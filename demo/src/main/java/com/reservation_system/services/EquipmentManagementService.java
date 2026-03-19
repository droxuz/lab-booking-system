package com.reservation_system.services;

import com.reservation_system.Equipment.*;
import com.reservation_system.model.LabManager;

import java.util.UUID;

public class EquipmentManagementService {

    public Equipment addEquipment(LabManager manager, String description, EquipmentType equipment_t, LabLocation lablocation){
        validateManager(manager);
        return new Equipment(UUID.randomUUID(), equipment_t, description, lablocation);
    }

    public void enableEquipment(LabManager manager, Equipment equipment){
        validateManager(manager);
        validateEquipment(equipment);
        equipment.enable();
    }

    public void disableEquipment(LabManager manager, Equipment equipment){
        validateManager(manager);
        validateEquipment(equipment);
        equipment.disable();
    }

    public void markEquipmentMaintenance(LabManager manager, Equipment equipment){
        validateManager(manager);
        validateEquipment(equipment);
        equipment.markUnavailable();
    }

    public void updateEquipmentDetails(LabManager manager, Equipment equipment,
                                       String description, EquipmentType equipmentType, LabLocation labLocation) {
        validateManager(manager);
        validateEquipment(equipment);

        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Description is required.");
        }

        equipment.updateDetail(equipmentType, description, labLocation);
    }

    public void removeEquipment(LabManager manager, Equipment equipment) {
        validateManager(manager);
        validateEquipment(equipment);
    }

    private void validateManager(LabManager manager){
        if(manager == null){
            throw new IllegalArgumentException("Lab Manager required");
        }
        if(!manager.isApproved()){
            throw new IllegalStateException("Lab manager account not approved");
        }
    }

    private void validateEquipment(Equipment equipment) {
        if (equipment == null) {
            throw new IllegalArgumentException("Equipment is required.");
        }
    }
}