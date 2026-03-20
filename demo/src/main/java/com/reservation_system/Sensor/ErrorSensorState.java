package com.reservation_system.Sensor;

/**
 * STATE PATTERN — Concrete State: Sensor has malfunctioned.
 * Data transmissions are blocked and a warning is logged.
 * A lab manager must explicitly reactivate the sensor after inspection.
 */
public class ErrorSensorState implements SensorState {

    @Override
    public boolean onSendData(Sensor sensor) {
        System.out.println("[SensorState] WARNING: sensor " + sensor.getSensorId()
                + " is in ERROR state — data discarded. Requires manager inspection.");
        return false;
    }

    @Override
    public void activate(Sensor sensor) {
        // Manager cleared the error — restore to active
        sensor.setState(new ActiveSensorState());
    }

    @Override
    public void deactivate(Sensor sensor) {
        sensor.setState(new InactiveSensorState());
    }

    @Override
    public void flagError(Sensor sensor) {
        // Already in error — no-op
    }

    @Override
    public String getStateName() {
        return "ERROR";
    }
}
