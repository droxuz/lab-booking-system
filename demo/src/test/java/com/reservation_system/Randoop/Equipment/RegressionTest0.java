package com.reservation_system.Randoop.Equipment;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.lang.Class<?> wildcardClass6 = equipment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.EquipmentType equipmentType7 = null;
        com.reservation_system.Equipment.LabLocation labLocation9 = null;
        equipment4.updateDetail(equipmentType7, "hi!", labLocation9);
        java.lang.Class<?> wildcardClass11 = equipment4.getClass();
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        java.lang.Class<?> wildcardClass8 = equipment4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        java.time.LocalDateTime localDateTime9 = equipment4.getLastUsedTime();
        java.lang.Class<?> wildcardClass10 = equipment4.getClass();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
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
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.EquipmentType equipmentType7 = null;
        com.reservation_system.Equipment.LabLocation labLocation9 = null;
        equipment4.updateDetail(equipmentType7, "hi!", labLocation9);
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sensorType6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.enable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        boolean boolean9 = equipment4.isInUse();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        boolean boolean9 = equipment4.isInUse();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        java.lang.Class<?> wildcardClass5 = equipment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation8 = equipment4.getLabLocation();
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
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        java.util.UUID uUID8 = equipment4.getEquipmentId();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
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
        com.reservation_system.Sensor.SensorType sensorType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        equipment4.setInUseDirectly();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        equipment4.setInUseDirectly();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
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
        java.lang.Class<?> wildcardClass11 = equipment4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        java.lang.String str8 = equipment4.toString();
        equipment4.markUnavailable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
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
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | IN_USE", labLocation3);
        java.lang.Class<?> wildcardClass5 = equipment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation8 = equipment4.getLabLocation();
        java.lang.String str9 = equipment4.toString();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str9, "ID: null |  | null | null | RESERVED");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
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
        java.lang.Class<?> wildcardClass13 = equipment4.getClass();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
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
        equipment4.disable();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        java.lang.Class<?> wildcardClass8 = equipment4.getClass();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.disable();
        boolean boolean7 = equipment4.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        com.reservation_system.Sensor.SensorType sensorType9 = equipment4.getLastSensorTriggered();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(sensorType9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        java.lang.String str8 = equipment4.toString();
        equipment4.disable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        equipment4.cancelReservation();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        java.lang.String str8 = equipment4.toString();
        equipment4.markUnavailable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isInUse();
        java.lang.String str8 = equipment4.getDescription();
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isInUse();
        java.lang.String str8 = equipment4.getDescription();
        equipment4.disable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        equipment4.setInUseDirectly();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus8 = equipment4.getEquipmentStatus();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus8.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.enable();
        java.lang.String str9 = equipment4.getDescription();
        java.lang.Class<?> wildcardClass10 = equipment4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        boolean boolean7 = equipment4.isReserved();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus8 = equipment4.getEquipmentStatus();
        equipment4.enable();
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        equipment4.markUnavailable();
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        equipment4.updateDetail(equipmentType10, "", labLocation12);
        java.lang.Class<?> wildcardClass14 = equipment4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        equipment4.checkIn(sensorType7);
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
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
        equipment4.disable();
        java.time.LocalDateTime localDateTime13 = equipment4.getLastUsedTime();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentType equipmentType7 = equipment4.getEquipmentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = equipmentType7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
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
        equipment4.markUnavailable();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        java.lang.String str8 = equipment4.toString();
        equipment4.disable();
        com.reservation_system.Equipment.EquipmentType equipmentType10 = equipment4.getEquipmentType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(equipmentType10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        equipment4.markUnavailable();
        java.lang.String str10 = equipment4.toString();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ID: null |  | null | null | MAINTENANCE" + "'", str10, "ID: null |  | null | null | MAINTENANCE");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
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
        boolean boolean12 = equipment4.isInUse();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        boolean boolean7 = equipment4.isReserved();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus8 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(labLocation11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        boolean boolean7 = equipment4.isReserved();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus8 = equipment4.getEquipmentStatus();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
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
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus11 = equipment4.getEquipmentStatus();
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
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus11.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sensorType6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        java.util.UUID uUID8 = equipment4.getEquipmentId();
        equipment4.enable();
        boolean boolean10 = equipment4.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.enable();
        java.lang.Class<?> wildcardClass9 = equipment4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
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
        java.lang.Class<?> wildcardClass13 = equipment4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        equipment4.cancelReservation();
        boolean boolean8 = equipment4.isAvailable();
        java.lang.Class<?> wildcardClass9 = equipment4.getClass();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isInUse();
        java.lang.String str8 = equipment4.getDescription();
        equipment4.reserve();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
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
        equipment4.enable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(sensorType11);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        boolean boolean9 = equipment4.isInUse();
        equipment4.markUnavailable();
        java.lang.Class<?> wildcardClass11 = equipment4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isInUse();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        boolean boolean5 = equipment4.isReserved();
        java.lang.String str6 = equipment4.toString();
        java.lang.Class<?> wildcardClass7 = equipment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null | ID: null |  | null | null | RESERVED | null | null | AVAILABLE" + "'", str6, "ID: null | ID: null |  | null | null | RESERVED | null | null | AVAILABLE");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentType equipmentType7 = equipment4.getEquipmentType();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
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
        com.reservation_system.Equipment.EquipmentType equipmentType14 = null;
        com.reservation_system.Equipment.LabLocation labLocation16 = null;
        equipment4.updateDetail(equipmentType14, "ID: null |  | null | null | MAINTENANCE", labLocation16);
        com.reservation_system.Equipment.EquipmentType equipmentType18 = equipment4.getEquipmentType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(equipmentType18);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        com.reservation_system.Sensor.SensorType sensorType9 = equipment4.getLastSensorTriggered();
        boolean boolean10 = equipment4.isAvailable();
        equipment4.setInUseDirectly();
        equipment4.setInUseDirectly();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(sensorType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.enable();
        java.lang.String str9 = equipment4.getDescription();
        boolean boolean10 = equipment4.isAvailable();
        equipment4.setInUseDirectly();
        equipment4.markUnavailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        equipment4.markUnavailable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        equipment4.setInUseDirectly();
        equipment4.disable();
        java.lang.Class<?> wildcardClass9 = equipment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
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
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(sensorType11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = localDateTime10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
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
        equipment4.enable();
        boolean boolean13 = equipment4.isInUse();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ID: null |  | null | null | IN_USE" + "'", str11, "ID: null |  | null | null | IN_USE");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
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
        equipment4.finishUse();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
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
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        equipment4.setInUse(sensorType12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus5 = equipment4.getEquipmentStatus();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        equipment4.disable();
        boolean boolean8 = equipment4.isReserved();
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
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
        java.lang.String str12 = equipment4.getDescription();
        java.lang.String str13 = equipment4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ID: null |  | null | null | MAINTENANCE" + "'", str13, "ID: null |  | null | null | MAINTENANCE");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        java.time.LocalDateTime localDateTime5 = equipment4.getLastUsedTime();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | AVAILABLE", labLocation3);
        equipment4.reserve();
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        equipment4.checkIn(sensorType6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "hi!", labLocation3);
        com.reservation_system.Equipment.EquipmentType equipmentType5 = equipment4.getEquipmentType();
        equipment4.setInUseDirectly();
        equipment4.enable();
        org.junit.Assert.assertNull(equipmentType5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
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
        java.lang.Class<?> wildcardClass11 = equipment4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        java.time.LocalDateTime localDateTime5 = equipment4.getLastUsedTime();
        boolean boolean6 = equipment4.isReserved();
        boolean boolean7 = equipment4.isInUse();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
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
        java.lang.Class<?> wildcardClass11 = equipment4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        equipment4.markUnavailable();
        java.lang.String str10 = equipment4.toString();
        equipment4.enable();
        com.reservation_system.Equipment.LabLocation labLocation12 = equipment4.getLabLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ID: null |  | null | null | MAINTENANCE" + "'", str10, "ID: null |  | null | null | MAINTENANCE");
        org.junit.Assert.assertNull(labLocation12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        java.lang.String str8 = equipment4.toString();
        equipment4.markUnavailable();
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        equipment4.updateDetail(equipmentType10, "", labLocation12);
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        boolean boolean7 = equipment4.isReserved();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus8 = equipment4.getEquipmentStatus();
        java.lang.Class<?> wildcardClass9 = equipmentStatus8.getClass();
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        equipment4.enable();
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertNull(sensorType7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
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
        java.lang.String str13 = equipment4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sensorType10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str12, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str13, "ID: null |  | null | null | AVAILABLE");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        boolean boolean9 = equipment4.isInUse();
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
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
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(labLocation10);
        org.junit.Assert.assertNull(equipmentType11);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
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
        equipment4.markUnavailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sensorType10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | AVAILABLE", labLocation3);
        equipment4.reserve();
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        equipment4.setInUse(sensorType6);
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        equipment4.setInUseDirectly();
        org.junit.Assert.assertNull(sensorType7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation8 = equipment4.getLabLocation();
        com.reservation_system.Equipment.EquipmentType equipmentType9 = equipment4.getEquipmentType();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertNull(equipmentType9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
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
        equipment4.disable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        com.reservation_system.Equipment.EquipmentType equipmentType5 = null;
        com.reservation_system.Equipment.LabLocation labLocation7 = null;
        equipment4.updateDetail(equipmentType5, "hi!", labLocation7);
        equipment4.markUnavailable();
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(sensorType7);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
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
        boolean boolean12 = equipment4.isInUse();
        com.reservation_system.Equipment.EquipmentType equipmentType13 = equipment4.getEquipmentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = equipmentType13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(sensorType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(equipmentType13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.checkIn(sensorType8);
        org.junit.Assert.assertNull(sensorType7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
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
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        boolean boolean6 = equipment4.isAvailable();
        equipment4.reserve();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        equipment4.markUnavailable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
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
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        equipment4.setInUse(sensorType13);
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(sensorType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "ID: null |  | null | null | AVAILABLE", labLocation10);
        java.lang.String str12 = equipment4.toString();
        java.lang.Class<?> wildcardClass13 = equipment4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ID: null | ID: null |  | null | null | AVAILABLE | null | null | AVAILABLE" + "'", str12, "ID: null | ID: null |  | null | null | AVAILABLE | null | null | AVAILABLE");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
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
        com.reservation_system.Equipment.EquipmentType equipmentType13 = equipment4.getEquipmentType();
        boolean boolean14 = equipment4.isReserved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sensorType10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str12, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(equipmentType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
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
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        equipment4.setInUse(sensorType13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus11.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
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
        boolean boolean13 = equipment4.isAvailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        java.time.LocalDateTime localDateTime9 = equipment4.getLastUsedTime();
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        equipment4.setInUse(sensorType10);
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus5 = equipment4.getEquipmentStatus();
        com.reservation_system.Equipment.LabLocation labLocation6 = equipment4.getLabLocation();
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(labLocation6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        boolean boolean8 = equipment4.isAvailable();
        java.lang.String str9 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        equipment4.updateDetail(equipmentType10, "ID: null |  | null | null | MAINTENANCE", labLocation12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str9, "ID: null |  | null | null | AVAILABLE");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
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
        java.time.LocalDateTime localDateTime12 = equipment4.getLastUsedTime();
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(labLocation11);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        java.lang.String str5 = equipment4.getDescription();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        equipment4.reserve();
        boolean boolean8 = equipment4.isReserved();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
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
        boolean boolean11 = equipment4.isAvailable();
        boolean boolean12 = equipment4.isAvailable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        boolean boolean5 = equipment4.isReserved();
        boolean boolean6 = equipment4.isInUse();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
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
        boolean boolean15 = equipment4.isReserved();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ID: null | hi! | null | null | AVAILABLE" + "'", str12, "ID: null | hi! | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
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
        boolean boolean12 = equipment4.isReserved();
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(equipmentType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.enable();
        java.lang.String str9 = equipment4.getDescription();
        com.reservation_system.Equipment.LabLocation labLocation10 = equipment4.getLabLocation();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(labLocation10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        java.time.LocalDateTime localDateTime5 = equipment4.getLastUsedTime();
        boolean boolean6 = equipment4.isReserved();
        boolean boolean7 = equipment4.isInUse();
        boolean boolean8 = equipment4.isAvailable();
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        equipment4.enable();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        boolean boolean7 = equipment4.isReserved();
        com.reservation_system.Sensor.SensorType sensorType8 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sensorType8);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
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
        java.util.UUID uUID11 = equipment4.getEquipmentId();
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(labLocation10);
        org.junit.Assert.assertNull(uUID11);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        java.util.UUID uUID7 = equipment4.getEquipmentId();
        com.reservation_system.Sensor.SensorType sensorType8 = equipment4.getLastSensorTriggered();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(uUID7);
        org.junit.Assert.assertNull(sensorType8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        java.time.LocalDateTime localDateTime5 = equipment4.getLastUsedTime();
        boolean boolean6 = equipment4.isAvailable();
        java.lang.Class<?> wildcardClass7 = equipment4.getClass();
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
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
        java.lang.Class<?> wildcardClass11 = equipment4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
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
        java.lang.Class<?> wildcardClass12 = equipment4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
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
        boolean boolean12 = equipment4.isInUse();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.enable();
        java.lang.String str9 = equipment4.getDescription();
        boolean boolean10 = equipment4.isAvailable();
        equipment4.setInUseDirectly();
        boolean boolean12 = equipment4.isReserved();
        boolean boolean13 = equipment4.isAvailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.enable();
        java.lang.String str9 = equipment4.getDescription();
        boolean boolean10 = equipment4.isAvailable();
        equipment4.setInUseDirectly();
        boolean boolean12 = equipment4.isReserved();
        equipment4.enable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
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
        java.time.LocalDateTime localDateTime13 = equipment4.getLastUsedTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
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
        java.lang.String str13 = equipment4.toString();
        equipment4.setInUseDirectly();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ID: null |  | null | null | MAINTENANCE" + "'", str13, "ID: null |  | null | null | MAINTENANCE");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        equipment4.enable();
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        equipment4.setInUse(sensorType7);
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isInUse();
        java.lang.String str8 = equipment4.getDescription();
        equipment4.reserve();
        java.time.LocalDateTime localDateTime10 = equipment4.getLastUsedTime();
        java.lang.Class<?> wildcardClass11 = equipment4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        com.reservation_system.Equipment.EquipmentType equipmentType9 = null;
        com.reservation_system.Equipment.LabLocation labLocation11 = null;
        equipment4.updateDetail(equipmentType9, "", labLocation11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        equipment4.markUnavailable();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus9 = equipment4.getEquipmentStatus();
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        equipment4.setInUse(sensorType11);
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.MAINTENANCE + "'", equipmentStatus9.equals(com.reservation_system.Equipment.EquipmentStatus.MAINTENANCE));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        java.time.LocalDateTime localDateTime9 = equipment4.getLastUsedTime();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus11.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus5 = equipment4.getEquipmentStatus();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        equipment4.disable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(uUID6);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        equipment4.markUnavailable();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus10 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.MAINTENANCE + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.MAINTENANCE));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        boolean boolean8 = equipment4.isAvailable();
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
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
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
        com.reservation_system.Equipment.LabLocation labLocation11 = equipment4.getLabLocation();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(labLocation11);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
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
        java.lang.String str13 = equipment4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ID: null | ID: null |  | null | null | RESERVED | null | null | RESERVED" + "'", str13, "ID: null | ID: null |  | null | null | RESERVED | null | null | RESERVED");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentType equipmentType7 = equipment4.getEquipmentType();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
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
        com.reservation_system.Equipment.EquipmentType equipmentType14 = equipment4.getEquipmentType();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(sensorType9);
        org.junit.Assert.assertNull(equipmentType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(equipmentType14);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        equipment4.setInUseDirectly();
        equipment4.disable();
        boolean boolean9 = equipment4.isAvailable();
        equipment4.enable();
        com.reservation_system.Equipment.EquipmentType equipmentType11 = equipment4.getEquipmentType();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(equipmentType11);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        java.lang.String str8 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType9 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(sensorType9);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "hi!", labLocation3);
        com.reservation_system.Equipment.EquipmentType equipmentType5 = equipment4.getEquipmentType();
        equipment4.setInUseDirectly();
        equipment4.finishUse();
        org.junit.Assert.assertNull(equipmentType5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus11.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        boolean boolean8 = equipment4.isReserved();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.disable();
        boolean boolean7 = equipment4.isAvailable();
        equipment4.disable();
        java.util.UUID uUID9 = equipment4.getEquipmentId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
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
        java.util.UUID uUID13 = equipment4.getEquipmentId();
        java.lang.String str14 = equipment4.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(labLocation11);
        org.junit.Assert.assertNull(labLocation12);
        org.junit.Assert.assertNull(uUID13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
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
        com.reservation_system.Equipment.EquipmentType equipmentType14 = null;
        com.reservation_system.Equipment.LabLocation labLocation16 = null;
        equipment4.updateDetail(equipmentType14, "ID: null |  | null | null | MAINTENANCE", labLocation16);
        com.reservation_system.Equipment.LabLocation labLocation18 = equipment4.getLabLocation();
        java.lang.String str19 = equipment4.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(labLocation18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ID: null |  | null | null | MAINTENANCE" + "'", str19, "ID: null |  | null | null | MAINTENANCE");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        com.reservation_system.Sensor.SensorType sensorType8 = equipment4.getLastSensorTriggered();
        java.time.LocalDateTime localDateTime9 = equipment4.getLastUsedTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sensorType8);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        com.reservation_system.Equipment.EquipmentType equipmentType5 = null;
        com.reservation_system.Equipment.LabLocation labLocation7 = null;
        equipment4.updateDetail(equipmentType5, "hi!", labLocation7);
        equipment4.markUnavailable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation8 = equipment4.getLabLocation();
        boolean boolean9 = equipment4.isReserved();
        java.time.LocalDateTime localDateTime10 = equipment4.getLastUsedTime();
        java.time.LocalDateTime localDateTime11 = equipment4.getLastUsedTime();
        boolean boolean12 = equipment4.isInUse();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        equipment4.checkIn(sensorType7);
        com.reservation_system.Sensor.SensorType sensorType9 = equipment4.getLastSensorTriggered();
        boolean boolean10 = equipment4.isInUse();
        com.reservation_system.Sensor.SensorType sensorType11 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(sensorType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(sensorType11);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
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
        boolean boolean14 = equipment4.isReserved();
        equipment4.setInUseDirectly();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation8 = equipment4.getLabLocation();
        boolean boolean9 = equipment4.isReserved();
        boolean boolean10 = equipment4.isReserved();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
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
        java.util.UUID uUID14 = equipment4.getEquipmentId();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(uUID14);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType7);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus8.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
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
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        equipment4.setInUse(sensorType11);
        boolean boolean13 = equipment4.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        equipment4.setInUseDirectly();
        equipment4.disable();
        boolean boolean9 = equipment4.isAvailable();
        java.util.UUID uUID10 = equipment4.getEquipmentId();
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        java.lang.String str8 = equipment4.getDescription();
        equipment4.enable();
        java.lang.String str10 = equipment4.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        equipment4.disable();
        equipment4.markUnavailable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isInUse();
        java.util.UUID uUID8 = equipment4.getEquipmentId();
        equipment4.reserve();
        equipment4.markUnavailable();
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
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
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
        equipment4.finishUse();
        com.reservation_system.Equipment.EquipmentType equipmentType13 = null;
        com.reservation_system.Equipment.LabLocation labLocation15 = null;
        equipment4.updateDetail(equipmentType13, "", labLocation15);
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(sensorType9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
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
        java.util.UUID uUID13 = equipment4.getEquipmentId();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(labLocation11);
        org.junit.Assert.assertNull(labLocation12);
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        equipment4.enable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
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
        org.junit.Assert.assertNull(sensorType13);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
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
        java.util.UUID uUID13 = equipment4.getEquipmentId();
        java.lang.String str14 = equipment4.toString();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(sensorType11);
        org.junit.Assert.assertNull(sensorType12);
        org.junit.Assert.assertNull(uUID13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str14, "ID: null |  | null | null | AVAILABLE");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null | hi! | null | null | AVAILABLE", labLocation3);
        equipment4.markUnavailable();
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        equipment4.setInUse(sensorType6);
        equipment4.markUnavailable();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation8 = equipment4.getLabLocation();
        equipment4.markUnavailable();
        java.util.UUID uUID10 = equipment4.getEquipmentId();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        equipment4.setInUseDirectly();
        com.reservation_system.Equipment.LabLocation labLocation9 = equipment4.getLabLocation();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(labLocation9);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        com.reservation_system.Equipment.EquipmentType equipmentType5 = null;
        com.reservation_system.Equipment.LabLocation labLocation7 = null;
        equipment4.updateDetail(equipmentType5, "hi!", labLocation7);
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        equipment4.setInUse(sensorType9);
        java.lang.String str11 = equipment4.toString();
        equipment4.finishUse();
        equipment4.setInUseDirectly();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ID: null | hi! | null | null | IN_USE" + "'", str11, "ID: null | hi! | null | null | IN_USE");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(labLocation10);
        org.junit.Assert.assertNull(equipmentType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        java.time.LocalDateTime localDateTime5 = equipment4.getLastUsedTime();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime5);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        boolean boolean7 = equipment4.isReserved();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
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
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        equipment4.setInUse(sensorType12);
        com.reservation_system.Sensor.SensorType sensorType14 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.EquipmentType equipmentType15 = null;
        com.reservation_system.Equipment.LabLocation labLocation17 = null;
        equipment4.updateDetail(equipmentType15, "ID: null |  | null | null | RESERVED", labLocation17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(labLocation11);
        org.junit.Assert.assertNull(sensorType14);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        boolean boolean8 = equipment4.isAvailable();
        java.lang.String str9 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus10 = equipment4.getEquipmentStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str9, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
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
        java.time.LocalDateTime localDateTime13 = equipment4.getLastUsedTime();
        equipment4.disable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(sensorType9);
        org.junit.Assert.assertNull(equipmentType12);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        boolean boolean10 = equipment4.isAvailable();
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        equipment4.setInUse(sensorType11);
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "ID: null | ID: null |  | null | null | RESERVED | null | null | AVAILABLE", labLocation10);
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
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
        boolean boolean12 = equipment4.isInUse();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(sensorType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentType equipmentType7 = equipment4.getEquipmentType();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus8 = equipment4.getEquipmentStatus();
        equipment4.disable();
        equipment4.enable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType7);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus8.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus5 = equipment4.getEquipmentStatus();
        equipment4.setInUseDirectly();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(sensorType7);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        equipment4.cancelReservation();
        org.junit.Assert.assertNull(sensorType7);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        java.lang.String str8 = equipment4.toString();
        equipment4.markUnavailable();
        boolean boolean10 = equipment4.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
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
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        equipment4.setInUse(sensorType12);
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(labLocation10);
        org.junit.Assert.assertNull(equipmentType11);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        java.lang.String str8 = equipment4.toString();
        equipment4.markUnavailable();
        java.lang.String str10 = equipment4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ID: null |  | null | null | MAINTENANCE" + "'", str10, "ID: null |  | null | null | MAINTENANCE");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
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
        java.util.UUID uUID12 = equipment4.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uUID12);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        boolean boolean8 = equipment4.isAvailable();
        equipment4.cancelReservation();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(sensorType10);
        org.junit.Assert.assertNull(sensorType11);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        equipment4.checkIn(sensorType7);
        java.lang.String str9 = equipment4.getDescription();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "hi!", labLocation3);
        com.reservation_system.Equipment.EquipmentType equipmentType5 = equipment4.getEquipmentType();
        equipment4.markUnavailable();
        com.reservation_system.Equipment.EquipmentType equipmentType7 = equipment4.getEquipmentType();
        org.junit.Assert.assertNull(equipmentType5);
        org.junit.Assert.assertNull(equipmentType7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
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
        boolean boolean12 = equipment4.isInUse();
        equipment4.disable();
        com.reservation_system.Equipment.EquipmentType equipmentType14 = equipment4.getEquipmentType();
        java.lang.String str15 = equipment4.getDescription();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(sensorType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(equipmentType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
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
        com.reservation_system.Equipment.EquipmentType equipmentType14 = null;
        com.reservation_system.Equipment.LabLocation labLocation16 = null;
        equipment4.updateDetail(equipmentType14, "ID: null |  | null | null | MAINTENANCE", labLocation16);
        com.reservation_system.Equipment.LabLocation labLocation18 = equipment4.getLabLocation();
        boolean boolean19 = equipment4.isReserved();
        java.lang.String str20 = equipment4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(labLocation18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ID: null | ID: null |  | null | null | MAINTENANCE | null | null | AVAILABLE" + "'", str20, "ID: null | ID: null |  | null | null | MAINTENANCE | null | null | AVAILABLE");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        equipment4.markUnavailable();
        java.time.LocalDateTime localDateTime10 = equipment4.getLastUsedTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
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
        boolean boolean15 = equipment4.isAvailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        equipment4.setInUseDirectly();
        equipment4.finishUse();
        equipment4.reserve();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
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
        java.util.UUID uUID15 = equipment4.getEquipmentId();
        java.lang.String str16 = equipment4.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(uUID15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentType equipmentType7 = equipment4.getEquipmentType();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus8 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType7);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus8.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.enable();
        java.lang.String str9 = equipment4.getDescription();
        boolean boolean10 = equipment4.isAvailable();
        boolean boolean11 = equipment4.isAvailable();
        equipment4.enable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(labLocation10);
        org.junit.Assert.assertNull(equipmentType11);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        java.time.LocalDateTime localDateTime5 = equipment4.getLastUsedTime();
        boolean boolean6 = equipment4.isReserved();
        java.util.UUID uUID7 = equipment4.getEquipmentId();
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(uUID7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(equipmentType11);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
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
        java.lang.String str16 = equipment4.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
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
        java.lang.String str12 = equipment4.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(labLocation10);
        org.junit.Assert.assertNull(equipmentType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
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
        equipment4.markUnavailable();
        equipment4.enable();
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
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
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
        equipment4.enable();
        equipment4.markUnavailable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "hi!", labLocation3);
        com.reservation_system.Equipment.EquipmentType equipmentType5 = equipment4.getEquipmentType();
        equipment4.markUnavailable();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertNull(equipmentType5);
        org.junit.Assert.assertNull(sensorType7);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
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
        equipment4.markUnavailable();
        java.time.LocalDateTime localDateTime14 = equipment4.getLastUsedTime();
        java.time.LocalDateTime localDateTime15 = equipment4.getLastUsedTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(sensorType9);
        org.junit.Assert.assertNull(equipmentType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
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
        com.reservation_system.Equipment.EquipmentType equipmentType14 = null;
        com.reservation_system.Equipment.LabLocation labLocation16 = null;
        equipment4.updateDetail(equipmentType14, "ID: null |  | null | null | MAINTENANCE", labLocation16);
        equipment4.reserve();
        equipment4.enable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        equipment4.cancelReservation();
        boolean boolean8 = equipment4.isAvailable();
        java.util.UUID uUID9 = equipment4.getEquipmentId();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
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
        com.reservation_system.Sensor.SensorType sensorType14 = null;
        equipment4.setInUse(sensorType14);
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.enable();
        java.lang.String str9 = equipment4.getDescription();
        com.reservation_system.Equipment.LabLocation labLocation10 = equipment4.getLabLocation();
        com.reservation_system.Equipment.EquipmentType equipmentType11 = equipment4.getEquipmentType();
        equipment4.reserve();
        equipment4.disable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(labLocation10);
        org.junit.Assert.assertNull(equipmentType11);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
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
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus11 = equipment4.getEquipmentStatus();
        com.reservation_system.Equipment.LabLocation labLocation12 = equipment4.getLabLocation();
        com.reservation_system.Equipment.LabLocation labLocation13 = equipment4.getLabLocation();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus11.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(labLocation12);
        org.junit.Assert.assertNull(labLocation13);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation8 = equipment4.getLabLocation();
        boolean boolean9 = equipment4.isReserved();
        java.time.LocalDateTime localDateTime10 = equipment4.getLastUsedTime();
        equipment4.markUnavailable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
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
        com.reservation_system.Equipment.EquipmentType equipmentType11 = equipment4.getEquipmentType();
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType10);
        org.junit.Assert.assertNull(equipmentType11);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        boolean boolean5 = equipment4.isReserved();
        boolean boolean6 = equipment4.isInUse();
        equipment4.disable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
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
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        equipment4.setInUse(sensorType12);
        com.reservation_system.Sensor.SensorType sensorType14 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.EquipmentType equipmentType15 = null;
        com.reservation_system.Equipment.LabLocation labLocation17 = null;
        equipment4.updateDetail(equipmentType15, "ID: null | ID: null |  | null | null | RESERVED | null | null | AVAILABLE", labLocation17);
        boolean boolean19 = equipment4.isInUse();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(labLocation11);
        org.junit.Assert.assertNull(sensorType14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        java.lang.String str5 = equipment4.getDescription();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        java.lang.String str7 = equipment4.getDescription();
        com.reservation_system.Equipment.LabLocation labLocation8 = equipment4.getLabLocation();
        equipment4.markUnavailable();
        equipment4.enable();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(labLocation8);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.enable();
        java.lang.String str9 = equipment4.getDescription();
        boolean boolean10 = equipment4.isAvailable();
        equipment4.setInUseDirectly();
        boolean boolean12 = equipment4.isAvailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
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
        boolean boolean14 = equipment4.isReserved();
        boolean boolean15 = equipment4.isReserved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        equipment4.setInUseDirectly();
        com.reservation_system.Equipment.LabLocation labLocation9 = equipment4.getLabLocation();
        boolean boolean10 = equipment4.isAvailable();
        equipment4.markUnavailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(labLocation9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus5 = equipment4.getEquipmentStatus();
        equipment4.setInUseDirectly();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        java.time.LocalDateTime localDateTime8 = equipment4.getLastUsedTime();
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(sensorType7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
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
        java.util.UUID uUID12 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus13 = equipment4.getEquipmentStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID12);
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus5 = equipment4.getEquipmentStatus();
        equipment4.setInUseDirectly();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.finishUse();
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus10 = equipment4.getEquipmentStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        java.lang.String str5 = equipment4.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
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
        java.lang.String str15 = equipment4.toString();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str15, "ID: null |  | null | null | AVAILABLE");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        java.lang.String str8 = equipment4.toString();
        equipment4.markUnavailable();
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        equipment4.updateDetail(equipmentType10, "", labLocation12);
        com.reservation_system.Sensor.SensorType sensorType14 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(sensorType14);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.disable();
        boolean boolean7 = equipment4.isAvailable();
        equipment4.markUnavailable();
        java.lang.String str9 = equipment4.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ID: null |  | null | null | MAINTENANCE" + "'", str9, "ID: null |  | null | null | MAINTENANCE");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus5 = equipment4.getEquipmentStatus();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        equipment4.disable();
        java.util.UUID uUID8 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.LabLocation labLocation9 = equipment4.getLabLocation();
        java.lang.String str10 = equipment4.getDescription();
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertNull(labLocation9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
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
        com.reservation_system.Sensor.SensorType sensorType15 = null;
        equipment4.setInUse(sensorType15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(labLocation11);
        org.junit.Assert.assertNull(labLocation12);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str10, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation11);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
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
        java.lang.String str13 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType14 = null;
        com.reservation_system.Equipment.LabLocation labLocation16 = null;
        equipment4.updateDetail(equipmentType14, "ID: null | hi! | null | null | IN_USE", labLocation16);
        com.reservation_system.Equipment.EquipmentType equipmentType18 = equipment4.getEquipmentType();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ID: null |  | null | null | MAINTENANCE" + "'", str13, "ID: null |  | null | null | MAINTENANCE");
        org.junit.Assert.assertNull(equipmentType18);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        equipment4.markUnavailable();
        java.lang.Class<?> wildcardClass9 = equipment4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isInUse();
        java.lang.String str8 = equipment4.getDescription();
        boolean boolean9 = equipment4.isInUse();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        com.reservation_system.Equipment.LabLocation labLocation10 = equipment4.getLabLocation();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = labLocation10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(labLocation10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
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
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        equipment4.setInUse(sensorType11);
        java.lang.String str13 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation14 = equipment4.getLabLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ID: null |  | null | null | IN_USE" + "'", str13, "ID: null |  | null | null | IN_USE");
        org.junit.Assert.assertNull(labLocation14);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
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
        java.time.LocalDateTime localDateTime13 = equipment4.getLastUsedTime();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(sensorType9);
        org.junit.Assert.assertNull(equipmentType12);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        com.reservation_system.Sensor.SensorType sensorType9 = equipment4.getLastSensorTriggered();
        boolean boolean10 = equipment4.isInUse();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(sensorType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
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
        com.reservation_system.Equipment.EquipmentType equipmentType12 = equipment4.getEquipmentType();
        java.lang.Class<?> wildcardClass13 = equipment4.getClass();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str11, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(equipmentType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
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
        com.reservation_system.Equipment.EquipmentType equipmentType12 = equipment4.getEquipmentType();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus13 = equipment4.getEquipmentStatus();
        com.reservation_system.Equipment.EquipmentType equipmentType14 = equipment4.getEquipmentType();
        boolean boolean15 = equipment4.isReserved();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str11, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(equipmentType12);
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(equipmentType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        boolean boolean8 = equipment4.isReserved();
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
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
        boolean boolean13 = equipment4.isReserved();
        equipment4.enable();
        com.reservation_system.Equipment.EquipmentType equipmentType15 = equipment4.getEquipmentType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sensorType10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str12, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(equipmentType15);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        equipment4.setInUseDirectly();
        equipment4.disable();
        boolean boolean9 = equipment4.isAvailable();
        com.reservation_system.Sensor.SensorType sensorType10 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(sensorType10);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        equipment4.setInUseDirectly();
        equipment4.disable();
        boolean boolean9 = equipment4.isAvailable();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus10 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.DISABLED + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.DISABLED));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
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
        equipment4.setInUseDirectly();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(sensorType9);
        org.junit.Assert.assertNull(equipmentType12);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        java.util.UUID uUID7 = equipment4.getEquipmentId();
        equipment4.enable();
        java.time.LocalDateTime localDateTime9 = equipment4.getLastUsedTime();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID7);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isInUse();
        java.util.UUID uUID8 = equipment4.getEquipmentId();
        equipment4.reserve();
        equipment4.markUnavailable();
        java.lang.Class<?> wildcardClass11 = equipment4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null | ID: null |  | null | null | RESERVED | null | null | RESERVED", labLocation3);
        boolean boolean5 = equipment4.isInUse();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "hi!", labLocation3);
        com.reservation_system.Equipment.EquipmentType equipmentType5 = equipment4.getEquipmentType();
        equipment4.setInUseDirectly();
        java.lang.String str7 = equipment4.toString();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipmentType5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null | hi! | null | null | IN_USE" + "'", str7, "ID: null | hi! | null | null | IN_USE");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        boolean boolean5 = equipment4.isInUse();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.enable();
        boolean boolean9 = equipment4.isAvailable();
        equipment4.enable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus5 = equipment4.getEquipmentStatus();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isAvailable();
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
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
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus13 = equipment4.getEquipmentStatus();
        equipment4.enable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus11.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus13.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        com.reservation_system.Sensor.SensorType sensorType9 = equipment4.getLastSensorTriggered();
        boolean boolean10 = equipment4.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(sensorType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation8 = equipment4.getLabLocation();
        boolean boolean9 = equipment4.isReserved();
        java.lang.String str10 = equipment4.getDescription();
        boolean boolean11 = equipment4.isInUse();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
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
        equipment4.enable();
        equipment4.disable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
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
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        equipment4.checkIn(sensorType12);
        com.reservation_system.Sensor.SensorType sensorType14 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str10, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation11);
        org.junit.Assert.assertNull(sensorType14);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        equipment4.setInUseDirectly();
        java.util.UUID uUID8 = equipment4.getEquipmentId();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID8);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        equipment4.markUnavailable();
        equipment4.enable();
        java.lang.Class<?> wildcardClass10 = equipment4.getClass();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        boolean boolean6 = equipment4.isReserved();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
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
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        equipment4.setInUse(sensorType12);
        equipment4.markUnavailable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sensorType10);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ID: null | hi! | null | null | AVAILABLE" + "'", str12, "ID: null | hi! | null | null | AVAILABLE");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
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
        java.lang.String str13 = equipment4.getDescription();
        equipment4.setInUseDirectly();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(labLocation11);
        org.junit.Assert.assertNull(labLocation12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        java.lang.Class<?> wildcardClass7 = equipment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
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
        equipment4.setInUseDirectly();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        equipment4.setInUseDirectly();
        equipment4.markUnavailable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        equipment4.setInUseDirectly();
        java.lang.String str8 = equipment4.toString();
        boolean boolean9 = equipment4.isReserved();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | IN_USE" + "'", str8, "ID: null |  | null | null | IN_USE");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus5 = equipment4.getEquipmentStatus();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentType equipmentType7 = equipment4.getEquipmentType();
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType7);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        boolean boolean5 = equipment4.isReserved();
        java.lang.String str6 = equipment4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str6, "ID: null |  | null | null | RESERVED");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
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
        com.reservation_system.Equipment.EquipmentType equipmentType12 = equipment4.getEquipmentType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(equipmentType12);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation8 = equipment4.getLabLocation();
        boolean boolean9 = equipment4.isReserved();
        java.time.LocalDateTime localDateTime10 = equipment4.getLastUsedTime();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus11 = equipment4.getEquipmentStatus();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus11.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
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
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus11 = equipment4.getEquipmentStatus();
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
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus11.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
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
        boolean boolean12 = equipment4.isInUse();
        equipment4.disable();
        java.lang.String str14 = equipment4.getDescription();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(sensorType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        com.reservation_system.Sensor.SensorType sensorType10 = equipment4.getLastSensorTriggered();
        equipment4.setInUseDirectly();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(sensorType10);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        java.util.UUID uUID10 = equipment4.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        java.util.UUID uUID7 = equipment4.getEquipmentId();
        equipment4.enable();
        java.time.LocalDateTime localDateTime9 = equipment4.getLastUsedTime();
        java.util.UUID uUID10 = equipment4.getEquipmentId();
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        equipment4.setInUse(sensorType11);
        org.junit.Assert.assertNull(uUID7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
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
        java.util.UUID uUID12 = equipment4.getEquipmentId();
        equipment4.markUnavailable();
        com.reservation_system.Sensor.SensorType sensorType14 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID12);
        org.junit.Assert.assertNull(sensorType14);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus5 = equipment4.getEquipmentStatus();
        java.lang.String str6 = equipment4.toString();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        boolean boolean10 = equipment4.isAvailable();
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        equipment4.setInUse(sensorType11);
        com.reservation_system.Equipment.LabLocation labLocation13 = equipment4.getLabLocation();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(labLocation13);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
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
        boolean boolean12 = equipment4.isAvailable();
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
        org.junit.Assert.assertNull(equipmentType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
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
        com.reservation_system.Equipment.EquipmentType equipmentType14 = null;
        com.reservation_system.Equipment.LabLocation labLocation16 = null;
        equipment4.updateDetail(equipmentType14, "ID: null |  | null | null | MAINTENANCE", labLocation16);
        equipment4.reserve();
        com.reservation_system.Equipment.EquipmentType equipmentType19 = equipment4.getEquipmentType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(equipmentType19);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null | ID: null |  | null | null | AVAILABLE | null | null | AVAILABLE", labLocation3);
        com.reservation_system.Equipment.LabLocation labLocation5 = equipment4.getLabLocation();
        org.junit.Assert.assertNull(labLocation5);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.disable();
        boolean boolean7 = equipment4.isAvailable();
        java.time.LocalDateTime localDateTime8 = equipment4.getLastUsedTime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        equipment4.setInUseDirectly();
        equipment4.finishUse();
        com.reservation_system.Equipment.LabLocation labLocation10 = equipment4.getLabLocation();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = labLocation10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(labLocation10);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
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
        java.util.UUID uUID12 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentType equipmentType13 = null;
        com.reservation_system.Equipment.LabLocation labLocation15 = null;
        equipment4.updateDetail(equipmentType13, "", labLocation15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID12);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
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
        boolean boolean13 = equipment4.isReserved();
        java.lang.String str14 = equipment4.getDescription();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(sensorType9);
        org.junit.Assert.assertNull(equipmentType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
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
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sensorType10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str12, "ID: null |  | null | null | AVAILABLE");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        java.util.UUID uUID8 = equipment4.getEquipmentId();
        equipment4.enable();
        boolean boolean10 = equipment4.isAvailable();
        java.lang.String str11 = equipment4.getDescription();
        equipment4.reserve();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        java.lang.String str5 = equipment4.getDescription();
        java.lang.String str6 = equipment4.toString();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        boolean boolean7 = equipment4.isReserved();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus8 = equipment4.getEquipmentStatus();
        boolean boolean9 = equipment4.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
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
        java.lang.String str11 = equipment4.toString();
        boolean boolean12 = equipment4.isReserved();
        com.reservation_system.Equipment.LabLocation labLocation13 = equipment4.getLabLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ID: null |  | null | null | IN_USE" + "'", str11, "ID: null |  | null | null | IN_USE");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(labLocation13);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isInUse();
        java.lang.String str8 = equipment4.getDescription();
        boolean boolean9 = equipment4.isAvailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
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
        boolean boolean14 = equipment4.isInUse();
        java.time.LocalDateTime localDateTime15 = equipment4.getLastUsedTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        com.reservation_system.Equipment.LabLocation labLocation10 = equipment4.getLabLocation();
        boolean boolean11 = equipment4.isInUse();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
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
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        equipment4.setInUse(sensorType11);
        java.lang.Class<?> wildcardClass13 = equipment4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        equipment4.setInUseDirectly();
        equipment4.disable();
        boolean boolean9 = equipment4.isAvailable();
        java.util.UUID uUID10 = equipment4.getEquipmentId();
        boolean boolean11 = equipment4.isAvailable();
        com.reservation_system.Sensor.SensorType sensorType12 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(uUID10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(sensorType12);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
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
        com.reservation_system.Equipment.LabLocation labLocation11 = equipment4.getLabLocation();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType10);
        org.junit.Assert.assertNull(labLocation11);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
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
        java.time.LocalDateTime localDateTime13 = equipment4.getLastUsedTime();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        java.time.LocalDateTime localDateTime8 = equipment4.getLastUsedTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
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
        equipment4.disable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(sensorType11);
        org.junit.Assert.assertNull(sensorType12);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
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
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus11 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        equipment4.setInUse(sensorType12);
        equipment4.enable();
        boolean boolean15 = equipment4.isAvailable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus11.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
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
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus17 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType18 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertNull(uUID11);
        org.junit.Assert.assertNull(labLocation16);
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus17.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
        org.junit.Assert.assertNull(sensorType18);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
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
        com.reservation_system.Sensor.SensorType sensorType11 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(labLocation10);
        org.junit.Assert.assertNull(sensorType11);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        java.time.LocalDateTime localDateTime8 = equipment4.getLastUsedTime();
        boolean boolean9 = equipment4.isInUse();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(sensorType7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "ID: null |  | null | null | AVAILABLE", labLocation10);
        equipment4.reserve();
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        equipment4.setInUse(sensorType13);
        com.reservation_system.Sensor.SensorType sensorType15 = null;
        equipment4.setInUse(sensorType15);
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus17 = equipment4.getEquipmentStatus();
        com.reservation_system.Equipment.LabLocation labLocation18 = equipment4.getLabLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus17.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
        org.junit.Assert.assertNull(labLocation18);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
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
        com.reservation_system.Equipment.EquipmentType equipmentType14 = null;
        com.reservation_system.Equipment.LabLocation labLocation16 = null;
        equipment4.updateDetail(equipmentType14, "ID: null |  | null | null | MAINTENANCE", labLocation16);
        com.reservation_system.Equipment.LabLocation labLocation18 = equipment4.getLabLocation();
        boolean boolean19 = equipment4.isReserved();
        equipment4.setInUseDirectly();
        com.reservation_system.Equipment.EquipmentType equipmentType21 = equipment4.getEquipmentType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(labLocation18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(equipmentType21);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | AVAILABLE", labLocation3);
        equipment4.reserve();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertNull(sensorType6);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        boolean boolean5 = equipment4.isReserved();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
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
        boolean boolean12 = equipment4.isReserved();
        equipment4.setInUseDirectly();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(equipmentType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
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
        java.util.UUID uUID12 = equipment4.getEquipmentId();
        equipment4.setInUseDirectly();
        org.junit.Assert.assertNull(uUID12);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
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
        java.time.LocalDateTime localDateTime13 = equipment4.getLastUsedTime();
        java.util.UUID uUID14 = equipment4.getEquipmentId();
        equipment4.enable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(sensorType11);
        org.junit.Assert.assertNull(sensorType12);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(uUID14);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        boolean boolean8 = equipment4.isAvailable();
        equipment4.setInUseDirectly();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.checkIn(sensorType8);
        equipment4.finishUse();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
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
        com.reservation_system.Equipment.EquipmentType equipmentType14 = equipment4.getEquipmentType();
        org.junit.Assert.assertNull(sensorType12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNull(equipmentType14);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
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
        equipment4.enable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
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
        com.reservation_system.Equipment.EquipmentType equipmentType13 = equipment4.getEquipmentType();
        equipment4.enable();
        java.util.UUID uUID15 = equipment4.getEquipmentId();
        boolean boolean16 = equipment4.isReserved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sensorType10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str12, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(equipmentType13);
        org.junit.Assert.assertNull(uUID15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        equipment4.markUnavailable();
        java.lang.String str10 = equipment4.toString();
        equipment4.disable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ID: null |  | null | null | MAINTENANCE" + "'", str10, "ID: null |  | null | null | MAINTENANCE");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
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
        equipment4.finishUse();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus11.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
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
        com.reservation_system.Equipment.EquipmentType equipmentType13 = equipment4.getEquipmentType();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sensorType10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str12, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(equipmentType13);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
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
        equipment4.markUnavailable();
        equipment4.enable();
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
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentType equipmentType7 = equipment4.getEquipmentType();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus8 = equipment4.getEquipmentStatus();
        equipment4.disable();
        boolean boolean10 = equipment4.isAvailable();
        boolean boolean11 = equipment4.isAvailable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType7);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus8.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.enable();
        java.lang.String str9 = equipment4.getDescription();
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        equipment4.updateDetail(equipmentType10, "", labLocation12);
        equipment4.markUnavailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        boolean boolean5 = equipment4.isReserved();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus9 = equipment4.getEquipmentStatus();
        java.time.LocalDateTime localDateTime10 = equipment4.getLastUsedTime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null | ID: null |  | null | null | RESERVED | null | null | AVAILABLE" + "'", str6, "ID: null | ID: null |  | null | null | RESERVED | null | null | AVAILABLE");
        org.junit.Assert.assertNull(sensorType7);
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus9.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        boolean boolean6 = equipment4.isAvailable();
        java.time.LocalDateTime localDateTime7 = equipment4.getLastUsedTime();
        java.lang.String str8 = equipment4.toString();
        java.lang.Class<?> wildcardClass9 = equipment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
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
        java.lang.String str13 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType14 = null;
        com.reservation_system.Equipment.LabLocation labLocation16 = null;
        equipment4.updateDetail(equipmentType14, "ID: null | hi! | null | null | IN_USE", labLocation16);
        boolean boolean18 = equipment4.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ID: null |  | null | null | MAINTENANCE" + "'", str13, "ID: null |  | null | null | MAINTENANCE");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        com.reservation_system.Equipment.EquipmentType equipmentType5 = null;
        com.reservation_system.Equipment.LabLocation labLocation7 = null;
        equipment4.updateDetail(equipmentType5, "hi!", labLocation7);
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        equipment4.setInUse(sensorType9);
        java.lang.String str11 = equipment4.getDescription();
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
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
        java.lang.String str13 = equipment4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ID: null | hi! | null | null | AVAILABLE" + "'", str12, "ID: null | hi! | null | null | AVAILABLE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ID: null | hi! | null | null | AVAILABLE" + "'", str13, "ID: null | hi! | null | null | AVAILABLE");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
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
        com.reservation_system.Equipment.EquipmentType equipmentType12 = equipment4.getEquipmentType();
        java.util.UUID uUID13 = equipment4.getEquipmentId();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str11, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(equipmentType12);
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        equipment4.setInUseDirectly();
        java.util.UUID uUID8 = equipment4.getEquipmentId();
        equipment4.setInUseDirectly();
        equipment4.enable();
        org.junit.Assert.assertNull(uUID8);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
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
        com.reservation_system.Equipment.LabLocation labLocation12 = equipment4.getLabLocation();
        java.lang.String str13 = equipment4.getDescription();
        com.reservation_system.Sensor.SensorType sensorType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(labLocation12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str13, "ID: null |  | null | null | RESERVED");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        equipment4.enable();
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        equipment4.setInUse(sensorType7);
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.enable();
        java.lang.String str9 = equipment4.getDescription();
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        equipment4.updateDetail(equipmentType10, "", labLocation12);
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        equipment4.setInUseDirectly();
        com.reservation_system.Equipment.LabLocation labLocation10 = equipment4.getLabLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(labLocation10);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.enable();
        boolean boolean9 = equipment4.isAvailable();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus10 = equipment4.getEquipmentStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
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
        java.lang.String str11 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType12 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str11, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(sensorType12);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "ID: null | ID: null |  | null | null | RESERVED | null | null | AVAILABLE", labLocation10);
        java.util.UUID uUID12 = equipment4.getEquipmentId();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertNull(uUID12);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        java.lang.String str5 = equipment4.getDescription();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        java.time.LocalDateTime localDateTime8 = equipment4.getLastUsedTime();
        com.reservation_system.Sensor.SensorType sensorType9 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertNull(sensorType7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(sensorType9);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
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
        com.reservation_system.Equipment.EquipmentType equipmentType14 = null;
        com.reservation_system.Equipment.LabLocation labLocation16 = null;
        equipment4.updateDetail(equipmentType14, "ID: null |  | null | null | MAINTENANCE", labLocation16);
        com.reservation_system.Equipment.LabLocation labLocation18 = equipment4.getLabLocation();
        boolean boolean19 = equipment4.isReserved();
        equipment4.setInUseDirectly();
        equipment4.markUnavailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(labLocation18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
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
        boolean boolean12 = equipment4.isInUse();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType7);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentType equipmentType7 = equipment4.getEquipmentType();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus8 = equipment4.getEquipmentStatus();
        boolean boolean9 = equipment4.isAvailable();
        boolean boolean10 = equipment4.isInUse();
        boolean boolean11 = equipment4.isAvailable();
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        equipment4.checkIn(sensorType12);
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType7);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus8.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
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
        com.reservation_system.Equipment.LabLocation labLocation12 = equipment4.getLabLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(labLocation12);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        java.util.UUID uUID8 = equipment4.getEquipmentId();
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        equipment4.setInUse(sensorType9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertNull(uUID8);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "hi!", labLocation3);
        com.reservation_system.Equipment.EquipmentType equipmentType5 = equipment4.getEquipmentType();
        equipment4.setInUseDirectly();
        boolean boolean7 = equipment4.isAvailable();
        org.junit.Assert.assertNull(equipmentType5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
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
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus11 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        equipment4.setInUse(sensorType12);
        equipment4.enable();
        com.reservation_system.Equipment.LabLocation labLocation15 = equipment4.getLabLocation();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus11.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(labLocation15);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        equipment4.setInUseDirectly();
        equipment4.markUnavailable();
        com.reservation_system.Sensor.SensorType sensorType10 = equipment4.getLastSensorTriggered();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sensorType10);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        java.lang.String str8 = equipment4.toString();
        equipment4.markUnavailable();
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        equipment4.updateDetail(equipmentType10, "", labLocation12);
        java.util.UUID uUID14 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentType equipmentType15 = equipment4.getEquipmentType();
        com.reservation_system.Sensor.SensorType sensorType16 = null;
        equipment4.setInUse(sensorType16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(uUID14);
        org.junit.Assert.assertNull(equipmentType15);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
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
        java.lang.String str13 = equipment4.getDescription();
        com.reservation_system.Sensor.SensorType sensorType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(labLocation11);
        org.junit.Assert.assertNull(labLocation12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        boolean boolean6 = equipment4.isAvailable();
        java.time.LocalDateTime localDateTime7 = equipment4.getLastUsedTime();
        boolean boolean8 = equipment4.isReserved();
        java.lang.String str9 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType10 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str9, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(sensorType10);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        boolean boolean8 = equipment4.isAvailable();
        java.lang.String str9 = equipment4.getDescription();
        boolean boolean10 = equipment4.isInUse();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        boolean boolean8 = equipment4.isAvailable();
        java.lang.String str9 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation10 = equipment4.getLabLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str9, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation10);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.markUnavailable();
        equipment4.markUnavailable();
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        equipment4.updateDetail(equipmentType10, "", labLocation12);
        equipment4.markUnavailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        java.lang.String str5 = equipment4.getDescription();
        java.lang.String str6 = equipment4.toString();
        equipment4.setInUseDirectly();
        boolean boolean8 = equipment4.isAvailable();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
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
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus11 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        equipment4.setInUse(sensorType12);
        equipment4.enable();
        equipment4.setInUseDirectly();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus11.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "hi!", labLocation3);
        com.reservation_system.Equipment.EquipmentType equipmentType5 = equipment4.getEquipmentType();
        equipment4.setInUseDirectly();
        java.lang.String str7 = equipment4.toString();
        equipment4.enable();
        com.reservation_system.Equipment.EquipmentType equipmentType9 = null;
        com.reservation_system.Equipment.LabLocation labLocation11 = null;
        equipment4.updateDetail(equipmentType9, "ID: null | ID: null |  | null | null | RESERVED | null | null | RESERVED", labLocation11);
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipmentType5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null | hi! | null | null | IN_USE" + "'", str7, "ID: null | hi! | null | null | IN_USE");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
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
        equipment4.enable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(uUID15);
        org.junit.Assert.assertNull(sensorType16);
        org.junit.Assert.assertNull(labLocation17);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
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
        com.reservation_system.Equipment.EquipmentType equipmentType12 = equipment4.getEquipmentType();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus13 = equipment4.getEquipmentStatus();
        com.reservation_system.Equipment.EquipmentType equipmentType14 = equipment4.getEquipmentType();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str11, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(equipmentType12);
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(equipmentType14);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        java.util.UUID uUID7 = equipment4.getEquipmentId();
        equipment4.enable();
        java.time.LocalDateTime localDateTime9 = equipment4.getLastUsedTime();
        java.util.UUID uUID10 = equipment4.getEquipmentId();
        boolean boolean11 = equipment4.isReserved();
        org.junit.Assert.assertNull(uUID7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(uUID10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertNull(uUID11);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
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
        equipment4.markUnavailable();
        equipment4.setInUseDirectly();
        boolean boolean15 = equipment4.isAvailable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(labLocation10);
        org.junit.Assert.assertNull(equipmentType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        boolean boolean5 = equipment4.isReserved();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null | ID: null |  | null | null | RESERVED | null | null | AVAILABLE" + "'", str6, "ID: null | ID: null |  | null | null | RESERVED | null | null | AVAILABLE");
        org.junit.Assert.assertNull(sensorType7);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
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
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus11 = equipment4.getEquipmentStatus();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType7);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus8.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.DISABLED + "'", equipmentStatus11.equals(com.reservation_system.Equipment.EquipmentStatus.DISABLED));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
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
        equipment4.enable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
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
        boolean boolean12 = equipment4.isReserved();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType7);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus8.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
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
        equipment4.disable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertNull(labLocation9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str10, "ID: null |  | null | null | AVAILABLE");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.enable();
        java.lang.String str9 = equipment4.getDescription();
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        equipment4.updateDetail(equipmentType10, "", labLocation12);
        java.util.UUID uUID14 = equipment4.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(uUID14);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        equipment4.disable();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
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
        com.reservation_system.Equipment.EquipmentType equipmentType12 = equipment4.getEquipmentType();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType7);
        org.junit.Assert.assertNull(equipmentType12);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
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
        com.reservation_system.Equipment.EquipmentType equipmentType14 = null;
        com.reservation_system.Equipment.LabLocation labLocation16 = null;
        equipment4.updateDetail(equipmentType14, "ID: null | ID: null | hi! | null | null | AVAILABLE | null | null | AVAILABLE", labLocation16);
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str13, "ID: null |  | null | null | AVAILABLE");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        boolean boolean8 = equipment4.isInUse();
        java.util.UUID uUID9 = equipment4.getEquipmentId();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
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
        equipment4.setInUseDirectly();
        boolean boolean12 = equipment4.isReserved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(sensorType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
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
        com.reservation_system.Equipment.LabLocation labLocation13 = equipment4.getLabLocation();
        java.util.UUID uUID14 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.LabLocation labLocation15 = equipment4.getLabLocation();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType11);
        org.junit.Assert.assertNull(labLocation13);
        org.junit.Assert.assertNull(uUID14);
        org.junit.Assert.assertNull(labLocation15);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
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
        boolean boolean18 = equipment4.isInUse();
        java.time.LocalDateTime localDateTime19 = equipment4.getLastUsedTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
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
        boolean boolean11 = equipment4.isAvailable();
        java.util.UUID uUID12 = equipment4.getEquipmentId();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(uUID12);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus6 = equipment4.getEquipmentStatus();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
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
        java.lang.String str12 = equipment4.getDescription();
        com.reservation_system.Equipment.EquipmentType equipmentType13 = equipment4.getEquipmentType();
        com.reservation_system.Sensor.SensorType sensorType14 = null;
        equipment4.checkIn(sensorType14);
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ID: null | ID: null |  | null | null | MAINTENANCE | null | null | AVAILABLE" + "'", str12, "ID: null | ID: null |  | null | null | MAINTENANCE | null | null | AVAILABLE");
        org.junit.Assert.assertNull(equipmentType13);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
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
        equipment4.markUnavailable();
        boolean boolean13 = equipment4.isReserved();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
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
        java.lang.String str12 = equipment4.getDescription();
        boolean boolean13 = equipment4.isInUse();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(labLocation10);
        org.junit.Assert.assertNull(equipmentType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        java.util.UUID uUID7 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = equipmentType8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(uUID7);
        org.junit.Assert.assertNull(equipmentType8);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
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
        equipment4.enable();
        equipment4.reserve();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        java.lang.String str5 = equipment4.getDescription();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.LabLocation labLocation8 = equipment4.getLabLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertNull(sensorType7);
        org.junit.Assert.assertNull(labLocation8);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
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
        com.reservation_system.Equipment.EquipmentType equipmentType13 = equipment4.getEquipmentType();
        equipment4.enable();
        com.reservation_system.Equipment.EquipmentType equipmentType15 = equipment4.getEquipmentType();
        com.reservation_system.Sensor.SensorType sensorType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sensorType10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str12, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(equipmentType13);
        org.junit.Assert.assertNull(equipmentType15);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentType equipmentType7 = equipment4.getEquipmentType();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus8 = equipment4.getEquipmentStatus();
        java.util.UUID uUID9 = equipment4.getEquipmentId();
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        equipment4.checkIn(sensorType10);
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType7);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus8.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
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
        java.time.LocalDateTime localDateTime13 = equipment4.getLastUsedTime();
        com.reservation_system.Equipment.EquipmentType equipmentType14 = null;
        com.reservation_system.Equipment.LabLocation labLocation16 = null;
        equipment4.updateDetail(equipmentType14, "", labLocation16);
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(sensorType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        boolean boolean8 = equipment4.isReserved();
        java.lang.Class<?> wildcardClass9 = equipment4.getClass();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null | hi! | null | null | IN_USE", labLocation3);
        com.reservation_system.Equipment.LabLocation labLocation5 = equipment4.getLabLocation();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentType equipmentType7 = null;
        com.reservation_system.Equipment.LabLocation labLocation9 = null;
        equipment4.updateDetail(equipmentType7, "ID: null |  | null | null | RESERVED", labLocation9);
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(labLocation5);
        org.junit.Assert.assertNull(uUID6);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        com.reservation_system.Equipment.EquipmentType equipmentType10 = equipment4.getEquipmentType();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType10);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        com.reservation_system.Equipment.EquipmentType equipmentType5 = null;
        com.reservation_system.Equipment.LabLocation labLocation7 = null;
        equipment4.updateDetail(equipmentType5, "hi!", labLocation7);
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        equipment4.setInUse(sensorType9);
        java.lang.String str11 = equipment4.toString();
        java.time.LocalDateTime localDateTime12 = equipment4.getLastUsedTime();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ID: null | hi! | null | null | IN_USE" + "'", str11, "ID: null | hi! | null | null | IN_USE");
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
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
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus13 = equipment4.getEquipmentStatus();
        com.reservation_system.Equipment.EquipmentType equipmentType14 = null;
        com.reservation_system.Equipment.LabLocation labLocation16 = null;
        equipment4.updateDetail(equipmentType14, "ID: null |  | null | null | IN_USE", labLocation16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus11.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus13.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
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
        java.lang.String str13 = equipment4.getDescription();
        equipment4.setInUseDirectly();
        java.util.UUID uUID15 = equipment4.getEquipmentId();
        org.junit.Assert.assertNull(sensorType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str13, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(uUID15);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
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
        equipment4.disable();
        java.time.LocalDateTime localDateTime13 = equipment4.getLastUsedTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
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
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus13 = equipment4.getEquipmentStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ID: null | hi! | null | null | AVAILABLE" + "'", str12, "ID: null | hi! | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        com.reservation_system.Equipment.EquipmentType equipmentType5 = null;
        com.reservation_system.Equipment.LabLocation labLocation7 = null;
        equipment4.updateDetail(equipmentType5, "hi!", labLocation7);
        equipment4.disable();
        java.time.LocalDateTime localDateTime10 = equipment4.getLastUsedTime();
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        equipment4.setInUse(sensorType11);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.enable();
        com.reservation_system.Equipment.LabLocation labLocation9 = equipment4.getLabLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(labLocation9);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
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
        java.lang.String str11 = equipment4.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        boolean boolean5 = equipment4.isReserved();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus9 = equipment4.getEquipmentStatus();
        java.lang.Class<?> wildcardClass10 = equipmentStatus9.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null | ID: null |  | null | null | RESERVED | null | null | AVAILABLE" + "'", str6, "ID: null | ID: null |  | null | null | RESERVED | null | null | AVAILABLE");
        org.junit.Assert.assertNull(sensorType7);
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus9.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus5 = equipment4.getEquipmentStatus();
        equipment4.setInUseDirectly();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = sensorType7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(sensorType7);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        equipment4.setInUseDirectly();
        equipment4.disable();
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        equipment4.setInUse(sensorType9);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        equipment4.cancelReservation();
        java.time.LocalDateTime localDateTime8 = equipment4.getLastUsedTime();
        boolean boolean9 = equipment4.isReserved();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.enable();
        boolean boolean9 = equipment4.isAvailable();
        java.lang.String str10 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType11 = equipment4.getEquipmentType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str10, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(equipmentType11);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
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
        boolean boolean12 = equipment4.isInUse();
        com.reservation_system.Equipment.EquipmentType equipmentType13 = equipment4.getEquipmentType();
        com.reservation_system.Sensor.SensorType sensorType14 = equipment4.getLastSensorTriggered();
        equipment4.setInUseDirectly();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(sensorType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(equipmentType13);
        org.junit.Assert.assertNull(sensorType14);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        equipment4.enable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
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
        com.reservation_system.Equipment.EquipmentType equipmentType13 = equipment4.getEquipmentType();
        com.reservation_system.Equipment.EquipmentType equipmentType14 = null;
        com.reservation_system.Equipment.LabLocation labLocation16 = null;
        equipment4.updateDetail(equipmentType14, "", labLocation16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sensorType10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str12, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(equipmentType13);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
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
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        equipment4.setInUse(sensorType12);
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
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertNull(labLocation9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str10, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        equipment4.setInUseDirectly();
        equipment4.disable();
        boolean boolean9 = equipment4.isAvailable();
        java.util.UUID uUID10 = equipment4.getEquipmentId();
        equipment4.setInUseDirectly();
        equipment4.enable();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.reserve();
        equipment4.setInUseDirectly();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus8 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType9 = equipment4.getLastSensorTriggered();
        equipment4.finishUse();
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus8.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
        org.junit.Assert.assertNull(sensorType9);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
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
        equipment4.cancelReservation();
        java.lang.Class<?> wildcardClass12 = equipment4.getClass();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
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
        com.reservation_system.Equipment.EquipmentType equipmentType13 = null;
        com.reservation_system.Equipment.LabLocation labLocation15 = null;
        equipment4.updateDetail(equipmentType13, "ID: null | hi! | null | null | AVAILABLE", labLocation15);
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(sensorType11);
        org.junit.Assert.assertNull(sensorType12);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "ID: null |  | null | null | AVAILABLE", labLocation10);
        equipment4.reserve();
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        equipment4.setInUse(sensorType13);
        com.reservation_system.Sensor.SensorType sensorType15 = null;
        equipment4.setInUse(sensorType15);
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus17 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType18 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus17.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
        org.junit.Assert.assertNull(sensorType18);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
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
        com.reservation_system.Equipment.LabLocation labLocation11 = equipment4.getLabLocation();
        com.reservation_system.Equipment.EquipmentType equipmentType12 = equipment4.getEquipmentType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertNull(labLocation9);
        org.junit.Assert.assertNull(equipmentType10);
        org.junit.Assert.assertNull(labLocation11);
        org.junit.Assert.assertNull(equipmentType12);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null | hi! | null | null | IN_USE", labLocation3);
        com.reservation_system.Equipment.LabLocation labLocation5 = equipment4.getLabLocation();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentType equipmentType7 = null;
        com.reservation_system.Equipment.LabLocation labLocation9 = null;
        equipment4.updateDetail(equipmentType7, "ID: null |  | null | null | MAINTENANCE", labLocation9);
        org.junit.Assert.assertNull(labLocation5);
        org.junit.Assert.assertNull(uUID6);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
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
        equipment4.enable();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus14 = equipment4.getEquipmentStatus();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(sensorType11);
        org.junit.Assert.assertNull(sensorType12);
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
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
        com.reservation_system.Equipment.EquipmentType equipmentType13 = null;
        com.reservation_system.Equipment.LabLocation labLocation15 = null;
        equipment4.updateDetail(equipmentType13, "ID: null |  | null | null | MAINTENANCE", labLocation15);
        com.reservation_system.Equipment.EquipmentType equipmentType17 = equipment4.getEquipmentType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(equipmentType17);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        com.reservation_system.Equipment.EquipmentType equipmentType5 = null;
        com.reservation_system.Equipment.LabLocation labLocation7 = null;
        equipment4.updateDetail(equipmentType5, "hi!", labLocation7);
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        equipment4.setInUse(sensorType9);
        java.lang.String str11 = equipment4.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
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
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus14 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str11, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(labLocation13);
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
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
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID8);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        java.util.UUID uUID7 = equipment4.getEquipmentId();
        com.reservation_system.Sensor.SensorType sensorType8 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertNull(uUID7);
        org.junit.Assert.assertNull(sensorType8);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null | hi! | null | null | AVAILABLE", labLocation3);
        java.lang.String str5 = equipment4.toString();
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ID: null | ID: null | hi! | null | null | AVAILABLE | null | null | AVAILABLE" + "'", str5, "ID: null | ID: null | hi! | null | null | AVAILABLE | null | null | AVAILABLE");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
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
        equipment4.markUnavailable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(sensorType9);
        org.junit.Assert.assertNull(equipmentType12);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
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
        equipment4.enable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(labLocation11);
        org.junit.Assert.assertNull(labLocation12);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        java.util.UUID uUID7 = equipment4.getEquipmentId();
        com.reservation_system.Sensor.SensorType sensorType8 = equipment4.getLastSensorTriggered();
        equipment4.reserve();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(uUID7);
        org.junit.Assert.assertNull(sensorType8);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
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
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        equipment4.setInUse(sensorType11);
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.disable();
        boolean boolean7 = equipment4.isAvailable();
        equipment4.disable();
        boolean boolean9 = equipment4.isAvailable();
        java.lang.String str10 = equipment4.getDescription();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus5 = equipment4.getEquipmentStatus();
        equipment4.setInUseDirectly();
        com.reservation_system.Sensor.SensorType sensorType7 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.LabLocation labLocation8 = equipment4.getLabLocation();
        java.lang.String str9 = equipment4.getDescription();
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(sensorType7);
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | RESERVED", labLocation3);
        com.reservation_system.Equipment.EquipmentType equipmentType5 = null;
        com.reservation_system.Equipment.LabLocation labLocation7 = null;
        equipment4.updateDetail(equipmentType5, "hi!", labLocation7);
        java.lang.Class<?> wildcardClass9 = equipment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        java.util.UUID uUID8 = equipment4.getEquipmentId();
        equipment4.enable();
        boolean boolean10 = equipment4.isAvailable();
        equipment4.disable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
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
        equipment4.markUnavailable();
        equipment4.enable();
        com.reservation_system.Equipment.EquipmentType equipmentType13 = equipment4.getEquipmentType();
        java.util.UUID uUID14 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.LabLocation labLocation15 = equipment4.getLabLocation();
        java.lang.String str16 = equipment4.toString();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(equipmentType13);
        org.junit.Assert.assertNull(uUID14);
        org.junit.Assert.assertNull(labLocation15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str16, "ID: null |  | null | null | AVAILABLE");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
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
        java.lang.String str11 = equipment4.getDescription();
        java.lang.String str12 = equipment4.toString();
        java.lang.String str13 = equipment4.getDescription();
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertNull(equipmentType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str12, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
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
        java.lang.Class<?> wildcardClass13 = equipment4.getClass();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
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
        equipment4.setInUseDirectly();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertNull(sensorType7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
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
        equipment4.markUnavailable();
        equipment4.enable();
        com.reservation_system.Equipment.EquipmentType equipmentType13 = equipment4.getEquipmentType();
        java.util.UUID uUID14 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.LabLocation labLocation15 = equipment4.getLabLocation();
        java.lang.String str16 = equipment4.getDescription();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(equipmentType13);
        org.junit.Assert.assertNull(uUID14);
        org.junit.Assert.assertNull(labLocation15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
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
        java.lang.String str14 = equipment4.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sensorType10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str12, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null |  | null | null | MAINTENANCE", labLocation3);
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus5 = equipment4.getEquipmentStatus();
        java.lang.Class<?> wildcardClass6 = equipment4.getClass();
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
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
        equipment4.enable();
        equipment4.markUnavailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "ID: null |  | null | null | AVAILABLE", labLocation10);
        equipment4.reserve();
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        equipment4.setInUse(sensorType13);
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus15 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType16 = equipment4.getLastSensorTriggered();
        java.util.UUID uUID17 = equipment4.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus15 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus15.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
        org.junit.Assert.assertNull(sensorType16);
        org.junit.Assert.assertNull(uUID17);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isInUse();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus8 = equipment4.getEquipmentStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.enable();
        java.lang.String str9 = equipment4.getDescription();
        com.reservation_system.Equipment.LabLocation labLocation10 = equipment4.getLabLocation();
        com.reservation_system.Equipment.EquipmentType equipmentType11 = equipment4.getEquipmentType();
        equipment4.reserve();
        boolean boolean13 = equipment4.isAvailable();
        java.time.LocalDateTime localDateTime14 = equipment4.getLastUsedTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(labLocation10);
        org.junit.Assert.assertNull(equipmentType11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
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
        boolean boolean14 = equipment4.isReserved();
        equipment4.markUnavailable();
        boolean boolean16 = equipment4.isInUse();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
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
        boolean boolean12 = equipment4.isInUse();
        com.reservation_system.Equipment.EquipmentType equipmentType13 = null;
        com.reservation_system.Equipment.LabLocation labLocation15 = null;
        equipment4.updateDetail(equipmentType13, "ID: null |  | null | null | IN_USE", labLocation15);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
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
        com.reservation_system.Equipment.EquipmentType equipmentType14 = null;
        com.reservation_system.Equipment.LabLocation labLocation16 = null;
        equipment4.updateDetail(equipmentType14, "ID: null |  | null | null | MAINTENANCE", labLocation16);
        equipment4.disable();
        boolean boolean19 = equipment4.isReserved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        equipment4.setInUseDirectly();
        equipment4.markUnavailable();
        java.lang.String str10 = equipment4.getDescription();
        boolean boolean11 = equipment4.isInUse();
        com.reservation_system.Equipment.EquipmentType equipmentType12 = null;
        com.reservation_system.Equipment.LabLocation labLocation14 = null;
        equipment4.updateDetail(equipmentType12, "ID: null | hi! | null | null | AVAILABLE", labLocation14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
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
        boolean boolean13 = equipment4.isAvailable();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus14 = equipment4.getEquipmentStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ID: null |  | null | null | IN_USE" + "'", str11, "ID: null |  | null | null | IN_USE");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus14.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        com.reservation_system.Sensor.SensorType sensorType9 = equipment4.getLastSensorTriggered();
        boolean boolean10 = equipment4.isReserved();
        boolean boolean11 = equipment4.isAvailable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertNull(sensorType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
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
        java.util.UUID uUID12 = equipment4.getEquipmentId();
        equipment4.markUnavailable();
        com.reservation_system.Equipment.EquipmentType equipmentType14 = equipment4.getEquipmentType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID12);
        org.junit.Assert.assertNull(equipmentType14);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
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
        com.reservation_system.Equipment.EquipmentType equipmentType13 = null;
        com.reservation_system.Equipment.LabLocation labLocation15 = null;
        equipment4.updateDetail(equipmentType13, "ID: null |  | null | null | MAINTENANCE", labLocation15);
        boolean boolean17 = equipment4.isAvailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null | hi! | null | null | AVAILABLE", labLocation3);
        equipment4.markUnavailable();
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        equipment4.setInUse(sensorType6);
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        org.junit.Assert.assertNull(equipmentType8);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
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
        java.util.UUID uUID13 = equipment4.getEquipmentId();
        equipment4.enable();
        java.util.UUID uUID15 = equipment4.getEquipmentId();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(sensorType11);
        org.junit.Assert.assertNull(sensorType12);
        org.junit.Assert.assertNull(uUID13);
        org.junit.Assert.assertNull(uUID15);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        equipment4.setInUseDirectly();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        equipment4.setInUseDirectly();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus9 = equipment4.getEquipmentStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus9.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
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
        boolean boolean13 = equipment4.isReserved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(labLocation11);
        org.junit.Assert.assertNull(labLocation12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "ID: null | ID: null | hi! | null | null | AVAILABLE | null | null | AVAILABLE", labLocation3);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
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
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
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
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment4.checkIn(sensorType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment must be reserved before check-in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertNull(sensorType7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        equipment4.updateDetail(equipmentType8, "ID: null |  | null | null | AVAILABLE", labLocation10);
        equipment4.reserve();
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        equipment4.setInUse(sensorType13);
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus15 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType16 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.EquipmentType equipmentType17 = null;
        com.reservation_system.Equipment.LabLocation labLocation19 = null;
        equipment4.updateDetail(equipmentType17, "ID: null | ID: null |  | null | null | AVAILABLE | null | null | AVAILABLE", labLocation19);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus15 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus15.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
        org.junit.Assert.assertNull(sensorType16);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType11);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
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
        equipment4.enable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        com.reservation_system.Sensor.SensorType sensorType6 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.setInUseDirectly();
        org.junit.Assert.assertNull(sensorType6);
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        boolean boolean6 = equipment4.isAvailable();
        java.lang.Class<?> wildcardClass7 = equipment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
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
        com.reservation_system.Sensor.SensorType sensorType14 = null;
        equipment4.setInUse(sensorType14);
        java.time.LocalDateTime localDateTime16 = equipment4.getLastUsedTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
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
        equipment4.enable();
        java.lang.String str13 = equipment4.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ID: null |  | null | null | IN_USE" + "'", str11, "ID: null |  | null | null | IN_USE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        equipment4.markUnavailable();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
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
        boolean boolean14 = equipment4.isAvailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str13, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isInUse();
        java.util.UUID uUID8 = equipment4.getEquipmentId();
        equipment4.reserve();
        equipment4.markUnavailable();
        com.reservation_system.Equipment.EquipmentType equipmentType11 = equipment4.getEquipmentType();
        equipment4.enable();
        com.reservation_system.Equipment.EquipmentType equipmentType13 = null;
        com.reservation_system.Equipment.LabLocation labLocation15 = null;
        equipment4.updateDetail(equipmentType13, "ID: null | ID: null |  | null | null | RESERVED | null | null | RESERVED", labLocation15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertNull(equipmentType11);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        equipment4.cancelReservation();
        equipment4.enable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
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
        equipment4.disable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str10, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation11);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.finishUse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType8 = equipment4.getEquipmentType();
        equipment4.disable();
        equipment4.disable();
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        equipment4.setInUse(sensorType11);
        equipment4.markUnavailable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        com.reservation_system.Equipment.EquipmentType equipmentType6 = equipment4.getEquipmentType();
        com.reservation_system.Equipment.EquipmentType equipmentType7 = null;
        com.reservation_system.Equipment.LabLocation labLocation9 = null;
        equipment4.updateDetail(equipmentType7, "ID: null | hi! | null | null | AVAILABLE", labLocation9);
        org.junit.Assert.assertNull(equipmentType6);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        java.lang.Class<?> wildcardClass8 = equipment4.getClass();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        boolean boolean7 = equipment4.isReserved();
        equipment4.setInUseDirectly();
        com.reservation_system.Equipment.LabLocation labLocation9 = equipment4.getLabLocation();
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        equipment4.updateDetail(equipmentType10, "ID: null | ID: null | hi! | null | null | AVAILABLE | null | null | AVAILABLE", labLocation12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(labLocation9);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation7 = equipment4.getLabLocation();
        java.lang.String str8 = equipment4.toString();
        equipment4.markUnavailable();
        boolean boolean10 = equipment4.isAvailable();
        boolean boolean11 = equipment4.isReserved();
        // The following exception was thrown during execution in test generation
        try {
            equipment4.reserve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not available for reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus6 = equipment4.getEquipmentStatus();
        boolean boolean7 = equipment4.isAvailable();
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
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
        com.reservation_system.Sensor.SensorType sensorType12 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(labLocation11);
        org.junit.Assert.assertNull(sensorType12);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
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
        com.reservation_system.Equipment.LabLocation labLocation11 = equipment4.getLabLocation();
        boolean boolean12 = equipment4.isInUse();
        equipment4.markUnavailable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(labLocation11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.reserve();
        java.util.UUID uUID6 = equipment4.getEquipmentId();
        java.lang.String str7 = equipment4.toString();
        com.reservation_system.Equipment.LabLocation labLocation8 = equipment4.getLabLocation();
        com.reservation_system.Sensor.SensorType sensorType9 = equipment4.getLastSensorTriggered();
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        equipment4.updateDetail(equipmentType10, "ID: null | ID: null |  | null | null | MAINTENANCE | null | null | AVAILABLE", labLocation12);
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertNull(sensorType9);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
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
        // The following exception was thrown during execution in test generation
        try {
            equipment4.cancelReservation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment is not currently reserved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.IN_USE + "'", equipmentStatus11.equals(com.reservation_system.Equipment.EquipmentStatus.IN_USE));
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
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
        java.lang.String str13 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentType equipmentType14 = null;
        com.reservation_system.Equipment.LabLocation labLocation16 = null;
        equipment4.updateDetail(equipmentType14, "ID: null | hi! | null | null | IN_USE", labLocation16);
        com.reservation_system.Sensor.SensorType sensorType18 = equipment4.getLastSensorTriggered();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(equipmentType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.RESERVED + "'", equipmentStatus10.equals(com.reservation_system.Equipment.EquipmentStatus.RESERVED));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ID: null |  | null | null | MAINTENANCE" + "'", str13, "ID: null |  | null | null | MAINTENANCE");
        org.junit.Assert.assertNull(sensorType18);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        equipment4.enable();
        java.lang.String str6 = equipment4.toString();
        com.reservation_system.Equipment.EquipmentStatus equipmentStatus7 = equipment4.getEquipmentStatus();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        equipment4.setInUse(sensorType8);
        com.reservation_system.Sensor.SensorType sensorType10 = equipment4.getLastSensorTriggered();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = sensorType10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(sensorType10);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
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
        com.reservation_system.Equipment.EquipmentType equipmentType14 = null;
        com.reservation_system.Equipment.LabLocation labLocation16 = null;
        equipment4.updateDetail(equipmentType14, "ID: null |  | null | null | MAINTENANCE", labLocation16);
        equipment4.reserve();
        equipment4.cancelReservation();
        equipment4.reserve();
        java.lang.Class<?> wildcardClass21 = equipment4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
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
        java.util.UUID uUID11 = equipment4.getEquipmentId();
        equipment4.setInUseDirectly();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(labLocation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str8, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(uUID11);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
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
        java.util.UUID uUID11 = equipment4.getEquipmentId();
        equipment4.disable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ID: null |  | null | null | AVAILABLE" + "'", str6, "ID: null |  | null | null | AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + com.reservation_system.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(com.reservation_system.Equipment.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(uUID11);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
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
        java.util.UUID uUID13 = equipment4.getEquipmentId();
        equipment4.disable();
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(sensorType11);
        org.junit.Assert.assertNull(sensorType12);
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
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
        java.util.UUID uUID13 = equipment4.getEquipmentId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = uUID13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uUID6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ID: null |  | null | null | RESERVED" + "'", str7, "ID: null |  | null | null | RESERVED");
        org.junit.Assert.assertNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(sensorType11);
        org.junit.Assert.assertNull(sensorType12);
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        java.util.UUID uUID0 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType1 = null;
        com.reservation_system.Equipment.LabLocation labLocation3 = null;
        com.reservation_system.Equipment.Equipment equipment4 = new com.reservation_system.Equipment.Equipment(uUID0, equipmentType1, "", labLocation3);
        java.lang.String str5 = equipment4.getDescription();
        equipment4.enable();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }
}

