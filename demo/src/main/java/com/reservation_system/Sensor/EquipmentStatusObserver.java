package com.reservation_system.Sensor;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentStatus;

/**
 * OBSERVER PATTERN — Concrete Observer.
 *
 * Reacts to sensor usage events by updating Equipment status
 * using their public API methods.
 *
 * Transition table:
 *
 *   Signal   | Equipment was  | Action
 *   ---------|----------------|-----------------------------
 *   IN_USE   | RESERVED       | setInUse()   (booked + showed up)
 *   IN_USE   | AVAILABLE      | reserve() + setInUse()  (walk-in / sensor test)
 *   IN_USE   | DISABLED/MAINT | ignored — manager must intervene
 *   IDLE/OFF | IN_USE         | finishUse()  -> back to AVAILABLE
 *   IDLE/OFF | other          | ignored
 */
public class EquipmentStatusObserver implements SensorObserver {

    private final CSVDataStore dataStore;

    public EquipmentStatusObserver(CSVDataStore dataStore) {
        this.dataStore = dataStore;
    }

    @Override
    public void onUsageDataReceived(UsageLogEntry entry) {
        Equipment equipment = dataStore.loadEquipment(entry.getEquipmentId());

        if (equipment == null) {
            System.out.println("[EquipmentStatusObserver] Equipment not found: "
                    + entry.getEquipmentId());
            return;
        }

        String prev   = equipment.getEquipmentStatus().name();
        String signal = entry.getUsageStatus();

        try {
            switch (signal) {

                case "IN_USE":
                    EquipmentStatus current = equipment.getEquipmentStatus();

                    if (current == EquipmentStatus.RESERVED) {
                        // Normal booking flow: user reserved, now physically present
                        equipment.setInUse(null);

                    } else if (current == EquipmentStatus.AVAILABLE) {
                        // Sensor-driven flow: walk-in use or direct sensor test.
                        // Equipment.setInUse() requires RESERVED state, so we
                        // call reserve() first, then check in immediately.
                        equipment.reserve();
                        equipment.setInUse(null);
                    }
                    // DISABLED or MAINTENANCE: sensor signal is ignored.
                    // Only a manager override can change those states.
                    break;

                case "IDLE":
                case "OFF":
                    if (equipment.getEquipmentStatus() == EquipmentStatus.IN_USE) {
                        equipment.finishUse();   // -> AVAILABLE
                    }
                    break;

                default:
                    System.out.println("[EquipmentStatusObserver] Unknown signal: " + signal);
            }

        } catch (IllegalStateException ex) {
            System.out.println("[EquipmentStatusObserver] Transition rejected: "
                    + ex.getMessage());
        }

        dataStore.updateEquipmentStatus(equipment);

        System.out.println("[EquipmentStatusObserver] Equipment " + entry.getEquipmentId()
                + " | " + prev + " -> " + equipment.getEquipmentStatus().name());
    }
}
