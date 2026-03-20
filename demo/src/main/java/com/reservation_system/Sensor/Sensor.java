package com.reservation_system.Sensor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/**
 * Represents a physical lab sensor attached to a piece of equipment.
 *
 * STATE PATTERN — Context: delegates operational behaviour to the
 * current SensorState (ACTIVE / INACTIVE / ERROR).
 *
 * Owns the UsageLogEntry history for this sensor (per the redesign
 * decision to move log ownership out of a separate UsageLog class
 * and into the Sensor subsystem).
 */
public class Sensor {

    private final UUID             sensorId;
    private       SensorType       sensorType;
    private       UUID             linkedEquipmentId;
    private       SensorState      state;
    private final List<UsageLogEntry> usageLogs;

    /** New sensors default to ACTIVE. */
    public Sensor(UUID sensorId, SensorType sensorType, UUID linkedEquipmentId) {
        this.sensorId         = sensorId;
        this.sensorType       = sensorType;
        this.linkedEquipmentId = linkedEquipmentId;
        this.state            = new ActiveSensorState();
        this.usageLogs        = new ArrayList<>();
    }

    /** Restore a sensor from CSV with a known state. */
    public Sensor(UUID sensorId, SensorType sensorType,
                  UUID linkedEquipmentId, SensorState state) {
        this.sensorId          = sensorId;
        this.sensorType        = sensorType;
        this.linkedEquipmentId = linkedEquipmentId;
        this.state             = state;
        this.usageLogs         = new ArrayList<>();
    }

    // ── State transitions (delegated to current SensorState) ──

    public void setState(SensorState state)  { this.state = state; }
    public SensorState getState()            { return state; }
    public String getStateName()             { return state.getStateName(); }

    public void activate()   { state.activate(this); }
    public void deactivate() { state.deactivate(this); }
    public void flagError()  { state.flagError(this); }

    /**
     * Gate check before sending data to the system.
     * Returns true only if the sensor is ACTIVE.
     */
    public boolean canSendData() {
        return state.onSendData(this);
    }

    // ── Usage log ownership ────────────────────────────────────

    /** Records a usage event in this sensor's in-memory history. */
    public void recordUsage(UsageLogEntry entry) {
        usageLogs.add(entry);
    }

    public List<UsageLogEntry> getUsageLogs() {
        return Collections.unmodifiableList(usageLogs);
    }

    // ── Getters / setters ──────────────────────────────────────

    public UUID       getSensorId()          { return sensorId; }
    public SensorType getSensorType()        { return sensorType; }
    public UUID       getLinkedEquipmentId() { return linkedEquipmentId; }

    public void setSensorType(SensorType sensorType)          { this.sensorType = sensorType; }
    public void setLinkedEquipmentId(UUID linkedEquipmentId)  { this.linkedEquipmentId = linkedEquipmentId; }

    @Override
    public String toString() {
        return "Sensor{id=" + sensorId
                + ", type=" + sensorType
                + ", equipment=" + linkedEquipmentId
                + ", state=" + getStateName() + "}";
    }
}
