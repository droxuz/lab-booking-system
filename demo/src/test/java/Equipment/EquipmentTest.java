package Equipment;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentStatus;
import com.reservation_system.Equipment.EquipmentType;
import com.reservation_system.Equipment.LabLocation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

public class EquipmentTest {

    @Test
    public void testConstructorInitializesFieldsCorrectly() {
        UUID id = UUID.randomUUID();
        Equipment equipment = new Equipment(
                id,
                EquipmentType.OSCILLOSCOPE,
                "Digital Oscilloscope",
                LabLocation.LAS1001
        );
        assertEquals(id, equipment.getEquipmentId());
        assertEquals(EquipmentType.OSCILLOSCOPE, equipment.getEquipmentType());
        assertEquals("Digital Oscilloscope", equipment.getDescription());
        assertEquals(LabLocation.LAS1001, equipment.getLabLocation());
        assertEquals(EquipmentStatus.AVAILABLE, equipment.getEquipmentStatus());
    }

    @Test
    public void testEnableSetsStatusToAvailable() {
        Equipment equipment = new Equipment(
                UUID.randomUUID(),
                EquipmentType.FPGA_BOARD,
                "DE10-Lite FPGA board",
                LabLocation.BERGERON300
        );
        equipment.disable();
        assertEquals(EquipmentStatus.DISABLED, equipment.getEquipmentStatus());
        equipment.enable();
        assertEquals(EquipmentStatus.AVAILABLE, equipment.getEquipmentStatus());
    }

    @Test
    public void testDisableSetsStatusToDisabled() {
        Equipment equipment = new Equipment(
                UUID.randomUUID(),
                EquipmentType.MULTIMETER,
                "Digital multimeter",
                LabLocation.LAS1002
        );
        equipment.disable();
        assertEquals(EquipmentStatus.DISABLED, equipment.getEquipmentStatus());
        assertFalse(equipment.isAvailable());
    }

    @Test
    public void testMarkUnavailableSetsStatusToMaintenance() {
        Equipment equipment = new Equipment(
                UUID.randomUUID(),
                EquipmentType.SIGNAL_GENERATOR,
                "Signal generator for lab use",
                LabLocation.BERGERON200
        );
        equipment.markUnavailable();
        assertEquals(EquipmentStatus.MAINTENANCE, equipment.getEquipmentStatus());
        assertFalse(equipment.isAvailable());
    }

    @Test
    public void testSetInUseSetsStatusToInUse() {
        Equipment equipment = new Equipment(
                UUID.randomUUID(),
                EquipmentType.MICROCONTROLLER,
                "Arduino Uno",
                LabLocation.LAS1001
        );
        equipment.setInUse();
        assertEquals(EquipmentStatus.IN_USE, equipment.getEquipmentStatus());
        assertFalse(equipment.isAvailable());
    }

    @Test
    public void testUpdateDetailUpdatesAllFields() {
        Equipment equipment = new Equipment(
                UUID.randomUUID(),
                EquipmentType.POWER_SUPPLY,
                "DC Power Supply",
                LabLocation.LAS1002
        );
        equipment.updateDetail(
                EquipmentType.SOLDERING_STATION,
                "Hakko soldering station",
                LabLocation.BERGERON300
        );
        assertEquals(EquipmentType.SOLDERING_STATION, equipment.getEquipmentType());
        assertEquals("Hakko soldering station", equipment.getDescription());
        assertEquals(LabLocation.BERGERON300, equipment.getLabLocation());
    }

    @Test
    public void testIsAvailableReturnsTrueWhenStatusIsAvailable() {
        Equipment equipment = new Equipment(
                UUID.randomUUID(),
                EquipmentType.PRINTER_3D,
                "3D printer",
                LabLocation.BERGERON200
        );
        assertTrue(equipment.isAvailable());
    }

    @Test
    public void testIsAvailableReturnsFalseWhenDisabled() {
        Equipment equipment = new Equipment(
                UUID.randomUUID(),
                EquipmentType.OSCILLOSCOPE,
                "Digital Oscilloscope",
                LabLocation.LAS1001
        );
        equipment.disable();
        assertFalse(equipment.isAvailable());
    }
    
}
