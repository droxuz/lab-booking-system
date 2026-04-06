package com.reservation_system.Sensor;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

public class ActiveSensorStateTest {

    private Sensor sensor;
    private ActiveSensorState state;

    @Before
    public void setUp() {
        sensor = new Sensor(UUID.randomUUID(), SensorType.MOTION, UUID.randomUUID());
        state = new ActiveSensorState();
    }

    @Test
    public void onSendData_activeState_returnsTrue() {
        assertTrue(state.onSendData(sensor));
    }

    @Test
    public void getStateName_returnsActive() {
        assertEquals("ACTIVE", state.getStateName());
    }

    @Test
    public void activate_whenAlreadyActive_keepsActiveState() {
        state.activate(sensor);
        assertEquals("ACTIVE", sensor.getStateName());
        assertTrue(sensor.getState() instanceof ActiveSensorState);
    }

    @Test
    public void deactivate_transitionsToInactive() {
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
