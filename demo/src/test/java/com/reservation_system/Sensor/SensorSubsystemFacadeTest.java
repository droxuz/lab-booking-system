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

public class SensorSubsystemFacadeTest {

    private SensorSubsystemFacade facade;
    private File testDir;

    @Before
    public void setUp() {
        testDir = new File("test-data/facade-" + System.nanoTime());
        CSVDataStore store = new CSVDataStore(testDir.getPath());
        SensorManager manager = SensorManager.createForTests(store);
        facade = new SensorSubsystemFacade(manager);
    }

    @After
    public void tearDown() {
        deleteRecursively(testDir);
    }

    @Test
    public void addSensor_thenGetAllSensors_containsAddedSensor() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();

        facade.addSensor(sensorId, SensorType.MOTION, equipmentId);

        List<Sensor> sensors = facade.getAllSensors();
        assertEquals(1, sensors.size());
        assertEquals(sensorId, sensors.get(0).getSensorId());
    }

    @Test
    public void removeSensor_existingId_removesSensor() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();
        facade.addSensor(sensorId, SensorType.MOTION, equipmentId);

        facade.removeSensor(sensorId);

        assertTrue(facade.getAllSensors().isEmpty());
    }

    @Test
    public void deactivateSensor_existingSensor_changesStateToInactive() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();
        facade.addSensor(sensorId, SensorType.MOTION, equipmentId);

        facade.deactivateSensor(sensorId);

        assertEquals("INACTIVE", facade.getAllSensors().get(0).getStateName());
    }

    @Test
    public void activateSensor_fromInactive_changesStateToActive() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();
        facade.addSensor(sensorId, SensorType.MOTION, equipmentId);
        facade.deactivateSensor(sensorId);

        facade.activateSensor(sensorId);

        assertEquals("ACTIVE", facade.getAllSensors().get(0).getStateName());
    }

    @Test
    public void flagSensorError_existingSensor_changesStateToError() {
        UUID sensorId = UUID.randomUUID();
        UUID equipmentId = UUID.randomUUID();
        facade.addSensor(sensorId, SensorType.MOTION, equipmentId);

        facade.flagSensorError(sensorId);

        assertEquals("ERROR", facade.getAllSensors().get(0).getStateName());
    }

    @Test
    public void activateSensor_missingSensor_doesNothing() {
        facade.activateSensor(UUID.randomUUID());
        assertTrue(facade.getAllSensors().isEmpty());
    }

    @Test
    public void addEquipment_thenGetAllEquipment_containsAddedEquipment() {
        UUID equipmentId = UUID.randomUUID();

        facade.addEquipment(equipmentId, EquipmentType.OSCILLOSCOPE, "Scope", LabLocation.LAS1001);

        List<Equipment> equipment = facade.getAllEquipment();
        assertEquals(1, equipment.size());
        assertEquals(equipmentId, equipment.get(0).getEquipmentId());
    }

    @Test
    public void removeEquipment_existingId_removesEquipment() {
        UUID equipmentId = UUID.randomUUID();
        facade.addEquipment(equipmentId, EquipmentType.OSCILLOSCOPE, "Scope", LabLocation.LAS1001);

        facade.removeEquipment(equipmentId);

        assertTrue(facade.getAllEquipment().isEmpty());
    }

    @Test
    public void setEquipmentDisabled_existingEquipment_setsDisabledStatus() {
        UUID equipmentId = UUID.randomUUID();
        facade.addEquipment(equipmentId, EquipmentType.OSCILLOSCOPE, "Scope", LabLocation.LAS1001);

        facade.setEquipmentDisabled(equipmentId);

        assertEquals(EquipmentStatus.DISABLED, facade.getAllEquipment().get(0).getEquipmentStatus());
    }

    @Test
    public void setEquipmentMaintenance_existingEquipment_setsMaintenanceStatus() {
        UUID equipmentId = UUID.randomUUID();
        facade.addEquipment(equipmentId, EquipmentType.OSCILLOSCOPE, "Scope", LabLocation.LAS1001);

        facade.setEquipmentMaintenance(equipmentId);

        assertEquals(EquipmentStatus.MAINTENANCE, facade.getAllEquipment().get(0).getEquipmentStatus());
    }

    @Test
    public void setEquipmentAvailable_afterDisabled_setsAvailableStatus() {
        UUID equipmentId = UUID.randomUUID();
        facade.addEquipment(equipmentId, EquipmentType.OSCILLOSCOPE, "Scope", LabLocation.LAS1001);
        facade.setEquipmentDisabled(equipmentId);

        facade.setEquipmentAvailable(equipmentId);

        assertEquals(EquipmentStatus.AVAILABLE, facade.getAllEquipment().get(0).getEquipmentStatus());
    }

    @Test
    public void setEquipmentDisabled_missingEquipment_doesNothing() {
        facade.setEquipmentDisabled(UUID.randomUUID());
        assertTrue(facade.getAllEquipment().isEmpty());
    }

    @Test
    public void sendUsageData_validInput_returnsSuccess() {
        UUID equipmentId = UUID.randomUUID();
        UUID sensorId = UUID.randomUUID();

        facade.addEquipment(equipmentId, EquipmentType.OSCILLOSCOPE, "Scope", LabLocation.LAS1001);
        facade.addSensor(sensorId, SensorType.MOTION, equipmentId);

        String result = facade.sendUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());

        assertTrue(result.startsWith("SUCCESS: LOG-"));
    }

    @Test
    public void sendUsageData_validInput_addsUsageLog() {
        UUID equipmentId = UUID.randomUUID();
        UUID sensorId = UUID.randomUUID();

        facade.addEquipment(equipmentId, EquipmentType.OSCILLOSCOPE, "Scope", LabLocation.LAS1001);
        facade.addSensor(sensorId, SensorType.MOTION, equipmentId);

        facade.sendUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());

        assertEquals(1, facade.getAllUsageLogs().size());
    }

    @Test
    public void sendUsageData_validInput_updatesEquipmentStatus() {
        UUID equipmentId = UUID.randomUUID();
        UUID sensorId = UUID.randomUUID();

        facade.addEquipment(equipmentId, EquipmentType.OSCILLOSCOPE, "Scope", LabLocation.LAS1001);
        facade.addSensor(sensorId, SensorType.MOTION, equipmentId);

        facade.sendUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());

        assertEquals(EquipmentStatus.IN_USE, facade.getAllEquipment().get(0).getEquipmentStatus());
    }

    @Test
    public void sendUsageData_invalidSensor_returnsError() {
        UUID equipmentId = UUID.randomUUID();
        facade.addEquipment(equipmentId, EquipmentType.OSCILLOSCOPE, "Scope", LabLocation.LAS1001);

        String result = facade.sendUsageData(UUID.randomUUID(), equipmentId, "IN_USE", LocalDateTime.now());

        assertTrue(result.startsWith("ERROR: Invalid sensorId"));
    }

    @Test
    public void addObserver_customObserver_receivesNotificationThroughFacade() {
        UUID equipmentId = UUID.randomUUID();
        UUID sensorId = UUID.randomUUID();

        CountingObserver observer = new CountingObserver();
        facade.addObserver(observer);

        facade.addEquipment(equipmentId, EquipmentType.OSCILLOSCOPE, "Scope", LabLocation.LAS1001);
        facade.addSensor(sensorId, SensorType.MOTION, equipmentId);

        facade.sendUsageData(sensorId, equipmentId, "IN_USE", LocalDateTime.now());

        assertEquals(1, observer.count);
        assertNotNull(observer.lastEntry);
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