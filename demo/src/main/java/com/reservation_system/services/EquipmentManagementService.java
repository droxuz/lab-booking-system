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
        equipment.enable();
    }

    public void disableEquipment(LabManager manager, Equipment equipment){
        validateManager(manager);
        equipment.disable();
    }

    public void markEquipmentMaintenance(LabManager manager, Equipment equipment){
        validateManager(manager);
        equipment.markUnavailable();
    }

    private void validateManager(LabManager manager){
        if(manager == null){
            throw new IllegalArgumentException("Lab Manager required");
        }
        if(!manager.isApproved()){
            throw new IllegalStateException("Lab manager account not approved");
        }
    }
}
