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
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class SensorManagerTest {

    private SensorManager manager;
    private CSVDataStore store;
    private File testDir;

    @Before
    public void setUp() {
        testDir = new File("test-data/sensor-manager-" + System.nanoTime());
        store = new CSVDataStore(testDir.getPath());
        manager = SensorManager.createForTests(store);
    }

    @After
    public void tearDown() {
        deleteRecursively(testDir);
    }

    @Test
    public void processUsageData_invalidSensor_returnsErrorMessage() {
        String result = manager.processUsageData(
                UUID.randomUUID(),
                UUID.randomUUID(),
                "IN_USE",
                LocalDateTime.now()
        );

        assertTrue(result.startsWith("ERROR: Invalid sensorId"));
    }

    @Test
    public void processUsageData_inactiveSensor_returnsRejectedMessage() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();

        Sensor sensor = new Sensor(sensorId, SensorType.MOTION, equipmentId);
        sensor.deactivate();
        manager.addSensor(sensor);
        manager.addEquipment(new Equipment(
                equipmentId,
                EquipmentType.OSCILLOSCOPE,
                "Eq",
                LabLocation.LAS1001
        ));

        String result = manager.processUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());

        assertTrue(result.contains("ERROR: Sensor"));
        assertTrue(result.contains("INACTIVE"));
    }

    @Test
    public void processUsageData_errorSensor_returnsRejectedMessage() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();

        Sensor sensor = new Sensor(sensorId, SensorType.POWER, equipmentId);
        sensor.flagError();
        manager.addSensor(sensor);
        manager.addEquipment(new Equipment(
                equipmentId,
                EquipmentType.FPGA_BOARD,
                "Eq",
                LabLocation.LAS1002
        ));

        String result = manager.processUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());

        assertTrue(result.contains("ERROR: Sensor"));
        assertTrue(result.contains("ERROR"));
    }

    @Test
    public void processUsageData_invalidEquipment_returnsErrorMessage() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();

        manager.addSensor(new Sensor(sensorId, SensorType.THERMAL, equipmentId));

        String result = manager.processUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());

        assertTrue(result.startsWith("ERROR: Invalid equipmentId"));
    }

    @Test
    public void processUsageData_validInput_returnsSuccessLogId() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();

        manager.addSensor(new Sensor(sensorId, SensorType.OCCUPANCY, equipmentId));
        manager.addEquipment(new Equipment(
                equipmentId,
                EquipmentType.MULTIMETER,
                "Eq",
                LabLocation.BERGERON200
        ));

        String result = manager.processUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());

        assertTrue(result.startsWith("SUCCESS: LOG-"));
    }

    @Test
    public void processUsageData_validInput_persistsUsageLogThroughObserver() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();

        manager.addSensor(new Sensor(sensorId, SensorType.MOTION, equipmentId));
        manager.addEquipment(new Equipment(
                equipmentId,
                EquipmentType.OSCILLOSCOPE,
                "Eq",
                LabLocation.LAS1001
        ));

        manager.processUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());

        List<UsageLogEntry> logs = manager.getAllLogs();
        assertEquals(1, logs.size());
        assertEquals(sensorId, logs.get(0).getSensorId());
        assertEquals(equipmentId, logs.get(0).getEquipmentId());
    }

    @Test
    public void processUsageData_validInput_updatesEquipmentStatusToInUse() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();

        manager.addSensor(new Sensor(sensorId, SensorType.MOTION, equipmentId));
        manager.addEquipment(new Equipment(
                equipmentId,
                EquipmentType.POWER_SUPPLY,
                "Eq",
                LabLocation.BERGERON300
        ));

        manager.processUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());

        Equipment loaded = manager.getDataStore().loadEquipment(equipmentId);
        assertEquals(EquipmentStatus.IN_USE, loaded.getEquipmentStatus());
    }

    @Test
    public void processUsageData_inUse_setsLastSensorTriggeredToNullInCurrentFlow() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();

        manager.addSensor(new Sensor(sensorId, SensorType.THERMAL, equipmentId));
        manager.addEquipment(new Equipment(
                equipmentId,
                EquipmentType.SIGNAL_GENERATOR,
                "Eq",
                LabLocation.LAS1002
        ));

        manager.processUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());

        Equipment loaded = manager.getDataStore().loadEquipment(equipmentId);
        assertEquals(EquipmentStatus.IN_USE, loaded.getEquipmentStatus());
        assertNull(loaded.getLastSensorTriggered());
    }

    @Test
    public void processUsageData_idleSignal_afterInUse_returnsEquipmentToAvailable() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();

        manager.addSensor(new Sensor(sensorId, SensorType.POWER, equipmentId));
        manager.addEquipment(new Equipment(
                equipmentId,
                EquipmentType.PRINTER_3D,
                "Eq",
                LabLocation.LAS1001
        ));

        manager.processUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());
        manager.processUsageData(sensorId, equipmentId, "IDLE", LocalDateTime.now());

        Equipment loaded = manager.getDataStore().loadEquipment(equipmentId);
        assertEquals(EquipmentStatus.AVAILABLE, loaded.getEquipmentStatus());
    }

    @Test
    public void processUsageData_offSignal_afterInUse_returnsEquipmentToAvailable() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();

        manager.addSensor(new Sensor(sensorId, SensorType.POWER, equipmentId));
        manager.addEquipment(new Equipment(
                equipmentId,
                EquipmentType.MICROCONTROLLER,
                "Eq",
                LabLocation.BERGERON200
        ));

        manager.processUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());
        manager.processUsageData(sensorId, equipmentId, "OFF", LocalDateTime.now());

        Equipment loaded = manager.getDataStore().loadEquipment(equipmentId);
        assertEquals(EquipmentStatus.AVAILABLE, loaded.getEquipmentStatus());
    }

    @Test
    public void processUsageData_unknownSignal_keepsEquipmentStatusUnchanged() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();

        manager.addSensor(new Sensor(sensorId, SensorType.MOTION, equipmentId));
        manager.addEquipment(new Equipment(
                equipmentId,
                EquipmentType.SOLDERING_STATION,
                "Eq",
                LabLocation.BERGERON300
        ));

        manager.processUsageData(sensorId, equipmentId, "UNKNOWN_STATUS", LocalDateTime.now());

        Equipment loaded = manager.getDataStore().loadEquipment(equipmentId);
        assertEquals(EquipmentStatus.AVAILABLE, loaded.getEquipmentStatus());
    }

    @Test
    public void addObserver_customObserver_receivesNotification() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();

        CountingObserver observer = new CountingObserver();
        manager.addObserver(observer);

        manager.addSensor(new Sensor(sensorId, SensorType.MOTION, equipmentId));
        manager.addEquipment(new Equipment(
                equipmentId,
                EquipmentType.OSCILLOSCOPE,
                "Eq",
                LabLocation.LAS1001
        ));

        manager.processUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());

        assertEquals(1, observer.count);
        assertNotNull(observer.lastEntry);
        assertEquals("IN_USE", observer.lastEntry.getUsageStatus());
    }

    @Test
    public void addObserver_sameObserverTwice_doesNotDuplicateNotification() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();

        CountingObserver observer = new CountingObserver();
        manager.addObserver(observer);
        manager.addObserver(observer);

        manager.addSensor(new Sensor(sensorId, SensorType.MOTION, equipmentId));
        manager.addEquipment(new Equipment(
                equipmentId,
                EquipmentType.MULTIMETER,
                "Eq",
                LabLocation.LAS1002
        ));

        manager.processUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());

        assertEquals(1, observer.count);
    }

    @Test
    public void removeObserver_customObserver_noLongerReceivesNotification() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();

        CountingObserver observer = new CountingObserver();
        manager.addObserver(observer);
        manager.removeObserver(observer);

        manager.addSensor(new Sensor(sensorId, SensorType.MOTION, equipmentId));
        manager.addEquipment(new Equipment(
                equipmentId,
                EquipmentType.FPGA_BOARD,
                "Eq",
                LabLocation.BERGERON200
        ));

        manager.processUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());

        assertEquals(0, observer.count);
    }

    @Test
    public void addSensor_thenGetAllSensors_containsAddedSensor() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();

        manager.addSensor(new Sensor(sensorId, SensorType.THERMAL, equipmentId));

        List<Sensor> sensors = manager.getAllSensors();
        assertEquals(1, sensors.size());
        assertEquals(sensorId, sensors.get(0).getSensorId());
    }

    @Test
    public void removeSensor_existingId_removesSensor() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();

        manager.addSensor(new Sensor(sensorId, SensorType.THERMAL, equipmentId));
        manager.removeSensor(sensorId);

        assertTrue(manager.getAllSensors().isEmpty());
    }

    @Test
    public void addEquipment_thenGetAllEquipment_containsAddedEquipment() {
        UUID equipmentId = UUID.randomUUID();

        manager.addEquipment(new Equipment(
                equipmentId,
                EquipmentType.OSCILLOSCOPE,
                "Eq",
                LabLocation.LAS1001
        ));

        List<Equipment> equipment = manager.getAllEquipment();
        assertEquals(1, equipment.size());
        assertEquals(equipmentId, equipment.get(0).getEquipmentId());
    }

    private static class CountingObserver implements SensorObserver {
        int count = 0;
        UsageLogEntry lastEntry;

        @Override
        public void onUsageDataReceived(UsageLogEntry entry) {
            count++;
            lastEntry = entry;
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