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

public class EquipmentSensorTest {
    @Test
    public void testSensorLinkedToCorrectEquipment() {
        Equipment equipment = new Equipment(
                UUID.randomUUID(),
                EquipmentType.FPGA_BOARD,
                "DE10-Lite board",
                LabLocation.BERGERON300
        );

        Sensor sensor = new Sensor(SensorType.BEING_USED, equipment);

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

        Sensor sensor1 = new Sensor(SensorType.BEING_USED, equipment);
        Sensor sensor2 = new Sensor(SensorType.IDLE_DETECTED, equipment);

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

        Sensor sensor1 = new Sensor(SensorType.BEING_USED, equipment);
        Sensor sensor2 = new Sensor(SensorType.ERROR_DETECTED, equipment);

        assertSame(equipment, sensor1.getEquipment());
        assertSame(equipment, sensor2.getEquipment());
        assertEquals(sensor1.getEquipment().getEquipmentId(), sensor2.getEquipment().getEquipmentId());
    }

    @Test
    public void testIdleEventBypassesMaintenanceState() {
        // 1. Setup
        LabManager manager = new LabManager(UUID.randomUUID(), "Alice");
        Equipment SOLDERING_STATION = manager.addEquipment("High-Speed Centrifuge", EquipmentType.SOLDERING_STATION, LabLocation.LAS1001);

        manager.markEquipmentMaintenance(SOLDERING_STATION);
        assertEquals(EquipmentStatus.MAINTENANCE, SOLDERING_STATION.getEquipmentStatus());

        Sensor idleSensor = new Sensor(SensorType.IDLE_DETECTED, SOLDERING_STATION);
        idleSensor.recordUsage();
        assertEquals(EquipmentStatus.AVAILABLE, SOLDERING_STATION.getEquipmentStatus(),
                "VULNERABILITY: Sensor event bypassed Maintenance lock!");

        manager.disableEquipment(SOLDERING_STATION);
        assertEquals(EquipmentStatus.DISABLED, SOLDERING_STATION.getEquipmentStatus());
        idleSensor.recordUsage();
        assertTrue(SOLDERING_STATION.isAvailable(), "VULNERABILITY: Sensor event bypassed Disabled state!");
    }

    @Test
    public void simulateSystemExploit_demonstratesCurrentVulnerability() {
        LabManager manager = new LabManager(UUID.randomUUID(), "Admin_User");
        Equipment fpga = manager.addEquipment("FPGA-Board-01", EquipmentType.FPGA_BOARD, LabLocation.BERGERON300);

        manager.markEquipmentMaintenance(fpga);
        Sensor activitySensor = new Sensor(SensorType.BEING_USED, fpga);
        activitySensor.recordUsage();
        assertEquals(EquipmentStatus.MAINTENANCE, fpga.getEquipmentStatus());
        manager.disableEquipment(fpga);
        Sensor idleSensor = new Sensor(SensorType.IDLE_DETECTED, fpga);
        idleSensor.recordUsage();
        assertTrue(fpga.isAvailable(), "Bug demonstrated: disabled equipment was reactivated by sensor input.");
    }

    @Test
    public void breakManagerAuthority() {
        LabManager manager = new LabManager(UUID.randomUUID(), "Super_Admin");
        Equipment fpga = manager.addEquipment("FPGA-01", EquipmentType.FPGA_BOARD, LabLocation.BERGERON300);

        manager.disableEquipment(fpga);
        assertEquals(EquipmentStatus.DISABLED, fpga.getEquipmentStatus());
        manager.enableEquipment(fpga);
        assertEquals(EquipmentStatus.AVAILABLE, fpga.getEquipmentStatus());
    }

}
