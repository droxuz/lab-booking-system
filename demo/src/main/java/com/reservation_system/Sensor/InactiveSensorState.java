package com.reservation_system.Sensor;

/**
 * STATE PATTERN — Concrete State: Sensor is powered down / dormant.
 * Data transmissions are blocked until the sensor is reactivated.
 */
public class InactiveSensorState implements SensorState {

    @Override
    public boolean onSendData(Sensor sensor) {
        System.out.println("[SensorState] Blocked: sensor " + sensor.getSensorId()
                + " is INACTIVE — data discarded.");
        return false;
    }

    @Override
    public void activate(Sensor sensor) {
        sensor.setState(new ActiveSensorState());
    }

    @Override
    public void deactivate(Sensor sensor) {
        // Already inactive — no-op
    }

    @Override
    public void flagError(Sensor sensor) {
        sensor.setState(new ErrorSensorState());
    }

    @Override
    public String getStateName() {
        return "INACTIVE";
    }
}
