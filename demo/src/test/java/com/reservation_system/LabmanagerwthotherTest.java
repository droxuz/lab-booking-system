package com.reservation_system;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentStatus;
import com.reservation_system.Equipment.EquipmentType;
import com.reservation_system.Equipment.LabLocation;
import com.reservation_system.LabManager.LabManager;
import com.reservation_system.Sensor.Sensor;
import com.reservation_system.Sensor.SensorType;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class LabmanagerwthotherTest {
    @Test
    public void testLabManagerAddsEquipmentSuccessfully() {
        LabManager manager = new LabManager(UUID.randomUUID(), "Manager1");

        Equipment equipment = manager.addEquipment(
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
    public void testLabManagerCanDisableEnableAndMarkMaintenance() {
        LabManager manager = new LabManager(UUID.randomUUID(), "Manager2");

        Equipment equipment = manager.addEquipment(
                "Digital oscilloscope",
                EquipmentType.OSCILLOSCOPE,
                LabLocation.LAS1001
        );

        manager.disableEquipment(equipment);
        assertEquals(EquipmentStatus.DISABLED, equipment.getEquipmentStatus());

        manager.enableEquipment(equipment);
        assertEquals(EquipmentStatus.AVAILABLE, equipment.getEquipmentStatus());

        manager.markEquipmentMaintenance(equipment);
        assertEquals(EquipmentStatus.MAINTENANCE, equipment.getEquipmentStatus());
    }

    @Test
    public void testLabManagerAndSensorBothModifyEquipment() {
        LabManager manager = new LabManager(UUID.randomUUID(), "Manager3");

        Equipment equipment = manager.addEquipment(
                "Digital multimeter",
                EquipmentType.MULTIMETER,
                LabLocation.LAS1002
        );

        manager.disableEquipment(equipment);
        assertEquals(EquipmentStatus.DISABLED, equipment.getEquipmentStatus());

        manager.enableEquipment(equipment);
        assertEquals(EquipmentStatus.AVAILABLE, equipment.getEquipmentStatus());

        Sensor sensor = new Sensor(SensorType.BEING_USED, equipment);
        sensor.recordUsage();

        assertEquals(EquipmentStatus.IN_USE, equipment.getEquipmentStatus());
        assertEquals(SensorType.BEING_USED, equipment.getLastSensorTriggered());
        assertNotNull(equipment.getLastUsedTime());
    }
}
