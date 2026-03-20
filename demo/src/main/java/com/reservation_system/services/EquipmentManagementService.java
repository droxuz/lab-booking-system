package com.reservation_system.services;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentStatus;
import com.reservation_system.Equipment.EquipmentType;
import com.reservation_system.Equipment.LabLocation;
import com.reservation_system.model.LabManager;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Handles all equipment management operations for Lab Managers.
 * Persists equipment to data/equipment.csv so that:
 *   - LabManagerPanel and SensorSubsystem share the same data source
 *   - Equipment survives application restarts
 *
 * CSV format (pipe-delimited):
 *   equipmentId | equipmentType | description | labLocation | status
 */
public class EquipmentManagementService {

    private static final String DATA_DIR  = "data" + File.separator;
    private static final String EQUIPMENT_FILE = DATA_DIR + "equipment.csv";
    private static final String HEADER =
            "equipmentId|equipmentType|description|labLocation|status";

    public EquipmentManagementService() {
        initFile();
    }

    // ── Init ──────────────────────────────────────────────────

    private void initFile() {
        try {
            Files.createDirectories(Paths.get(DATA_DIR));
            File f = new File(EQUIPMENT_FILE);
            if (!f.exists()) {
                try (PrintWriter pw = new PrintWriter(f)) {
                    pw.println(HEADER);
                }
            }
        } catch (IOException e) {
            System.err.println("[EquipmentManagementService] Could not init CSV: "
                    + e.getMessage());
        }
    }

    // ── Public API (called by LabManagerPanel) ─────────────────

    /**
     * Creates a new piece of equipment, assigns a random UUID,
     * defaults status to AVAILABLE, and saves to CSV.
     */
    public Equipment addEquipment(LabManager manager,
                                  String description,
                                  EquipmentType equipmentType,
                                  LabLocation labLocation) {
        Equipment equipment = new Equipment(
                UUID.randomUUID(), equipmentType, description, labLocation);
        saveToCSV(equipment);
        return equipment;
    }

    /**
     * Updates description, type, and location of an existing equipment item.
     * Finds the record by UUID and overwrites it.
     */
    public void updateEquipmentDetails(LabManager manager,
                                       Equipment equipment,
                                       String description,
                                       EquipmentType equipmentType,
                                       LabLocation labLocation) {
        equipment.updateDetail(equipmentType, description, labLocation);
        updateInCSV(equipment);
    }

    /** Removes equipment from the CSV. */
    public void removeEquipment(LabManager manager, Equipment equipment) {
        deleteFromCSV(equipment.getEquipmentId());
    }

    /** Sets equipment status to AVAILABLE. */
    public void enableEquipment(LabManager manager, Equipment equipment) {
        equipment.enable();
        updateInCSV(equipment);
    }

    /** Sets equipment status to DISABLED. */
    public void disableEquipment(LabManager manager, Equipment equipment) {
        equipment.disable();
        updateInCSV(equipment);
    }

    /** Sets equipment status to MAINTENANCE. */
    public void markEquipmentMaintenance(LabManager manager, Equipment equipment) {
        equipment.markUnavailable();
        updateInCSV(equipment);
    }

    /**
     * Loads all equipment from CSV.
     * Call this in LabManagerPanel on startup to pre-populate the list.
     */
    public List<Equipment> loadAllEquipment() {
        List<Equipment> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(EQUIPMENT_FILE))) {
            String line;
            boolean first = true;
            while ((line = br.readLine()) != null) {
                if (first) { first = false; continue; } // skip header
                if (line.isBlank()) continue;
                String[] parts = line.split("\\|", -1);
                if (parts.length >= 5) {
                    try {
                        UUID          id     = UUID.fromString(parts[0]);
                        EquipmentType type   = EquipmentType.valueOf(parts[1]);
                        String        desc   = parts[2];
                        LabLocation   loc    = LabLocation.valueOf(parts[3]);
                        EquipmentStatus status = EquipmentStatus.valueOf(parts[4]);

                        Equipment eq = new Equipment(id, type, desc, loc);
                        applyStatus(eq, status);
                        list.add(eq);
                    } catch (Exception e) {
                        System.err.println("[EquipmentManagementService] Skipping row: "
                                + e.getMessage());
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("[EquipmentManagementService] Error reading CSV: "
                    + e.getMessage());
        }
        return list;
    }

    // ── CSV helpers ────────────────────────────────────────────

    /** Appends a new equipment row. */
    private void saveToCSV(Equipment equipment) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(EQUIPMENT_FILE, true))) {
            pw.println(toCSVRow(equipment));
        } catch (IOException e) {
            System.err.println("[EquipmentManagementService] Error saving: " + e.getMessage());
        }
    }

    /** Rewrites the whole file, replacing the matching row. */
    private void updateInCSV(Equipment equipment) {
        List<String> lines = readAllLines();
        try (PrintWriter pw = new PrintWriter(new FileWriter(EQUIPMENT_FILE))) {
            pw.println(HEADER);
            for (String line : lines) {
                String[] parts = line.split("\\|", -1);
                if (parts.length > 0 && parts[0].equals(equipment.getEquipmentId().toString())) {
                    pw.println(toCSVRow(equipment));
                } else {
                    pw.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("[EquipmentManagementService] Error updating: " + e.getMessage());
        }
    }

    /** Rewrites the whole file, omitting the matching row. */
    private void deleteFromCSV(UUID equipmentId) {
        List<String> lines = readAllLines();
        try (PrintWriter pw = new PrintWriter(new FileWriter(EQUIPMENT_FILE))) {
            pw.println(HEADER);
            for (String line : lines) {
                String[] parts = line.split("\\|", -1);
                if (parts.length > 0 && !parts[0].equals(equipmentId.toString())) {
                    pw.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("[EquipmentManagementService] Error deleting: " + e.getMessage());
        }
    }

    /** Reads all data rows (skips header). */
    private List<String> readAllLines() {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(EQUIPMENT_FILE))) {
            String line;
            boolean first = true;
            while ((line = br.readLine()) != null) {
                if (first) { first = false; continue; }
                if (!line.isBlank()) lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("[EquipmentManagementService] Error reading: " + e.getMessage());
        }
        return lines;
    }

    private String toCSVRow(Equipment eq) {
        return eq.getEquipmentId() + "|"
                + eq.getEquipmentType() + "|"
                + eq.getDescription() + "|"
                + eq.getLabLocation() + "|"
                + eq.getEquipmentStatus();
    }

    /**
     * Restores a persisted EquipmentStatus by calling Equipment's
     * public methods. Equipment starts AVAILABLE by default.
     */
    private void applyStatus(Equipment eq, EquipmentStatus target) {
        switch (target) {
            case DISABLED:    eq.disable();        break;
            case MAINTENANCE: eq.markUnavailable(); break;
            case RESERVED:
                try { eq.reserve(); } catch (IllegalStateException ignored) {}
                break;
            case IN_USE:
                try { eq.reserve(); eq.setInUse(null); }
                catch (IllegalStateException ignored) {}
                break;
            case AVAILABLE:
            default:
                break; // default on construction
        }
    }
}
