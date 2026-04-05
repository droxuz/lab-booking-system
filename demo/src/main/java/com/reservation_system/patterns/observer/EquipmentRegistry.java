package com.reservation_system.patterns.observer;

import com.reservation_system.Equipment.Equipment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EquipmentRegistry {

    private final List<Equipment> equipment = new ArrayList<>();
    private final List<EquipmentObserver> observers = new ArrayList<>();

    public void addObserver(EquipmentObserver observer) {
        observers.add(observer);
    }

    public void addEquipment(Equipment e) {
        equipment.add(e);
        List<Equipment> snapshot = new ArrayList<>(equipment);
        for (EquipmentObserver o : observers) {
            o.onEquipmentListChanged(snapshot);
        }
    }

    public void replaceAll(List<Equipment> newList) {
        equipment.clear();
        equipment.addAll(newList);
        List<Equipment> snapshot = new ArrayList<>(equipment);
        for (EquipmentObserver o : observers) {
            o.onEquipmentListChanged(snapshot);
        }
    }

    public List<Equipment> getAll() {
        return Collections.unmodifiableList(equipment);
    }
}