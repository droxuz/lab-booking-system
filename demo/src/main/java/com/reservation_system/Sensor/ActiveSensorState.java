package com.reservation_system.Sensor;

/**
 * STATE PATTERN — Concrete State: Sensor is online and sending data normally.
 * Only in this state will sendData calls be forwarded to the system.
 */
public class ActiveSensorState implements SensorState {

    @Override
    public boolean onSendData(Sensor sensor) {
        // Active — allow data through
        return true;
    }

    @Override
    public void activate(Sensor sensor) {
        // Already active — no-op
    }

    @Override
    public void deactivate(Sensor sensor) {
        sensor.setState(new InactiveSensorState());
    }

    @Override
    public void flagError(Sensor sensor) {
        sensor.setState(new ErrorSensorState());
    }

    @Override
    public String getStateName() {
        return "ACTIVE";
    }
}
