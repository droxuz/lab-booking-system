package com.reservation_system.Sensor;

/**
 * OBSERVER PATTERN — Observer interface.
 *
 * Any component that needs to react to sensor usage events implements this.
 * SensorManager (the Subject/Publisher) calls onUsageDataReceived()
 * on every registered observer whenever valid sensor data arrives.
 */
public interface SensorObserver {
    void onUsageDataReceived(UsageLogEntry entry);
}
