package com.reservation_system;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentType;
import com.reservation_system.Equipment.LabLocation;

import com.reservation_system.Sensor.Sensor;
import com.reservation_system.Sensor.SensorType;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class EquipmentSensorTest {
    @Test
    public void testSensorLinkedToCorrectEquipment() {
        Equipment equipment = new Equipment(
                UUID.randomUUID(),
                EquipmentType.FPGA_BOARD,
                "DE10-Lite board",
                LabLocation.BERGERON300
        );

        Sensor sensor = new Sensor(UUID.randomUUID(), SensorType.USAGE_DETECTED, equipment);

        assertEquals(equipment, sensor.getEquipment());
        assertEquals(equipment.getEquipmentId(), sensor.getEquipment().getEquipmentId());
    }

    @Test
    public void testDifferentSensorsHaveDifferentSensorIds() {
        Equipment equipment = new Equipment(
                UUID.randomUUID(),
                EquipmentType.OSCILLOSCOPE,
                "Lab oscilloscope",
                LabLocation.LAS1001
        );

        Sensor sensor1 = new Sensor(UUID.randomUUID(), SensorType.USAGE_DETECTED, equipment);
        Sensor sensor2 = new Sensor(UUID.randomUUID(), SensorType.IDLE_DETECTED, equipment);

        assertNotNull(sensor1.getSensorID());
        assertNotNull(sensor2.getSensorID());
        assertNotEquals(sensor1.getSensorID(), sensor2.getSensorID());
    }

    @Test
    public void testMultipleSensorsCanReferenceSameEquipment() {
        Equipment equipment = new Equipment(
                UUID.randomUUID(),
                EquipmentType.MULTIMETER,
                "Bench multimeter",
                LabLocation.LAS1002
        );

        Sensor sensor1 = new Sensor(UUID.randomUUID(), SensorType.USAGE_DETECTED, equipment);
        Sensor sensor2 = new Sensor(UUID.randomUUID(), SensorType.ERROR_DETECTED, equipment);

        assertSame(equipment, sensor1.getEquipment());
        assertSame(equipment, sensor2.getEquipment());
        assertEquals(sensor1.getEquipment().getEquipmentId(), sensor2.getEquipment().getEquipmentId());
    }
}
