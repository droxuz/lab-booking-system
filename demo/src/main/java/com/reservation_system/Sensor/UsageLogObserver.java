package com.reservation_system.Sensor;

/**
 * OBSERVER PATTERN — Concrete Observer.
 * Persists every usage event to usage_logs.csv via CSVDataStore.
 */
public class UsageLogObserver implements SensorObserver {

    private final CSVDataStore dataStore;

    public UsageLogObserver(CSVDataStore dataStore) {
        this.dataStore = dataStore;
    }

    @Override
    public void onUsageDataReceived(UsageLogEntry entry) {
        dataStore.saveUsageLog(entry);
        System.out.println("[UsageLogObserver] Persisted: " + entry.getLogId()
                + " | sensor=" + entry.getSensorId()
                + " | equip=" + entry.getEquipmentId()
                + " | status=" + entry.getUsageStatus());
    }
}
