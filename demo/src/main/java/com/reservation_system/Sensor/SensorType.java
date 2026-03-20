package com.reservation_system.Sensor;

/**
 * Enumerates the physical sensor types that can be attached to lab equipment.
 * Used by Equipment.checkIn() and Equipment.setInUse() to record which
 * sensor triggered the status change.
 */
public enum SensorType {
    MOTION,       // detects physical movement near equipment
    POWER,        // monitors power draw (equipment powered on/off)
    OCCUPANCY,    // detects a user present at the workstation
    THERMAL       // monitors heat output (indicates active processing)
}
