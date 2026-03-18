package com.reservation_system;

import com.reservation_system.Equipment.*;
import com.reservation_system.Sensor.Sensor;
import com.reservation_system.Sensor.SensorType;
import com.reservation_system.model.LabManager;
import com.reservation_system.services.EquipmentManagementService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EquipmentManagementServiceTest {

    @Test
    void shouldAddEquipmentSuccessfully() {
        LabManager manager = new LabManager(1, "Manager1", "m1@yorku.ca", "Strong1!", true);
        EquipmentManagementService service = new EquipmentManagementService();

        Equipment equipment = service.addEquipment(
                manager,
                "DE10-Lite board",
                EquipmentType.FPGA_BOARD,
                LabLocation.BERGERON300
        );

        assertNotNull(equipment);
        assertNotNull(equipment.getEquipmentId());
        assertEquals("DE10-Lite board", equipment.getDescription());
        assertEquals(EquipmentType.FPGA_BOARD, equipment.getEquipmentType());
        assertEquals(LabLocation.BERGERON300, equipment.getLabLocation());
        assertEquals(EquipmentStatus.AVAILABLE, equipment.getEquipmentStatus());
    }

    @Test
    void shouldEnableDisableAndMarkMaintenance() {
        LabManager manager = new LabManager(2, "Manager2", "m2@yorku.ca", "Strong1!", true);
        EquipmentManagementService service = new EquipmentManagementService();

        Equipment equipment = service.addEquipment(
                manager,
                "Oscilloscope",
                EquipmentType.OSCILLOSCOPE,
                LabLocation.LAS1001
        );

        service.disableEquipment(manager, equipment);
        assertEquals(EquipmentStatus.DISABLED, equipment.getEquipmentStatus());

        service.enableEquipment(manager, equipment);
        assertEquals(EquipmentStatus.AVAILABLE, equipment.getEquipmentStatus());

        service.markEquipmentMaintenance(manager, equipment);
        assertEquals(EquipmentStatus.MAINTENANCE, equipment.getEquipmentStatus());
    }

    @Test
    void shouldThrowIfManagerIsNull() {
        EquipmentManagementService service = new EquipmentManagementService();

        assertThrows(IllegalArgumentException.class, () ->
                service.addEquipment(
                        null,
                        "Multimeter",
                        EquipmentType.MULTIMETER,
                        LabLocation.LAS1002
                )
        );
    }

    @Test
    void shouldThrowIfManagerNotApproved() {
        LabManager manager = new LabManager(3, "Manager3", "m3@yorku.ca", "Strong1!", false);
        EquipmentManagementService service = new EquipmentManagementService();

        assertThrows(IllegalStateException.class, () ->
                service.addEquipment(
                        manager,
                        "Multimeter",
                        EquipmentType.MULTIMETER,
                        LabLocation.LAS1002
                )
        );
    }

    @Test
    void shouldWorkWithSensorUsage() {
        LabManager manager = new LabManager(4, "Manager4", "m4@yorku.ca", "Strong1!", true);
        EquipmentManagementService service = new EquipmentManagementService();

        Equipment equipment = service.addEquipment(
                manager,
                "Digital multimeter",
                EquipmentType.MULTIMETER,
                LabLocation.LAS1002
        );

        // simulate reservation first (required before check-in)
        equipment.reserve();

        Sensor sensor = new Sensor(equipment.getEquipmentId(), SensorType.USAGE_DETECTED, equipment);
        sensor.recordUsage();

        assertEquals(EquipmentStatus.IN_USE, equipment.getEquipmentStatus());
        assertEquals(SensorType.USAGE_DETECTED, equipment.getLastSensorTriggered());
        assertNotNull(equipment.getLastUsedTime());
    }
}
