package com.reservation_system.Sensor;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class UsageLogObserverTest {

    private CSVDataStore dataStore;
    private UsageLogObserver observer;
    private File testDir;

    @Before
    public void setUp() {
        testDir = new File("test-data/usage-log-observer-" + System.nanoTime());
        dataStore = new CSVDataStore(testDir.getPath());
        observer = new UsageLogObserver(dataStore);
    }

    @After
    public void tearDown() {
        deleteRecursively(testDir);
    }

    @Test
    public void onUsageDataReceived_singleEntry_persistsOneLog() {
        UsageLogEntry entry = entry("LOG-00001", "IN_USE");

        observer.onUsageDataReceived(entry);

        List<UsageLogEntry> logs = dataStore.loadAllUsageLogs();
        assertEquals(1, logs.size());
    }

    @Test
    public void onUsageDataReceived_persistsCorrectLogId() {
        UsageLogEntry entry = entry("LOG-00002", "IN_USE");

        observer.onUsageDataReceived(entry);

        assertEquals("LOG-00002", dataStore.loadAllUsageLogs().get(0).getLogId());
    }

    @Test
    public void onUsageDataReceived_persistsCorrectSensorId() {
        UUID sensorId = UUID.randomUUID();
        UsageLogEntry entry = new UsageLogEntry(
                "LOG-00003",
                sensorId,
                UUID.randomUUID(),
                LocalDateTime.of(2026, 4, 5, 10, 0),
                "IN_USE"
        );

        observer.onUsageDataReceived(entry);

        assertEquals(sensorId, dataStore.loadAllUsageLogs().get(0).getSensorId());
    }

    @Test
    public void onUsageDataReceived_persistsCorrectEquipmentId() {
        UUID equipmentId = UUID.randomUUID();
        UsageLogEntry entry = new UsageLogEntry(
                "LOG-00004",
                UUID.randomUUID(),
                equipmentId,
                LocalDateTime.of(2026, 4, 5, 10, 5),
                "IN_USE"
        );

        observer.onUsageDataReceived(entry);

        assertEquals(equipmentId, dataStore.loadAllUsageLogs().get(0).getEquipmentId());
    }

    @Test
    public void onUsageDataReceived_persistsCorrectTimestamp() {
        LocalDateTime timestamp = LocalDateTime.of(2026, 4, 5, 10, 15);
        UsageLogEntry entry = new UsageLogEntry(
                "LOG-00005",
                UUID.randomUUID(),
                UUID.randomUUID(),
                timestamp,
                "IN_USE"
        );

        observer.onUsageDataReceived(entry);

        assertEquals(timestamp, dataStore.loadAllUsageLogs().get(0).getTimestamp());
    }

    @Test
    public void onUsageDataReceived_persistsCorrectUsageStatus() {
        UsageLogEntry entry = entry("LOG-00006", "OFF");

        observer.onUsageDataReceived(entry);

        assertEquals("OFF", dataStore.loadAllUsageLogs().get(0).getUsageStatus());
    }

    @Test
    public void onUsageDataReceived_twoEntries_appendsRatherThanOverwrites() {
        observer.onUsageDataReceived(entry("LOG-00007", "IN_USE"));
        observer.onUsageDataReceived(entry("LOG-00008", "IDLE"));

        List<UsageLogEntry> logs = dataStore.loadAllUsageLogs();
        assertEquals(2, logs.size());
        assertEquals("LOG-00007", logs.get(0).getLogId());
        assertEquals("LOG-00008", logs.get(1).getLogId());
    }

    @Test
    public void onUsageDataReceived_acceptsIdleStatus() {
        observer.onUsageDataReceived(entry("LOG-00009", "IDLE"));

        List<UsageLogEntry> logs = dataStore.loadAllUsageLogs();
        assertEquals(1, logs.size());
        assertEquals("IDLE", logs.get(0).getUsageStatus());
    }

    @Test
    public void onUsageDataReceived_acceptsUnknownStatusWithoutValidation() {
        observer.onUsageDataReceived(entry("LOG-00010", "WEIRD_SIGNAL"));

        List<UsageLogEntry> logs = dataStore.loadAllUsageLogs();
        assertEquals(1, logs.size());
        assertEquals("WEIRD_SIGNAL", logs.get(0).getUsageStatus());
    }

    @Test
    public void onUsageDataReceived_incrementsCountLogs() {
        observer.onUsageDataReceived(entry("LOG-00011", "IN_USE"));
        observer.onUsageDataReceived(entry("LOG-00012", "OFF"));

        assertEquals(2, dataStore.countLogs());
    }

    private UsageLogEntry entry(String logId, String status) {
        return new UsageLogEntry(
                logId,
                UUID.randomUUID(),
                UUID.randomUUID(),
                LocalDateTime.of(2026, 4, 5, 9, 0),
                status
        );
    }

    private void deleteRecursively(File file) {
        if (file == null || !file.exists()) return;
        if (file.isDirectory()) {
            File[] children = file.listFiles();
            if (children != null) {
                for (File child : children) {
                    deleteRecursively(child);
                }
            }
        }
        file.delete();
    }
}