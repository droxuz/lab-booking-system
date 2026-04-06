package com.reservation_system.Sensor;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

public class ErrorSensorStateTest {

    private Sensor sensor;
    private ErrorSensorState state;

    @Before
    public void setUp() {
        sensor = new Sensor(UUID.randomUUID(), SensorType.OCCUPANCY, UUID.randomUUID());
        sensor.flagError();
        state = new ErrorSensorState();
    }

    @Test
    public void onSendData_errorState_returnsFalse() {
        assertFalse(state.onSendData(sensor));
    }

    @Test
    public void getStateName_returnsError() {
        assertEquals("ERROR", state.getStateName());
    }

    @Test
    public void activate_transitionsToActive() {
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
    public void flagError_whenAlreadyError_keepsErrorState() {
        state.flagError(sensor);
        assertEquals("ERROR", sensor.getStateName());
        assertTrue(sensor.getState() instanceof ErrorSensorState);
    }
}
