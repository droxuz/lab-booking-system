package com.reservation_system.Sensor;

import static org.junit.Assert.*;

import org.junit.Test;

public class SensorTypeTest {

    @Test
    public void valueOf_motion_returnsMotion() {
        assertEquals(SensorType.MOTION, SensorType.valueOf("MOTION"));
    }

    @Test
    public void valueOf_power_returnsPower() {
        assertEquals(SensorType.POWER, SensorType.valueOf("POWER"));
    }

    @Test
    public void valueOf_occupancy_returnsOccupancy() {
        assertEquals(SensorType.OCCUPANCY, SensorType.valueOf("OCCUPANCY"));
    }

    @Test
    public void valueOf_thermal_returnsThermal() {
        assertEquals(SensorType.THERMAL, SensorType.valueOf("THERMAL"));
    }

    @Test
    public void values_containsFourSensorTypes() {
        assertEquals(4, SensorType.values().length);
    }
}
