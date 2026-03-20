package com.reservation_system.Sensor;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentType;
import com.reservation_system.Equipment.LabLocation;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * FACADE PATTERN — Single entry point to the entire Sensor subsystem.
 *
 * Other groups (booking, auth, GUI) interact with this class only.
 * All internal wiring (SensorManager, Observers, CSV, State classes)
 * is hidden behind this interface.
 *
 * Integration example for other teams:
 *
 *   SensorSubsystemFacade sensor = new SensorSubsystemFacade();
 *   sensor.sendUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());
 *   sensor.setEquipmentMaintenance(equipmentId);
 *   List<Equipment> all = sensor.getAllEquipment();
 */
public class SensorSubsystemFacade {

    private final SensorManager manager;

    public SensorSubsystemFacade() {
        this.manager = SensorManager.getInstance();

        // Wire observers once — hidden from callers
        CSVDataStore dataStore = manager.getDataStore();
        manager.addObserver(new UsageLogObserver(dataStore));
        manager.addObserver(new EquipmentStatusObserver(dataStore));
    }

    // ── Primary interface ──────────────────────────────────────

    /**
     * Receive sensor data from a physical or simulated sensor.
     * Mirrors sendUsageData(sensorId, equipmentId, usageStatus, timestamp)
     * in the sequence diagram.
     *
     * @param usageStatus "IN_USE" | "IDLE" | "OFF"
     * @return "SUCCESS: LOG-XXXXX" or "ERROR: <reason>"
     */
    public String sendUsageData(UUID sensorId, UUID equipmentId,
                                String usageStatus, LocalDateTime timestamp) {
        return manager.processUsageData(sensorId, equipmentId, usageStatus, timestamp);
    }

    // ── Sensor management ──────────────────────────────────────

    public List<Sensor> getAllSensors()          { return manager.getAllSensors(); }

    public void addSensor(UUID sensorId, SensorType type, UUID linkedEquipmentId) {
        manager.addSensor(new Sensor(sensorId, type, linkedEquipmentId));
    }

    public void removeSensor(UUID sensorId)      { manager.removeSensor(sensorId); }

    public void activateSensor(UUID sensorId)    { changeSensorState(sensorId, "ACTIVE"); }
    public void deactivateSensor(UUID sensorId)  { changeSensorState(sensorId, "INACTIVE"); }
    public void flagSensorError(UUID sensorId)   { changeSensorState(sensorId, "ERROR"); }

    private void changeSensorState(UUID sensorId, String targetState) {
        Sensor s = manager.getDataStore().loadSensor(sensorId);
        if (s == null) return;
        switch (targetState) {
            case "ACTIVE":   s.activate();   break;
            case "INACTIVE": s.deactivate(); break;
            case "ERROR":    s.flagError();  break;
        }
        manager.updateSensor(s);
    }

    // ── Equipment management ───────────────────────────────────

    public List<Equipment> getAllEquipment()      { return manager.getAllEquipment(); }

    public void addEquipment(UUID equipmentId, EquipmentType type,
                             String description, LabLocation location) {
        manager.addEquipment(new Equipment(equipmentId, type, description, location));
    }

    public void removeEquipment(UUID equipmentId) { manager.removeEquipment(equipmentId); }

    /** Manager override: restore equipment to available. */
    public void setEquipmentAvailable(UUID equipmentId) {
        Equipment eq = manager.getDataStore().loadEquipment(equipmentId);
        if (eq == null) return;
        eq.enable();
        manager.updateEquipment(eq);
    }

    /** Manager override: disable equipment. */
    public void setEquipmentDisabled(UUID equipmentId) {
        Equipment eq = manager.getDataStore().loadEquipment(equipmentId);
        if (eq == null) return;
        eq.disable();
        manager.updateEquipment(eq);
    }

    /** Manager override: mark equipment under maintenance. */
    public void setEquipmentMaintenance(UUID equipmentId) {
        Equipment eq = manager.getDataStore().loadEquipment(equipmentId);
        if (eq == null) return;
        eq.markUnavailable();
        manager.updateEquipment(eq);
    }

    // ── Usage log access ───────────────────────────────────────

    public List<UsageLogEntry> getAllUsageLogs()  { return manager.getAllLogs(); }

    // ── Observer extension ──────────────────────────────────────

    /** Allows other subsystems to register custom observers if needed. */
    public void addObserver(SensorObserver observer) {
        manager.addObserver(observer);
    }
}
