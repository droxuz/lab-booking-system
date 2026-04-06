package com.reservation_system.AI_assistant;

import static org.junit.Assert.*;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentStatus;
import com.reservation_system.Equipment.EquipmentType;
import com.reservation_system.Equipment.LabLocation;
import com.reservation_system.Sensor.CSVDataStore;
import com.reservation_system.Sensor.Sensor;
import com.reservation_system.Sensor.SensorManager;
import com.reservation_system.Sensor.SensorObserver;
import com.reservation_system.Sensor.SensorType;
import com.reservation_system.Sensor.UsageLogEntry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.time.LocalDateTime;
import java.util.UUID;

public class SensorManagerAIAssistantTest {

    private SensorManager manager;
    private CSVDataStore store;
    private File testDir;

    @Before
    public void setUp() {
        testDir = new File("test-data/ai-sensor-manager-" + System.nanoTime());
        store = new CSVDataStore(testDir.getPath());
        manager = SensorManager.createForTests(store);
    }

    @After
    public void tearDown() {
        deleteRecursively(testDir);
    }

    @Test
    public void processUsageData_afterExistingPersistedLogs_continuesNumberingFromDisk() {
        store.saveUsageLog(new UsageLogEntry("LOG-00001", UUID.randomUUID(), UUID.randomUUID(), LocalDateTime.now(), "IN_USE"));
        store.saveUsageLog(new UsageLogEntry("LOG-00002", UUID.randomUUID(), UUID.randomUUID(), LocalDateTime.now(), "OFF"));

        SensorManager reloadedManager = SensorManager.createForTests(store);
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();
        reloadedManager.addSensor(new Sensor(sensorId, SensorType.MOTION, equipmentId));
        reloadedManager.addEquipment(new Equipment(equipmentId, EquipmentType.OSCILLOSCOPE, "Scope", LabLocation.LAS1001));

        String result = reloadedManager.processUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());

        assertTrue(result.startsWith("SUCCESS: LOG-00003"));
        assertEquals(3, reloadedManager.getAllLogs().size());
    }

    @Test
    public void processUsageData_invalidSensor_doesNotConsumeNextLogNumber() {
        UUID missingSensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();

        manager.addEquipment(new Equipment(equipmentId, EquipmentType.MULTIMETER, "Meter", LabLocation.BERGERON200));

        String rejected = manager.processUsageData(missingSensorId, equipmentId, "IN_USE", LocalDateTime.now());
        assertTrue(rejected.startsWith("ERROR: Invalid sensorId"));

        UUID realSensorId = UUID.randomUUID();
        manager.addSensor(new Sensor(realSensorId, SensorType.THERMAL, equipmentId));

        String accepted = manager.processUsageData(realSensorId, equipmentId, "IN_USE", LocalDateTime.now());

        assertTrue(accepted.startsWith("SUCCESS: LOG-00001"));
    }

    @Test
    public void processUsageData_reservedEquipment_entersInUseWithoutCreatingExtraRows() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();

        Equipment equipment = new Equipment(equipmentId, EquipmentType.SIGNAL_GENERATOR, "Generator", LabLocation.BERGERON300);
        equipment.reserve();

        manager.addSensor(new Sensor(sensorId, SensorType.OCCUPANCY, equipmentId));
        manager.addEquipment(equipment);

        manager.processUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());

        Equipment loaded = manager.getDataStore().loadEquipment(equipmentId);
        assertEquals(EquipmentStatus.IN_USE, loaded.getEquipmentStatus());
        assertEquals(1, manager.getAllEquipment().size());
        assertEquals(1, manager.getAllLogs().size());
    }

    @Test
    public void processUsageData_validEvent_persistsLogEvenThoughReloadedSensorInstanceHasSeparateMemory() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();
        Sensor originalSensor = new Sensor(sensorId, SensorType.POWER, equipmentId);

        manager.addSensor(originalSensor);
        manager.addEquipment(new Equipment(equipmentId, EquipmentType.POWER_SUPPLY, "Supply", LabLocation.LAS1001));

        String result = manager.processUsageData(sensorId, equipmentId, "UNKNOWN_STATUS", LocalDateTime.of(2026, 4, 5, 16, 0));

        Sensor reloadedSensor = manager.getDataStore().loadSensor(sensorId);

        assertTrue(result.startsWith("SUCCESS: LOG-"));
        assertTrue(originalSensor.getUsageLogs().isEmpty());
        assertTrue(reloadedSensor.getUsageLogs().isEmpty());
        assertEquals(1, manager.getAllLogs().size());
        assertEquals("UNKNOWN_STATUS", manager.getAllLogs().get(0).getUsageStatus());
    }

    @Test
    public void addObserver_sameInstanceTwice_notifiedOnlyOncePerEvent() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();
        CountingObserver observer = new CountingObserver();

        manager.addObserver(observer);
        manager.addObserver(observer);
        manager.addSensor(new Sensor(sensorId, SensorType.MOTION, equipmentId));
        manager.addEquipment(new Equipment(equipmentId, EquipmentType.FPGA_BOARD, "Board", LabLocation.LAS1002));

        manager.processUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());

        assertEquals(1, observer.count);
    }

    @Test
    public void removeObserver_preventsFurtherNotificationsWithoutBreakingDefaultObservers() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();
        CountingObserver observer = new CountingObserver();

        manager.addObserver(observer);
        manager.removeObserver(observer);
        manager.addSensor(new Sensor(sensorId, SensorType.MOTION, equipmentId));
        manager.addEquipment(new Equipment(equipmentId, EquipmentType.PRINTER_3D, "Printer", LabLocation.BERGERON300));

        String result = manager.processUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());

        assertEquals(0, observer.count);
        assertTrue(result.startsWith("SUCCESS: LOG-"));
        assertEquals(1, manager.getAllLogs().size());
    }

    @Test
    public void processUsageData_inactiveSensor_rejectsEventWithoutTouchingEquipmentState() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();
        Sensor sensor = new Sensor(sensorId, SensorType.THERMAL, equipmentId);
        sensor.deactivate();

        manager.addSensor(sensor);
        manager.addEquipment(new Equipment(equipmentId, EquipmentType.MICROCONTROLLER, "MCU", LabLocation.BERGERON200));

        String result = manager.processUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());

        Equipment loaded = manager.getDataStore().loadEquipment(equipmentId);
        assertTrue(result.contains("INACTIVE"));
        assertEquals(EquipmentStatus.AVAILABLE, loaded.getEquipmentStatus());
        assertTrue(sensor.getUsageLogs().isEmpty());
        assertTrue(manager.getAllLogs().isEmpty());
    }

    private static class CountingObserver implements SensorObserver {
        int count;

        @Override
        public void onUsageDataReceived(UsageLogEntry entry) {
            count++;
        }
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
