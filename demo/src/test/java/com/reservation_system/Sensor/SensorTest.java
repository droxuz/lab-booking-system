package com.reservation_system.Sensor;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

public class SensorTest {

    private UUID sensorId;
    private UUID equipmentId;
    private Sensor sensor;

    @Before
    public void setUp() {
        sensorId = UUID.randomUUID();
        equipmentId = UUID.randomUUID();
        sensor = new Sensor(sensorId, SensorType.MOTION, equipmentId);
    }

    @Test
    public void constructor_defaultsToActiveState() {
        assertEquals("ACTIVE", sensor.getStateName());
        assertTrue(sensor.getState() instanceof ActiveSensorState);
    }

    @Test
    public void constructor_setsFieldsCorrectly() {
        assertEquals(sensorId, sensor.getSensorId());
        assertEquals(SensorType.MOTION, sensor.getSensorType());
        assertEquals(equipmentId, sensor.getLinkedEquipmentId());
    }

    @Test
    public void secondConstructor_usesProvidedState() {
        Sensor restored = new Sensor(sensorId, SensorType.POWER, equipmentId, new InactiveSensorState());

        assertEquals("INACTIVE", restored.getStateName());
        assertTrue(restored.getState() instanceof InactiveSensorState);
    }

    @Test
    public void activate_fromInactive_changesStateToActive() {
        sensor.deactivate();

        sensor.activate();

        assertEquals("ACTIVE", sensor.getStateName());
        assertTrue(sensor.getState() instanceof ActiveSensorState);
    }

    @Test
    public void deactivate_fromActive_changesStateToInactive() {
        sensor.deactivate();

        assertEquals("INACTIVE", sensor.getStateName());
        assertTrue(sensor.getState() instanceof InactiveSensorState);
    }

    @Test
    public void flagError_fromActive_changesStateToError() {
        sensor.flagError();

        assertEquals("ERROR", sensor.getStateName());
        assertTrue(sensor.getState() instanceof ErrorSensorState);
    }

    @Test
    public void canSendData_whenActive_returnsTrue() {
        assertTrue(sensor.canSendData());
    }

    @Test
    public void canSendData_whenInactive_returnsFalse() {
        sensor.deactivate();

        assertFalse(sensor.canSendData());
    }

    @Test
    public void canSendData_whenError_returnsFalse() {
        sensor.flagError();

        assertFalse(sensor.canSendData());
    }

    @Test
    public void recordUsage_addsEntryToUsageLogs() {
        UsageLogEntry entry = new UsageLogEntry(
                "LOG-00001",
                sensorId,
                equipmentId,
                LocalDateTime.now(),
                "IN_USE"
        );

        sensor.recordUsage(entry);

        assertEquals(1, sensor.getUsageLogs().size());
        assertSame(entry, sensor.getUsageLogs().get(0));
    }

    @Test
    public void getUsageLogs_returnsUnmodifiableList() {
        UsageLogEntry entry = new UsageLogEntry(
                "LOG-00002",
                sensorId,
                equipmentId,
                LocalDateTime.now(),
                "IDLE"
        );
        sensor.recordUsage(entry);

        List<UsageLogEntry> logs = sensor.getUsageLogs();

        try {
            logs.add(entry);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            assertEquals(1, sensor.getUsageLogs().size());
        }
    }

    @Test
    public void setSensorType_updatesType() {
        sensor.setSensorType(SensorType.THERMAL);

        assertEquals(SensorType.THERMAL, sensor.getSensorType());
    }

    @Test
    public void setLinkedEquipmentId_updatesLinkedEquipmentId() {
        UUID newEquipmentId = UUID.randomUUID();

        sensor.setLinkedEquipmentId(newEquipmentId);

        assertEquals(newEquipmentId, sensor.getLinkedEquipmentId());
    }

    @Test
    public void toString_containsIdTypeEquipmentAndState() {
        String text = sensor.toString();

        assertTrue(text.contains(sensorId.toString()));
        assertTrue(text.contains("MOTION"));
        assertTrue(text.contains(equipmentId.toString()));
        assertTrue(text.contains("ACTIVE"));
    }
}
