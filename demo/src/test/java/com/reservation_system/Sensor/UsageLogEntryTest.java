package com.reservation_system.Sensor;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

public class UsageLogEntryTest {

    private String logId;
    private UUID sensorId;
    private UUID equipmentId;
    private LocalDateTime timestamp;
    private UsageLogEntry entry;

    @Before
    public void setUp() {
        logId = "LOG-00099";
        sensorId = UUID.randomUUID();
        equipmentId = UUID.randomUUID();
        timestamp = LocalDateTime.of(2026, 4, 5, 10, 30, 0);
        entry = new UsageLogEntry(logId, sensorId, equipmentId, timestamp, "IN_USE");
    }

    @Test
    public void getLogId_returnsConstructorValue() {
        assertEquals(logId, entry.getLogId());
    }

    @Test
    public void getSensorId_returnsConstructorValue() {
        assertEquals(sensorId, entry.getSensorId());
    }

    @Test
    public void getEquipmentId_returnsConstructorValue() {
        assertEquals(equipmentId, entry.getEquipmentId());
    }

    @Test
    public void getTimestamp_returnsConstructorValue() {
        assertEquals(timestamp, entry.getTimestamp());
    }

    @Test
    public void getUsageStatus_returnsConstructorValue() {
        assertEquals("IN_USE", entry.getUsageStatus());
    }

    @Test
    public void toString_containsLogId() {
        assertTrue(entry.toString().contains(logId));
    }

    @Test
    public void toString_containsSensorId() {
        assertTrue(entry.toString().contains(sensorId.toString()));
    }

    @Test
    public void toString_containsEquipmentId() {
        assertTrue(entry.toString().contains(equipmentId.toString()));
    }

    @Test
    public void toString_containsUsageStatus() {
        assertTrue(entry.toString().contains("IN_USE"));
    }

    @Test
    public void toString_containsTimestamp() {
        assertTrue(entry.toString().contains(timestamp.toString()));
    }
}
