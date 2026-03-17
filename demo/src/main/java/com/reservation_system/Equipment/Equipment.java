package com.reservation_system.Equipment;

import java.util.UUID;

public class Equipment {

    private UUID equipmentId;
    private EquipmentType equipmentType;
    private String description;
    private LabLocation labLocation;
    private EquipmentStatus equipmentStatus;

    public Equipment(UUID equipmentId, EquipmentType equipmentType, String description, LabLocation labLocation) {
        this.equipmentId = equipmentId;
        this.equipmentType = equipmentType;
        this.description = description;
        this.labLocation = labLocation;
        this.equipmentStatus = EquipmentStatus.AVAILABLE;
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

    public void setInUse() {
        this.equipmentStatus = EquipmentStatus.IN_USE;
    }

    public void updateDetail(EquipmentType equipmentType, String description, LabLocation labLocation) {
        this.equipmentType = equipmentType;
        this.description = description;
        this.labLocation = labLocation;
    }
    public UUID getEquipmentId() {
        return equipmentId;
    }

    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    public String getDescription() {
        return description;
    }

    public LabLocation getLabLocation() {
        return labLocation;
    }

    public EquipmentStatus getEquipmentStatus() {
        return equipmentStatus;
    }

    public boolean isAvailable() {
        return equipmentStatus == EquipmentStatus.AVAILABLE;
    }
}

