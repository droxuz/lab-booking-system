package com.reservation_system.Sensor;

/**
 * STATE PATTERN — State interface.
 *
 * Represents the operational state of a Sensor itself
 * (not Equipment — Equipment manages its own status internally).
 *
 * States:
 *   ActiveSensorState   — sensor is online and transmitting data
 *   InactiveSensorState — sensor is powered down / dormant
 *   ErrorSensorState    — sensor has malfunctioned; data cannot be trusted
 */
public interface SensorState {

    /**
     * Called when the sensor attempts to send usage data.
     * Active sensors proceed; inactive/error sensors block or flag the call.
     *
     * @return true if the data should be processed, false if it should be blocked
     */
    boolean onSendData(Sensor sensor);

    /** Transition: activate this sensor. */
    void activate(Sensor sensor);

    /** Transition: deactivate this sensor. */
    void deactivate(Sensor sensor);

    /** Transition: flag this sensor as errored. */
    void flagError(Sensor sensor);

    /** Human-readable label for CSV storage and GUI display. */
    String getStateName();
}
