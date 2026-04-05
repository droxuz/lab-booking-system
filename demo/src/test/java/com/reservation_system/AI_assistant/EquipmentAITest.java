package com.reservation_system.AI_assistant;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentStatus;
import com.reservation_system.Equipment.EquipmentType;
import com.reservation_system.Equipment.LabLocation;
import com.reservation_system.Sensor.SensorType;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class EquipmentAITest {

    private Equipment createEquipment() {
        return new Equipment(
                UUID.randomUUID(),
                EquipmentType.OSCILLOSCOPE,
                "Oscilloscope A",
                LabLocation.LAS1001
        );
    }

    private SensorType createSensor() {
        return SensorType.values()[0];
    }

    @Test
    void constructorShouldInitializeDefaultValuesCorrectly() {
        UUID id = UUID.randomUUID();

        Equipment equipment = new Equipment(
                id,
                EquipmentType.FPGA_BOARD,
                "FPGA Board 1",
                LabLocation.BERGERON200
        );

        assertEquals(id, equipment.getEquipmentId());
        assertEquals(EquipmentType.FPGA_BOARD, equipment.getEquipmentType());
        assertEquals("FPGA Board 1", equipment.getDescription());
        assertEquals(LabLocation.BERGERON200, equipment.getLabLocation());
        assertEquals(EquipmentStatus.AVAILABLE, equipment.getEquipmentStatus());
        assertNull(equipment.getLastUsedTime());
        assertNull(equipment.getLastSensorTriggered());
    }

    @Test
    void newEquipmentShouldBeAvailableByDefault() {
        Equipment equipment = createEquipment();

        assertTrue(equipment.isAvailable());
        assertFalse(equipment.isReserved());
        assertFalse(equipment.isInUse());
    }

    @Test
    void enableShouldSetStatusToAvailable() {
        Equipment equipment = createEquipment();
        equipment.disable();

        equipment.enable();

        assertEquals(EquipmentStatus.AVAILABLE, equipment.getEquipmentStatus());
        assertTrue(equipment.isAvailable());
    }

    @Test
    void disableShouldSetStatusToDisabled() {
        Equipment equipment = createEquipment();

        equipment.disable();

        assertEquals(EquipmentStatus.DISABLED, equipment.getEquipmentStatus());
        assertFalse(equipment.isAvailable());
        assertFalse(equipment.isReserved());
        assertFalse(equipment.isInUse());
    }

    @Test
    void markUnavailableShouldSetStatusToMaintenance() {
        Equipment equipment = createEquipment();

        equipment.markUnavailable();

        assertEquals(EquipmentStatus.MAINTENANCE, equipment.getEquipmentStatus());
        assertFalse(equipment.isAvailable());
    }

    @Test
    void updateDetailShouldReplaceTypeDescriptionAndLocation() {
        Equipment equipment = createEquipment();

        equipment.updateDetail(
                EquipmentType.MULTIMETER,
                "Updated Multimeter",
                LabLocation.BERGERON300
        );

        assertEquals(EquipmentType.MULTIMETER, equipment.getEquipmentType());
        assertEquals("Updated Multimeter", equipment.getDescription());
        assertEquals(LabLocation.BERGERON300, equipment.getLabLocation());
    }

    @Test
    void reserveShouldChangeStatusToReservedWhenAvailable() {
        Equipment equipment = createEquipment();

        equipment.reserve();

        assertEquals(EquipmentStatus.RESERVED, equipment.getEquipmentStatus());
        assertTrue(equipment.isReserved());
        assertFalse(equipment.isAvailable());
    }

    @Test
    void reserveShouldThrowExceptionWhenEquipmentIsDisabled() {
        Equipment equipment = createEquipment();
        equipment.disable();

        IllegalStateException exception = assertThrows(
                IllegalStateException.class,
                equipment::reserve
        );

        assertEquals("Equipment is not available for reservation.", exception.getMessage());
    }

    @Test
    void reserveShouldThrowExceptionWhenEquipmentIsUnderMaintenance() {
        Equipment equipment = createEquipment();
        equipment.markUnavailable();

        IllegalStateException exception = assertThrows(
                IllegalStateException.class,
                equipment::reserve
        );

        assertEquals("Equipment is not available for reservation.", exception.getMessage());
    }

    @Test
    void reserveShouldThrowExceptionWhenEquipmentIsAlreadyReserved() {
        Equipment equipment = createEquipment();
        equipment.reserve();

        IllegalStateException exception = assertThrows(
                IllegalStateException.class,
                equipment::reserve
        );

        assertEquals("Equipment is not available for reservation.", exception.getMessage());
    }

    @Test
    void cancelReservationShouldReturnEquipmentToAvailable() {
        Equipment equipment = createEquipment();
        equipment.reserve();

        equipment.cancelReservation();

        assertEquals(EquipmentStatus.AVAILABLE, equipment.getEquipmentStatus());
        assertTrue(equipment.isAvailable());
    }

    @Test
    void cancelReservationShouldThrowExceptionWhenEquipmentWasNeverReserved() {
        Equipment equipment = createEquipment();

        IllegalStateException exception = assertThrows(
                IllegalStateException.class,
                equipment::cancelReservation
        );

        assertEquals("Equipment is not currently reserved.", exception.getMessage());
    }

    @Test
    void cancelReservationShouldThrowExceptionWhenEquipmentIsDisabled() {
        Equipment equipment = createEquipment();
        equipment.disable();

        IllegalStateException exception = assertThrows(
                IllegalStateException.class,
                equipment::cancelReservation
        );

        assertEquals("Equipment is not currently reserved.", exception.getMessage());
    }

    @Test
    void checkInShouldMoveReservedEquipmentToInUse() {
        Equipment equipment = createEquipment();
        SensorType sensor = createSensor();

        equipment.reserve();
        equipment.checkIn(sensor);

        assertEquals(EquipmentStatus.IN_USE, equipment.getEquipmentStatus());
        assertTrue(equipment.isInUse());
        assertEquals(sensor, equipment.getLastSensorTriggered());
        assertNotNull(equipment.getLastUsedTime());
    }

    @Test
    void checkInShouldRecordTimeWithinExpectedWindow() {
        Equipment equipment = createEquipment();
        SensorType sensor = createSensor();

        equipment.reserve();
        LocalDateTime beforeCheckIn = LocalDateTime.now();

        equipment.checkIn(sensor);

        LocalDateTime afterCheckIn = LocalDateTime.now();

        assertNotNull(equipment.getLastUsedTime());
        assertFalse(equipment.getLastUsedTime().isBefore(beforeCheckIn));
        assertFalse(equipment.getLastUsedTime().isAfter(afterCheckIn));
    }

    @Test
    void checkInShouldThrowExceptionWhenEquipmentIsAvailable() {
        Equipment equipment = createEquipment();

        IllegalStateException exception = assertThrows(
                IllegalStateException.class,
                () -> equipment.checkIn(createSensor())
        );

        assertEquals("Equipment must be reserved before check-in.", exception.getMessage());
    }

    @Test
    void checkInShouldThrowExceptionWhenEquipmentIsDisabled() {
        Equipment equipment = createEquipment();
        equipment.disable();

        IllegalStateException exception = assertThrows(
                IllegalStateException.class,
                () -> equipment.checkIn(createSensor())
        );

        assertEquals("Equipment must be reserved before check-in.", exception.getMessage());
    }

    @Test
    void checkInShouldThrowExceptionWhenEquipmentIsUnderMaintenance() {
        Equipment equipment = createEquipment();
        equipment.markUnavailable();

        IllegalStateException exception = assertThrows(
                IllegalStateException.class,
                () -> equipment.checkIn(createSensor())
        );

        assertEquals("Equipment must be reserved before check-in.", exception.getMessage());
    }

    @Test
    void finishUseShouldReturnInUseEquipmentToAvailable() {
        Equipment equipment = createEquipment();

        equipment.reserve();
        equipment.checkIn(createSensor());
        equipment.finishUse();

        assertEquals(EquipmentStatus.AVAILABLE, equipment.getEquipmentStatus());
        assertTrue(equipment.isAvailable());
        assertFalse(equipment.isReserved());
        assertFalse(equipment.isInUse());
    }

    @Test
    void finishUseShouldThrowExceptionWhenEquipmentIsAvailable() {
        Equipment equipment = createEquipment();

        IllegalStateException exception = assertThrows(
                IllegalStateException.class,
                equipment::finishUse
        );

        assertEquals("Equipment is not currently in use.", exception.getMessage());
    }

    @Test
    void finishUseShouldThrowExceptionWhenEquipmentIsOnlyReserved() {
        Equipment equipment = createEquipment();
        equipment.reserve();

        IllegalStateException exception = assertThrows(
                IllegalStateException.class,
                equipment::finishUse
        );

        assertEquals("Equipment is not currently in use.", exception.getMessage());
    }

    @Test
    void finishUseShouldThrowExceptionWhenEquipmentIsDisabled() {
        Equipment equipment = createEquipment();
        equipment.disable();

        IllegalStateException exception = assertThrows(
                IllegalStateException.class,
                equipment::finishUse
        );

        assertEquals("Equipment is not currently in use.", exception.getMessage());
    }

    @Test
    void setInUseShouldDirectlySetStatusTimeAndSensor() {
        Equipment equipment = createEquipment();
        SensorType sensor = createSensor();

        equipment.setInUse(sensor);

        assertEquals(EquipmentStatus.IN_USE, equipment.getEquipmentStatus());
        assertTrue(equipment.isInUse());
        assertEquals(sensor, equipment.getLastSensorTriggered());
        assertNotNull(equipment.getLastUsedTime());
    }

    @Test
    void setInUseDirectlyShouldSetStatusAndTimeWithoutSensor() {
        Equipment equipment = createEquipment();

        equipment.setInUseDirectly();

        assertEquals(EquipmentStatus.IN_USE, equipment.getEquipmentStatus());
        assertTrue(equipment.isInUse());
        assertNotNull(equipment.getLastUsedTime());
        assertNull(equipment.getLastSensorTriggered());
    }

    @Test
    void equipmentShouldSupportFullReservationLifecycle() {
        Equipment equipment = createEquipment();
        SensorType sensor = createSensor();

        equipment.reserve();
        equipment.checkIn(sensor);
        equipment.finishUse();

        assertEquals(EquipmentStatus.AVAILABLE, equipment.getEquipmentStatus());
        assertNotNull(equipment.getLastUsedTime());
        assertEquals(sensor, equipment.getLastSensorTriggered());
    }

    @Test
    void equipmentShouldBeReservableAgainAfterUseIsFinished() {
        Equipment equipment = createEquipment();

        equipment.reserve();
        equipment.checkIn(createSensor());
        equipment.finishUse();
        equipment.reserve();

        assertEquals(EquipmentStatus.RESERVED, equipment.getEquipmentStatus());
        assertTrue(equipment.isReserved());
    }

    @Test
    void equipmentShouldBeReservableAgainAfterReservationCancellation() {
        Equipment equipment = createEquipment();

        equipment.reserve();
        equipment.cancelReservation();
        equipment.reserve();

        assertEquals(EquipmentStatus.RESERVED, equipment.getEquipmentStatus());
    }

    @Test
    void equipmentShouldBecomeAvailableAfterEnableFromMaintenance() {
        Equipment equipment = createEquipment();

        equipment.markUnavailable();
        equipment.enable();

        assertEquals(EquipmentStatus.AVAILABLE, equipment.getEquipmentStatus());
    }

    @Test
    void equipmentShouldBecomeAvailableAfterEnableFromDisabled() {
        Equipment equipment = createEquipment();

        equipment.disable();
        equipment.enable();

        assertEquals(EquipmentStatus.AVAILABLE, equipment.getEquipmentStatus());
    }

    @Test
    void toStringShouldContainKeyEquipmentInformation() {
        UUID id = UUID.randomUUID();

        Equipment equipment = new Equipment(
                id,
                EquipmentType.POWER_SUPPLY,
                "Bench Power Supply",
                LabLocation.LAS1002
        );

        String result = equipment.toString();

        assertTrue(result.contains(id.toString()));
        assertTrue(result.contains("Bench Power Supply"));
        assertTrue(result.contains("POWER_SUPPLY"));
        assertTrue(result.contains("LAS1002"));
        assertTrue(result.contains("AVAILABLE"));
    }

    @Test
    void gettersShouldReturnExactConstructorValues() {
        UUID id = UUID.randomUUID();
        EquipmentType type = EquipmentType.SOLDERING_STATION;
        String description = "Hakko Station";
        LabLocation location = LabLocation.BERGERON300;

        Equipment equipment = new Equipment(id, type, description, location);

        assertEquals(id, equipment.getEquipmentId());
        assertEquals(type, equipment.getEquipmentType());
        assertEquals(description, equipment.getDescription());
        assertEquals(location, equipment.getLabLocation());
    }
}