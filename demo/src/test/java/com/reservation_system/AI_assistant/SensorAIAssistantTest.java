package com.reservation_system.AI_assistant;

import static org.junit.Assert.*;

import com.reservation_system.Sensor.ErrorSensorState;
import com.reservation_system.Sensor.InactiveSensorState;
import com.reservation_system.Sensor.Sensor;
import com.reservation_system.Sensor.SensorType;
import com.reservation_system.Sensor.UsageLogEntry;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class SensorAIAssistantTest {

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
    public void stateMachine_multipleTransitions_followExpectedPath() {
        assertEquals("ACTIVE", sensor.getStateName());

        sensor.deactivate();
        assertEquals("INACTIVE", sensor.getStateName());
        assertFalse(sensor.canSendData());

        sensor.flagError();
        assertEquals("ERROR", sensor.getStateName());
        assertFalse(sensor.canSendData());

        sensor.activate();
        assertEquals("ACTIVE", sensor.getStateName());
        assertTrue(sensor.canSendData());
    }

    @Test
    public void providedStateConstructor_restoresErrorState_andCanBeRecovered() {
        Sensor restored = new Sensor(sensorId, SensorType.THERMAL, equipmentId, new ErrorSensorState());

        assertEquals("ERROR", restored.getStateName());
        assertFalse(restored.canSendData());

        restored.activate();

        assertEquals("ACTIVE", restored.getStateName());
        assertTrue(restored.canSendData());
    }

    @Test
    public void recordUsage_multipleEntries_preservesInsertionOrderAndPayload() {
        LocalDateTime firstTime = LocalDateTime.of(2026, 4, 5, 10, 0);
        LocalDateTime secondTime = LocalDateTime.of(2026, 4, 5, 10, 15);

        UsageLogEntry first = new UsageLogEntry("LOG-01000", sensorId, equipmentId, firstTime, "IN_USE");
        UsageLogEntry second = new UsageLogEntry("LOG-01001", sensorId, equipmentId, secondTime, "OFF");

        sensor.recordUsage(first);
        sensor.recordUsage(second);

        List<UsageLogEntry> logs = sensor.getUsageLogs();
        assertEquals(2, logs.size());
        assertEquals("LOG-01000", logs.get(0).getLogId());
        assertEquals(firstTime, logs.get(0).getTimestamp());
        assertEquals("LOG-01001", logs.get(1).getLogId());
        assertEquals("OFF", logs.get(1).getUsageStatus());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getUsageLogs_exposesReadOnlyView_evenAfterSeveralEntries() {
        sensor.recordUsage(new UsageLogEntry("LOG-02000", sensorId, equipmentId, LocalDateTime.now(), "IN_USE"));
        sensor.recordUsage(new UsageLogEntry("LOG-02001", sensorId, equipmentId, LocalDateTime.now(), "IDLE"));

        sensor.getUsageLogs().clear();
    }

    @Test
    public void sensorMetadata_canBeRetargeted_withoutChangingIdentityOrState() {
        UUID newEquipmentId = UUID.randomUUID();

        sensor.deactivate();
        sensor.setSensorType(SensorType.OCCUPANCY);
        sensor.setLinkedEquipmentId(newEquipmentId);

        assertEquals(sensorId, sensor.getSensorId());
        assertEquals(SensorType.OCCUPANCY, sensor.getSensorType());
        assertEquals(newEquipmentId, sensor.getLinkedEquipmentId());
        assertEquals("INACTIVE", sensor.getStateName());
    }

    @Test
    public void toString_afterMutations_reflectsCurrentSnapshot() {
        UUID newEquipmentId = UUID.randomUUID();
        sensor.setSensorType(SensorType.POWER);
        sensor.setLinkedEquipmentId(newEquipmentId);
        sensor.flagError();

        String text = sensor.toString();

        assertTrue(text.contains(sensorId.toString()));
        assertTrue(text.contains(newEquipmentId.toString()));
        assertTrue(text.contains("POWER"));
        assertTrue(text.contains("ERROR"));
    }

    @Test
    public void inactiveStateObjectPassedToConstructor_blocksDataUntilReactivated() {
        Sensor restored = new Sensor(sensorId, SensorType.POWER, equipmentId, new InactiveSensorState());

        assertFalse(restored.canSendData());

        restored.activate();

        assertTrue(restored.canSendData());
        assertEquals("ACTIVE", restored.getStateName());
    }
}
