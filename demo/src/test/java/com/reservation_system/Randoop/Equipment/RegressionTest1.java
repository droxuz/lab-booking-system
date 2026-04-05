package com.reservation_system.Randoop.Equipment;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        com.reservation_system.Equipment.EquipmentType equipmentType6 = equipment4.getEquipmentType();
        equipment4.cancelReservation();
        org.junit.Assert.assertNull(equipmentType6);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isInUse();
        java.util.UUID uUID8 = equipment4.getEquipmentId();
        equipment4.reserve();
        equipment4.setInUseDirectly();
        java.util.UUID uUID11 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentType equipmentType12 = null;
        com.reservation_system.Equipment.LabLocation labLocation14 = null;
        equipment4.updateDetail(equipmentType12, "ID: null | ID: null |  | null | null | AVAILABLE | null | null | AVAILABLE", labLocation14);
        com.reservation_system.Equipment.LabLocation labLocation16 = equipment4.getLabLocation();
        java.lang.String str17 = equipment4.getDescription();
        java.lang.Class<?> wildcardClass18 = equipment4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertNull(uUID11);
        org.junit.Assert.assertNull(labLocation16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ID: null | ID: null |  | null | null | AVAILABLE | null | null | AVAILABLE" + "'", str17, "ID: null | ID: null |  | null | null | AVAILABLE | null | null | AVAILABLE");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        equipment4.disable();
        com.reservation_system.Equipment.LabLocation labLocation10 = equipment4.getLabLocation();
        com.reservation_system.Equipment.EquipmentType equipmentType11 = equipment4.getEquipmentType();
        boolean boolean12 = equipment4.isInUse();
        boolean boolean13 = equipment4.isInUse();
        com.reservation_system.Sensor.SensorType sensorType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(labLocation10);
        org.junit.Assert.assertNull(equipmentType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        java.time.LocalDateTime localDateTime5 = equipment4.getLastUsedTime();
        boolean boolean6 = equipment4.isAvailable();
        equipment4.reserve();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.checkIn(sensorType8);
        java.lang.Class<?> wildcardClass10 = equipment4.getClass();
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        boolean boolean8 = equipment4.isAvailable();
        java.lang.String str9 = equipment4.getDescription();
        equipment4.setInUseDirectly();
        java.time.LocalDateTime localDateTime11 = equipment4.getLastUsedTime();
        equipment4.enable();
        boolean boolean13 = equipment4.isInUse();
        com.reservation_system.Equipment.LabLocation labLocation14 = equipment4.getLabLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(labLocation14);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        equipment4.setInUseDirectly();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus11 = equipment4.getEquipmentStatus();
        equipment4.enable();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus13 = equipment4.getEquipmentStatus();
        equipment4.setInUseDirectly();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus11.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "hi!", labLocation10);
        java.lang.String str12 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        equipment4.setInUse(sensorType13);
        boolean boolean15 = equipment4.isInUse();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ID: null | hi! | null | null | AVAILABLE" + "'", str12, "ID: null | hi! | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "ID: null |  | null | null | AVAILABLE", labLocation10);
        equipment4.enable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(sensorType7);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.enable();
        boolean boolean9 = equipment4.isAvailable();
        boolean boolean10 = equipment4.isReserved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        boolean boolean9 = equipment4.isInUse();
        com.reservation_system.Sensor.SensorType sensorType10 = equipment4.getLastSensorTriggered();
        com.reservation_system.Sensor.SensorType sensorType11 = equipment4.getLastSensorTriggered();
        java.time.LocalDateTime localDateTime12 = equipment4.getLastUsedTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(sensorType10);
        org.junit.Assert.assertNull(sensorType11);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        equipment4.setInUseDirectly();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus11 = equipment4.getEquipmentStatus();
        java.time.LocalDateTime localDateTime12 = equipment4.getLastUsedTime();
        equipment4.setInUseDirectly();
        com.reservation_system.Sensor.SensorType sensorType14 = equipment4.getLastSensorTriggered();
        java.util.UUID uUID15 = equipment4.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus11.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNull(sensorType14);
        org.junit.Assert.assertNull(uUID15);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        boolean boolean6 = equipment4.isAvailable();
        equipment4.disable();
        java.lang.Class<?> wildcardClass8 = equipment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isInUse();
        java.lang.String str8 = equipment4.getDescription();
        com.reservation_system.Equipment.EquipmentType equipmentType9 = null;
        com.reservation_system.Equipment.LabLocation labLocation11 = null;
        equipment4.updateDetail(equipmentType9, "ID: null |  | null | null | AVAILABLE", labLocation11);
        com.reservation_system.Sensor.SensorType sensorType13 = equipment4.getLastSensorTriggered();
        java.util.UUID uUID14 = equipment4.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(sensorType13);
        org.junit.Assert.assertNull(uUID14);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        java.util.UUID uUID8 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.LabLocation labLocation9 = equipment4.getLabLocation();
        com.reservation_system.Equipment.EquipmentType equipmentType10 = equipment4.getEquipmentType();
        com.reservation_system.Sensor.SensorType sensorType11 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.LabLocation labLocation12 = equipment4.getLabLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertNull(labLocation9);
        org.junit.Assert.assertNull(equipmentType10);
        org.junit.Assert.assertNull(sensorType11);
        org.junit.Assert.assertNull(labLocation12);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        boolean boolean8 = equipment4.isAvailable();
        java.lang.String str9 = equipment4.getDescription();
        equipment4.setInUseDirectly();
        java.time.LocalDateTime localDateTime11 = equipment4.getLastUsedTime();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        java.util.UUID uUID7 = equipment4.getEquipmentId();
        com.reservation_system.Sensor.SensorType sensorType8 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.LabLocation labLocation9 = equipment4.getLabLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(uUID7);
        org.junit.Assert.assertNull(sensorType8);
        org.junit.Assert.assertNull(labLocation9);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "hi!", labLocation10);
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        equipment4.setInUse(sensorType12);
        com.reservation_system.Equipment.EquipmentType equipmentType14 = null;
        com.reservation_system.Equipment.LabLocation labLocation16 = null;
        equipment4.updateDetail(equipmentType14, "ID: null | ID: null |  | null | null | RESERVED | null | null | AVAILABLE", labLocation16);
        equipment4.markUnavailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation8 = equipment4.getLabLocation();
        boolean boolean9 = equipment4.isReserved();
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType11 = equipment4.getLastSensorTriggered();
        com.reservation_system.Sensor.SensorType sensorType12 = equipment4.getLastSensorTriggered();
        boolean boolean13 = equipment4.isReserved();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(sensorType11);
        org.junit.Assert.assertNull(sensorType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null | hi! | null | null | IN_USE", labLocation3);
        com.reservation_system.Equipment.LabLocation labLocation5 = equipment4.getLabLocation();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentType equipmentType7 = null;
        com.reservation_system.Equipment.LabLocation labLocation9 = null;
        equipment4.updateDetail(equipmentType7, "ID: null |  | null | null | RESERVED", labLocation9);
        equipment4.markUnavailable();
        org.junit.Assert.assertNull(labLocation5);
        org.junit.Assert.assertNull(uUID6);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation8 = equipment4.getLabLocation();
        boolean boolean9 = equipment4.isReserved();
        equipment4.cancelReservation();
        java.lang.String str11 = equipment4.toString();
        java.time.LocalDateTime localDateTime12 = equipment4.getLastUsedTime();
        boolean boolean13 = equipment4.isReserved();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str11, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        java.lang.String str5 = equipment4.getDescription();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "", labLocation10);
        boolean boolean12 = equipment4.isReserved();
        equipment4.disable();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertNull(sensorType7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus5 = equipment4.getEquipmentStatus();
        equipment4.setInUseDirectly();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "", labLocation10);
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(sensorType7);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "hi!", labLocation10);
        boolean boolean12 = equipment4.isReserved();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus13 = equipment4.getEquipmentStatus();
        equipment4.setInUseDirectly();
        java.util.UUID uUID15 = equipment4.getEquipmentId();
        com.reservation_system.Sensor.SensorType sensorType16 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.LabLocation labLocation17 = equipment4.getLabLocation();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(uUID15);
        org.junit.Assert.assertNull(sensorType16);
        org.junit.Assert.assertNull(labLocation17);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        java.lang.String str9 = equipment4.getDescription();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus10 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        equipment4.setInUse(sensorType11);
        boolean boolean13 = equipment4.isReserved();
        equipment4.markUnavailable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        equipment4.markUnavailable();
        com.reservation_system.Equipment.EquipmentType equipmentType11 = equipment4.getEquipmentType();
        equipment4.enable();
        java.time.LocalDateTime localDateTime13 = equipment4.getLastUsedTime();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        java.lang.String str10 = equipment4.getDescription();
        boolean boolean11 = equipment4.isAvailable();
        equipment4.finishUse();
        java.lang.String str13 = equipment4.toString();
        equipment4.enable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str13, "ID: null |  | null | null | AVAILABLE");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "hi!", labLocation3);
        com.reservation_system.Equipment.EquipmentType equipmentType5 = equipment4.getEquipmentType();
        equipment4.setInUseDirectly();
        java.lang.String str7 = equipment4.toString();
        equipment4.enable();
        com.reservation_system.Equipment.LabLocation labLocation9 = equipment4.getLabLocation();
        equipment4.enable();
        org.junit.Assert.assertNull(equipmentType5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null | hi! | null | null | IN_USE" + "'", str7, "ID: null | hi! | null | null | IN_USE");
        org.junit.Assert.assertNull(labLocation9);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation8 = equipment4.getLabLocation();
        boolean boolean9 = equipment4.isReserved();
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType11 = equipment4.getLastSensorTriggered();
        boolean boolean12 = equipment4.isAvailable();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus13 = equipment4.getEquipmentStatus();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(sensorType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        equipment4.markUnavailable();
        java.time.LocalDateTime localDateTime9 = equipment4.getLastUsedTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isInUse();
        java.lang.String str8 = equipment4.getDescription();
        equipment4.reserve();
        java.lang.String str10 = equipment4.toString();
        boolean boolean11 = equipment4.isReserved();
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        equipment4.checkIn(sensorType12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str10, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        com.reservation_system.Sensor.SensorType sensorType10 = equipment4.getLastSensorTriggered();
        java.util.UUID uUID11 = equipment4.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sensorType10);
        org.junit.Assert.assertNull(uUID11);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        com.reservation_system.Sensor.SensorType sensorType9 = equipment4.getLastSensorTriggered();
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        equipment4.checkIn(sensorType10);
        java.lang.String str12 = equipment4.getDescription();
        equipment4.enable();
        boolean boolean14 = equipment4.isReserved();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(sensorType9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        equipment4.markUnavailable();
        java.util.UUID uUID10 = equipment4.getEquipmentId();
        java.util.UUID uUID11 = equipment4.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(uUID10);
        org.junit.Assert.assertNull(uUID11);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation8 = equipment4.getLabLocation();
        com.reservation_system.Equipment.LabLocation labLocation9 = equipment4.getLabLocation();
        equipment4.setInUseDirectly();
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertNull(labLocation9);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        java.lang.String str5 = equipment4.getDescription();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        java.lang.String str7 = equipment4.getDescription();
        com.reservation_system.Equipment.LabLocation labLocation8 = equipment4.getLabLocation();
        equipment4.markUnavailable();
        java.time.LocalDateTime localDateTime10 = equipment4.getLastUsedTime();
        equipment4.setInUseDirectly();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentType equipmentType7 = equipment4.getEquipmentType();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus8 = equipment4.getEquipmentStatus();
        java.util.UUID uUID9 = equipment4.getEquipmentId();
        java.lang.String str10 = equipment4.toString();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType7);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus8.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertNull(uUID9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str10, "ID: null |  | null | null | RESERVED");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        boolean boolean8 = equipment4.isAvailable();
        java.lang.String str9 = equipment4.getDescription();
        equipment4.setInUseDirectly();
        java.time.LocalDateTime localDateTime11 = equipment4.getLastUsedTime();
        com.reservation_system.Equipment.EquipmentType equipmentType12 = equipment4.getEquipmentType();
        java.util.UUID uUID13 = equipment4.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNull(equipmentType12);
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        java.lang.String str8 = equipment4.getDescription();
        boolean boolean9 = equipment4.isReserved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        boolean boolean5 = equipment4.isReserved();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        java.lang.Class<?> wildcardClass9 = equipment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null | ID: null |  | null | null | RESERVED | null | null | AVAILABLE" + "'", str6, "ID: null | ID: null |  | null | null | RESERVED | null | null | AVAILABLE");
        org.junit.Assert.assertNull(sensorType7);
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "ID: null |  | null | null | AVAILABLE", labLocation10);
        com.reservation_system.Equipment.LabLocation labLocation12 = equipment4.getLabLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(sensorType7);
        org.junit.Assert.assertNull(labLocation12);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        boolean boolean6 = equipment4.isAvailable();
        java.time.LocalDateTime localDateTime7 = equipment4.getLastUsedTime();
        boolean boolean8 = equipment4.isReserved();
        java.lang.String str9 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus10 = equipment4.getEquipmentStatus();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str9, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        java.util.UUID uUID8 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.LabLocation labLocation9 = equipment4.getLabLocation();
        com.reservation_system.Equipment.LabLocation labLocation10 = equipment4.getLabLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertNull(labLocation9);
        org.junit.Assert.assertNull(labLocation10);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        java.lang.Class<?> wildcardClass8 = equipmentStatus7.getClass();
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isInUse();
        java.util.UUID uUID8 = equipment4.getEquipmentId();
        equipment4.reserve();
        equipment4.setInUseDirectly();
        java.util.UUID uUID11 = equipment4.getEquipmentId();
        equipment4.setInUseDirectly();
        equipment4.setInUseDirectly();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertNull(uUID11);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "hi!", labLocation10);
        java.lang.String str12 = equipment4.toString();
        equipment4.setInUseDirectly();
        equipment4.setInUseDirectly();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ID: null | hi! | null | null | AVAILABLE" + "'", str12, "ID: null | hi! | null | null | AVAILABLE");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        equipment4.setInUseDirectly();
        com.reservation_system.Equipment.EquipmentType equipmentType11 = equipment4.getEquipmentType();
        boolean boolean12 = equipment4.isAvailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(equipmentType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        equipment4.setInUseDirectly();
        boolean boolean11 = equipment4.isReserved();
        java.util.UUID uUID12 = equipment4.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uUID12);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        com.reservation_system.Sensor.SensorType sensorType9 = equipment4.getLastSensorTriggered();
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        equipment4.checkIn(sensorType10);
        com.reservation_system.Equipment.EquipmentType equipmentType12 = equipment4.getEquipmentType();
        boolean boolean13 = equipment4.isInUse();
        com.reservation_system.Sensor.SensorType sensorType14 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(sensorType9);
        org.junit.Assert.assertNull(equipmentType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(sensorType14);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "hi!", labLocation10);
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        equipment4.setInUse(sensorType12);
        equipment4.disable();
        java.lang.String str15 = equipment4.getDescription();
        com.reservation_system.Equipment.EquipmentType equipmentType16 = equipment4.getEquipmentType();
        java.time.LocalDateTime localDateTime17 = equipment4.getLastUsedTime();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(equipmentType16);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        boolean boolean8 = equipment4.isAvailable();
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        equipment4.setInUse(sensorType9);
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        equipment4.setInUse(sensorType11);
        org.junit.Assert.assertNull(sensorType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        equipment4.setInUseDirectly();
        java.lang.String str11 = equipment4.toString();
        boolean boolean12 = equipment4.isAvailable();
        java.lang.String str13 = equipment4.toString();
        java.lang.String str14 = equipment4.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ID: null |  | null | null | IN_USE" + "'", str11, "ID: null |  | null | null | IN_USE");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ID: null |  | null | null | IN_USE" + "'", str13, "ID: null |  | null | null | IN_USE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        equipment4.setInUseDirectly();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus8 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType9 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.EquipmentType equipmentType10 = equipment4.getEquipmentType();
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus8.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
        org.junit.Assert.assertNull(sensorType9);
        org.junit.Assert.assertNull(equipmentType10);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.disable();
        boolean boolean7 = equipment4.isAvailable();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "hi!", labLocation10);
        com.reservation_system.Equipment.EquipmentType equipmentType12 = equipment4.getEquipmentType();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(equipmentType12);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        equipment4.setInUseDirectly();
        com.reservation_system.Equipment.EquipmentType equipmentType11 = equipment4.getEquipmentType();
        equipment4.markUnavailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(equipmentType11);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null | hi! | null | null | IN_USE", labLocation3);
        equipment4.setInUseDirectly();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        boolean boolean8 = equipment4.isAvailable();
        java.lang.String str9 = equipment4.getDescription();
        equipment4.setInUseDirectly();
        java.time.LocalDateTime localDateTime11 = equipment4.getLastUsedTime();
        com.reservation_system.Equipment.EquipmentType equipmentType12 = equipment4.getEquipmentType();
        equipment4.finishUse();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNull(equipmentType12);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        equipment4.setInUseDirectly();
        java.lang.String str10 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType11 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ID: null |  | null | null | IN_USE" + "'", str10, "ID: null |  | null | null | IN_USE");
        org.junit.Assert.assertNull(sensorType11);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        equipment4.setInUseDirectly();
        equipment4.markUnavailable();
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        equipment4.setInUse(sensorType10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        java.lang.String str5 = equipment4.getDescription();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        java.lang.String str7 = equipment4.getDescription();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        equipment4.markUnavailable();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(equipmentType8);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        equipment4.disable();
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        equipment4.setInUse(sensorType11);
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        equipment4.setInUse(sensorType13);
        equipment4.setInUseDirectly();
        boolean boolean16 = equipment4.isReserved();
        com.reservation_system.Sensor.SensorType sensorType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentType equipmentType7 = equipment4.getEquipmentType();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "ID: null | ID: null |  | null | null | MAINTENANCE | null | null | AVAILABLE", labLocation10);
        equipment4.cancelReservation();
        boolean boolean13 = equipment4.isInUse();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        equipment4.disable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | AVAILABLE", labLocation3);
        equipment4.enable();
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        com.reservation_system.Sensor.SensorType sensorType9 = equipment4.getLastSensorTriggered();
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        equipment4.checkIn(sensorType10);
        java.lang.String str12 = equipment4.getDescription();
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(sensorType9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        equipment4.setInUseDirectly();
        equipment4.markUnavailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | IN_USE", labLocation3);
        equipment4.reserve();
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null | hi! | null | null | AVAILABLE", labLocation3);
        equipment4.markUnavailable();
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        equipment4.setInUse(sensorType6);
        java.time.LocalDateTime localDateTime8 = equipment4.getLastUsedTime();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        java.lang.String str8 = equipment4.toString();
        equipment4.markUnavailable();
        java.time.LocalDateTime localDateTime10 = equipment4.getLastUsedTime();
        com.reservation_system.Equipment.LabLocation labLocation11 = equipment4.getLabLocation();
        com.reservation_system.Equipment.LabLocation labLocation12 = equipment4.getLabLocation();
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        equipment4.setInUse(sensorType13);
        boolean boolean15 = equipment4.isReserved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(labLocation11);
        org.junit.Assert.assertNull(labLocation12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        boolean boolean9 = equipment4.isInUse();
        com.reservation_system.Sensor.SensorType sensorType10 = equipment4.getLastSensorTriggered();
        equipment4.enable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(sensorType10);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        equipment4.setInUseDirectly();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus8 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType9 = equipment4.getLastSensorTriggered();
        boolean boolean10 = equipment4.isAvailable();
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus8.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
        org.junit.Assert.assertNull(sensorType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        java.lang.String str9 = equipment4.getDescription();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus10 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        equipment4.setInUse(sensorType11);
        com.reservation_system.Equipment.EquipmentType equipmentType13 = null;
        com.reservation_system.Equipment.LabLocation labLocation15 = null;
        equipment4.updateDetail(equipmentType13, "ID: null | ID: null |  | null | null | RESERVED | null | null | AVAILABLE", labLocation15);
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isInUse();
        java.lang.String str8 = equipment4.getDescription();
        com.reservation_system.Equipment.EquipmentType equipmentType9 = null;
        com.reservation_system.Equipment.LabLocation labLocation11 = null;
        equipment4.updateDetail(equipmentType9, "ID: null |  | null | null | AVAILABLE", labLocation11);
        boolean boolean13 = equipment4.isReserved();
        com.reservation_system.Sensor.SensorType sensorType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        com.reservation_system.Equipment.EquipmentType equipmentType7 = equipment4.getEquipmentType();
        java.time.LocalDateTime localDateTime8 = equipment4.getLastUsedTime();
        equipment4.markUnavailable();
        org.junit.Assert.assertNull(equipmentType7);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        java.time.LocalDateTime localDateTime5 = equipment4.getLastUsedTime();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(sensorType7);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        java.lang.String str5 = equipment4.getDescription();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "", labLocation10);
        boolean boolean12 = equipment4.isReserved();
        equipment4.enable();
        equipment4.disable();
        com.reservation_system.Equipment.EquipmentType equipmentType15 = null;
        com.reservation_system.Equipment.LabLocation labLocation17 = null;
        equipment4.updateDetail(equipmentType15, "hi!", labLocation17);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertNull(sensorType7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        java.lang.String str10 = equipment4.getDescription();
        com.reservation_system.Sensor.SensorType sensorType11 = equipment4.getLastSensorTriggered();
        java.lang.String str12 = equipment4.getDescription();
        equipment4.markUnavailable();
        java.lang.Class<?> wildcardClass14 = equipment4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(sensorType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation8 = equipment4.getLabLocation();
        boolean boolean9 = equipment4.isReserved();
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType11 = equipment4.getLastSensorTriggered();
        com.reservation_system.Sensor.SensorType sensorType12 = equipment4.getLastSensorTriggered();
        boolean boolean13 = equipment4.isInUse();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(sensorType11);
        org.junit.Assert.assertNull(sensorType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "hi!", labLocation10);
        java.lang.String str12 = equipment4.toString();
        equipment4.markUnavailable();
        boolean boolean14 = equipment4.isInUse();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ID: null | hi! | null | null | AVAILABLE" + "'", str12, "ID: null | hi! | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        com.reservation_system.Sensor.SensorType sensorType10 = equipment4.getLastSensorTriggered();
        equipment4.finishUse();
        java.lang.String str12 = equipment4.toString();
        boolean boolean13 = equipment4.isInUse();
        com.reservation_system.Sensor.SensorType sensorType14 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sensorType10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str12, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(sensorType14);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isInUse();
        java.lang.String str8 = equipment4.getDescription();
        com.reservation_system.Equipment.EquipmentType equipmentType9 = null;
        com.reservation_system.Equipment.LabLocation labLocation11 = null;
        equipment4.updateDetail(equipmentType9, "ID: null |  | null | null | AVAILABLE", labLocation11);
        java.time.LocalDateTime localDateTime13 = equipment4.getLastUsedTime();
        com.reservation_system.Sensor.SensorType sensorType14 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(sensorType14);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        equipment4.disable();
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        equipment4.setInUse(sensorType11);
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        equipment4.setInUse(sensorType13);
        equipment4.setInUseDirectly();
        boolean boolean16 = equipment4.isReserved();
        boolean boolean17 = equipment4.isAvailable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        boolean boolean8 = equipment4.isAvailable();
        java.lang.String str9 = equipment4.getDescription();
        java.time.LocalDateTime localDateTime10 = equipment4.getLastUsedTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentType equipmentType7 = equipment4.getEquipmentType();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus8 = equipment4.getEquipmentStatus();
        equipment4.disable();
        java.time.LocalDateTime localDateTime10 = equipment4.getLastUsedTime();
        java.time.LocalDateTime localDateTime11 = equipment4.getLastUsedTime();
        com.reservation_system.Equipment.EquipmentType equipmentType12 = equipment4.getEquipmentType();
        boolean boolean13 = equipment4.isReserved();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType7);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus8.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(equipmentType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation8 = equipment4.getLabLocation();
        boolean boolean9 = equipment4.isReserved();
        equipment4.cancelReservation();
        java.lang.String str11 = equipment4.toString();
        java.time.LocalDateTime localDateTime12 = equipment4.getLastUsedTime();
        com.reservation_system.Equipment.LabLocation labLocation13 = equipment4.getLabLocation();
        boolean boolean14 = equipment4.isAvailable();
        boolean boolean15 = equipment4.isReserved();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str11, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(labLocation13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        java.lang.String str9 = equipment4.getDescription();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus10 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        equipment4.markUnavailable();
        boolean boolean13 = equipment4.isAvailable();
        equipment4.enable();
        boolean boolean15 = equipment4.isInUse();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus5 = equipment4.getEquipmentStatus();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        equipment4.disable();
        equipment4.markUnavailable();
        equipment4.enable();
        com.reservation_system.Equipment.EquipmentType equipmentType10 = equipment4.getEquipmentType();
        boolean boolean11 = equipment4.isAvailable();
        java.lang.Class<?> wildcardClass12 = equipment4.getClass();
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        equipment4.markUnavailable();
        com.reservation_system.Equipment.EquipmentType equipmentType11 = equipment4.getEquipmentType();
        boolean boolean12 = equipment4.isReserved();
        equipment4.enable();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus14 = equipment4.getEquipmentStatus();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        java.lang.String str8 = equipment4.toString();
        equipment4.markUnavailable();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus10 = equipment4.getEquipmentStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.MAINTENANCE + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.MAINTENANCE));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isInUse();
        java.lang.String str8 = equipment4.getDescription();
        equipment4.reserve();
        java.lang.String str10 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation11 = equipment4.getLabLocation();
        java.lang.String str12 = equipment4.toString();
        equipment4.setInUseDirectly();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str10, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str12, "ID: null |  | null | null | RESERVED");
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        com.reservation_system.Sensor.SensorType sensorType9 = equipment4.getLastSensorTriggered();
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        equipment4.checkIn(sensorType10);
        com.reservation_system.Equipment.EquipmentType equipmentType12 = equipment4.getEquipmentType();
        equipment4.setInUseDirectly();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus14 = equipment4.getEquipmentStatus();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(sensorType9);
        org.junit.Assert.assertNull(equipmentType12);
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus14.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        equipment4.setInUseDirectly();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "ID: null |  | null | null | RESERVED", labLocation10);
        com.reservation_system.Sensor.SensorType sensorType12 = equipment4.getLastSensorTriggered();
        java.time.LocalDateTime localDateTime13 = equipment4.getLastUsedTime();
        java.lang.String str14 = equipment4.getDescription();
        equipment4.setInUseDirectly();
        org.junit.Assert.assertNull(sensorType12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str14, "ID: null |  | null | null | RESERVED");
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isInUse();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "ID: null |  | null | null | RESERVED", labLocation10);
        equipment4.reserve();
        equipment4.cancelReservation();
        java.lang.String str14 = equipment4.toString();
        java.lang.String str15 = equipment4.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ID: null | ID: null |  | null | null | RESERVED | null | null | AVAILABLE" + "'", str14, "ID: null | ID: null |  | null | null | RESERVED | null | null | AVAILABLE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str15, "ID: null |  | null | null | RESERVED");
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentType equipmentType7 = equipment4.getEquipmentType();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus8 = equipment4.getEquipmentStatus();
        equipment4.disable();
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        equipment4.setInUse(sensorType10);
        com.reservation_system.Equipment.EquipmentType equipmentType12 = null;
        com.reservation_system.Equipment.LabLocation labLocation14 = null;
        equipment4.updateDetail(equipmentType12, "ID: null | ID: null |  | null | null | MAINTENANCE | null | null | AVAILABLE", labLocation14);
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType7);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus8.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        boolean boolean8 = equipment4.isReserved();
        boolean boolean9 = equipment4.isInUse();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        boolean boolean9 = equipment4.isInUse();
        java.time.LocalDateTime localDateTime10 = equipment4.getLastUsedTime();
        boolean boolean11 = equipment4.isReserved();
        equipment4.enable();
        boolean boolean13 = equipment4.isAvailable();
        equipment4.disable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        java.time.LocalDateTime localDateTime8 = equipment4.getLastUsedTime();
        java.lang.String str9 = equipment4.getDescription();
        equipment4.disable();
        java.util.UUID uUID11 = equipment4.getEquipmentId();
        boolean boolean12 = equipment4.isInUse();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(sensorType7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(uUID11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        com.reservation_system.Equipment.EquipmentType equipmentType6 = equipment4.getEquipmentType();
        java.lang.String str7 = equipment4.getDescription();
        org.junit.Assert.assertNull(equipmentType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "hi!", labLocation10);
        boolean boolean12 = equipment4.isReserved();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus13 = equipment4.getEquipmentStatus();
        boolean boolean14 = equipment4.isAvailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isInUse();
        java.util.UUID uUID8 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.LabLocation labLocation9 = equipment4.getLabLocation();
        java.lang.String str10 = equipment4.toString();
        boolean boolean11 = equipment4.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertNull(labLocation9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str10, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        boolean boolean6 = equipment4.isAvailable();
        java.time.LocalDateTime localDateTime7 = equipment4.getLastUsedTime();
        boolean boolean8 = equipment4.isReserved();
        boolean boolean9 = equipment4.isInUse();
        equipment4.reserve();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        java.util.UUID uUID9 = equipment4.getEquipmentId();
        equipment4.cancelReservation();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation8 = equipment4.getLabLocation();
        equipment4.enable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        equipment4.markUnavailable();
        equipment4.setInUseDirectly();
        boolean boolean11 = equipment4.isReserved();
        boolean boolean12 = equipment4.isReserved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        equipment4.setInUseDirectly();
        equipment4.finishUse();
        equipment4.reserve();
        equipment4.markUnavailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isInUse();
        java.util.UUID uUID8 = equipment4.getEquipmentId();
        equipment4.reserve();
        equipment4.setInUseDirectly();
        java.util.UUID uUID11 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentType equipmentType12 = null;
        com.reservation_system.Equipment.LabLocation labLocation14 = null;
        equipment4.updateDetail(equipmentType12, "ID: null | ID: null |  | null | null | AVAILABLE | null | null | AVAILABLE", labLocation14);
        com.reservation_system.Equipment.LabLocation labLocation16 = equipment4.getLabLocation();
        boolean boolean17 = equipment4.isReserved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertNull(uUID11);
        org.junit.Assert.assertNull(labLocation16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }
}

