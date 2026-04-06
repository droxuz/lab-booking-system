package com.reservation_system.Randoop.Sensor.SensorManager;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.reservation_system.Sensor.CSVDataStore cSVDataStore0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.Sensor.SensorManager sensorManager1 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.CSVDataStore.countLogs()\" because \"dataStore\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.lang.Class<?> wildcardClass1 = sensorManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        com.reservation_system.Equipment.Equipment equipment1 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        com.reservation_system.Equipment.Equipment equipment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Equipment.Equipment equipment4 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.lang.Class<?> wildcardClass2 = sensorManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        com.reservation_system.Sensor.Sensor sensor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateSensor(sensor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.Sensor sensor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateSensor(sensor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Equipment.Equipment equipment2 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.removeObserver(sensorObserver2);
        com.reservation_system.Equipment.Equipment equipment4 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.removeObserver(sensorObserver2);
        java.lang.Class<?> wildcardClass4 = sensorManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Equipment.Equipment equipment4 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = sensorManager0.processUsageData(uUID2, uUID3, "hi!", localDateTime5);
        com.reservation_system.Sensor.Sensor sensor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateSensor(sensor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str6.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorManager0.removeObserver(sensorObserver1);
        com.reservation_system.Equipment.Equipment equipment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.Sensor sensor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addSensor(sensor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = sensorManager0.processUsageData(uUID2, uUID3, "hi!", localDateTime5);
        com.reservation_system.Sensor.Sensor sensor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addSensor(sensor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str6.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore5 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.Sensor sensor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateSensor(sensor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        java.lang.Class<?> wildcardClass5 = sensorManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        com.reservation_system.Sensor.Sensor sensor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager5.updateSensor(sensor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Equipment.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        com.reservation_system.Equipment.Equipment equipment4 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList2 = sensorManager0.getAllEquipment();
        java.lang.Class<?> wildcardClass3 = sensorManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        java.util.UUID uUID6 = null;
        sensorManager5.removeSensor(uUID6);
        com.reservation_system.Equipment.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager5.addEquipment(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Equipment.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        java.util.UUID uUID3 = null;
        sensorManager0.removeSensor(uUID3);
        com.reservation_system.Equipment.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        com.reservation_system.Sensor.Sensor sensor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateSensor(sensor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList4 = sensorManager0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore6 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorManager0.removeObserver(sensorObserver7);
        com.reservation_system.Sensor.Sensor sensor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addSensor(sensor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore6);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.UUID uUID5 = null;
        sensorManager0.removeEquipment(uUID5);
        java.util.UUID uUID7 = null;
        sensorManager0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        sensorManager0.removeEquipment(uUID9);
        com.reservation_system.Sensor.Sensor sensor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateSensor(sensor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList4 = sensorManager0.getAllEquipment();
        java.lang.Class<?> wildcardClass5 = equipmentList4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.Sensor sensor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateSensor(sensor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.Sensor sensor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addSensor(sensor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.removeObserver(sensorObserver2);
        com.reservation_system.Equipment.Equipment equipment4 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList2 = sensorManager0.getAllEquipment();
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorManager0.processUsageData(uUID3, uUID4, "", localDateTime6);
        com.reservation_system.Equipment.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        java.util.UUID uUID6 = null;
        sensorManager0.removeSensor(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore6 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorManager0.removeObserver(sensorObserver7);
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager0.removeObserver(sensorObserver9);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList11 = sensorManager0.getAllEquipment();
        com.reservation_system.Equipment.Equipment equipment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList11);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver5 = null;
        sensorManager0.removeObserver(sensorObserver5);
        com.reservation_system.Sensor.Sensor sensor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateSensor(sensor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore7 = sensorManager6.getDataStore();
        java.lang.Class<?> wildcardClass8 = cSVDataStore7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        com.reservation_system.Equipment.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Equipment.Equipment equipment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore6 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorManager0.removeObserver(sensorObserver7);
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager0.removeObserver(sensorObserver9);
        com.reservation_system.Sensor.Sensor sensor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addSensor(sensor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList2 = sensorManager0.getAllEquipment();
        java.util.UUID uUID3 = null;
        sensorManager0.removeEquipment(uUID3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        com.reservation_system.Equipment.Equipment equipment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.Sensor sensor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateSensor(sensor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorManager6.getAllLogs();
        com.reservation_system.Equipment.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager6.updateEquipment(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore7 = sensorManager6.getDataStore();
        com.reservation_system.Equipment.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager6.addEquipment(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        java.util.UUID uUID6 = null;
        sensorManager0.removeEquipment(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.lang.Class<?> wildcardClass4 = equipmentList3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorManager6.getAllLogs();
        com.reservation_system.Sensor.Sensor sensor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager6.addSensor(sensor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList2 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorManager0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver5 = null;
        sensorManager0.removeObserver(sensorObserver5);
        java.lang.Class<?> wildcardClass7 = sensorManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.UUID uUID4 = null;
        java.util.UUID uUID5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.lang.String str8 = sensorManager0.processUsageData(uUID4, uUID5, "", localDateTime7);
        java.util.UUID uUID9 = null;
        sensorManager0.removeSensor(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str8.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList2 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.UUID uUID4 = null;
        sensorManager0.removeEquipment(uUID4);
        java.util.UUID uUID6 = null;
        sensorManager0.removeEquipment(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore6 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorManager0.removeObserver(sensorObserver7);
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager0.removeObserver(sensorObserver9);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList11 = sensorManager0.getAllEquipment();
        java.util.UUID uUID12 = null;
        java.util.UUID uUID13 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.lang.String str16 = sensorManager0.processUsageData(uUID12, uUID13, "ERROR: Invalid sensorId \u2014 null", localDateTime15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str16.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver3 = null;
        sensorManager0.removeObserver(sensorObserver3);
        java.lang.Class<?> wildcardClass5 = sensorManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.UUID uUID5 = null;
        sensorManager4.removeSensor(uUID5);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList7 = sensorManager4.getAllSensors();
        java.util.UUID uUID8 = null;
        sensorManager4.removeEquipment(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.UUID uUID5 = null;
        sensorManager0.removeEquipment(uUID5);
        com.reservation_system.Sensor.Sensor sensor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addSensor(sensor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore7 = sensorManager6.getDataStore();
        java.lang.Class<?> wildcardClass8 = sensorManager6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorManager0.getAllSensors();
        java.util.UUID uUID6 = null;
        sensorManager0.removeEquipment(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Equipment.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver3 = null;
        sensorManager0.removeObserver(sensorObserver3);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList5 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorManager0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorManager5.getAllSensors();
        com.reservation_system.Sensor.Sensor sensor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager5.updateSensor(sensor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList2 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        com.reservation_system.Equipment.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = sensorManager0.processUsageData(uUID2, uUID3, "hi!", localDateTime5);
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorManager0.removeObserver(sensorObserver7);
        com.reservation_system.Equipment.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str6.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore6 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorManager0.removeObserver(sensorObserver7);
        java.util.UUID uUID9 = null;
        java.util.UUID uUID10 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.lang.String str13 = sensorManager0.processUsageData(uUID9, uUID10, "hi!", localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str13.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        com.reservation_system.Sensor.Sensor sensor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager5.addSensor(sensor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore5 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        com.reservation_system.Sensor.SensorManager sensorManager7 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        java.lang.Class<?> wildcardClass8 = sensorManager7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.Sensor sensor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addSensor(sensor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList5 = sensorManager0.getAllEquipment();
        java.lang.Class<?> wildcardClass6 = sensorManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        java.util.UUID uUID3 = null;
        sensorManager0.removeSensor(uUID3);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.SensorObserver sensorObserver6 = null;
        sensorManager0.addObserver(sensorObserver6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.UUID uUID4 = null;
        java.util.UUID uUID5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.lang.String str8 = sensorManager0.processUsageData(uUID4, uUID5, "hi!", localDateTime7);
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager0.removeObserver(sensorObserver9);
        java.util.UUID uUID11 = null;
        java.util.UUID uUID12 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.lang.String str15 = sensorManager0.processUsageData(uUID11, uUID12, "ERROR: Invalid sensorId \u2014 null", localDateTime14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str8.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str15.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensorManager5.getAllLogs();
        com.reservation_system.Sensor.Sensor sensor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager5.addSensor(sensor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.UUID uUID5 = null;
        sensorManager4.removeSensor(uUID5);
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorManager4.addObserver(sensorObserver7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeSensor(uUID4);
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorManager0.processUsageData(uUID6, uUID7, "ERROR: Invalid sensorId \u2014 null", localDateTime9);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore11 = sensorManager0.getDataStore();
        java.util.UUID uUID12 = null;
        java.util.UUID uUID13 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.lang.String str16 = sensorManager0.processUsageData(uUID12, uUID13, "", localDateTime15);
        com.reservation_system.Equipment.Equipment equipment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str16.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.UUID uUID5 = null;
        sensorManager0.removeEquipment(uUID5);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorManager0.getAllLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList6 = sensorManager0.getAllEquipment();
        java.util.UUID uUID7 = null;
        java.util.UUID uUID8 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.lang.String str11 = sensorManager0.processUsageData(uUID7, uUID8, "hi!", localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str11.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.Sensor sensor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addSensor(sensor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver4 = null;
        sensorManager0.removeObserver(sensorObserver4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        java.util.UUID uUID2 = null;
        sensorManager0.removeEquipment(uUID2);
        com.reservation_system.Sensor.Sensor sensor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addSensor(sensor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.UUID uUID5 = null;
        sensorManager0.removeEquipment(uUID5);
        java.util.UUID uUID7 = null;
        sensorManager0.removeSensor(uUID7);
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager0.removeObserver(sensorObserver9);
        com.reservation_system.Sensor.Sensor sensor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateSensor(sensor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.UUID uUID5 = null;
        sensorManager4.removeSensor(uUID5);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList7 = sensorManager4.getAllSensors();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorManager4.getAllEquipment();
        java.lang.Class<?> wildcardClass9 = sensorManager4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList3 = sensorManager0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = sensorManager0.processUsageData(uUID2, uUID3, "hi!", localDateTime5);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList7 = sensorManager0.getAllSensors();
        com.reservation_system.Equipment.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str6.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList7);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore6 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorManager0.removeObserver(sensorObserver7);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList9 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList10 = sensorManager0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.SensorObserver sensorObserver5 = null;
        sensorManager0.addObserver(sensorObserver5);
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorManager0.removeObserver(sensorObserver7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.Sensor sensor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager4.addSensor(sensor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensorManager5.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList7 = sensorManager5.getAllSensors();
        com.reservation_system.Equipment.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager5.updateEquipment(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeSensor(uUID4);
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorManager0.processUsageData(uUID6, uUID7, "ERROR: Invalid sensorId \u2014 null", localDateTime9);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore11 = sensorManager0.getDataStore();
        com.reservation_system.Equipment.Equipment equipment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.UUID uUID4 = null;
        java.util.UUID uUID5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.lang.String str8 = sensorManager0.processUsageData(uUID4, uUID5, "", localDateTime7);
        com.reservation_system.Sensor.Sensor sensor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateSensor(sensor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str8.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore7 = sensorManager6.getDataStore();
        java.util.UUID uUID8 = null;
        sensorManager6.removeSensor(uUID8);
        java.lang.Class<?> wildcardClass10 = sensorManager6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeSensor(uUID4);
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorManager0.processUsageData(uUID6, uUID7, "ERROR: Invalid sensorId \u2014 null", localDateTime9);
        java.util.UUID uUID11 = null;
        sensorManager0.removeSensor(uUID11);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore13 = sensorManager0.getDataStore();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore13);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.UUID uUID7 = null;
        sensorManager6.removeSensor(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        java.lang.Class<?> wildcardClass6 = sensorManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore2 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager3 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore2);
        java.util.UUID uUID4 = null;
        java.util.UUID uUID5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.lang.String str8 = sensorManager3.processUsageData(uUID4, uUID5, "ERROR: Invalid sensorId \u2014 null", localDateTime7);
        java.util.UUID uUID9 = null;
        sensorManager3.removeSensor(uUID9);
        java.util.UUID uUID11 = null;
        sensorManager3.removeSensor(uUID11);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList13 = sensorManager3.getAllLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str8.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.lang.Class<?> wildcardClass5 = sensorManager4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList5 = sensorManager0.getAllEquipment();
        java.lang.Class<?> wildcardClass6 = sensorManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList5 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorManager0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorManager0.removeSensor(uUID7);
        com.reservation_system.Equipment.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.UUID uUID6 = null;
        sensorManager5.removeSensor(uUID6);
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.lang.String str12 = sensorManager5.processUsageData(uUID8, uUID9, "", localDateTime11);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList13 = sensorManager5.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore14 = sensorManager5.getDataStore();
        com.reservation_system.Sensor.Sensor sensor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager5.addSensor(sensor15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str12.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore14);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore5 = sensorManager0.getDataStore();
        java.lang.Class<?> wildcardClass6 = sensorManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.UUID uUID6 = null;
        sensorManager5.removeSensor(uUID6);
        java.util.UUID uUID8 = null;
        sensorManager5.removeSensor(uUID8);
        com.reservation_system.Equipment.Equipment equipment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager5.addEquipment(equipment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorManager0.removeObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorManager0.removeEquipment(uUID3);
        com.reservation_system.Sensor.SensorObserver sensorObserver5 = null;
        sensorManager0.addObserver(sensorObserver5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore6 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.Sensor sensor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateSensor(sensor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorManager0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorManager0.removeEquipment(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver3 = null;
        sensorManager0.removeObserver(sensorObserver3);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore5 = sensorManager0.getDataStore();
        com.reservation_system.Equipment.Equipment equipment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeSensor(uUID4);
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorManager0.processUsageData(uUID6, uUID7, "ERROR: Invalid sensorId \u2014 null", localDateTime9);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore11 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.Sensor sensor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addSensor(sensor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore11);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore7 = sensorManager6.getDataStore();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore8 = sensorManager6.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList9 = sensorManager6.getAllLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList2 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.Sensor sensor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addSensor(sensor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeSensor(uUID4);
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorManager0.processUsageData(uUID6, uUID7, "ERROR: Invalid sensorId \u2014 null", localDateTime9);
        java.util.UUID uUID11 = null;
        sensorManager0.removeSensor(uUID11);
        com.reservation_system.Sensor.Sensor sensor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateSensor(sensor13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.UUID uUID5 = null;
        sensorManager0.removeEquipment(uUID5);
        java.util.UUID uUID7 = null;
        sensorManager0.removeSensor(uUID7);
        com.reservation_system.Sensor.Sensor sensor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addSensor(sensor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        com.reservation_system.Sensor.SensorManager sensorManager7 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        com.reservation_system.Sensor.Sensor sensor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager7.updateSensor(sensor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.Sensor sensor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addSensor(sensor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        java.lang.Class<?> wildcardClass2 = equipmentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore2 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager3 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore2);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager3.getAllSensors();
        com.reservation_system.Equipment.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager3.addEquipment(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.SensorObserver sensorObserver5 = null;
        sensorManager0.addObserver(sensorObserver5);
        java.util.UUID uUID7 = null;
        sensorManager0.removeEquipment(uUID7);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList9 = sensorManager0.getAllSensors();
        com.reservation_system.Equipment.Equipment equipment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore2 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorObserver sensorObserver3 = null;
        sensorManager0.addObserver(sensorObserver3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore2);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver3 = null;
        sensorManager0.removeObserver(sensorObserver3);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore5 = sensorManager0.getDataStore();
        java.lang.Class<?> wildcardClass6 = sensorManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.UUID uUID6 = null;
        sensorManager5.removeSensor(uUID6);
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.lang.String str12 = sensorManager5.processUsageData(uUID8, uUID9, "", localDateTime11);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList13 = sensorManager5.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList14 = sensorManager5.getAllSensors();
        java.lang.Class<?> wildcardClass15 = sensorManager5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str12.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorManager0.processUsageData(uUID6, uUID7, "ERROR: Invalid sensorId \u2014 null", localDateTime9);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore11 = sensorManager0.getDataStore();
        com.reservation_system.Equipment.Equipment equipment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore11);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList5 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorManager0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorManager0.removeSensor(uUID7);
        com.reservation_system.Equipment.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver3 = null;
        sensorManager0.addObserver(sensorObserver3);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList5 = sensorManager0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = sensorManager0.processUsageData(uUID2, uUID3, "hi!", localDateTime5);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList7 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.Sensor sensor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addSensor(sensor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str6.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        com.reservation_system.Sensor.Sensor sensor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager6.updateSensor(sensor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeSensor(uUID4);
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorManager0.processUsageData(uUID6, uUID7, "ERROR: Invalid sensorId \u2014 null", localDateTime9);
        java.util.UUID uUID11 = null;
        sensorManager0.removeSensor(uUID11);
        com.reservation_system.Sensor.Sensor sensor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addSensor(sensor13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeSensor(uUID4);
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorManager0.processUsageData(uUID6, uUID7, "ERROR: Invalid sensorId \u2014 null", localDateTime9);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore11 = sensorManager0.getDataStore();
        java.util.UUID uUID12 = null;
        java.util.UUID uUID13 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.lang.String str16 = sensorManager0.processUsageData(uUID12, uUID13, "", localDateTime15);
        com.reservation_system.Sensor.SensorObserver sensorObserver17 = null;
        sensorManager0.removeObserver(sensorObserver17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str16.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        com.reservation_system.Equipment.Equipment equipment1 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver3 = null;
        sensorManager0.removeObserver(sensorObserver3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorManager0.getAllSensors();
        com.reservation_system.Equipment.Equipment equipment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorManager0.getAllSensors();
        java.util.UUID uUID6 = null;
        sensorManager0.removeSensor(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager4.getAllLogs();
        java.util.UUID uUID6 = null;
        sensorManager4.removeEquipment(uUID6);
        com.reservation_system.Equipment.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager4.addEquipment(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore2 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager3 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore2);
        java.util.UUID uUID4 = null;
        java.util.UUID uUID5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.lang.String str8 = sensorManager3.processUsageData(uUID4, uUID5, "ERROR: Invalid sensorId \u2014 null", localDateTime7);
        java.util.UUID uUID9 = null;
        sensorManager3.removeSensor(uUID9);
        com.reservation_system.Equipment.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager3.updateEquipment(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str8.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        java.util.UUID uUID2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.lang.String str5 = sensorManager0.processUsageData(uUID1, uUID2, "", localDateTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str5.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore2 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager3 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore2);
        java.util.UUID uUID4 = null;
        java.util.UUID uUID5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.lang.String str8 = sensorManager3.processUsageData(uUID4, uUID5, "ERROR: Invalid sensorId \u2014 null", localDateTime7);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList9 = sensorManager3.getAllLogs();
        com.reservation_system.Sensor.SensorObserver sensorObserver10 = null;
        sensorManager3.removeObserver(sensorObserver10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str8.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager4.getAllLogs();
        java.lang.Class<?> wildcardClass6 = sensorManager4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.removeObserver(sensorObserver2);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList4 = sensorManager0.getAllEquipment();
        java.lang.Class<?> wildcardClass5 = equipmentList4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.UUID uUID4 = null;
        java.util.UUID uUID5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.lang.String str8 = sensorManager0.processUsageData(uUID4, uUID5, "hi!", localDateTime7);
        java.util.UUID uUID9 = null;
        java.util.UUID uUID10 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.lang.String str13 = sensorManager0.processUsageData(uUID9, uUID10, "", localDateTime12);
        com.reservation_system.Sensor.Sensor sensor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateSensor(sensor14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str8.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str13.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        java.util.UUID uUID3 = null;
        sensorManager0.removeSensor(uUID3);
        java.lang.Class<?> wildcardClass5 = sensorManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore5 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        com.reservation_system.Sensor.Sensor sensor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager6.updateSensor(sensor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.UUID uUID4 = null;
        java.util.UUID uUID5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.lang.String str8 = sensorManager0.processUsageData(uUID4, uUID5, "hi!", localDateTime7);
        java.util.UUID uUID9 = null;
        sensorManager0.removeSensor(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str8.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorManager0.removeObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorManager0.removeEquipment(uUID3);
        com.reservation_system.Equipment.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList2 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorObserver sensorObserver5 = null;
        sensorManager4.removeObserver(sensorObserver5);
        com.reservation_system.Sensor.Sensor sensor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager4.updateSensor(sensor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList5 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList7 = sensorManager0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.SensorObserver sensorObserver5 = null;
        sensorManager0.addObserver(sensorObserver5);
        java.util.UUID uUID7 = null;
        sensorManager0.removeEquipment(uUID7);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList9 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver10 = null;
        sensorManager0.addObserver(sensorObserver10);
        com.reservation_system.Sensor.SensorObserver sensorObserver12 = null;
        sensorManager0.addObserver(sensorObserver12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList9);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorManager5.getAllSensors();
        java.lang.Class<?> wildcardClass7 = sensorList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.removeObserver(sensorObserver2);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList4 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList5 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensorManager0.getAllLogs();
        java.util.UUID uUID7 = null;
        sensorManager0.removeEquipment(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = sensorManager0.processUsageData(uUID2, uUID3, "", localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str6.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore2 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager3 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore2);
        java.util.UUID uUID4 = null;
        java.util.UUID uUID5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.lang.String str8 = sensorManager3.processUsageData(uUID4, uUID5, "ERROR: Invalid sensorId \u2014 null", localDateTime7);
        com.reservation_system.Sensor.Sensor sensor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager3.addSensor(sensor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str8.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver3 = null;
        sensorManager0.addObserver(sensorObserver3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorManager0.getAllSensors();
        java.util.UUID uUID6 = null;
        sensorManager0.removeEquipment(uUID6);
        com.reservation_system.Equipment.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.UUID uUID6 = null;
        sensorManager5.removeSensor(uUID6);
        com.reservation_system.Sensor.SensorObserver sensorObserver8 = null;
        sensorManager5.addObserver(sensorObserver8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList2 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver3 = null;
        sensorManager0.addObserver(sensorObserver3);
        java.util.UUID uUID5 = null;
        sensorManager0.removeEquipment(uUID5);
        com.reservation_system.Sensor.Sensor sensor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addSensor(sensor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList2);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList2 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList5 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorManager0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager4.getAllLogs();
        java.util.UUID uUID6 = null;
        sensorManager4.removeEquipment(uUID6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorManager4.getAllEquipment();
        com.reservation_system.Equipment.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager4.addEquipment(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList4 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensorManager5.getAllLogs();
        java.lang.Class<?> wildcardClass7 = usageLogEntryList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.UUID uUID6 = null;
        sensorManager5.removeSensor(uUID6);
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.lang.String str12 = sensorManager5.processUsageData(uUID8, uUID9, "", localDateTime11);
        com.reservation_system.Sensor.Sensor sensor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager5.updateSensor(sensor13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str12.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeSensor(uUID4);
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorManager0.processUsageData(uUID6, uUID7, "ERROR: Invalid sensorId \u2014 null", localDateTime9);
        java.util.UUID uUID11 = null;
        sensorManager0.removeSensor(uUID11);
        java.util.UUID uUID13 = null;
        sensorManager0.removeSensor(uUID13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore6 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorManager0.removeObserver(sensorObserver7);
        com.reservation_system.Equipment.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore6);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore5 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        com.reservation_system.Sensor.SensorManager sensorManager7 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        com.reservation_system.Sensor.SensorManager sensorManager8 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager8.removeObserver(sensorObserver9);
        com.reservation_system.Sensor.SensorObserver sensorObserver11 = null;
        sensorManager8.addObserver(sensorObserver11);
        com.reservation_system.Sensor.Sensor sensor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager8.addSensor(sensor13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager8);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore5 = sensorManager0.getDataStore();
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorManager0.processUsageData(uUID6, uUID7, "", localDateTime9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager4.getAllLogs();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensorManager4.getAllLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList2 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList5 = sensorManager4.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        com.reservation_system.Equipment.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.UUID uUID4 = null;
        java.util.UUID uUID5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.lang.String str8 = sensorManager0.processUsageData(uUID4, uUID5, "hi!", localDateTime7);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList9 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList10 = sensorManager0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str8.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        com.reservation_system.Sensor.SensorObserver sensorObserver4 = null;
        sensorManager0.removeObserver(sensorObserver4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeSensor(uUID4);
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorManager0.processUsageData(uUID6, uUID7, "ERROR: Invalid sensorId \u2014 null", localDateTime9);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore11 = sensorManager0.getDataStore();
        java.util.UUID uUID12 = null;
        java.util.UUID uUID13 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.lang.String str16 = sensorManager0.processUsageData(uUID12, uUID13, "hi!", localDateTime15);
        java.util.UUID uUID17 = null;
        sensorManager0.removeEquipment(uUID17);
        com.reservation_system.Sensor.SensorObserver sensorObserver19 = null;
        sensorManager0.removeObserver(sensorObserver19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str16.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore2 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager3 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore2);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager3.getAllSensors();
        com.reservation_system.Sensor.Sensor sensor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager3.updateSensor(sensor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = sensorManager0.processUsageData(uUID2, uUID3, "hi!", localDateTime5);
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorManager0.removeObserver(sensorObserver7);
        com.reservation_system.Equipment.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str6.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore6 = sensorManager0.getDataStore();
        java.lang.Class<?> wildcardClass7 = cSVDataStore6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.UUID uUID5 = null;
        sensorManager4.removeSensor(uUID5);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList7 = sensorManager4.getAllSensors();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorManager4.getAllEquipment();
        com.reservation_system.Sensor.Sensor sensor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager4.updateSensor(sensor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList2 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.UUID uUID4 = null;
        sensorManager0.removeEquipment(uUID4);
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorManager0.processUsageData(uUID6, uUID7, "ERROR: Invalid sensorId \u2014 null", localDateTime9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.SensorObserver sensorObserver5 = null;
        sensorManager0.addObserver(sensorObserver5);
        java.util.UUID uUID7 = null;
        sensorManager0.removeEquipment(uUID7);
        com.reservation_system.Sensor.Sensor sensor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addSensor(sensor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.UUID uUID5 = null;
        sensorManager4.removeSensor(uUID5);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList7 = sensorManager4.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList8 = sensorManager4.getAllSensors();
        java.util.UUID uUID9 = null;
        java.util.UUID uUID10 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.lang.String str13 = sensorManager4.processUsageData(uUID9, uUID10, "", localDateTime12);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensorManager4.getAllLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str13.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorManager6.getAllLogs();
        java.util.UUID uUID8 = null;
        sensorManager6.removeSensor(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore5 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorManager6.addObserver(sensorObserver7);
        java.util.UUID uUID9 = null;
        sensorManager6.removeEquipment(uUID9);
        com.reservation_system.Sensor.SensorObserver sensorObserver11 = null;
        sensorManager6.addObserver(sensorObserver11);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList13 = sensorManager6.getAllLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList13);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.removeObserver(sensorObserver2);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList4 = sensorManager0.getAllEquipment();
        java.util.UUID uUID5 = null;
        sensorManager0.removeEquipment(uUID5);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorManager0.getAllLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore6 = sensorManager0.getDataStore();
        java.util.UUID uUID7 = null;
        java.util.UUID uUID8 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.lang.String str11 = sensorManager0.processUsageData(uUID7, uUID8, "ERROR: Invalid sensorId \u2014 null", localDateTime10);
        com.reservation_system.Sensor.Sensor sensor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addSensor(sensor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str11.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore5 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.Sensor sensor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addSensor(sensor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensorManager5.getAllLogs();
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorManager5.addObserver(sensorObserver7);
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager5.addObserver(sensorObserver9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore7 = sensorManager6.getDataStore();
        com.reservation_system.Equipment.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager6.updateEquipment(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore7);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager4.getAllLogs();
        java.util.UUID uUID6 = null;
        sensorManager4.removeEquipment(uUID6);
        com.reservation_system.Equipment.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager4.updateEquipment(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeSensor(uUID4);
        java.util.UUID uUID6 = null;
        sensorManager0.removeSensor(uUID6);
        com.reservation_system.Sensor.SensorObserver sensorObserver8 = null;
        sensorManager0.addObserver(sensorObserver8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensorManager5.getAllLogs();
        java.util.UUID uUID7 = null;
        sensorManager5.removeEquipment(uUID7);
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager5.removeObserver(sensorObserver9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        com.reservation_system.Sensor.SensorObserver sensorObserver6 = null;
        sensorManager5.addObserver(sensorObserver6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorManager5.getAllEquipment();
        com.reservation_system.Sensor.Sensor sensor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager5.addSensor(sensor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList2 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver3 = null;
        sensorManager0.addObserver(sensorObserver3);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        com.reservation_system.Equipment.Equipment equipment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore5 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        com.reservation_system.Sensor.SensorManager sensorManager7 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        com.reservation_system.Sensor.SensorObserver sensorObserver8 = null;
        sensorManager7.addObserver(sensorObserver8);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList10 = sensorManager7.getAllLogs();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensorManager7.getAllLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        com.reservation_system.Sensor.SensorObserver sensorObserver6 = null;
        sensorManager5.addObserver(sensorObserver6);
        java.util.UUID uUID8 = null;
        sensorManager5.removeEquipment(uUID8);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList10 = sensorManager5.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeSensor(uUID4);
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorManager0.processUsageData(uUID6, uUID7, "ERROR: Invalid sensorId \u2014 null", localDateTime9);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore11 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList12 = sensorManager0.getAllLogs();
        java.util.UUID uUID13 = null;
        sensorManager0.removeEquipment(uUID13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList12);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver3 = null;
        sensorManager0.removeObserver(sensorObserver3);
        com.reservation_system.Equipment.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = sensorManager0.processUsageData(uUID2, uUID3, "hi!", localDateTime5);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList7 = sensorManager0.getAllSensors();
        java.util.UUID uUID8 = null;
        sensorManager0.removeEquipment(uUID8);
        com.reservation_system.Sensor.SensorObserver sensorObserver10 = null;
        sensorManager0.addObserver(sensorObserver10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str6.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList7);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        java.util.UUID uUID6 = null;
        sensorManager5.removeSensor(uUID6);
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.lang.String str12 = sensorManager5.processUsageData(uUID8, uUID9, "", localDateTime11);
        com.reservation_system.Sensor.SensorObserver sensorObserver13 = null;
        sensorManager5.removeObserver(sensorObserver13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str12.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager4.getAllLogs();
        java.util.UUID uUID6 = null;
        sensorManager4.removeEquipment(uUID6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorManager4.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore9 = sensorManager4.getDataStore();
        com.reservation_system.Equipment.Equipment equipment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager4.addEquipment(equipment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore9);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.removeObserver(sensorObserver2);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList4 = sensorManager0.getAllEquipment();
        java.util.UUID uUID5 = null;
        sensorManager0.removeEquipment(uUID5);
        com.reservation_system.Equipment.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList4);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver5 = null;
        sensorManager0.removeObserver(sensorObserver5);
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorManager0.removeObserver(sensorObserver7);
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager0.removeObserver(sensorObserver9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorManager0.processUsageData(uUID6, uUID7, "ERROR: Invalid sensorId \u2014 null", localDateTime9);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore11 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList12 = sensorManager0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList12);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList2 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver3 = null;
        sensorManager0.addObserver(sensorObserver3);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        java.util.UUID uUID6 = null;
        sensorManager0.removeEquipment(uUID6);
        com.reservation_system.Sensor.SensorObserver sensorObserver8 = null;
        sensorManager0.removeObserver(sensorObserver8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore5 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorManager0.getAllLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.Sensor sensor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateSensor(sensor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensorManager5.getAllLogs();
        java.util.UUID uUID7 = null;
        java.util.UUID uUID8 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.lang.String str11 = sensorManager5.processUsageData(uUID7, uUID8, "hi!", localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str11.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.UUID uUID5 = null;
        sensorManager4.removeSensor(uUID5);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList7 = sensorManager4.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList8 = sensorManager4.getAllSensors();
        java.util.UUID uUID9 = null;
        java.util.UUID uUID10 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.lang.String str13 = sensorManager4.processUsageData(uUID9, uUID10, "", localDateTime12);
        com.reservation_system.Sensor.SensorObserver sensorObserver14 = null;
        sensorManager4.removeObserver(sensorObserver14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str13.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorManager6.getAllLogs();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensorManager6.getAllLogs();
        com.reservation_system.Sensor.Sensor sensor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager6.updateSensor(sensor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore5 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        com.reservation_system.Sensor.SensorManager sensorManager7 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        com.reservation_system.Sensor.SensorManager sensorManager8 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager8.removeObserver(sensorObserver9);
        com.reservation_system.Sensor.SensorObserver sensorObserver11 = null;
        sensorManager8.addObserver(sensorObserver11);
        com.reservation_system.Equipment.Equipment equipment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager8.updateEquipment(equipment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.SensorObserver sensorObserver5 = null;
        sensorManager0.addObserver(sensorObserver5);
        java.util.UUID uUID7 = null;
        sensorManager0.removeEquipment(uUID7);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList9 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList10 = sensorManager0.getAllLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.UUID uUID6 = null;
        sensorManager5.removeSensor(uUID6);
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.lang.String str12 = sensorManager5.processUsageData(uUID8, uUID9, "", localDateTime11);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList13 = sensorManager5.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList14 = sensorManager5.getAllSensors();
        java.util.UUID uUID15 = null;
        sensorManager5.removeSensor(uUID15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str12.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList14);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Equipment.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager4.updateEquipment(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        java.util.UUID uUID6 = null;
        sensorManager0.removeEquipment(uUID6);
        java.util.UUID uUID8 = null;
        sensorManager0.removeEquipment(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.UUID uUID5 = null;
        sensorManager0.removeEquipment(uUID5);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList7 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList8 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.Sensor sensor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateSensor(sensor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList8);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore5 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        com.reservation_system.Sensor.SensorManager sensorManager7 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        com.reservation_system.Sensor.SensorManager sensorManager8 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        com.reservation_system.Sensor.SensorManager sensorManager9 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager9);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager4.getAllLogs();
        java.util.UUID uUID6 = null;
        sensorManager4.removeEquipment(uUID6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorManager4.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore9 = sensorManager4.getDataStore();
        com.reservation_system.Equipment.Equipment equipment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager4.updateEquipment(equipment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore9);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore5 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        com.reservation_system.Sensor.SensorManager sensorManager7 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorManager7.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.UUID uUID6 = null;
        sensorManager5.removeSensor(uUID6);
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.lang.String str12 = sensorManager5.processUsageData(uUID8, uUID9, "", localDateTime11);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList13 = sensorManager5.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore14 = sensorManager5.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager15 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore14);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList16 = sensorManager15.getAllLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str12.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList16);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.UUID uUID5 = null;
        sensorManager0.removeEquipment(uUID5);
        java.util.UUID uUID7 = null;
        sensorManager0.removeSensor(uUID7);
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager0.removeObserver(sensorObserver9);
        java.util.UUID uUID11 = null;
        sensorManager0.removeSensor(uUID11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorManager5.processUsageData(uUID6, uUID7, "", localDateTime9);
        com.reservation_system.Sensor.SensorObserver sensorObserver11 = null;
        sensorManager5.addObserver(sensorObserver11);
        com.reservation_system.Sensor.SensorObserver sensorObserver13 = null;
        sensorManager5.removeObserver(sensorObserver13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.UUID uUID5 = null;
        sensorManager0.removeEquipment(uUID5);
        java.util.UUID uUID7 = null;
        sensorManager0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        sensorManager0.removeEquipment(uUID9);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.Sensor sensor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateSensor(sensor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore2 = sensorManager0.getDataStore();
        java.util.UUID uUID3 = null;
        sensorManager0.removeSensor(uUID3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore2);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeSensor(uUID4);
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorManager0.processUsageData(uUID6, uUID7, "ERROR: Invalid sensorId \u2014 null", localDateTime9);
        java.util.UUID uUID11 = null;
        sensorManager0.removeSensor(uUID11);
        com.reservation_system.Equipment.Equipment equipment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore7 = sensorManager6.getDataStore();
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.lang.String str12 = sensorManager6.processUsageData(uUID8, uUID9, "hi!", localDateTime11);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList13 = sensorManager6.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensorManager6.getAllLogs();
        java.lang.Class<?> wildcardClass15 = usageLogEntryList14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str12.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeSensor(uUID4);
        java.util.UUID uUID6 = null;
        sensorManager0.removeSensor(uUID6);
        java.util.UUID uUID8 = null;
        sensorManager0.removeSensor(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeEquipment(uUID4);
        com.reservation_system.Sensor.Sensor sensor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addSensor(sensor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensorManager5.getAllLogs();
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorManager5.addObserver(sensorObserver7);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList9 = sensorManager5.getAllLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList9);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager7 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager8 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager8);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore2 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList3 = sensorManager0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList3);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.removeObserver(sensorObserver2);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList4 = sensorManager0.getAllEquipment();
        com.reservation_system.Equipment.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore7 = sensorManager6.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager8 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorManager8.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeSensor(uUID4);
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorManager0.processUsageData(uUID6, uUID7, "ERROR: Invalid sensorId \u2014 null", localDateTime9);
        java.util.UUID uUID11 = null;
        sensorManager0.removeSensor(uUID11);
        java.util.UUID uUID13 = null;
        sensorManager0.removeEquipment(uUID13);
        java.lang.Class<?> wildcardClass15 = sensorManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        java.util.UUID uUID6 = null;
        sensorManager0.removeEquipment(uUID6);
        com.reservation_system.Sensor.SensorObserver sensorObserver8 = null;
        sensorManager0.addObserver(sensorObserver8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver6 = null;
        sensorManager0.removeObserver(sensorObserver6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList6 = sensorManager0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore2 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorObserver sensorObserver3 = null;
        sensorManager0.removeObserver(sensorObserver3);
        com.reservation_system.Sensor.Sensor sensor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addSensor(sensor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore2);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.UUID uUID4 = null;
        java.util.UUID uUID5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.lang.String str8 = sensorManager0.processUsageData(uUID4, uUID5, "", localDateTime7);
        com.reservation_system.Equipment.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str8.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = sensorManager0.processUsageData(uUID2, uUID3, "hi!", localDateTime5);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList7 = sensorManager0.getAllEquipment();
        java.lang.Class<?> wildcardClass8 = equipmentList7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str6.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = sensorManager0.processUsageData(uUID2, uUID3, "hi!", localDateTime5);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList7 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensorManager0.getAllLogs();
        java.util.UUID uUID9 = null;
        sensorManager0.removeSensor(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str6.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeSensor(uUID4);
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorManager0.processUsageData(uUID6, uUID7, "ERROR: Invalid sensorId \u2014 null", localDateTime9);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore11 = sensorManager0.getDataStore();
        java.util.UUID uUID12 = null;
        java.util.UUID uUID13 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.lang.String str16 = sensorManager0.processUsageData(uUID12, uUID13, "hi!", localDateTime15);
        java.util.UUID uUID17 = null;
        sensorManager0.removeEquipment(uUID17);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore19 = sensorManager0.getDataStore();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str16.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore19);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorManager5.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorManager5.removeSensor(uUID7);
        java.lang.Class<?> wildcardClass9 = sensorManager5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.UUID uUID5 = null;
        sensorManager4.removeSensor(uUID5);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList7 = sensorManager4.getAllSensors();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorManager4.getAllEquipment();
        java.util.UUID uUID9 = null;
        sensorManager4.removeSensor(uUID9);
        java.util.UUID uUID11 = null;
        sensorManager4.removeSensor(uUID11);
        com.reservation_system.Sensor.Sensor sensor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager4.addSensor(sensor13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore2 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager3 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore2);
        java.util.UUID uUID4 = null;
        java.util.UUID uUID5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.lang.String str8 = sensorManager3.processUsageData(uUID4, uUID5, "ERROR: Invalid sensorId \u2014 null", localDateTime7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorManager3.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str8.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore6 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager7 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore6);
        java.util.UUID uUID8 = null;
        sensorManager7.removeEquipment(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensorManager5.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList7 = sensorManager5.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore8 = sensorManager5.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager9 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore8);
        java.util.UUID uUID10 = null;
        java.util.UUID uUID11 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.lang.String str14 = sensorManager9.processUsageData(uUID10, uUID11, "ERROR: Invalid sensorId \u2014 null", localDateTime13);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList15 = sensorManager9.getAllSensors();
        java.util.UUID uUID16 = null;
        sensorManager9.removeSensor(uUID16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str14.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList15);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.UUID uUID4 = null;
        java.util.UUID uUID5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.lang.String str8 = sensorManager0.processUsageData(uUID4, uUID5, "", localDateTime7);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList9 = sensorManager0.getAllLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str8.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList9);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.UUID uUID5 = null;
        sensorManager0.removeEquipment(uUID5);
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorManager0.addObserver(sensorObserver7);
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager0.removeObserver(sensorObserver9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.removeObserver(sensorObserver2);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList4 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList7 = sensorManager0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList7);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.UUID uUID6 = null;
        sensorManager5.removeSensor(uUID6);
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.lang.String str12 = sensorManager5.processUsageData(uUID8, uUID9, "", localDateTime11);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList13 = sensorManager5.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore14 = sensorManager5.getDataStore();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList15 = sensorManager5.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList16 = sensorManager5.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str12.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList16);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList5 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.Sensor sensor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateSensor(sensor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = sensorManager0.processUsageData(uUID2, uUID3, "hi!", localDateTime5);
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorManager0.addObserver(sensorObserver7);
        java.lang.Class<?> wildcardClass9 = sensorManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str6.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList6 = sensorManager0.getAllEquipment();
        java.util.UUID uUID7 = null;
        sensorManager0.removeEquipment(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList6);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeSensor(uUID4);
        java.util.UUID uUID6 = null;
        sensorManager0.removeEquipment(uUID6);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager0.removeObserver(sensorObserver9);
        com.reservation_system.Sensor.SensorObserver sensorObserver11 = null;
        sensorManager0.removeObserver(sensorObserver11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensorManager0.getAllLogs();
        java.util.UUID uUID7 = null;
        sensorManager0.removeSensor(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.UUID uUID5 = null;
        sensorManager0.removeEquipment(uUID5);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList7 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList8 = sensorManager0.getAllSensors();
        java.lang.Class<?> wildcardClass9 = sensorList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.UUID uUID4 = null;
        java.util.UUID uUID5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.lang.String str8 = sensorManager0.processUsageData(uUID4, uUID5, "hi!", localDateTime7);
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager0.removeObserver(sensorObserver9);
        com.reservation_system.Sensor.SensorObserver sensorObserver11 = null;
        sensorManager0.removeObserver(sensorObserver11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str8.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeSensor(uUID4);
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorManager0.processUsageData(uUID6, uUID7, "ERROR: Invalid sensorId \u2014 null", localDateTime9);
        java.util.UUID uUID11 = null;
        java.util.UUID uUID12 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.lang.String str15 = sensorManager0.processUsageData(uUID11, uUID12, "ERROR: Invalid sensorId \u2014 null", localDateTime14);
        java.util.UUID uUID16 = null;
        sensorManager0.removeSensor(uUID16);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList18 = sensorManager0.getAllEquipment();
        com.reservation_system.Equipment.Equipment equipment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str15.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList18);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeEquipment(uUID4);
        com.reservation_system.Equipment.Equipment equipment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.UUID uUID3 = null;
        sensorManager0.removeSensor(uUID3);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore5 = sensorManager0.getDataStore();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore5);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.SensorObserver sensorObserver5 = null;
        sensorManager0.addObserver(sensorObserver5);
        java.util.UUID uUID7 = null;
        sensorManager0.removeEquipment(uUID7);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList9 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver10 = null;
        sensorManager0.addObserver(sensorObserver10);
        com.reservation_system.Equipment.Equipment equipment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateEquipment(equipment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList9);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore7 = sensorManager6.getDataStore();
        com.reservation_system.Sensor.SensorObserver sensorObserver8 = null;
        sensorManager6.removeObserver(sensorObserver8);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList10 = sensorManager6.getAllLogs();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensorManager6.getAllLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorManager6.getAllLogs();
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.lang.String str12 = sensorManager6.processUsageData(uUID8, uUID9, "hi!", localDateTime11);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList13 = sensorManager6.getAllSensors();
        java.lang.Class<?> wildcardClass14 = sensorManager6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str12.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList2 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver3 = null;
        sensorManager0.addObserver(sensorObserver3);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        java.util.UUID uUID6 = null;
        sensorManager0.removeEquipment(uUID6);
        com.reservation_system.Sensor.SensorObserver sensorObserver8 = null;
        sensorManager0.addObserver(sensorObserver8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore6 = sensorManager5.getDataStore();
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorManager5.addObserver(sensorObserver7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore6);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorManager6.getAllLogs();
        com.reservation_system.Sensor.SensorObserver sensorObserver8 = null;
        sensorManager6.addObserver(sensorObserver8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.removeObserver(sensorObserver2);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList4 = sensorManager0.getAllEquipment();
        java.util.UUID uUID5 = null;
        sensorManager0.removeEquipment(uUID5);
        com.reservation_system.Sensor.Sensor sensor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateSensor(sensor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList4);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorManager6.getAllLogs();
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.lang.String str12 = sensorManager6.processUsageData(uUID8, uUID9, "hi!", localDateTime11);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList13 = sensorManager6.getAllSensors();
        com.reservation_system.Equipment.Equipment equipment14 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager6.updateEquipment(equipment14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str12.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList13);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList5 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorManager0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorManager0.removeSensor(uUID7);
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager0.addObserver(sensorObserver9);
        java.util.UUID uUID11 = null;
        sensorManager0.removeEquipment(uUID11);
        com.reservation_system.Equipment.Equipment equipment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore2 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager3 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore2);
        java.util.UUID uUID4 = null;
        java.util.UUID uUID5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.lang.String str8 = sensorManager3.processUsageData(uUID4, uUID5, "ERROR: Invalid sensorId \u2014 null", localDateTime7);
        java.util.UUID uUID9 = null;
        sensorManager3.removeSensor(uUID9);
        java.util.UUID uUID11 = null;
        sensorManager3.removeSensor(uUID11);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore13 = sensorManager3.getDataStore();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList14 = sensorManager3.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver15 = null;
        sensorManager3.removeObserver(sensorObserver15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str8.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList14);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensorManager5.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList7 = sensorManager5.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore8 = sensorManager5.getDataStore();
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager5.removeObserver(sensorObserver9);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList11 = sensorManager5.getAllSensors();
        java.util.UUID uUID12 = null;
        sensorManager5.removeEquipment(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList11);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorManager6.getAllLogs();
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.lang.String str12 = sensorManager6.processUsageData(uUID8, uUID9, "hi!", localDateTime11);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList13 = sensorManager6.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str12.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList13);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.lang.Class<?> wildcardClass7 = cSVDataStore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorManager5.processUsageData(uUID6, uUID7, "", localDateTime9);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList11 = sensorManager5.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList11);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore7 = sensorManager6.getDataStore();
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.lang.String str12 = sensorManager6.processUsageData(uUID8, uUID9, "hi!", localDateTime11);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList13 = sensorManager6.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str12.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList13);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.lang.Class<?> wildcardClass6 = cSVDataStore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.UUID uUID5 = null;
        sensorManager0.removeSensor(uUID5);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore7 = sensorManager0.getDataStore();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore7);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeSensor(uUID4);
        java.util.UUID uUID6 = null;
        sensorManager0.removeEquipment(uUID6);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager0.removeObserver(sensorObserver9);
        java.util.UUID uUID11 = null;
        sensorManager0.removeEquipment(uUID11);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList13 = sensorManager0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList13);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager4.getAllLogs();
        java.lang.Class<?> wildcardClass6 = usageLogEntryList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeSensor(uUID4);
        java.util.UUID uUID6 = null;
        sensorManager0.removeEquipment(uUID6);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager0.removeObserver(sensorObserver9);
        com.reservation_system.Equipment.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore7 = sensorManager6.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager8 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore7);
        com.reservation_system.Sensor.SensorManager sensorManager9 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore7);
        com.reservation_system.Sensor.SensorManager sensorManager10 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList2 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Equipment.Equipment equipment4 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.addEquipment(equipment4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList4 = sensorManager0.getAllLogs();
        java.util.UUID uUID5 = null;
        sensorManager0.removeEquipment(uUID5);
        java.util.UUID uUID7 = null;
        sensorManager0.removeSensor(uUID7);
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager0.removeObserver(sensorObserver9);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList11 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore12 = sensorManager0.getDataStore();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore12);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore4 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore4);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensorManager5.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList7 = sensorManager5.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore8 = sensorManager5.getDataStore();
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager5.removeObserver(sensorObserver9);
        java.util.UUID uUID11 = null;
        sensorManager5.removeSensor(uUID11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore8);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver5 = null;
        sensorManager0.removeObserver(sensorObserver5);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.Sensor sensor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateSensor(sensor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver2 = null;
        sensorManager0.addObserver(sensorObserver2);
        java.util.UUID uUID4 = null;
        sensorManager0.removeSensor(uUID4);
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorManager0.processUsageData(uUID6, uUID7, "ERROR: Invalid sensorId \u2014 null", localDateTime9);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore11 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager12 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore11);
        java.util.UUID uUID13 = null;
        sensorManager12.removeEquipment(uUID13);
        com.reservation_system.Sensor.SensorObserver sensorObserver15 = null;
        sensorManager12.addObserver(sensorObserver15);
        com.reservation_system.Sensor.SensorObserver sensorObserver17 = null;
        sensorManager12.removeObserver(sensorObserver17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager12);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager4 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        com.reservation_system.Sensor.SensorManager sensorManager5 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore3);
        java.util.UUID uUID6 = null;
        sensorManager5.removeSensor(uUID6);
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.lang.String str12 = sensorManager5.processUsageData(uUID8, uUID9, "", localDateTime11);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList13 = sensorManager5.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore14 = sensorManager5.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager15 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore14);
        com.reservation_system.Equipment.Equipment equipment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager15.updateEquipment(equipment16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Equipment.Equipment.getEquipmentId()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str12.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager15);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore5 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        com.reservation_system.Sensor.SensorManager sensorManager7 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        com.reservation_system.Sensor.SensorManager sensorManager8 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager8.removeObserver(sensorObserver9);
        com.reservation_system.Sensor.SensorObserver sensorObserver11 = null;
        sensorManager8.addObserver(sensorObserver11);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList13 = sensorManager8.getAllEquipment();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore14 = sensorManager8.getDataStore();
        java.util.UUID uUID15 = null;
        sensorManager8.removeEquipment(uUID15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore14);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore5 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        com.reservation_system.Sensor.SensorManager sensorManager7 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        com.reservation_system.Sensor.SensorManager sensorManager8 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager8.removeObserver(sensorObserver9);
        com.reservation_system.Sensor.SensorObserver sensorObserver11 = null;
        sensorManager8.addObserver(sensorObserver11);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList13 = sensorManager8.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList14 = sensorManager8.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList14);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorManager0.removeObserver(sensorObserver1);
        com.reservation_system.Sensor.SensorObserver sensorObserver3 = null;
        sensorManager0.removeObserver(sensorObserver3);
        com.reservation_system.Sensor.SensorObserver sensorObserver5 = null;
        sensorManager0.addObserver(sensorObserver5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList1 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver3 = null;
        sensorManager0.removeObserver(sensorObserver3);
        com.reservation_system.Sensor.CSVDataStore cSVDataStore5 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.SensorManager sensorManager6 = com.reservation_system.Sensor.SensorManager.createForTests(cSVDataStore5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager6);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver3 = null;
        sensorManager0.removeObserver(sensorObserver3);
        com.reservation_system.Sensor.SensorObserver sensorObserver5 = null;
        sensorManager0.removeObserver(sensorObserver5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.UUID uUID1 = null;
        sensorManager0.removeSensor(uUID1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorManager0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorManager0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore6 = sensorManager0.getDataStore();
        com.reservation_system.Sensor.Sensor sensor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorManager0.updateSensor(sensor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.Sensor.getSensorId()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore6);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.UUID uUID4 = null;
        java.util.UUID uUID5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.lang.String str8 = sensorManager0.processUsageData(uUID4, uUID5, "hi!", localDateTime7);
        com.reservation_system.Sensor.SensorObserver sensorObserver9 = null;
        sensorManager0.removeObserver(sensorObserver9);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensorManager0.getAllLogs();
        com.reservation_system.Sensor.SensorObserver sensorObserver12 = null;
        sensorManager0.addObserver(sensorObserver12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str8.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.reservation_system.Sensor.SensorManager sensorManager0 = com.reservation_system.Sensor.SensorManager.getInstance();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList1 = sensorManager0.getAllLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList2 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.CSVDataStore cSVDataStore3 = sensorManager0.getDataStore();
        java.util.UUID uUID4 = null;
        java.util.UUID uUID5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.lang.String str8 = sensorManager0.processUsageData(uUID4, uUID5, "hi!", localDateTime7);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList9 = sensorManager0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver10 = null;
        sensorManager0.addObserver(sensorObserver10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDataStore3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str8.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList9);
    }
}

