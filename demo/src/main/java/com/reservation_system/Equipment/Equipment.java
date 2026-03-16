package com.reservation_system.Equipment;

import com.reservation_system.LabManager.LabManager;

import java.util.UUID;

public class Equipment {
    LabManager user_labmanager;

    private UUID equipmentId;
    private Equipments equipmennt_name;
    private Lablocation lablocation;
    private EquipmentStatus equipmentstatus;

    public Equipment(UUID equipmentId, Equipments equip_name, Lablocation lablocation){
        this.equipmentId = equipmentId;
        this.equipmentstatus = EquipmentStatus.Available;
        this.equipmennt_name = equip_name;
        this.lablocation = lablocation;
    }

    public void enable(){}
    public void disable(){}
    public void markunavaible(){}
    public void updateDetail(){}

}
