package com.reservation_system.Sensor;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentStatus;
import com.reservation_system.Equipment.EquipmentType;
import com.reservation_system.Equipment.LabLocation;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CSVDataStore {

    private final String dataDir;
    private final String sensorsFile;
    private final String equipmentFile;
    private final String logsFile;

    private static final DateTimeFormatter FMT =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private static final String EQUIPMENT_HEADER = "id|description|type|location|status";

    public CSVDataStore() {
        this("data");
    }

    public CSVDataStore(String baseDir) {
        this.dataDir = baseDir;
        this.sensorsFile = dataDir + File.separator + "sensors.csv";
        this.equipmentFile = dataDir + File.separator + "equipment.csv";
        this.logsFile = dataDir + File.separator + "usage_logs.csv";
        initFiles();
    }

    private void initFiles() {
        try {
            Files.createDirectories(Paths.get(dataDir));
            ensureFile(sensorsFile, "sensorId|sensorType|linkedEquipmentId|state");
            ensureFile(equipmentFile, EQUIPMENT_HEADER);
            ensureFile(logsFile, "logId|sensorId|equipmentId|timestamp|usageStatus");
        } catch (IOException e) {
            System.err.println("[CSVDataStore] Init failed: " + e.getMessage());
        }
    }

    private void ensureFile(String path, String header) throws IOException {
        File f = new File(path);
        if (!f.exists()) {
            try (PrintWriter pw = new PrintWriter(f)) {
                pw.println(header);
            }
        }
    }

    public List<Sensor> loadAllSensors() {
        List<Sensor> list = new ArrayList<>();
        for (String[] row : readRows(sensorsFile)) {
            if (row.length >= 4) {
                try {
                    UUID id = UUID.fromString(row[0]);
                    SensorType type = SensorType.valueOf(row[1]);
                    UUID eqId = UUID.fromString(row[2]);
                    SensorState state = parseSensorState(row[3]);
                    list.add(new Sensor(id, type, eqId, state));
                } catch (Exception e) {
                    System.err.println("[CSVDataStore] Skipping bad sensor row: " + e.getMessage());
                }
            }
        }
        return list;
    }

    public Sensor loadSensor(UUID sensorId) {
        return loadAllSensors().stream()
                .filter(s -> s.getSensorId().equals(sensorId))
                .findFirst().orElse(null);
    }

    public void saveSensor(Sensor sensor) {
        List<Sensor> all = loadAllSensors();
        boolean found = false;
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).getSensorId().equals(sensor.getSensorId())) {
                all.set(i, sensor);
                found = true;
                break;
            }
        }
        if (!found) all.add(sensor);
        writeAllSensors(all);
    }

    public void deleteSensor(UUID sensorId) {
        List<Sensor> all = loadAllSensors();
        all.removeIf(s -> s.getSensorId().equals(sensorId));
        writeAllSensors(all);
    }

    private void writeAllSensors(List<Sensor> list) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(sensorsFile))) {
            pw.println("sensorId|sensorType|linkedEquipmentId|state");
            for (Sensor s : list) {
                pw.println(s.getSensorId() + "|" + s.getSensorType()
                        + "|" + s.getLinkedEquipmentId() + "|" + s.getStateName());
            }
        } catch (IOException e) {
            System.err.println("[CSVDataStore] Error writing sensors: " + e.getMessage());
        }
    }

    public List<Equipment> loadAllEquipment() {
        List<Equipment> list = new ArrayList<>();
        for (String[] row : readRows(equipmentFile)) {
            if (row.length >= 5) {
                try {
                    UUID id = UUID.fromString(row[0].trim());
                    String desc = row[1].trim();
                    EquipmentType type = EquipmentType.valueOf(row[2].trim());
                    LabLocation loc = LabLocation.valueOf(row[3].trim());
                    EquipmentStatus status = EquipmentStatus.valueOf(row[4].trim());

                    Equipment eq = new Equipment(id, type, desc, loc);
                    applyStatus(eq, status);
                    list.add(eq);
                } catch (Exception e) {
                    System.err.println("[CSVDataStore] Skipping bad equipment row: " + e.getMessage());
                }
            }
        }
        return list;
    }

    public Equipment loadEquipment(UUID equipmentId) {
        return loadAllEquipment().stream()
                .filter(e -> e.getEquipmentId().equals(equipmentId))
                .findFirst().orElse(null);
    }

    public void saveEquipment(Equipment equipment) {
        List<Equipment> all = loadAllEquipment();
        boolean found = false;
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).getEquipmentId().equals(equipment.getEquipmentId())) {
                all.set(i, equipment);
                found = true;
                break;
            }
        }
        if (!found) all.add(equipment);
        writeAllEquipment(all);
    }

    public void updateEquipmentStatus(Equipment equipment) {
        saveEquipment(equipment);
    }

    public void deleteEquipment(UUID equipmentId) {
        List<Equipment> all = loadAllEquipment();
        all.removeIf(e -> e.getEquipmentId().equals(equipmentId));
        writeAllEquipment(all);
    }

    private void writeAllEquipment(List<Equipment> list) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(equipmentFile))) {
            pw.println(EQUIPMENT_HEADER);
            for (Equipment e : list) {
                pw.println(e.getEquipmentId() + "|"
                        + e.getDescription() + "|"
                        + e.getEquipmentType() + "|"
                        + e.getLabLocation() + "|"
                        + e.getEquipmentStatus());
            }
        } catch (IOException e) {
            System.err.println("[CSVDataStore] Error writing equipment: " + e.getMessage());
        }
    }

    public List<UsageLogEntry> loadAllUsageLogs() {
        List<UsageLogEntry> list = new ArrayList<>();
        for (String[] row : readRows(logsFile)) {
            if (row.length >= 5) {
                try {
                    LocalDateTime ts = LocalDateTime.parse(row[3], FMT);
                    list.add(new UsageLogEntry(
                            row[0],
                            UUID.fromString(row[1]),
                            UUID.fromString(row[2]),
                            ts,
                            row[4]));
                } catch (Exception e) {
                    System.err.println("[CSVDataStore] Skipping bad log row.");
                }
            }
        }
        return list;
    }

    public void saveUsageLog(UsageLogEntry entry) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(logsFile, true))) {
            pw.println(entry.getLogId() + "|"
                    + entry.getSensorId() + "|"
                    + entry.getEquipmentId() + "|"
                    + entry.getTimestamp().format(FMT) + "|"
                    + entry.getUsageStatus());
        } catch (IOException e) {
            System.err.println("[CSVDataStore] Error appending log: " + e.getMessage());
        }
    }

    public int countLogs() {
        return readRows(logsFile).size();
    }

    private List<String[]> readRows(String filePath) {
        List<String[]> rows = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean first = true;
            while ((line = br.readLine()) != null) {
                if (first) {
                    first = false;
                    continue;
                }
                if (!line.isBlank()) rows.add(line.split("\\|", -1));
            }
        } catch (IOException e) {
            System.err.println("[CSVDataStore] Error reading " + filePath + ": " + e.getMessage());
        }
        return rows;
    }

    private SensorState parseSensorState(String s) {
        switch (s.trim()) {
            case "INACTIVE": return new InactiveSensorState();
            case "ERROR": return new ErrorSensorState();
            default: return new ActiveSensorState();
        }
    }

    private void applyStatus(Equipment eq, EquipmentStatus target) {
        switch (target) {
            case DISABLED:
                eq.disable();
                break;
            case MAINTENANCE:
                eq.markUnavailable();
                break;
            case RESERVED:
                try { eq.reserve(); } catch (IllegalStateException ignored) {}
                break;
            case IN_USE:
                try { eq.reserve(); eq.setInUseDirectly(); } catch (IllegalStateException ignored) {}
                break;
            case AVAILABLE:
            default:
                break;
        }
    }
}