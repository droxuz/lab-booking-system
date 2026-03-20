package com.reservation_system.Sensor;

import com.reservation_system.Equipment.Equipment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * SINGLETON PATTERN — One instance receives all sensor signals.
 * OBSERVER PATTERN  — Subject: notifies registered observers on each valid event.
 *
 * Mirrors the System:LabReservationSystem lifeline from the sequence diagram.
 */
public class SensorManager {

    // ── Singleton ─────────────────────────────────────────────
    private static SensorManager instance;

    private SensorManager() {
        this.observers   = new ArrayList<>();
        this.dataStore   = new CSVDataStore();
        this.logCounter  = dataStore.countLogs() + 1;
    }

    public static SensorManager getInstance() {
        if (instance == null) {
            instance = new SensorManager();
        }
        return instance;
    }

    // ── Fields ─────────────────────────────────────────────────
    private final List<SensorObserver> observers;
    private final CSVDataStore         dataStore;
    private       int                  logCounter;

    // ── Observer management ────────────────────────────────────

    public void addObserver(SensorObserver observer) {
        if (!observers.contains(observer)) observers.add(observer);
    }

    public void removeObserver(SensorObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(UsageLogEntry entry) {
        for (SensorObserver obs : new ArrayList<>(observers)) {
            obs.onUsageDataReceived(entry);
        }
    }

    // ── Core data flow ─────────────────────────────────────────

    /**
     * Main entry point for incoming sensor data.
     * Mirrors sendUsageData(sensorId, equipmentId, usageStatus, timestamp)
     * from the sequence diagram.
     *
     * Flow:
     *   1. Validate sensor exists
     *   2. Gate check: is sensor ACTIVE? (State pattern)
     *   3. Validate equipment exists
     *   4. Build UsageLogEntry
     *   5. Record in Sensor's in-memory log
     *   6. Notify observers (persist log, update equipment status)
     *
     * @return "SUCCESS: <logId>" or "ERROR: <reason>"
     */
    public String processUsageData(UUID sensorId, UUID equipmentId,
                                   String usageStatus, LocalDateTime timestamp) {
        // Step 1: validate sensor
        Sensor sensor = dataStore.loadSensor(sensorId);
        if (sensor == null) {
            return "ERROR: Invalid sensorId — " + sensorId;
        }

        // Step 2: State pattern gate — inactive/error sensors are blocked
        if (!sensor.canSendData()) {
            return "ERROR: Sensor " + sensorId + " is " + sensor.getStateName()
                    + " — data rejected.";
        }

        // Step 3: validate equipment
        Equipment equipment = dataStore.loadEquipment(equipmentId);
        if (equipment == null) {
            return "ERROR: Invalid equipmentId — " + equipmentId;
        }

        // Step 4: build log entry
        String logId = String.format("LOG-%05d", logCounter++);
        UsageLogEntry entry = new UsageLogEntry(logId, sensorId, equipmentId,
                                                timestamp, usageStatus);

        // Step 5: store in sensor's memory
        sensor.recordUsage(entry);

        // Step 6: notify observers
        notifyObservers(entry);

        return "SUCCESS: " + logId;
    }

    // ── Data access (delegated) ────────────────────────────────

    public List<Sensor>        getAllSensors()   { return dataStore.loadAllSensors(); }
    public List<Equipment>     getAllEquipment() { return dataStore.loadAllEquipment(); }
    public List<UsageLogEntry> getAllLogs()      { return dataStore.loadAllUsageLogs(); }

    public void addSensor(Sensor s)              { dataStore.saveSensor(s); }
    public void removeSensor(UUID id)            { dataStore.deleteSensor(id); }
    public void updateSensor(Sensor s)           { dataStore.saveSensor(s); }

    public void addEquipment(Equipment e)        { dataStore.saveEquipment(e); }
    public void removeEquipment(UUID id)         { dataStore.deleteEquipment(id); }
    public void updateEquipment(Equipment e)     { dataStore.saveEquipment(e); }

    public CSVDataStore getDataStore()           { return dataStore; }
}
