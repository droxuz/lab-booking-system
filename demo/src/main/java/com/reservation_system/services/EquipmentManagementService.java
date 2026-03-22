package com.reservation_system.services;

import com.reservation_system.Equipment.*;
import com.reservation_system.model.LabManager;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EquipmentManagementService {

    private static final String FILE_PATH = "data/equipment.csv";
    private static final String HEADER    = "id|description|type|location|status";

    public EquipmentManagementService() {
        ensureFileExists();
    }

    private void ensureFileExists() {
        try {
            Path path = Paths.get(FILE_PATH);
            if (Files.notExists(path.getParent())) Files.createDirectories(path.getParent());
            if (Files.notExists(path)) {
                Files.createFile(path);
                try (BufferedWriter w = Files.newBufferedWriter(path)) {
                    w.write(HEADER); w.newLine();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to initialise equipment.csv", e);
        }
    }

    public Equipment addEquipment(LabManager manager, String description,
                                  EquipmentType type, LabLocation location) {
        validateManager(manager);
        Equipment eq = new Equipment(UUID.randomUUID(), type, description, location);
        List<Equipment> all = loadAllEquipment();
        all.add(eq);
        saveAll(all);
        return eq;
    }

    public void updateEquipmentDetails(LabManager manager, Equipment equipment,
                                       String description, EquipmentType type, LabLocation location) {
        validateManager(manager);
        equipment.updateDetail(type, description, location);
        List<Equipment> all = loadAllEquipment();
        saveAll(replaceById(all, equipment));
    }

    public void removeEquipment(LabManager manager, Equipment equipment) {
        validateManager(manager);
        List<Equipment> all = loadAllEquipment();
        all.removeIf(e -> e.getEquipmentId().equals(equipment.getEquipmentId()));
        saveAll(all);
    }

    public void enableEquipment(LabManager manager, Equipment equipment) {
        validateManager(manager);
        equipment.enable();
        List<Equipment> all = loadAllEquipment();
        saveAll(replaceById(all, equipment));
    }

    public void disableEquipment(LabManager manager, Equipment equipment) {
        validateManager(manager);
        equipment.disable();
        List<Equipment> all = loadAllEquipment();
        saveAll(replaceById(all, equipment));
    }

    public void markEquipmentMaintenance(LabManager manager, Equipment equipment) {
        validateManager(manager);
        equipment.markUnavailable();
        List<Equipment> all = loadAllEquipment();
        saveAll(replaceById(all, equipment));
    }

    public List<Equipment> loadAllEquipment() {
        List<Equipment> list = new ArrayList<>();
        try (BufferedReader r = Files.newBufferedReader(Paths.get(FILE_PATH))) {
            String line = r.readLine(); // skip header
            while ((line = r.readLine()) != null) {
                if (line.isBlank()) continue;
                String[] p = line.split("\\|", -1);
                if (p.length < 5) continue;
                try {
                    UUID          id          = UUID.fromString(p[0].trim());
                    String        description = p[1].trim();
                    EquipmentType type        = EquipmentType.valueOf(p[2].trim());
                    LabLocation   loc         = LabLocation.valueOf(p[3].trim());
                    Equipment     eq          = new Equipment(id, type, description, loc);
                    applyStatus(eq, p[4].trim());
                    list.add(eq);
                } catch (Exception ignored) {}
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to read equipment.csv", e);
        }
        return list;
    }

    private void saveAll(List<Equipment> list) {
        try (BufferedWriter w = Files.newBufferedWriter(Paths.get(FILE_PATH))) {
            w.write(HEADER); w.newLine();
            for (Equipment eq : list) {
                w.write(String.join("|",
                        eq.getEquipmentId().toString(),
                        eq.getDescription(),
                        eq.getEquipmentType().name(),
                        eq.getLabLocation().name(),
                        eq.getEquipmentStatus().name()));
                w.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to save equipment.csv", e);
        }
    }

    private List<Equipment> replaceById(List<Equipment> all, Equipment updated) {
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).getEquipmentId().equals(updated.getEquipmentId())) {
                all.set(i, updated);
                return all;
            }
        }
        all.add(updated);
        return all;
    }

    private void applyStatus(Equipment eq, String status) {
        switch (status) {
            case "DISABLED":    eq.disable();                    break;
            case "MAINTENANCE": eq.markUnavailable();            break;
            case "RESERVED":    eq.reserve();                    break;
            case "IN_USE":      eq.reserve(); eq.setInUseDirectly(); break;
            default: break;
        }
    }

    private void validateManager(LabManager manager) {
        if (manager == null) throw new IllegalArgumentException("Lab Manager required");
        if (!manager.isApproved()) throw new IllegalStateException("Lab manager account not approved");
    }
}
