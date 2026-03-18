package com.reservation_system.Equipment;

import com.reservation_system.Sensor.SensorType;

import java.time.LocalDateTime;
import java.util.UUID;

public class Equipment {

    private UUID equipmentId;
    private EquipmentType equipmentType;
    private String description;
    private LabLocation labLocation;
    private EquipmentStatus equipmentStatus;

    private LocalDateTime lastUsedTime;
    private SensorType lastSensorTriggered;

    public Equipment(UUID equipmentId, EquipmentType equipmentType, String description, LabLocation labLocation) {
        this.equipmentId = equipmentId;
        this.equipmentType = equipmentType;
        this.description = description;
        this.labLocation = labLocation;
        this.equipmentStatus = EquipmentStatus.AVAILABLE;
        this.lastUsedTime = null;
        this.lastSensorTriggered = null;
    }

    public void enable() {
        this.equipmentStatus = EquipmentStatus.AVAILABLE;
    }

    public void disable() {
        this.equipmentStatus = EquipmentStatus.DISABLED;
    }

    public void markUnavailable() {
        this.equipmentStatus = EquipmentStatus.MAINTENANCE;
    }

    public void updateDetail(EquipmentType equipmentType, String description, LabLocation labLocation) {
        this.equipmentType = equipmentType;
        this.description = description;
        this.labLocation = labLocation;
    }

    public void reserve() {
        if (equipmentStatus != EquipmentStatus.AVAILABLE) {
            throw new IllegalStateException("Equipment is not available for reservation.");
        }
        this.equipmentStatus = EquipmentStatus.RESERVED;
    }

    public void cancelReservation() {
        if (equipmentStatus != EquipmentStatus.RESERVED) {
            throw new IllegalStateException("Equipment is not currently reserved.");
        }
        this.equipmentStatus = EquipmentStatus.AVAILABLE;
    }

    public void checkIn(SensorType sensorType) {
        if (equipmentStatus != EquipmentStatus.RESERVED) {
            throw new IllegalStateException("Equipment must be reserved before check-in.");
        }
        this.equipmentStatus = EquipmentStatus.IN_USE;
        this.lastUsedTime = LocalDateTime.now();
        this.lastSensorTriggered = sensorType;
    }

    public void finishUse() {
        if (equipmentStatus != EquipmentStatus.IN_USE) {
            throw new IllegalStateException("Equipment is not currently in use.");
        }
        this.equipmentStatus = EquipmentStatus.AVAILABLE;
    }

    public void setInUse(SensorType sensorType) {
        this.equipmentStatus = EquipmentStatus.IN_USE;
        this.lastUsedTime = LocalDateTime.now();
        this.lastSensorTriggered = sensorType;
    }

    public boolean isAvailable() {return equipmentStatus == EquipmentStatus.AVAILABLE;}

    public boolean isReserved() {return equipmentStatus == EquipmentStatus.RESERVED;}

    public boolean isInUse() {return equipmentStatus == EquipmentStatus.IN_USE;}

    public UUID getEquipmentId() {return equipmentId;}

    public EquipmentType getEquipmentType() {return equipmentType;}

    public String getDescription() {return description;}

    public LabLocation getLabLocation() {return labLocation;}

    public EquipmentStatus getEquipmentStatus() {return equipmentStatus;}

    public LocalDateTime getLastUsedTime() {return lastUsedTime;}

    public SensorType getLastSensorTriggered() {return lastSensorTriggered;}
}

