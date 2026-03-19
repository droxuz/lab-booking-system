package com.reservation_system.LabManager;

import java.util.UUID;
import com.reservation_system.Equipment.*;

public class LabManager {

    private UUID managerId;
    private String name;

    public LabManager(UUID managerId, String name) {
        this.managerId = managerId;
        this.name = name;
    }

    public Equipment addEquipment(String description, EquipmentType equipment_t, LabLocation lablocation) {
        return new Equipment(UUID.randomUUID(), equipment_t, description, lablocation);
    }

    public void enableEquipment(Equipment equipment) {
        equipment.enable();
    }

    public void disableEquipment(Equipment equipment) {
        equipment.disable();
    }

    public void markEquipmentMaintenance(Equipment equipment) {
        equipment.markUnavailable();
    }
}
