package com.reservation_system.Sensor;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentType;
import com.reservation_system.Equipment.LabLocation;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class SensorSubsystemFacade {

    private final SensorManager manager;

    public SensorSubsystemFacade() {
        this.manager = SensorManager.getInstance();
    }

    public SensorSubsystemFacade(SensorManager manager) {
        this.manager = manager;
    }

    public String sendUsageData(UUID sensorId, UUID equipmentId,
                                String usageStatus, LocalDateTime timestamp) {
        return manager.processUsageData(sensorId, equipmentId, usageStatus, timestamp);
    }

    public List<Sensor> getAllSensors() { return manager.getAllSensors(); }

    public void addSensor(UUID sensorId, SensorType type, UUID linkedEquipmentId) {
        manager.addSensor(new Sensor(sensorId, type, linkedEquipmentId));
    }

    public void removeSensor(UUID sensorId) { manager.removeSensor(sensorId); }

    public void activateSensor(UUID sensorId) { changeSensorState(sensorId, "ACTIVE"); }
    public void deactivateSensor(UUID sensorId) { changeSensorState(sensorId, "INACTIVE"); }
    public void flagSensorError(UUID sensorId) { changeSensorState(sensorId, "ERROR"); }

    private void changeSensorState(UUID sensorId, String targetState) {
        Sensor s = manager.getDataStore().loadSensor(sensorId);
        if (s == null) return;
        switch (targetState) {
            case "ACTIVE": s.activate(); break;
            case "INACTIVE": s.deactivate(); break;
            case "ERROR": s.flagError(); break;
        }
        manager.updateSensor(s);
    }

    public List<Equipment> getAllEquipment() { return manager.getAllEquipment(); }

    public void addEquipment(UUID equipmentId, EquipmentType type,
                             String description, LabLocation location) {
        manager.addEquipment(new Equipment(equipmentId, type, description, location));
    }

    public void removeEquipment(UUID equipmentId) { manager.removeEquipment(equipmentId); }

    public void setEquipmentAvailable(UUID equipmentId) {
        Equipment eq = manager.getDataStore().loadEquipment(equipmentId);
        if (eq == null) return;
        eq.enable();
        manager.updateEquipment(eq);
    }

    public void setEquipmentDisabled(UUID equipmentId) {
        Equipment eq = manager.getDataStore().loadEquipment(equipmentId);
        if (eq == null) return;
        eq.disable();
        manager.updateEquipment(eq);
    }

    public void setEquipmentMaintenance(UUID equipmentId) {
        Equipment eq = manager.getDataStore().loadEquipment(equipmentId);
        if (eq == null) return;
        eq.markUnavailable();
        manager.updateEquipment(eq);
    }

    public List<UsageLogEntry> getAllUsageLogs() { return manager.getAllLogs(); }

    public void addObserver(SensorObserver observer) {
        manager.addObserver(observer);
    }
}