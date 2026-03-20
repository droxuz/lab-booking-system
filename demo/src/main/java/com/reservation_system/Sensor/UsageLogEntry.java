package com.reservation_system.Sensor;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Represents a single sensor usage event.
 *
 * Per the subsystem redesign, log ownership lives here in the Sensor
 * package rather than in a separate UsageLog class. Each Sensor holds
 * a list of these in memory; they are also persisted to usage_logs.csv.
 *
 * NOTE: If the team's shared model.UsageLogEntry already exists and
 * is compatible, this class can be replaced by an import of that one.
 */
public class UsageLogEntry {

    private final String        logId;
    private final UUID          sensorId;
    private final UUID          equipmentId;
    private final LocalDateTime timestamp;
    private final String        usageStatus;   // IN_USE | IDLE | OFF

    public UsageLogEntry(String logId, UUID sensorId, UUID equipmentId,
                         LocalDateTime timestamp, String usageStatus) {
        this.logId       = logId;
        this.sensorId    = sensorId;
        this.equipmentId = equipmentId;
        this.timestamp   = timestamp;
        this.usageStatus = usageStatus;
    }

    public String        getLogId()       { return logId; }
    public UUID          getSensorId()    { return sensorId; }
    public UUID          getEquipmentId() { return equipmentId; }
    public LocalDateTime getTimestamp()   { return timestamp; }
    public String        getUsageStatus() { return usageStatus; }

    @Override
    public String toString() {
        return "UsageLogEntry{" + logId
                + ", sensor=" + sensorId
                + ", equip=" + equipmentId
                + ", status=" + usageStatus
                + ", time=" + timestamp + "}";
    }
}
