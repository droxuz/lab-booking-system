package com.reservation_system.Sensor;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

public class InactiveSensorStateTest {

    private Sensor sensor;
    private InactiveSensorState state;

    @Before
    public void setUp() {
        sensor = new Sensor(UUID.randomUUID(), SensorType.POWER, UUID.randomUUID());
        sensor.deactivate();
        state = new InactiveSensorState();
    }

    @Test
    public void onSendData_inactiveState_returnsFalse() {
        assertFalse(state.onSendData(sensor));
    }

    @Test
    public void getStateName_returnsInactive() {
        assertEquals("INACTIVE", state.getStateName());
    }

    @Test
    public void activate_transitionsToActive() {
        state.activate(sensor);
        assertEquals("ACTIVE", sensor.getStateName());
        assertTrue(sensor.getState() instanceof ActiveSensorState);
    }

    @Test
    public void deactivate_whenAlreadyInactive_keepsInactiveState() {
        state.deactivate(sensor);
        assertEquals("INACTIVE", sensor.getStateName());
        assertTrue(sensor.getState() instanceof InactiveSensorState);
    }

    @Test
    public void flagError_transitionsToError() {
        state.flagError(sensor);
        assertEquals("ERROR", sensor.getStateName());
        assertTrue(sensor.getState() instanceof ErrorSensorState);
    }
}
