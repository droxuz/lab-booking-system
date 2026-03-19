package com.reservation_system.patterns.observer;

import com.reservation_system.Equipment.Equipment;
import java.util.List;

public interface EquipmentObserver {
    void onEquipmentListChanged(List<Equipment> allEquipment);
}