package com.reservation_system;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentStatus;
import com.reservation_system.Equipment.EquipmentType;
import com.reservation_system.Equipment.LabLocation;
import com.reservation_system.Sensor.SensorType;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class EquipmentTest {

    private Equipment createEquipment() {
        return new Equipment(
                UUID.randomUUID(),
                EquipmentType.OSCILLOSCOPE,
                "Scope A",
                LabLocation.LAS1001
        );
    }

    private SensorType getSensor() {
        return SensorType.values()[0];
    }

    @Test
    void shouldInitializeWithAvailableStatus() {
        Equipment equipment = createEquipment();

        assertEquals(EquipmentStatus.AVAILABLE, equipment.getEquipmentStatus());
        assertTrue(equipment.isAvailable());
        assertFalse(equipment.isReserved());
        assertFalse(equipment.isInUse());
    }

    @Test
    void shouldReserveWhenAvailable() {
        Equipment equipment = createEquipment();

        equipment.reserve();

        assertEquals(EquipmentStatus.RESERVED, equipment.getEquipmentStatus());
        assertTrue(equipment.isReserved());
    }

    @Test
    void shouldThrowExceptionWhenReservingUnavailableEquipment() {
        Equipment equipment = createEquipment();
        equipment.disable();

        Exception exception = assertThrows(IllegalStateException.class, equipment::reserve);

        assertEquals("Equipment is not available for reservation.", exception.getMessage());
    }

    @Test
    void shouldCancelReservationSuccessfully() {
        Equipment equipment = createEquipment();
        equipment.reserve();

        equipment.cancelReservation();

        assertEquals(EquipmentStatus.AVAILABLE, equipment.getEquipmentStatus());
    }

    @Test
    void shouldCheckInAfterReservation() {
        Equipment equipment = createEquipment();
        SensorType sensor = getSensor();

        equipment.reserve();
        equipment.checkIn(sensor);

        assertEquals(EquipmentStatus.IN_USE, equipment.getEquipmentStatus());
        assertTrue(equipment.isInUse());
        assertEquals(sensor, equipment.getLastSensorTriggered());
        assertNotNull(equipment.getLastUsedTime());
    }

    @Test
    void shouldFinishUseAndReturnToAvailable() {
        Equipment equipment = createEquipment();

        equipment.reserve();
        equipment.checkIn(getSensor());
        equipment.finishUse();

        assertEquals(EquipmentStatus.AVAILABLE, equipment.getEquipmentStatus());
        assertTrue(equipment.isAvailable());
    }

    @Test
    void shouldUpdateEquipmentDetails() {
        Equipment equipment = createEquipment();

        equipment.updateDetail(
                EquipmentType.MULTIMETER,
                "Updated Meter",
                LabLocation.BERGERON200
        );

        assertEquals(EquipmentType.MULTIMETER, equipment.getEquipmentType());
        assertEquals("Updated Meter", equipment.getDescription());
        assertEquals(LabLocation.BERGERON200, equipment.getLabLocation());
    }

    @Test
    void shouldDisableEquipment() {
        Equipment equipment = createEquipment();

        equipment.disable();

        assertEquals(EquipmentStatus.DISABLED, equipment.getEquipmentStatus());
        assertFalse(equipment.isAvailable());
    }

    @Test
    void shouldSetInUseDirectly() {
        Equipment equipment = createEquipment();

        equipment.setInUseDirectly();

        assertEquals(EquipmentStatus.IN_USE, equipment.getEquipmentStatus());
        assertTrue(equipment.isInUse());
        assertNotNull(equipment.getLastUsedTime());
    }
}