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
import java.util.UUID;

public class EquipmentStatusObserverTest {

    private CSVDataStore dataStore;
    private EquipmentStatusObserver observer;
    private File testDir;

    @Before
    public void setUp() {
        testDir = new File("test-data/equipment-status-observer-" + System.nanoTime());
        dataStore = new CSVDataStore(testDir.getPath());
        observer = new EquipmentStatusObserver(dataStore);
    }

    @After
    public void tearDown() {
        deleteRecursively(testDir);
    }

    @Test
    public void onUsageDataReceived_inUseFromAvailable_setsEquipmentToInUse() {
        Equipment equipment = equipment();
        dataStore.saveEquipment(equipment);

        observer.onUsageDataReceived(entry(equipment.getEquipmentId(), "IN_USE"));

        Equipment loaded = dataStore.loadEquipment(equipment.getEquipmentId());
        assertEquals(EquipmentStatus.IN_USE, loaded.getEquipmentStatus());
    }

    @Test
    public void onUsageDataReceived_inUseFromAvailable_setsLastUsedTime() {
        Equipment equipment = equipment();
        dataStore.saveEquipment(equipment);

        observer.onUsageDataReceived(entry(equipment.getEquipmentId(), "IN_USE"));

        Equipment loaded = dataStore.loadEquipment(equipment.getEquipmentId());
        assertNotNull(loaded.getLastUsedTime());
    }

    @Test
    public void onUsageDataReceived_inUseFromAvailable_keepsLastSensorTriggeredNull() {
        Equipment equipment = equipment();
        dataStore.saveEquipment(equipment);

        observer.onUsageDataReceived(entry(equipment.getEquipmentId(), "IN_USE"));

        Equipment loaded = dataStore.loadEquipment(equipment.getEquipmentId());
        assertNull(loaded.getLastSensorTriggered());
    }

    @Test
    public void onUsageDataReceived_inUseFromReserved_setsEquipmentToInUse() {
        Equipment equipment = equipment();
        equipment.reserve();
        dataStore.saveEquipment(equipment);

        observer.onUsageDataReceived(entry(equipment.getEquipmentId(), "IN_USE"));

        Equipment loaded = dataStore.loadEquipment(equipment.getEquipmentId());
        assertEquals(EquipmentStatus.IN_USE, loaded.getEquipmentStatus());
    }

    @Test
    public void onUsageDataReceived_idleFromInUse_setsEquipmentToAvailable() {
        Equipment equipment = equipment();
        equipment.setInUseDirectly();
        dataStore.saveEquipment(equipment);

        observer.onUsageDataReceived(entry(equipment.getEquipmentId(), "IDLE"));

        Equipment loaded = dataStore.loadEquipment(equipment.getEquipmentId());
        assertEquals(EquipmentStatus.AVAILABLE, loaded.getEquipmentStatus());
    }

    @Test
    public void onUsageDataReceived_offFromInUse_setsEquipmentToAvailable() {
        Equipment equipment = equipment();
        equipment.setInUseDirectly();
        dataStore.saveEquipment(equipment);

        observer.onUsageDataReceived(entry(equipment.getEquipmentId(), "OFF"));

        Equipment loaded = dataStore.loadEquipment(equipment.getEquipmentId());
        assertEquals(EquipmentStatus.AVAILABLE, loaded.getEquipmentStatus());
    }

    @Test
    public void onUsageDataReceived_idleFromAvailable_leavesEquipmentAvailable() {
        Equipment equipment = equipment();
        dataStore.saveEquipment(equipment);

        observer.onUsageDataReceived(entry(equipment.getEquipmentId(), "IDLE"));

        Equipment loaded = dataStore.loadEquipment(equipment.getEquipmentId());
        assertEquals(EquipmentStatus.AVAILABLE, loaded.getEquipmentStatus());
    }

    @Test
    public void onUsageDataReceived_offFromReserved_leavesEquipmentReserved() {
        Equipment equipment = equipment();
        equipment.reserve();
        dataStore.saveEquipment(equipment);

        observer.onUsageDataReceived(entry(equipment.getEquipmentId(), "OFF"));

        Equipment loaded = dataStore.loadEquipment(equipment.getEquipmentId());
        assertEquals(EquipmentStatus.RESERVED, loaded.getEquipmentStatus());
    }

    @Test
    public void onUsageDataReceived_inUseFromDisabled_ignoresSignal() {
        Equipment equipment = equipment();
        equipment.disable();
        dataStore.saveEquipment(equipment);

        observer.onUsageDataReceived(entry(equipment.getEquipmentId(), "IN_USE"));

        Equipment loaded = dataStore.loadEquipment(equipment.getEquipmentId());
        assertEquals(EquipmentStatus.DISABLED, loaded.getEquipmentStatus());
    }

    @Test
    public void onUsageDataReceived_inUseFromMaintenance_ignoresSignal() {
        Equipment equipment = equipment();
        equipment.markUnavailable();
        dataStore.saveEquipment(equipment);

        observer.onUsageDataReceived(entry(equipment.getEquipmentId(), "IN_USE"));

        Equipment loaded = dataStore.loadEquipment(equipment.getEquipmentId());
        assertEquals(EquipmentStatus.MAINTENANCE, loaded.getEquipmentStatus());
    }

    @Test
    public void onUsageDataReceived_unknownSignal_leavesEquipmentUnchanged() {
        Equipment equipment = equipment();
        dataStore.saveEquipment(equipment);

        observer.onUsageDataReceived(entry(equipment.getEquipmentId(), "UNKNOWN"));

        Equipment loaded = dataStore.loadEquipment(equipment.getEquipmentId());
        assertEquals(EquipmentStatus.AVAILABLE, loaded.getEquipmentStatus());
    }

    @Test
    public void onUsageDataReceived_missingEquipment_doesNothingAndDoesNotThrow() {
        observer.onUsageDataReceived(entry(UUID.randomUUID(), "IN_USE"));
        assertTrue(dataStore.loadAllEquipment().isEmpty());
    }

    private Equipment equipment() {
        return new Equipment(
                UUID.randomUUID(),
                EquipmentType.OSCILLOSCOPE,
                "Scope",
                LabLocation.LAS1001
        );
    }

    private UsageLogEntry entry(UUID equipmentId, String status) {
        return new UsageLogEntry(
                "LOG-12345",
                UUID.randomUUID(),
                equipmentId,
                LocalDateTime.of(2026, 4, 5, 11, 0),
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