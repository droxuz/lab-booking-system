package com.reservation_system.Sensor;

import com.reservation_system.Equipment.Equipment;

import java.util.UUID;

public class Sensor {
     private UUID sensorID;
     private SensorType type;
     private Equipment equipment;

     public Sensor(SensorType type, Equipment equipment) {
            this.sensorID = UUID.randomUUID();
            this.type = type;
            this.equipment = equipment;
        }

    // Sensor.java
    public void recordUsage() {
        switch (type) {
            case BEING_USED -> equipment.setInUse(type);
            case IDLE_DETECTED -> equipment.enable();
            case ERROR_DETECTED -> equipment.markUnavailable();
        }
    }

     public UUID getSensorID() {
            return sensorID;
        }

     public SensorType getType() {
            return type;
        }

     public Equipment getEquipment() {
            return equipment;
        }

}
