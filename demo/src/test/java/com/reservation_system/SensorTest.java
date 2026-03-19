package com.reservation_system;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentStatus;
import com.reservation_system.Equipment.EquipmentType;
import com.reservation_system.Equipment.LabLocation;

import com.reservation_system.Sensor.Sensor;
import com.reservation_system.Sensor.SensorType;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;


public class SensorTest {
    @Test
    public void testSensorConstructorInitializesFields() {
        var equipment = new Equipment(
                UUID.randomUUID(),
                EquipmentType.FPGA_BOARD,
                "DE10-Lite board",
                LabLocation.BERGERON300
        );

        Sensor sensor = new Sensor(SensorType.BEING_USED, equipment);

        assertNotNull(sensor.getSensorID());
        assertEquals(SensorType.BEING_USED, sensor.getType());
        assertEquals(equipment, sensor.getEquipment());
    }

    @Test
    public void testUsageDetectedSetsEquipmentToInUse() {
        Equipment equipment = new Equipment(
                UUID.randomUUID(),
                EquipmentType.OSCILLOSCOPE,
                "Digital oscilloscope",
                LabLocation.LAS1001
        );

        Sensor sensor = new Sensor(SensorType.BEING_USED, equipment);
        sensor.recordUsage();

        assertEquals(EquipmentStatus.IN_USE, equipment.getEquipmentStatus());
        assertEquals(SensorType.BEING_USED, equipment.getLastSensorTriggered());
        assertNotNull(equipment.getLastUsedTime());
    }

    @Test
    public void testIdleDetectedSetsEquipmentToAvailable() {
        Equipment equipment = new Equipment(
                UUID.randomUUID(),
                EquipmentType.MULTIMETER,
                "Digital multimeter",
                LabLocation.LAS1002
        );

        equipment.setInUse(SensorType.BEING_USED);
        assertEquals(EquipmentStatus.IN_USE, equipment.getEquipmentStatus());

        Sensor sensor = new Sensor(SensorType.IDLE_DETECTED, equipment);
        sensor.recordUsage();

        assertEquals(EquipmentStatus.AVAILABLE, equipment.getEquipmentStatus());
    }

    @Test
    public void testErrorDetectedSetsEquipmentToMaintenance() {
        Equipment equipment = new Equipment(
                UUID.randomUUID(),
                EquipmentType.SIGNAL_GENERATOR,
                "Function generator",
                LabLocation.BERGERON200
        );

        Sensor sensor = new Sensor(SensorType.ERROR_DETECTED, equipment);
        sensor.recordUsage();

        assertEquals(EquipmentStatus.MAINTENANCE, equipment.getEquipmentStatus());
    }
}
