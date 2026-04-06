package com.reservation_system.Sensor;

import com.reservation_system.Equipment.Equipment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SensorManager {

    private static SensorManager instance;

    private final List<SensorObserver> observers;
    private final CSVDataStore dataStore;
    private int logCounter;

    private SensorManager(CSVDataStore dataStore) {
        this.observers = new ArrayList<>();
        this.dataStore = dataStore;
        this.logCounter = dataStore.countLogs() + 1;
    }

    public static SensorManager getInstance() {
        if (instance == null) {
            instance = new SensorManager(new CSVDataStore());
            instance.addObserver(new UsageLogObserver(instance.dataStore));
            instance.addObserver(new EquipmentStatusObserver(instance.dataStore));
        }
        return instance;
    }

    public static SensorManager createForTests(CSVDataStore dataStore) {
        SensorManager manager = new SensorManager(dataStore);
        manager.addObserver(new UsageLogObserver(manager.dataStore));
        manager.addObserver(new EquipmentStatusObserver(manager.dataStore));
        return manager;
    }

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

    public String processUsageData(UUID sensorId, UUID equipmentId,
                                   String usageStatus, LocalDateTime timestamp) {
        Sensor sensor = dataStore.loadSensor(sensorId);
        if (sensor == null) {
            return "ERROR: Invalid sensorId — " + sensorId;
        }

        if (!sensor.canSendData()) {
            return "ERROR: Sensor " + sensorId + " is " + sensor.getStateName()
                    + " — data rejected.";
        }

        Equipment equipment = dataStore.loadEquipment(equipmentId);
        if (equipment == null) {
            return "ERROR: Invalid equipmentId — " + equipmentId;
        }

        String logId = String.format("LOG-%05d", logCounter++);
        UsageLogEntry entry = new UsageLogEntry(logId, sensorId, equipmentId, timestamp, usageStatus);

        sensor.recordUsage(entry);
        notifyObservers(entry);

        return "SUCCESS: " + logId;
    }

    public List<Sensor> getAllSensors() { return dataStore.loadAllSensors(); }
    public List<Equipment> getAllEquipment() { return dataStore.loadAllEquipment(); }
    public List<UsageLogEntry> getAllLogs() { return dataStore.loadAllUsageLogs(); }

    public void addSensor(Sensor s) { dataStore.saveSensor(s); }
    public void removeSensor(UUID id) { dataStore.deleteSensor(id); }
    public void updateSensor(Sensor s) { dataStore.saveSensor(s); }

    public void addEquipment(Equipment e) { dataStore.saveEquipment(e); }
    public void removeEquipment(UUID id) { dataStore.deleteEquipment(id); }
    public void updateEquipment(Equipment e) { dataStore.saveEquipment(e); }

    public CSVDataStore getDataStore() { return dataStore; }
}