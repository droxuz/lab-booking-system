package com.reservation_system.Sensor;

import static org.junit.Assert.*;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentStatus;
import com.reservation_system.Equipment.EquipmentType;
import com.reservation_system.Equipment.LabLocation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class CSVDataStoreTest {

    private CSVDataStore store;
    private File testDir;
    private File sensorsFile;
    private File equipmentFile;
    private File logsFile;

    @Before
    public void setUp() {
        testDir = new File("test-data/csv-store-" + System.nanoTime());
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
    public void constructor_createsDataDirectoryAndCsvFiles() {
        assertTrue(testDir.exists());
        assertTrue(sensorsFile.exists());
        assertTrue(equipmentFile.exists());
        assertTrue(logsFile.exists());
    }

    @Test
    public void loadAllSensors_whenEmpty_returnsEmptyList() {
        assertTrue(store.loadAllSensors().isEmpty());
    }

    @Test
    public void saveSensor_thenLoadSensor_returnsPersistedSensor() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();
        Sensor sensor = new Sensor(sensorId, SensorType.MOTION, equipmentId);

        store.saveSensor(sensor);

        Sensor loaded = store.loadSensor(sensorId);
        assertNotNull(loaded);
        assertEquals(sensorId, loaded.getSensorId());
        assertEquals(SensorType.MOTION, loaded.getSensorType());
        assertEquals(equipmentId, loaded.getLinkedEquipmentId());
        assertEquals("ACTIVE", loaded.getStateName());
    }

    @Test
    public void saveSensor_existingId_updatesPersistedSensor() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();

        store.saveSensor(new Sensor(sensorId, SensorType.MOTION, equipmentId));

        Sensor updated = new Sensor(sensorId, SensorType.THERMAL, equipmentId, new InactiveSensorState());
        store.saveSensor(updated);

        Sensor loaded = store.loadSensor(sensorId);
        assertNotNull(loaded);
        assertEquals(SensorType.THERMAL, loaded.getSensorType());
        assertEquals("INACTIVE", loaded.getStateName());
        assertEquals(1, store.loadAllSensors().size());
    }

    @Test
    public void deleteSensor_existingId_removesSensor() {
        UUID sensorId = UUID.randomUUID();
        store.saveSensor(new Sensor(sensorId, SensorType.POWER, UUID.randomUUID()));

        store.deleteSensor(sensorId);

        assertNull(store.loadSensor(sensorId));
        assertTrue(store.loadAllSensors().isEmpty());
    }

    @Test
    public void loadAllSensors_skipsInvalidRow() throws Exception {
        try (PrintWriter pw = new PrintWriter(new FileWriter(sensorsFile))) {
            pw.println("sensorId|sensorType|linkedEquipmentId|state");
            pw.println("not-a-uuid|MOTION|also-bad|ACTIVE");
            pw.println(UUID.randomUUID() + "|POWER|" + UUID.randomUUID() + "|ERROR");
        }

        List<Sensor> sensors = store.loadAllSensors();

        assertEquals(1, sensors.size());
        assertEquals(SensorType.POWER, sensors.get(0).getSensorType());
        assertEquals("ERROR", sensors.get(0).getStateName());
    }

    @Test
    public void loadAllSensors_unknownState_defaultsToActive() throws Exception {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();

        try (PrintWriter pw = new PrintWriter(new FileWriter(sensorsFile))) {
            pw.println("sensorId|sensorType|linkedEquipmentId|state");
            pw.println(sensorId + "|OCCUPANCY|" + equipmentId + "|WHATEVER");
        }

        Sensor loaded = store.loadSensor(sensorId);

        assertNotNull(loaded);
        assertEquals("ACTIVE", loaded.getStateName());
    }

    @Test
    public void saveEquipment_thenLoadEquipment_returnsPersistedEquipment() {
        UUID equipmentId = UUID.randomUUID();
        Equipment equipment = new Equipment(
                equipmentId,
                EquipmentType.OSCILLOSCOPE,
                "Oscilloscope A",
                LabLocation.LAS1001
        );

        store.saveEquipment(equipment);

        Equipment loaded = store.loadEquipment(equipmentId);
        assertNotNull(loaded);
        assertEquals(equipmentId, loaded.getEquipmentId());
        assertEquals(EquipmentType.OSCILLOSCOPE, loaded.getEquipmentType());
        assertEquals("Oscilloscope A", loaded.getDescription());
        assertEquals(LabLocation.LAS1001, loaded.getLabLocation());
        assertEquals(EquipmentStatus.AVAILABLE, loaded.getEquipmentStatus());
    }

    @Test
    public void saveEquipment_existingId_updatesPersistedEquipment() {
        UUID equipmentId = UUID.randomUUID();

        Equipment original = new Equipment(
                equipmentId,
                EquipmentType.MULTIMETER,
                "Old Desc",
                LabLocation.LAS1001
        );
        store.saveEquipment(original);

        Equipment updated = new Equipment(
                equipmentId,
                EquipmentType.POWER_SUPPLY,
                "New Desc",
                LabLocation.BERGERON200
        );
        store.saveEquipment(updated);

        Equipment loaded = store.loadEquipment(equipmentId);
        assertNotNull(loaded);
        assertEquals(EquipmentType.POWER_SUPPLY, loaded.getEquipmentType());
        assertEquals("New Desc", loaded.getDescription());
        assertEquals(LabLocation.BERGERON200, loaded.getLabLocation());
        assertEquals(1, store.loadAllEquipment().size());
    }

    @Test
    public void deleteEquipment_existingId_removesEquipment() {
        UUID equipmentId = UUID.randomUUID();
        Equipment equipment = new Equipment(
                equipmentId,
                EquipmentType.FPGA_BOARD,
                "Delete Me",
                LabLocation.LAS1002
        );

        store.saveEquipment(equipment);
        store.deleteEquipment(equipmentId);

        assertNull(store.loadEquipment(equipmentId));
    }

    @Test
    public void loadAllEquipment_restoresReservedStatus() throws Exception {
        UUID equipmentId = UUID.randomUUID();

        try (PrintWriter pw = new PrintWriter(new FileWriter(equipmentFile))) {
            pw.println("id|description|type|location|status");
            pw.println(equipmentId + "|Reserved Eq|OSCILLOSCOPE|LAS1001|RESERVED");
        }

        Equipment loaded = store.loadEquipment(equipmentId);

        assertNotNull(loaded);
        assertEquals(EquipmentStatus.RESERVED, loaded.getEquipmentStatus());
    }

    @Test
    public void loadAllEquipment_restoresInUseStatus() throws Exception {
        UUID equipmentId = UUID.randomUUID();

        try (PrintWriter pw = new PrintWriter(new FileWriter(equipmentFile))) {
            pw.println("id|description|type|location|status");
            pw.println(equipmentId + "|Busy Eq|MULTIMETER|LAS1002|IN_USE");
        }

        Equipment loaded = store.loadEquipment(equipmentId);

        assertNotNull(loaded);
        assertEquals(EquipmentStatus.IN_USE, loaded.getEquipmentStatus());
    }

    @Test
    public void loadAllEquipment_restoresDisabledStatus() throws Exception {
        UUID equipmentId = UUID.randomUUID();

        try (PrintWriter pw = new PrintWriter(new FileWriter(equipmentFile))) {
            pw.println("id|description|type|location|status");
            pw.println(equipmentId + "|Disabled Eq|POWER_SUPPLY|BERGERON200|DISABLED");
        }

        Equipment loaded = store.loadEquipment(equipmentId);

        assertNotNull(loaded);
        assertEquals(EquipmentStatus.DISABLED, loaded.getEquipmentStatus());
    }

    @Test
    public void loadAllEquipment_restoresMaintenanceStatus() throws Exception {
        UUID equipmentId = UUID.randomUUID();

        try (PrintWriter pw = new PrintWriter(new FileWriter(equipmentFile))) {
            pw.println("id|description|type|location|status");
            pw.println(equipmentId + "|Maint Eq|SIGNAL_GENERATOR|BERGERON300|MAINTENANCE");
        }

        Equipment loaded = store.loadEquipment(equipmentId);

        assertNotNull(loaded);
        assertEquals(EquipmentStatus.MAINTENANCE, loaded.getEquipmentStatus());
    }

    @Test
    public void saveUsageLog_thenLoadAllUsageLogs_returnsAppendedEntry() {
        UsageLogEntry entry = new UsageLogEntry(
                "LOG-00001",
                UUID.randomUUID(),
                UUID.randomUUID(),
                LocalDateTime.of(2026, 4, 5, 12, 0, 0),
                "IN_USE"
        );

        store.saveUsageLog(entry);

        List<UsageLogEntry> logs = store.loadAllUsageLogs();
        assertEquals(1, logs.size());
        assertEquals("LOG-00001", logs.get(0).getLogId());
        assertEquals("IN_USE", logs.get(0).getUsageStatus());
    }

    @Test
    public void countLogs_returnsNumberOfPersistedRows() {
        store.saveUsageLog(new UsageLogEntry(
                "LOG-00001", UUID.randomUUID(), UUID.randomUUID(),
                LocalDateTime.now(), "IN_USE"
        ));
        store.saveUsageLog(new UsageLogEntry(
                "LOG-00002", UUID.randomUUID(), UUID.randomUUID(),
                LocalDateTime.now(), "IDLE"
        ));

        assertEquals(2, store.countLogs());
    }

    @Test
    public void loadAllUsageLogs_skipsMalformedLogRow() throws Exception {
        try (PrintWriter pw = new PrintWriter(new FileWriter(logsFile))) {
            pw.println("logId|sensorId|equipmentId|timestamp|usageStatus");
            pw.println("bad|notuuid|notuuid|badtime|IN_USE");
            pw.println("LOG-00002|" + UUID.randomUUID() + "|" + UUID.randomUUID()
                    + "|2026-04-05 14:30:00|OFF");
        }

        List<UsageLogEntry> logs = store.loadAllUsageLogs();

        assertEquals(1, logs.size());
        assertEquals("LOG-00002", logs.get(0).getLogId());
        assertEquals("OFF", logs.get(0).getUsageStatus());
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