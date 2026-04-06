package com.reservation_system.AI_assistant;

import static org.junit.Assert.*;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentStatus;
import com.reservation_system.Equipment.EquipmentType;
import com.reservation_system.Equipment.LabLocation;
import com.reservation_system.Sensor.ActiveSensorState;
import com.reservation_system.Sensor.CSVDataStore;
import com.reservation_system.Sensor.Sensor;
import com.reservation_system.Sensor.SensorType;
import com.reservation_system.Sensor.UsageLogEntry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class CSVDataStoreAIAssistantTest {

    private CSVDataStore store;
    private File testDir;
    private File sensorsFile;
    private File equipmentFile;
    private File logsFile;

    @Before
    public void setUp() {
        testDir = new File("test-data/ai-csv-store-" + System.nanoTime());
        store = new CSVDataStore(testDir.getPath());
        sensorsFile = new File(testDir, "sensors.csv");
        equipmentFile = new File(testDir, "equipment.csv");
        logsFile = new File(testDir, "usage_logs.csv");
    }

    @After
    public void tearDown() {
        deleteRecursively(testDir);
    }

    @Test
    public void recreatingStoreOnSameDirectory_preservesExistingRows() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();
        store.saveSensor(new Sensor(sensorId, SensorType.OCCUPANCY, equipmentId));
        store.saveUsageLog(new UsageLogEntry("LOG-00009", sensorId, equipmentId, LocalDateTime.of(2026, 4, 5, 8, 0), "IN_USE"));

        CSVDataStore reopened = new CSVDataStore(testDir.getPath());

        assertNotNull(reopened.loadSensor(sensorId));
        assertEquals(1, reopened.countLogs());
        assertEquals("LOG-00009", reopened.loadAllUsageLogs().get(0).getLogId());
    }

    @Test
    public void saveSensor_sameIdWithDifferentValues_overwritesSinglePersistedRow() {
        UUID sensorId = UUID.randomUUID();
        UUID firstEquipmentId = UUID.randomUUID();
        UUID secondEquipmentId = UUID.randomUUID();

        store.saveSensor(new Sensor(sensorId, SensorType.MOTION, firstEquipmentId));
        store.saveSensor(new Sensor(sensorId, SensorType.THERMAL, secondEquipmentId, new ActiveSensorState()));

        List<Sensor> sensors = store.loadAllSensors();
        assertEquals(1, sensors.size());
        assertEquals(SensorType.THERMAL, sensors.get(0).getSensorType());
        assertEquals(secondEquipmentId, sensors.get(0).getLinkedEquipmentId());
    }

    @Test
    public void deleteSensor_missingId_leavesPersistedSensorsUntouched() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();
        store.saveSensor(new Sensor(sensorId, SensorType.POWER, equipmentId));

        store.deleteSensor(UUID.randomUUID());

        assertEquals(1, store.loadAllSensors().size());
        assertNotNull(store.loadSensor(sensorId));
    }

    @Test
    public void loadAllSensors_unknownStateText_defaultsBackToActive() throws Exception {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();

        try (PrintWriter pw = new PrintWriter(new FileWriter(sensorsFile))) {
            pw.println("sensorId|sensorType|linkedEquipmentId|state");
            pw.println(sensorId + "|THERMAL|" + equipmentId + "|SOMETHING_UNEXPECTED");
        }

        Sensor loaded = store.loadSensor(sensorId);

        assertNotNull(loaded);
        assertEquals("ACTIVE", loaded.getStateName());
    }

    @Test
    public void updateEquipmentStatus_rewritesStoredStatusInsteadOfAppendingDuplicateEquipment() {
        UUID equipmentId = UUID.randomUUID();
        Equipment equipment = new Equipment(equipmentId, EquipmentType.OSCILLOSCOPE, "Shared Scope", LabLocation.LAS1001);
        store.saveEquipment(equipment);

        equipment.disable();
        store.updateEquipmentStatus(equipment);

        List<Equipment> all = store.loadAllEquipment();
        assertEquals(1, all.size());
        assertEquals(EquipmentStatus.DISABLED, all.get(0).getEquipmentStatus());
    }

    @Test
    public void loadAllEquipment_invalidStatusRow_isSkippedWithoutBreakingValidRows() throws Exception {
        UUID validId = UUID.randomUUID();

        try (PrintWriter pw = new PrintWriter(new FileWriter(equipmentFile))) {
            pw.println("id|description|type|location|status");
            pw.println(UUID.randomUUID() + "|Broken|OSCILLOSCOPE|LAS1001|NOT_A_REAL_STATUS");
            pw.println(validId + "|Working|MULTIMETER|BERGERON200|AVAILABLE");
        }

        List<Equipment> equipment = store.loadAllEquipment();

        assertEquals(1, equipment.size());
        assertEquals(validId, equipment.get(0).getEquipmentId());
        assertEquals(EquipmentStatus.AVAILABLE, equipment.get(0).getEquipmentStatus());
    }

    @Test
    public void saveUsageLog_appendsRowsThatSurviveReopenInSameOrder() {
        store.saveUsageLog(new UsageLogEntry("LOG-00100", UUID.randomUUID(), UUID.randomUUID(), LocalDateTime.of(2026, 4, 5, 9, 0), "IN_USE"));
        store.saveUsageLog(new UsageLogEntry("LOG-00101", UUID.randomUUID(), UUID.randomUUID(), LocalDateTime.of(2026, 4, 5, 9, 5), "IDLE"));

        CSVDataStore reopened = new CSVDataStore(testDir.getPath());
        List<UsageLogEntry> logs = reopened.loadAllUsageLogs();

        assertEquals(2, logs.size());
        assertEquals("LOG-00100", logs.get(0).getLogId());
        assertEquals("LOG-00101", logs.get(1).getLogId());
    }

    @Test
    public void countLogs_ignoresHeaderAndBlankLines() throws Exception {
        try (PrintWriter pw = new PrintWriter(new FileWriter(logsFile))) {
            pw.println("logId|sensorId|equipmentId|timestamp|usageStatus");
            pw.println();
            pw.println("LOG-02000|" + UUID.randomUUID() + "|" + UUID.randomUUID() + "|2026-04-05 14:30:00|OFF");
            pw.println("   ");
            pw.println("LOG-02001|" + UUID.randomUUID() + "|" + UUID.randomUUID() + "|2026-04-05 15:30:00|IN_USE");
        }

        assertEquals(2, store.countLogs());
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
