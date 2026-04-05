package com.reservation_system.AI_assistant;


import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentStatus;
import com.reservation_system.Equipment.EquipmentType;
import com.reservation_system.Equipment.LabLocation;
import com.reservation_system.model.LabManager;
import com.reservation_system.services.EquipmentManagementService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EquipmentManagementServiceTest {

    private EquipmentManagementService service;
    private LabManager approvedManager;
    private LabManager unapprovedManager;

    @BeforeEach
    void setUp() throws IOException {
        Files.deleteIfExists(Paths.get("data/equipment.csv"));

        service = new EquipmentManagementService();

        approvedManager   = new LabManager(1, "Sarah", "sarah@uni.com", "pass123", true);
        unapprovedManager = new LabManager(2, "Tom",   "tom@uni.com",   "pass456", false);
    }

    // --- add equipment ---

    @Test
    void addEquipmentReturnsEquipmentWithCorrectDescription() {
        Equipment eq = service.addEquipment(approvedManager, "Oscilloscope",
                EquipmentType.OSCILLOSCOPE, LabLocation.LAS1001);
        assertEquals("Oscilloscope", eq.getDescription());
    }

    @Test
    void addedEquipmentShowsUpInLoadAll() {
        service.addEquipment(approvedManager, "3D printer", EquipmentType.PRINTER_3D, LabLocation.LAS1001);
        List<Equipment> all = service.loadAllEquipment();
        assertEquals(1, all.size());
        assertEquals("3D printer", all.get(0).getDescription());
    }

    @Test
    void addEquipmentWithNullManagerThrows() {
        assertThrows(IllegalArgumentException.class, () ->
                service.addEquipment(null, "Multimeter", EquipmentType.MULTIMETER, LabLocation.LAS1001));
    }

    @Test
    void unapprovedManagerCannotAddEquipment() {
        assertThrows(IllegalStateException.class, () ->
                service.addEquipment(unapprovedManager, "Multimeter", EquipmentType.MULTIMETER, LabLocation.LAS1001));
    }

    // --- remove equipment ---

    @Test
    void removeEquipmentDeletesItFromList() {
        Equipment eq = service.addEquipment(approvedManager, "Old Multimeter", EquipmentType.MULTIMETER, LabLocation.LAS1001);
        service.removeEquipment(approvedManager, eq);
        assertTrue(service.loadAllEquipment().isEmpty());
    }

    @Test
    void removingOneEquipmentLeavesOthersAlone() {
        Equipment eq1 = service.addEquipment(approvedManager, "Meter A", EquipmentType.MULTIMETER, LabLocation.LAS1001);
        Equipment eq2 = service.addEquipment(approvedManager, "Meter B", EquipmentType.MULTIMETER, LabLocation.LAS1001);

        service.removeEquipment(approvedManager, eq1);

        List<Equipment> remaining = service.loadAllEquipment();
        assertEquals(1, remaining.size());
        assertEquals(eq2.getEquipmentId(), remaining.get(0).getEquipmentId());
    }

    @Test
    void unapprovedManagerCannotRemoveEquipment() {
        Equipment eq = service.addEquipment(approvedManager, "Meter", EquipmentType.MULTIMETER, LabLocation.LAS1001);
        assertThrows(IllegalStateException.class, () ->
                service.removeEquipment(unapprovedManager, eq));
    }

    // --- status changes ---

    @Test
    void disableEquipmentSetsDisabledStatus() {
        Equipment eq = service.addEquipment(approvedManager, "FPGA Board", EquipmentType.FPGA_BOARD, LabLocation.BERGERON300);
        service.disableEquipment(approvedManager, eq);
        assertEquals(EquipmentStatus.DISABLED, eq.getEquipmentStatus());
    }

    @Test
    void enableEquipmentSetsAvailableStatus() {
        Equipment eq = service.addEquipment(approvedManager, "3D Printer", EquipmentType.PRINTER_3D, LabLocation.LAS1001);
        service.disableEquipment(approvedManager, eq);
        service.enableEquipment(approvedManager, eq);
        assertEquals(EquipmentStatus.AVAILABLE, eq.getEquipmentStatus());
    }

    @Test
    void markMaintenanceSetsMaintenanceStatus() {
        Equipment eq = service.addEquipment(approvedManager, "Oscilloscope", EquipmentType.OSCILLOSCOPE, LabLocation.LAS1001);
        service.markEquipmentMaintenance(approvedManager, eq);
        assertEquals(EquipmentStatus.MAINTENANCE, eq.getEquipmentStatus());
    }

    @Test
    void unapprovedManagerCannotDisableEquipment() {
        Equipment eq = service.addEquipment(approvedManager, "Meter", EquipmentType.MULTIMETER, LabLocation.LAS1001);
        assertThrows(IllegalStateException.class, () ->
                service.disableEquipment(unapprovedManager, eq));
    }

    // --- update details ---

    @Test
    void updateEquipmentDetailsChangesDescription() {
        Equipment eq = service.addEquipment(approvedManager, "Old Name", EquipmentType.MULTIMETER, LabLocation.LAS1001);
        service.updateEquipmentDetails(approvedManager, eq, "New Name", EquipmentType.MULTIMETER, LabLocation.LAS1001);
        assertEquals("New Name", eq.getDescription());
    }

    @Test
    void updateEquipmentDetailsChangesLocation() {
        Equipment eq = service.addEquipment(approvedManager, "Meter", EquipmentType.MULTIMETER, LabLocation.LAS1001);
        service.updateEquipmentDetails(approvedManager, eq, "Meter", EquipmentType.MULTIMETER, LabLocation.LAS1001);
        assertEquals(LabLocation.LAS1001, eq.getLabLocation());
    }

    @Test
    void unapprovedManagerCannotUpdateEquipment() {
        Equipment eq = service.addEquipment(approvedManager, "Meter", EquipmentType.MULTIMETER, LabLocation.LAS1001);
        assertThrows(IllegalStateException.class, () ->
                service.updateEquipmentDetails(unapprovedManager, eq, "New Name", EquipmentType.MULTIMETER, LabLocation.LAS1001));
    }

    // --- persistence ---

    @Test
    void loadAllReturnsEmptyWhenNothingAdded() {
        assertTrue(service.loadAllEquipment().isEmpty());
    }

    @Test
    void multipleEquipmentItemsAllPersist() {
        service.addEquipment(approvedManager, "Scope 1", EquipmentType.OSCILLOSCOPE,   LabLocation.LAS1001);
        service.addEquipment(approvedManager, "Scope 2", EquipmentType.OSCILLOSCOPE, LabLocation.LAS1001);
        service.addEquipment(approvedManager, "Scope 3", EquipmentType.OSCILLOSCOPE,   LabLocation.BERGERON300);
        assertEquals(3, service.loadAllEquipment().size());
    }

    @Test
    void statusPersistedAfterDisable() {
        Equipment eq = service.addEquipment(approvedManager, "Scope", EquipmentType.OSCILLOSCOPE, LabLocation.LAS1001);
        service.disableEquipment(approvedManager, eq);

        // reload from disk and verify the DISABLED status survived the round-trip
        EquipmentManagementService freshService = new EquipmentManagementService();
        List<Equipment> reloaded = freshService.loadAllEquipment();
        assertEquals(1, reloaded.size());
        assertEquals(EquipmentStatus.DISABLED, reloaded.get(0).getEquipmentStatus());
    }


    // =========================================================================
    // AI-GENERATED TEST CASES
    // The following tests were automatically generated by an AI assistant.
    // They have been appended for additional coverage but should be reviewed
    // before being considered production-ready.
    // =========================================================================

    @Test
    void addedEquipmentHasAvailableStatusByDefault() {
        Equipment eq = service.addEquipment(approvedManager, "New Scope", EquipmentType.OSCILLOSCOPE, LabLocation.BERGERON300);
        assertEquals(EquipmentStatus.AVAILABLE, eq.getEquipmentStatus());
    }

    @Test
    void addedEquipmentHasCorrectType() {
        Equipment eq = service.addEquipment(approvedManager, "Power Supply", EquipmentType.POWER_SUPPLY, LabLocation.LAS1001);
        assertEquals(EquipmentType.POWER_SUPPLY, eq.getEquipmentType());
    }

    @Test
    void addedEquipmentHasCorrectLocation() {
        Equipment eq = service.addEquipment(approvedManager, "Scope", EquipmentType.OSCILLOSCOPE, LabLocation.LAS1001);
        assertEquals(LabLocation.LAS1001, eq.getLabLocation());
    }

    @Test
    void addedEquipmentHasNonNullId() {
        Equipment eq = service.addEquipment(approvedManager, "Scope", EquipmentType.OSCILLOSCOPE, LabLocation.BERGERON300);
        assertNotNull(eq.getEquipmentId());
    }

    @Test
    void twoAddedEquipmentItemsHaveDifferentIds() {
        Equipment eq1 = service.addEquipment(approvedManager, "Scope A", EquipmentType.OSCILLOSCOPE, LabLocation.BERGERON300);
        Equipment eq2 = service.addEquipment(approvedManager, "Scope B", EquipmentType.OSCILLOSCOPE, LabLocation.BERGERON300);
        assertNotEquals(eq1.getEquipmentId(), eq2.getEquipmentId());
    }

    @Test
    void maintenanceStatusPersistedAfterReload() {
        Equipment eq = service.addEquipment(approvedManager, "Scope", EquipmentType.OSCILLOSCOPE, LabLocation.BERGERON300);
        service.markEquipmentMaintenance(approvedManager, eq);

        EquipmentManagementService freshService = new EquipmentManagementService();
        List<Equipment> reloaded = freshService.loadAllEquipment();
        assertEquals(EquipmentStatus.MAINTENANCE, reloaded.get(0).getEquipmentStatus());
    }

    @Test
    void updateEquipmentDetailsChangesType() {
        Equipment eq = service.addEquipment(approvedManager, "Scope", EquipmentType.OSCILLOSCOPE, LabLocation.BERGERON300);
        service.updateEquipmentDetails(approvedManager, eq, "Scope", EquipmentType.OSCILLOSCOPE, LabLocation.BERGERON300);
        assertEquals(EquipmentType.OSCILLOSCOPE, eq.getEquipmentType());
    }

    @Test
    void unapprovedManagerCannotMarkMaintenance() {
        Equipment eq = service.addEquipment(approvedManager, "Scope", EquipmentType.OSCILLOSCOPE, LabLocation.BERGERON300);
        assertThrows(IllegalStateException.class, () ->
                service.markEquipmentMaintenance(unapprovedManager, eq));
    }

    @Test
    void enableAfterMaintenanceRestoresAvailableStatus() {
        Equipment eq = service.addEquipment(approvedManager, "Scope", EquipmentType.OSCILLOSCOPE, LabLocation.BERGERON300);
        service.markEquipmentMaintenance(approvedManager, eq);
        service.enableEquipment(approvedManager, eq);
        assertEquals(EquipmentStatus.AVAILABLE, eq.getEquipmentStatus());
    }
}