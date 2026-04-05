package com.reservation_system;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentType;
import com.reservation_system.Equipment.LabLocation;
import com.reservation_system.patterns.observer.EquipmentObserver;
import com.reservation_system.patterns.observer.EquipmentRegistry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class EquipmentRegistryTest {

    private EquipmentRegistry registry;

    // simple observer that just records the last snapshot it received
    private static class TestObserver implements EquipmentObserver {
        List<Equipment> lastSnapshot;
        int callCount = 0;

        @Override
        public void onEquipmentListChanged(List<Equipment> updatedList) {
            lastSnapshot = updatedList;
            callCount++;
        }
    }

    private Equipment makeEquipment() {
        return new Equipment(UUID.randomUUID(), EquipmentType.OSCILLOSCOPE, "Test Equipment", LabLocation.BERGERON200);
    }

    @BeforeEach
    void setUp() {
        registry = new EquipmentRegistry();
    }

    @Test
    void startsEmpty() {
        assertTrue(registry.getAll().isEmpty());
    }

    @Test
    void addEquipmentStoresIt() {
        Equipment eq = makeEquipment();
        registry.addEquipment(eq);
        assertEquals(1, registry.getAll().size());
        assertEquals(eq, registry.getAll().get(0));
    }

    @Test
    void observerNotifiedWhenEquipmentAdded() {
        TestObserver observer = new TestObserver();
        registry.addObserver(observer);

        registry.addEquipment(makeEquipment());

        assertEquals(1, observer.callCount);
        assertEquals(1, observer.lastSnapshot.size());
    }

    @Test
    void multipleObserversAllGetNotified() {
        TestObserver obs1 = new TestObserver();
        TestObserver obs2 = new TestObserver();
        registry.addObserver(obs1);
        registry.addObserver(obs2);

        registry.addEquipment(makeEquipment());

        assertEquals(1, obs1.callCount);
        assertEquals(1, obs2.callCount);
    }

    @Test
    void replaceAllSwapsOutEverything() {
        registry.addEquipment(makeEquipment());
        registry.addEquipment(makeEquipment());

        List<Equipment> newList = new ArrayList<>();
        newList.add(makeEquipment());
        registry.replaceAll(newList);

        assertEquals(1, registry.getAll().size());
    }

    @Test
    void observerNotifiedOnReplaceAll() {
        TestObserver observer = new TestObserver();
        registry.addObserver(observer);

        registry.replaceAll(new ArrayList<>());

        assertEquals(1, observer.callCount);
    }

    @Test
    void getAllReturnsUnmodifiableList() {
        registry.addEquipment(makeEquipment());
        List<Equipment> result = registry.getAll();
        assertThrows(UnsupportedOperationException.class, () -> result.add(makeEquipment()));
    }

    @Test
    void observerSnapshotMatchesRegistryContents() {
        TestObserver observer = new TestObserver();
        registry.addObserver(observer);

        Equipment eq1 = makeEquipment();
        Equipment eq2 = makeEquipment();
        registry.addEquipment(eq1);
        registry.addEquipment(eq2);

        assertEquals(2, observer.lastSnapshot.size());
        assertTrue(observer.lastSnapshot.contains(eq2));
    }
}