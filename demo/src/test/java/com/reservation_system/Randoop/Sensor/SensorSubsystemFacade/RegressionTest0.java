package com.reservation_system.Randoop.Sensor.SensorSubsystemFacade;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID6 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.lang.Class<?> wildcardClass6 = sensorList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.lang.Class<?> wildcardClass9 = equipmentList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "ERROR: Invalid sensorId \u2014 null", labLocation12);
        java.util.UUID uUID14 = null;
        java.util.UUID uUID15 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.lang.String str18 = sensorSubsystemFacade0.sendUsageData(uUID14, uUID15, "ERROR: Invalid sensorId \u2014 null", localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str18.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "ERROR: Invalid sensorId \u2014 null", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeSensor(uUID14);
        java.util.UUID uUID16 = null;
        java.util.UUID uUID17 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.lang.String str20 = sensorSubsystemFacade0.sendUsageData(uUID16, uUID17, "ERROR: Invalid sensorId \u2014 null", localDateTime19);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList21 = sensorSubsystemFacade0.getAllUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str20.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList21);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID8);
        java.util.UUID uUID10 = null;
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.addSensor(uUID10, sensorType11, uUID12);
        java.lang.Class<?> wildcardClass14 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "ERROR: Invalid sensorId \u2014 null", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeSensor(uUID14);
        java.lang.Class<?> wildcardClass16 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList3 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorSubsystemFacade0.getAllSensors();
        java.lang.Class<?> wildcardClass5 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID8);
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.flagSensorError(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.flagSensorError(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.removeSensor(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID11);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.flagSensorError(uUID1);
        java.lang.Class<?> wildcardClass3 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.flagSensorError(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.activateSensor(uUID13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.flagSensorError(uUID5);
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.flagSensorError(uUID1);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList3 = sensorSubsystemFacade0.getAllUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.removeSensor(uUID8);
        java.lang.Class<?> wildcardClass10 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        sensorSubsystemFacade0.addEquipment(uUID7, equipmentType8, "hi!", labLocation10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.activateSensor(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "ERROR: Invalid sensorId \u2014 null", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeSensor(uUID14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID16);
        java.util.UUID uUID18 = null;
        sensorSubsystemFacade0.flagSensorError(uUID18);
        java.util.UUID uUID20 = null;
        java.util.UUID uUID21 = null;
        java.time.LocalDateTime localDateTime23 = null;
        java.lang.String str24 = sensorSubsystemFacade0.sendUsageData(uUID20, uUID21, "ERROR: Invalid sensorId \u2014 null", localDateTime23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str24.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.activateSensor(uUID7);
        java.util.UUID uUID9 = null;
        java.util.UUID uUID10 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.lang.String str13 = sensorSubsystemFacade0.sendUsageData(uUID9, uUID10, "hi!", localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str13.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "ERROR: Invalid sensorId \u2014 null", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.flagSensorError(uUID14);
        java.lang.Class<?> wildcardClass16 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "ERROR: Invalid sensorId \u2014 null", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeSensor(uUID14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID16);
        java.util.UUID uUID18 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID18);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList20 = sensorSubsystemFacade0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList20);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.flagSensorError(uUID10);
        java.lang.Class<?> wildcardClass12 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.flagSensorError(uUID10);
        java.util.UUID uUID12 = null;
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.addSensor(uUID12, sensorType13, uUID14);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList16 = sensorSubsystemFacade0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList16);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        com.reservation_system.Sensor.SensorObserver sensorObserver3 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID8);
        java.util.UUID uUID10 = null;
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.addSensor(uUID10, sensorType11, uUID12);
        java.util.UUID uUID14 = null;
        java.util.UUID uUID15 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.lang.String str18 = sensorSubsystemFacade0.sendUsageData(uUID14, uUID15, "ERROR: Invalid sensorId \u2014 null", localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str18.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.activateSensor(uUID8);
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID10);
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.addSensor(uUID5, sensorType6, uUID7);
        java.util.UUID uUID9 = null;
        java.util.UUID uUID10 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.lang.String str13 = sensorSubsystemFacade0.sendUsageData(uUID9, uUID10, "ERROR: Invalid sensorId \u2014 null", localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str13.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorSubsystemFacade0.sendUsageData(uUID6, uUID7, "hi!", localDateTime9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "ERROR: Invalid sensorId \u2014 null", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeSensor(uUID14);
        java.util.UUID uUID16 = null;
        java.util.UUID uUID17 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.lang.String str20 = sensorSubsystemFacade0.sendUsageData(uUID16, uUID17, "ERROR: Invalid sensorId \u2014 null", localDateTime19);
        java.util.UUID uUID21 = null;
        com.reservation_system.Sensor.SensorType sensorType22 = null;
        java.util.UUID uUID23 = null;
        sensorSubsystemFacade0.addSensor(uUID21, sensorType22, uUID23);
        java.lang.Class<?> wildcardClass25 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str20.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.activateSensor(uUID14);
        com.reservation_system.Sensor.SensorObserver sensorObserver16 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver16);
        java.util.UUID uUID18 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType19 = null;
        com.reservation_system.Equipment.LabLocation labLocation21 = null;
        sensorSubsystemFacade0.addEquipment(uUID18, equipmentType19, "", labLocation21);
        java.util.UUID uUID23 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.activateSensor(uUID7);
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "hi!", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID16);
        com.reservation_system.Sensor.SensorObserver sensorObserver18 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver18);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.flagSensorError(uUID9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.addSensor(uUID6, sensorType7, uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID10);
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.activateSensor(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.activateSensor(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID11);
        java.util.UUID uUID13 = null;
        java.util.UUID uUID14 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.lang.String str17 = sensorSubsystemFacade0.sendUsageData(uUID13, uUID14, "hi!", localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str17.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.activateSensor(uUID8);
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID10);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList12 = sensorSubsystemFacade0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList12);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID8);
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID10);
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID12);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList3 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID4 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID4);
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.addSensor(uUID6, sensorType7, uUID8);
        java.util.UUID uUID10 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType11 = null;
        com.reservation_system.Equipment.LabLocation labLocation13 = null;
        sensorSubsystemFacade0.addEquipment(uUID10, equipmentType11, "", labLocation13);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList15 = sensorSubsystemFacade0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver16 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver16);
        java.util.UUID uUID18 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList15);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.activateSensor(uUID14);
        java.lang.Class<?> wildcardClass16 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeSensor(uUID3);
        java.util.UUID uUID5 = null;
        java.util.UUID uUID6 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.lang.String str9 = sensorSubsystemFacade0.sendUsageData(uUID5, uUID6, "", localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str9.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.flagSensorError(uUID10);
        java.util.UUID uUID12 = null;
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.addSensor(uUID12, sensorType13, uUID14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.removeSensor(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.flagSensorError(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID9);
        java.util.UUID uUID11 = null;
        java.util.UUID uUID12 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.lang.String str15 = sensorSubsystemFacade0.sendUsageData(uUID11, uUID12, "ERROR: Invalid sensorId \u2014 null", localDateTime14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.activateSensor(uUID16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str15.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID8);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList10 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.addSensor(uUID11, sensorType12, uUID13);
        java.lang.Class<?> wildcardClass15 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.activateSensor(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID11);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList13 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID14);
        java.util.UUID uUID16 = null;
        com.reservation_system.Sensor.SensorType sensorType17 = null;
        java.util.UUID uUID18 = null;
        sensorSubsystemFacade0.addSensor(uUID16, sensorType17, uUID18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorSubsystemFacade0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver4 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver4);
        java.util.UUID uUID6 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.activateSensor(uUID8);
        com.reservation_system.Sensor.SensorObserver sensorObserver10 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver10);
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeSensor(uUID14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "ERROR: Invalid sensorId \u2014 null", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeSensor(uUID14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID16);
        java.util.UUID uUID18 = null;
        sensorSubsystemFacade0.flagSensorError(uUID18);
        java.util.UUID uUID20 = null;
        sensorSubsystemFacade0.flagSensorError(uUID20);
        java.util.UUID uUID22 = null;
        com.reservation_system.Sensor.SensorType sensorType23 = null;
        java.util.UUID uUID24 = null;
        sensorSubsystemFacade0.addSensor(uUID22, sensorType23, uUID24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.activateSensor(uUID7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID10);
        java.lang.Class<?> wildcardClass12 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList3 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID5 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType6 = null;
        com.reservation_system.Equipment.LabLocation labLocation8 = null;
        sensorSubsystemFacade0.addEquipment(uUID5, equipmentType6, "", labLocation8);
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.removeSensor(uUID8);
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.flagSensorError(uUID10);
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.activateSensor(uUID14);
        com.reservation_system.Sensor.SensorObserver sensorObserver16 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver16);
        java.util.UUID uUID18 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType19 = null;
        com.reservation_system.Equipment.LabLocation labLocation21 = null;
        sensorSubsystemFacade0.addEquipment(uUID18, equipmentType19, "", labLocation21);
        java.util.UUID uUID23 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.activateSensor(uUID8);
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID10);
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.activateSensor(uUID12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeEquipment(uUID14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.flagSensorError(uUID1);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList3 = sensorSubsystemFacade0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.activateSensor(uUID7);
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "hi!", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID14);
        java.util.UUID uUID16 = null;
        com.reservation_system.Sensor.SensorType sensorType17 = null;
        java.util.UUID uUID18 = null;
        sensorSubsystemFacade0.addSensor(uUID16, sensorType17, uUID18);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.addSensor(uUID5, sensorType6, uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "ERROR: Invalid sensorId \u2014 null", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeSensor(uUID14);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList16 = sensorSubsystemFacade0.getAllEquipment();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList17 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID18 = null;
        com.reservation_system.Sensor.SensorType sensorType19 = null;
        java.util.UUID uUID20 = null;
        sensorSubsystemFacade0.addSensor(uUID18, sensorType19, uUID20);
        java.lang.Class<?> wildcardClass22 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID6 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType7 = null;
        com.reservation_system.Equipment.LabLocation labLocation9 = null;
        sensorSubsystemFacade0.addEquipment(uUID6, equipmentType7, "hi!", labLocation9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.removeEquipment(uUID11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.removeSensor(uUID8);
        java.util.UUID uUID10 = null;
        java.util.UUID uUID11 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.lang.String str14 = sensorSubsystemFacade0.sendUsageData(uUID10, uUID11, "hi!", localDateTime13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str14.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.activateSensor(uUID7);
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "hi!", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID14);
        java.util.UUID uUID16 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType17 = null;
        com.reservation_system.Equipment.LabLocation labLocation19 = null;
        sensorSubsystemFacade0.addEquipment(uUID16, equipmentType17, "ERROR: Invalid sensorId \u2014 null", labLocation19);
        java.util.UUID uUID21 = null;
        java.util.UUID uUID22 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.lang.String str25 = sensorSubsystemFacade0.sendUsageData(uUID21, uUID22, "hi!", localDateTime24);
        com.reservation_system.Sensor.SensorObserver sensorObserver26 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver26);
        java.util.UUID uUID28 = null;
        sensorSubsystemFacade0.activateSensor(uUID28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str25.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID6 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType7 = null;
        com.reservation_system.Equipment.LabLocation labLocation9 = null;
        sensorSubsystemFacade0.addEquipment(uUID6, equipmentType7, "hi!", labLocation9);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList11 = sensorSubsystemFacade0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList11);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID8);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList10 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.flagSensorError(uUID11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeSensor(uUID3);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList5 = sensorSubsystemFacade0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "ERROR: Invalid sensorId \u2014 null", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeSensor(uUID14);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList16 = sensorSubsystemFacade0.getAllEquipment();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList17 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID18 = null;
        com.reservation_system.Sensor.SensorType sensorType19 = null;
        java.util.UUID uUID20 = null;
        sensorSubsystemFacade0.addSensor(uUID18, sensorType19, uUID20);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList22 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID23 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType24 = null;
        com.reservation_system.Equipment.LabLocation labLocation26 = null;
        sensorSubsystemFacade0.addEquipment(uUID23, equipmentType24, "ERROR: Invalid sensorId \u2014 null", labLocation26);
        java.lang.Class<?> wildcardClass28 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.reservation_system.Sensor.SensorManager sensorManager0 = null;
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade1 = new com.reservation_system.Sensor.SensorSubsystemFacade(sensorManager0);
        java.util.UUID uUID2 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorSubsystemFacade1.removeEquipment(uUID2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.SensorManager.removeEquipment(java.util.UUID)\" because \"this.manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList3 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID4 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID4);
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.addSensor(uUID6, sensorType7, uUID8);
        java.util.UUID uUID10 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType11 = null;
        com.reservation_system.Equipment.LabLocation labLocation13 = null;
        sensorSubsystemFacade0.addEquipment(uUID10, equipmentType11, "", labLocation13);
        java.util.UUID uUID15 = null;
        sensorSubsystemFacade0.activateSensor(uUID15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID8);
        java.lang.Class<?> wildcardClass10 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver7);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList9 = sensorSubsystemFacade0.getAllSensors();
        java.lang.Class<?> wildcardClass10 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.activateSensor(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.flagSensorError(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.removeEquipment(uUID9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.removeEquipment(uUID8);
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.addSensor(uUID8, sensorType9, uUID10);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList12 = sensorSubsystemFacade0.getAllUsageLogs();
        java.lang.Class<?> wildcardClass13 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.flagSensorError(uUID10);
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.flagSensorError(uUID12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.activateSensor(uUID16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.addSensor(uUID5, sensorType6, uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.activateSensor(uUID11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID3);
        java.util.UUID uUID5 = null;
        java.util.UUID uUID6 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.lang.String str9 = sensorSubsystemFacade0.sendUsageData(uUID5, uUID6, "hi!", localDateTime8);
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.activateSensor(uUID10);
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.activateSensor(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str9.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.addSensor(uUID8, sensorType9, uUID10);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList12 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList13 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID14 = null;
        java.util.UUID uUID15 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.lang.String str18 = sensorSubsystemFacade0.sendUsageData(uUID14, uUID15, "ERROR: Invalid sensorId \u2014 null", localDateTime17);
        java.util.UUID uUID19 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType20 = null;
        com.reservation_system.Equipment.LabLocation labLocation22 = null;
        sensorSubsystemFacade0.addEquipment(uUID19, equipmentType20, "hi!", labLocation22);
        java.util.UUID uUID24 = null;
        com.reservation_system.Sensor.SensorType sensorType25 = null;
        java.util.UUID uUID26 = null;
        sensorSubsystemFacade0.addSensor(uUID24, sensorType25, uUID26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str18.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.flagSensorError(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.removeSensor(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.removeEquipment(uUID11);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList13 = sensorSubsystemFacade0.getAllEquipment();
        java.lang.Class<?> wildcardClass14 = equipmentList13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.addSensor(uUID5, sensorType6, uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.removeSensor(uUID13);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList15 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID16 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType17 = null;
        com.reservation_system.Equipment.LabLocation labLocation19 = null;
        sensorSubsystemFacade0.addEquipment(uUID16, equipmentType17, "hi!", labLocation19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList15);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.UUID uUID8 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType9 = null;
        com.reservation_system.Equipment.LabLocation labLocation11 = null;
        sensorSubsystemFacade0.addEquipment(uUID8, equipmentType9, "ERROR: Invalid sensorId \u2014 null", labLocation11);
        java.util.UUID uUID13 = null;
        com.reservation_system.Sensor.SensorType sensorType14 = null;
        java.util.UUID uUID15 = null;
        sensorSubsystemFacade0.addSensor(uUID13, sensorType14, uUID15);
        java.util.UUID uUID17 = null;
        sensorSubsystemFacade0.flagSensorError(uUID17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID4 = null;
        java.util.UUID uUID5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.lang.String str8 = sensorSubsystemFacade0.sendUsageData(uUID4, uUID5, "", localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str8.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.flagSensorError(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID13);
        java.util.UUID uUID15 = null;
        sensorSubsystemFacade0.removeSensor(uUID15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        sensorSubsystemFacade0.addEquipment(uUID7, equipmentType8, "", labLocation10);
        java.util.UUID uUID12 = null;
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.addSensor(uUID12, sensorType13, uUID14);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.activateSensor(uUID7);
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "hi!", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID14);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID5);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorSubsystemFacade0.getAllUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.addSensor(uUID8, sensorType9, uUID10);
        com.reservation_system.Sensor.SensorObserver sensorObserver12 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.removeSensor(uUID8);
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.removeSensor(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        sensorSubsystemFacade0.addEquipment(uUID7, equipmentType8, "", labLocation10);
        java.util.UUID uUID12 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType13 = null;
        com.reservation_system.Equipment.LabLocation labLocation15 = null;
        sensorSubsystemFacade0.addEquipment(uUID12, equipmentType13, "hi!", labLocation15);
        java.util.UUID uUID17 = null;
        sensorSubsystemFacade0.flagSensorError(uUID17);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.addSensor(uUID5, sensorType6, uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID11);
        java.lang.Class<?> wildcardClass13 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.flagSensorError(uUID5);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList7 = sensorSubsystemFacade0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.activateSensor(uUID5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.addSensor(uUID8, sensorType9, uUID10);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList12 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList13 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID14 = null;
        java.util.UUID uUID15 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.lang.String str18 = sensorSubsystemFacade0.sendUsageData(uUID14, uUID15, "ERROR: Invalid sensorId \u2014 null", localDateTime17);
        java.util.UUID uUID19 = null;
        sensorSubsystemFacade0.activateSensor(uUID19);
        java.util.UUID uUID21 = null;
        sensorSubsystemFacade0.removeSensor(uUID21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str18.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.addSensor(uUID5, sensorType6, uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.removeSensor(uUID13);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList15 = sensorSubsystemFacade0.getAllSensors();
        java.lang.Class<?> wildcardClass16 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.activateSensor(uUID14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID8);
        java.util.UUID uUID10 = null;
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.addSensor(uUID10, sensorType11, uUID12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.activateSensor(uUID14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID16);
        java.util.UUID uUID18 = null;
        sensorSubsystemFacade0.removeSensor(uUID18);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList20 = sensorSubsystemFacade0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList20);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.flagSensorError(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.flagSensorError(uUID13);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.flagSensorError(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.removeEquipment(uUID11);
        java.util.UUID uUID13 = null;
        java.util.UUID uUID14 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.lang.String str17 = sensorSubsystemFacade0.sendUsageData(uUID13, uUID14, "ERROR: Invalid sensorId \u2014 null", localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str17.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorSubsystemFacade0.sendUsageData(uUID6, uUID7, "", localDateTime9);
        java.util.UUID uUID11 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType12 = null;
        com.reservation_system.Equipment.LabLocation labLocation14 = null;
        sensorSubsystemFacade0.addEquipment(uUID11, equipmentType12, "", labLocation14);
        java.util.UUID uUID16 = null;
        java.util.UUID uUID17 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.lang.String str20 = sensorSubsystemFacade0.sendUsageData(uUID16, uUID17, "", localDateTime19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str20.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.addSensor(uUID8, sensorType9, uUID10);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList12 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList13 = sensorSubsystemFacade0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver14 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID16);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList18 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList19 = sensorSubsystemFacade0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList19);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.flagSensorError(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.flagSensorError(uUID13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.flagSensorError(uUID10);
        java.util.UUID uUID12 = null;
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.addSensor(uUID12, sensorType13, uUID14);
        java.util.UUID uUID16 = null;
        java.util.UUID uUID17 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.lang.String str20 = sensorSubsystemFacade0.sendUsageData(uUID16, uUID17, "hi!", localDateTime19);
        java.util.UUID uUID21 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str20.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID8);
        java.util.UUID uUID10 = null;
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.addSensor(uUID10, sensorType11, uUID12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeEquipment(uUID14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList3 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID6 = null;
        sensorSubsystemFacade0.removeSensor(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.activateSensor(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeEquipment(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.removeEquipment(uUID9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.addSensor(uUID8, sensorType9, uUID10);
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.removeEquipment(uUID12);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensorSubsystemFacade0.getAllUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.flagSensorError(uUID10);
        java.util.UUID uUID12 = null;
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.addSensor(uUID12, sensorType13, uUID14);
        java.lang.Class<?> wildcardClass16 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.flagSensorError(uUID10);
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.flagSensorError(uUID12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID14);
        java.lang.Class<?> wildcardClass16 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID9);
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.addSensor(uUID11, sensorType12, uUID13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID11);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList13 = sensorSubsystemFacade0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList13);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "", labLocation12);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList14 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID15 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList14);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorSubsystemFacade0.sendUsageData(uUID6, uUID7, "", localDateTime9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.flagSensorError(uUID11);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList13 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID14 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType15 = null;
        com.reservation_system.Equipment.LabLocation labLocation17 = null;
        sensorSubsystemFacade0.addEquipment(uUID14, equipmentType15, "", labLocation17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.addSensor(uUID5, sensorType6, uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID9);
        com.reservation_system.Sensor.SensorObserver sensorObserver11 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID13);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        java.util.UUID uUID10 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.lang.String str13 = sensorSubsystemFacade0.sendUsageData(uUID9, uUID10, "ERROR: Invalid sensorId \u2014 null", localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str13.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.flagSensorError(uUID9);
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.addSensor(uUID11, sensorType12, uUID13);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.activateSensor(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.activateSensor(uUID7);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList9 = sensorSubsystemFacade0.getAllUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "ERROR: Invalid sensorId \u2014 null", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeSensor(uUID14);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList16 = sensorSubsystemFacade0.getAllEquipment();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList17 = sensorSubsystemFacade0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList18 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID19 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID19);
        java.util.UUID uUID21 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList18);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.addSensor(uUID5, sensorType6, uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.removeSensor(uUID13);
        java.util.UUID uUID15 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID15);
        java.util.UUID uUID17 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID17);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList19 = sensorSubsystemFacade0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList19);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.activateSensor(uUID14);
        com.reservation_system.Sensor.SensorObserver sensorObserver16 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver16);
        java.util.UUID uUID18 = null;
        sensorSubsystemFacade0.flagSensorError(uUID18);
        java.util.UUID uUID20 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList3 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList5 = sensorSubsystemFacade0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeSensor(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID5);
        java.util.UUID uUID7 = null;
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.addSensor(uUID7, sensorType8, uUID9);
        java.lang.Class<?> wildcardClass11 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID10 = null;
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.addSensor(uUID10, sensorType11, uUID12);
        com.reservation_system.Sensor.SensorObserver sensorObserver14 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID8);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList10 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.addSensor(uUID11, sensorType12, uUID13);
        java.util.UUID uUID15 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.flagSensorError(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.removeSensor(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.removeEquipment(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID13);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList15 = sensorSubsystemFacade0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList15);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.flagSensorError(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.flagSensorError(uUID13);
        java.util.UUID uUID15 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID15);
        java.util.UUID uUID17 = null;
        com.reservation_system.Sensor.SensorType sensorType18 = null;
        java.util.UUID uUID19 = null;
        sensorSubsystemFacade0.addSensor(uUID17, sensorType18, uUID19);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.flagSensorError(uUID10);
        java.util.UUID uUID12 = null;
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.addSensor(uUID12, sensorType13, uUID14);
        java.util.UUID uUID16 = null;
        java.util.UUID uUID17 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.lang.String str20 = sensorSubsystemFacade0.sendUsageData(uUID16, uUID17, "hi!", localDateTime19);
        java.util.UUID uUID21 = null;
        com.reservation_system.Sensor.SensorType sensorType22 = null;
        java.util.UUID uUID23 = null;
        sensorSubsystemFacade0.addSensor(uUID21, sensorType22, uUID23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str20.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.addSensor(uUID5, sensorType6, uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.removeEquipment(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID13);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList3 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList4 = sensorSubsystemFacade0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "ERROR: Invalid sensorId \u2014 null", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeSensor(uUID14);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList16 = sensorSubsystemFacade0.getAllEquipment();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList17 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID18 = null;
        com.reservation_system.Sensor.SensorType sensorType19 = null;
        java.util.UUID uUID20 = null;
        sensorSubsystemFacade0.addSensor(uUID18, sensorType19, uUID20);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList22 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID23 = null;
        sensorSubsystemFacade0.activateSensor(uUID23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList22);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.addSensor(uUID5, sensorType6, uUID7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.addSensor(uUID5, sensorType6, uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.removeSensor(uUID13);
        java.util.UUID uUID15 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID15);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.activateSensor(uUID7);
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "hi!", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID14);
        java.util.UUID uUID16 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType17 = null;
        com.reservation_system.Equipment.LabLocation labLocation19 = null;
        sensorSubsystemFacade0.addEquipment(uUID16, equipmentType17, "ERROR: Invalid sensorId \u2014 null", labLocation19);
        java.util.UUID uUID21 = null;
        java.util.UUID uUID22 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.lang.String str25 = sensorSubsystemFacade0.sendUsageData(uUID21, uUID22, "hi!", localDateTime24);
        java.util.UUID uUID26 = null;
        com.reservation_system.Sensor.SensorType sensorType27 = null;
        java.util.UUID uUID28 = null;
        sensorSubsystemFacade0.addSensor(uUID26, sensorType27, uUID28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str25.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID6 = null;
        java.util.UUID uUID7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = sensorSubsystemFacade0.sendUsageData(uUID6, uUID7, "", localDateTime9);
        java.util.UUID uUID11 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType12 = null;
        com.reservation_system.Equipment.LabLocation labLocation14 = null;
        sensorSubsystemFacade0.addEquipment(uUID11, equipmentType12, "", labLocation14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.activateSensor(uUID16);
        java.util.UUID uUID18 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType19 = null;
        com.reservation_system.Equipment.LabLocation labLocation21 = null;
        sensorSubsystemFacade0.addEquipment(uUID18, equipmentType19, "ERROR: Invalid sensorId \u2014 null", labLocation21);
        com.reservation_system.Sensor.SensorObserver sensorObserver23 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str10.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID6 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType7 = null;
        com.reservation_system.Equipment.LabLocation labLocation9 = null;
        sensorSubsystemFacade0.addEquipment(uUID6, equipmentType7, "", labLocation9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.removeEquipment(uUID8);
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.activateSensor(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.flagSensorError(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.flagSensorError(uUID13);
        java.util.UUID uUID15 = null;
        sensorSubsystemFacade0.removeEquipment(uUID15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.UUID uUID8 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType9 = null;
        com.reservation_system.Equipment.LabLocation labLocation11 = null;
        sensorSubsystemFacade0.addEquipment(uUID8, equipmentType9, "ERROR: Invalid sensorId \u2014 null", labLocation11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.addSensor(uUID8, sensorType9, uUID10);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList12 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.UUID uUID13 = null;
        com.reservation_system.Sensor.SensorType sensorType14 = null;
        java.util.UUID uUID15 = null;
        sensorSubsystemFacade0.addSensor(uUID13, sensorType14, uUID15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList12);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType6 = null;
        com.reservation_system.Equipment.LabLocation labLocation8 = null;
        sensorSubsystemFacade0.addEquipment(uUID5, equipmentType6, "ERROR: Invalid sensorId \u2014 null", labLocation8);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList10 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensorSubsystemFacade0.getAllUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.addSensor(uUID5, sensorType6, uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID9);
        com.reservation_system.Sensor.SensorObserver sensorObserver11 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver11);
        java.util.UUID uUID13 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType14 = null;
        com.reservation_system.Equipment.LabLocation labLocation16 = null;
        sensorSubsystemFacade0.addEquipment(uUID13, equipmentType14, "ERROR: Invalid sensorId \u2014 null", labLocation16);
        java.lang.Class<?> wildcardClass18 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID8);
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.activateSensor(uUID10);
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.removeSensor(uUID12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID16);
        java.util.UUID uUID18 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID18);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID8);
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.flagSensorError(uUID10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.activateSensor(uUID14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.removeEquipment(uUID16);
        java.util.UUID uUID18 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID18);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList20 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID21 = null;
        sensorSubsystemFacade0.removeSensor(uUID21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList20);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "ERROR: Invalid sensorId \u2014 null", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeSensor(uUID14);
        java.util.UUID uUID16 = null;
        java.util.UUID uUID17 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.lang.String str20 = sensorSubsystemFacade0.sendUsageData(uUID16, uUID17, "ERROR: Invalid sensorId \u2014 null", localDateTime19);
        java.util.UUID uUID21 = null;
        com.reservation_system.Sensor.SensorType sensorType22 = null;
        java.util.UUID uUID23 = null;
        sensorSubsystemFacade0.addSensor(uUID21, sensorType22, uUID23);
        java.util.UUID uUID25 = null;
        sensorSubsystemFacade0.removeEquipment(uUID25);
        java.util.UUID uUID27 = null;
        sensorSubsystemFacade0.flagSensorError(uUID27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str20.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.addSensor(uUID8, sensorType9, uUID10);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList12 = sensorSubsystemFacade0.getAllUsageLogs();
        com.reservation_system.Sensor.SensorObserver sensorObserver13 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver13);
        java.util.UUID uUID15 = null;
        sensorSubsystemFacade0.activateSensor(uUID15);
        java.util.UUID uUID17 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList12);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.addSensor(uUID5, sensorType6, uUID7);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList9 = sensorSubsystemFacade0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList9);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID8);
        java.util.UUID uUID10 = null;
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.addSensor(uUID10, sensorType11, uUID12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.activateSensor(uUID14);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList16 = sensorSubsystemFacade0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList16);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.flagSensorError(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID11);
        java.util.UUID uUID13 = null;
        com.reservation_system.Sensor.SensorType sensorType14 = null;
        java.util.UUID uUID15 = null;
        sensorSubsystemFacade0.addSensor(uUID13, sensorType14, uUID15);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "hi!", labLocation12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.activateSensor(uUID7);
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "hi!", labLocation12);
        com.reservation_system.Sensor.SensorObserver sensorObserver14 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.activateSensor(uUID16);
        java.util.UUID uUID18 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID18);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver7);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList9 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID10 = null;
        java.util.UUID uUID11 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.lang.String str14 = sensorSubsystemFacade0.sendUsageData(uUID10, uUID11, "hi!", localDateTime13);
        java.util.UUID uUID15 = null;
        java.util.UUID uUID16 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.lang.String str19 = sensorSubsystemFacade0.sendUsageData(uUID15, uUID16, "hi!", localDateTime18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str14.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str19.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.flagSensorError(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID9);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensorSubsystemFacade0.getAllUsageLogs();
        com.reservation_system.Sensor.SensorObserver sensorObserver12 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID3);
        com.reservation_system.Sensor.SensorObserver sensorObserver5 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver5);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList7 = sensorSubsystemFacade0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "ERROR: Invalid sensorId \u2014 null", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeSensor(uUID14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID16);
        java.util.UUID uUID18 = null;
        sensorSubsystemFacade0.flagSensorError(uUID18);
        java.util.UUID uUID20 = null;
        sensorSubsystemFacade0.flagSensorError(uUID20);
        java.util.UUID uUID22 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType23 = null;
        com.reservation_system.Equipment.LabLocation labLocation25 = null;
        sensorSubsystemFacade0.addEquipment(uUID22, equipmentType23, "ERROR: Invalid sensorId \u2014 null", labLocation25);
        java.util.UUID uUID27 = null;
        sensorSubsystemFacade0.flagSensorError(uUID27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID4 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID4);
        java.lang.Class<?> wildcardClass6 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.addSensor(uUID5, sensorType6, uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID13);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.activateSensor(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.flagSensorError(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.activateSensor(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID13);
        java.util.UUID uUID15 = null;
        sensorSubsystemFacade0.removeEquipment(uUID15);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList17 = sensorSubsystemFacade0.getAllUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList17);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.activateSensor(uUID7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID10);
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "ERROR: Invalid sensorId \u2014 null", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeEquipment(uUID14);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList16 = sensorSubsystemFacade0.getAllUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList16);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.flagSensorError(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.removeSensor(uUID9);
        java.util.UUID uUID11 = null;
        java.util.UUID uUID12 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.lang.String str15 = sensorSubsystemFacade0.sendUsageData(uUID11, uUID12, "", localDateTime14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str15.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.reservation_system.Sensor.SensorManager sensorManager0 = null;
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade1 = new com.reservation_system.Sensor.SensorSubsystemFacade(sensorManager0);
        java.util.UUID uUID2 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType3 = null;
        com.reservation_system.Equipment.LabLocation labLocation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorSubsystemFacade1.addEquipment(uUID2, equipmentType3, "ERROR: Invalid sensorId \u2014 null", labLocation5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.SensorManager.addEquipment(com.reservation_system.Equipment.Equipment)\" because \"this.manager\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.flagSensorError(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.activateSensor(uUID14);
        com.reservation_system.Sensor.SensorObserver sensorObserver16 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver16);
        java.lang.Class<?> wildcardClass18 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.activateSensor(uUID8);
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.removeSensor(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.addSensor(uUID5, sensorType6, uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.removeSensor(uUID13);
        java.util.UUID uUID15 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID15);
        java.util.UUID uUID17 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID17);
        java.util.UUID uUID19 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID19);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "ERROR: Invalid sensorId \u2014 null", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeSensor(uUID14);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList16 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID17 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID17);
        java.util.UUID uUID19 = null;
        sensorSubsystemFacade0.removeEquipment(uUID19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList16);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.UUID uUID8 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType9 = null;
        com.reservation_system.Equipment.LabLocation labLocation11 = null;
        sensorSubsystemFacade0.addEquipment(uUID8, equipmentType9, "", labLocation11);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.activateSensor(uUID14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.removeEquipment(uUID16);
        java.util.UUID uUID18 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID18);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList20 = sensorSubsystemFacade0.getAllEquipment();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList21 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID22 = null;
        sensorSubsystemFacade0.removeEquipment(uUID22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList21);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.flagSensorError(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID11);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.UUID uUID8 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType9 = null;
        com.reservation_system.Equipment.LabLocation labLocation11 = null;
        sensorSubsystemFacade0.addEquipment(uUID8, equipmentType9, "ERROR: Invalid sensorId \u2014 null", labLocation11);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList13 = sensorSubsystemFacade0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList13);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.flagSensorError(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.removeEquipment(uUID11);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver7);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList9 = sensorSubsystemFacade0.getAllSensors();
        java.lang.Class<?> wildcardClass10 = sensorList9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType8 = null;
        com.reservation_system.Equipment.LabLocation labLocation10 = null;
        sensorSubsystemFacade0.addEquipment(uUID7, equipmentType8, "", labLocation10);
        java.util.UUID uUID12 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType13 = null;
        com.reservation_system.Equipment.LabLocation labLocation15 = null;
        sensorSubsystemFacade0.addEquipment(uUID12, equipmentType13, "hi!", labLocation15);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList17 = sensorSubsystemFacade0.getAllEquipment();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList18 = sensorSubsystemFacade0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList18);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorSubsystemFacade0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver4 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver4);
        java.util.UUID uUID6 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.activateSensor(uUID7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.activateSensor(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.flagSensorError(uUID10);
        java.util.UUID uUID12 = null;
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.addSensor(uUID12, sensorType13, uUID14);
        java.util.UUID uUID16 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType17 = null;
        com.reservation_system.Equipment.LabLocation labLocation19 = null;
        sensorSubsystemFacade0.addEquipment(uUID16, equipmentType17, "", labLocation19);
        java.util.UUID uUID21 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID8);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList10 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.addSensor(uUID11, sensorType12, uUID13);
        java.util.UUID uUID15 = null;
        java.util.UUID uUID16 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.lang.String str19 = sensorSubsystemFacade0.sendUsageData(uUID15, uUID16, "ERROR: Invalid sensorId \u2014 null", localDateTime18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str19.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID8);
        java.util.UUID uUID10 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType11 = null;
        com.reservation_system.Equipment.LabLocation labLocation13 = null;
        sensorSubsystemFacade0.addEquipment(uUID10, equipmentType11, "ERROR: Invalid sensorId \u2014 null", labLocation13);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.activateSensor(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID11);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList13 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.flagSensorError(uUID14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList13);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList3 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList3 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensorSubsystemFacade0.getAllUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.flagSensorError(uUID1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.flagSensorError(uUID3);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.activateSensor(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList3 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID4 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID4);
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.addSensor(uUID6, sensorType7, uUID8);
        java.util.UUID uUID10 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType11 = null;
        com.reservation_system.Equipment.LabLocation labLocation13 = null;
        sensorSubsystemFacade0.addEquipment(uUID10, equipmentType11, "", labLocation13);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList15 = sensorSubsystemFacade0.getAllEquipment();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList16 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID17 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList16);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.activateSensor(uUID14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID8);
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.activateSensor(uUID10);
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.removeSensor(uUID12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.removeSensor(uUID16);
        java.util.UUID uUID18 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID18);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID7);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList9 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.activateSensor(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.flagSensorError(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.activateSensor(uUID9);
        com.reservation_system.Sensor.SensorObserver sensorObserver11 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID13);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList7 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID8);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList10 = sensorSubsystemFacade0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.flagSensorError(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID11);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList13 = sensorSubsystemFacade0.getAllSensors();
        java.lang.Class<?> wildcardClass14 = sensorList13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.addSensor(uUID5, sensorType6, uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.removeEquipment(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID13);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList15 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.flagSensorError(uUID16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList15);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList7 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.removeEquipment(uUID8);
        com.reservation_system.Sensor.SensorObserver sensorObserver10 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver10);
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList7);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.activateSensor(uUID8);
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.removeSensor(uUID10);
        com.reservation_system.Sensor.SensorObserver sensorObserver12 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver12);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "ERROR: Invalid sensorId \u2014 null", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeSensor(uUID14);
        java.util.UUID uUID16 = null;
        java.util.UUID uUID17 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.lang.String str20 = sensorSubsystemFacade0.sendUsageData(uUID16, uUID17, "hi!", localDateTime19);
        java.util.UUID uUID21 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID21);
        java.util.UUID uUID23 = null;
        sensorSubsystemFacade0.removeEquipment(uUID23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str20.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.activateSensor(uUID14);
        com.reservation_system.Sensor.SensorObserver sensorObserver16 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver16);
        java.util.UUID uUID18 = null;
        sensorSubsystemFacade0.flagSensorError(uUID18);
        java.util.UUID uUID20 = null;
        sensorSubsystemFacade0.flagSensorError(uUID20);
        java.util.UUID uUID22 = null;
        sensorSubsystemFacade0.removeSensor(uUID22);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList24 = sensorSubsystemFacade0.getAllUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList24);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.activateSensor(uUID8);
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.flagSensorError(uUID10);
        java.util.UUID uUID12 = null;
        java.util.UUID uUID13 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.lang.String str16 = sensorSubsystemFacade0.sendUsageData(uUID12, uUID13, "", localDateTime15);
        java.util.UUID uUID17 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str16.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.flagSensorError(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.removeSensor(uUID9);
        java.util.UUID uUID11 = null;
        java.util.UUID uUID12 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.lang.String str15 = sensorSubsystemFacade0.sendUsageData(uUID11, uUID12, "", localDateTime14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.flagSensorError(uUID16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str15.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.flagSensorError(uUID11);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList13 = sensorSubsystemFacade0.getAllUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList13);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList3 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID4 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID4);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.flagSensorError(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "ERROR: Invalid sensorId \u2014 null", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeSensor(uUID14);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList16 = sensorSubsystemFacade0.getAllEquipment();
        java.lang.Class<?> wildcardClass17 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.removeSensor(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.flagSensorError(uUID9);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensorSubsystemFacade0.getAllUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.activateSensor(uUID7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID10);
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.activateSensor(uUID12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeSensor(uUID14);
        java.util.UUID uUID16 = null;
        com.reservation_system.Sensor.SensorType sensorType17 = null;
        java.util.UUID uUID18 = null;
        sensorSubsystemFacade0.addSensor(uUID16, sensorType17, uUID18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.flagSensorError(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.removeSensor(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.removeEquipment(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID13);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList15 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList16 = sensorSubsystemFacade0.getAllUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList16);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorSubsystemFacade0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver4 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver4);
        java.util.UUID uUID6 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.activateSensor(uUID8);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList10 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID11 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType12 = null;
        com.reservation_system.Equipment.LabLocation labLocation14 = null;
        sensorSubsystemFacade0.addEquipment(uUID11, equipmentType12, "ERROR: Invalid sensorId \u2014 null", labLocation14);
        java.util.UUID uUID16 = null;
        sensorSubsystemFacade0.removeSensor(uUID16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.flagSensorError(uUID10);
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeSensor(uUID14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorSubsystemFacade0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver4 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver4);
        java.util.UUID uUID6 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.activateSensor(uUID8);
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.activateSensor(uUID10);
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID12);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList14 = sensorSubsystemFacade0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList14);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.flagSensorError(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.removeSensor(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.removeEquipment(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID13);
        com.reservation_system.Sensor.SensorObserver sensorObserver15 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver15);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID4 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.activateSensor(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "ERROR: Invalid sensorId \u2014 null", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.removeSensor(uUID14);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList16 = sensorSubsystemFacade0.getAllEquipment();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList17 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID18 = null;
        com.reservation_system.Sensor.SensorType sensorType19 = null;
        java.util.UUID uUID20 = null;
        sensorSubsystemFacade0.addSensor(uUID18, sensorType19, uUID20);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList22 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID23 = null;
        com.reservation_system.Sensor.SensorType sensorType24 = null;
        java.util.UUID uUID25 = null;
        sensorSubsystemFacade0.addSensor(uUID23, sensorType24, uUID25);
        java.util.UUID uUID27 = null;
        sensorSubsystemFacade0.activateSensor(uUID27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList22);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorSubsystemFacade0.getAllEquipment();
        com.reservation_system.Sensor.SensorObserver sensorObserver4 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver4);
        java.util.UUID uUID6 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.activateSensor(uUID8);
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID10);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList6 = sensorSubsystemFacade0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList6);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.removeSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "ERROR: Invalid sensorId \u2014 null", labLocation6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID6 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType7 = null;
        com.reservation_system.Equipment.LabLocation labLocation9 = null;
        sensorSubsystemFacade0.addEquipment(uUID6, equipmentType7, "hi!", labLocation9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.activateSensor(uUID13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.addSensor(uUID5, sensorType6, uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID13);
        java.util.UUID uUID15 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID15);
        java.util.UUID uUID17 = null;
        sensorSubsystemFacade0.removeSensor(uUID17);
        java.util.UUID uUID19 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType20 = null;
        com.reservation_system.Equipment.LabLocation labLocation22 = null;
        sensorSubsystemFacade0.addEquipment(uUID19, equipmentType20, "hi!", labLocation22);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.flagSensorError(uUID10);
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.flagSensorError(uUID12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID14);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList16 = sensorSubsystemFacade0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList16);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "", labLocation12);
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.activateSensor(uUID14);
        com.reservation_system.Sensor.SensorObserver sensorObserver16 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver16);
        java.util.UUID uUID18 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID18);
        java.util.UUID uUID20 = null;
        sensorSubsystemFacade0.removeSensor(uUID20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.activateSensor(uUID8);
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID10);
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.activateSensor(uUID12);
        java.util.UUID uUID14 = null;
        java.util.UUID uUID15 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.lang.String str18 = sensorSubsystemFacade0.sendUsageData(uUID14, uUID15, "ERROR: Invalid sensorId \u2014 null", localDateTime17);
        java.util.UUID uUID19 = null;
        sensorSubsystemFacade0.activateSensor(uUID19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str18.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeSensor(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID5);
        java.util.UUID uUID7 = null;
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.addSensor(uUID7, sensorType8, uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.removeSensor(uUID11);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        java.util.UUID uUID4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.lang.String str7 = sensorSubsystemFacade0.sendUsageData(uUID3, uUID4, "", localDateTime6);
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.addSensor(uUID8, sensorType9, uUID10);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList12 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList13 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID14 = null;
        java.util.UUID uUID15 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.lang.String str18 = sensorSubsystemFacade0.sendUsageData(uUID14, uUID15, "ERROR: Invalid sensorId \u2014 null", localDateTime17);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList19 = sensorSubsystemFacade0.getAllSensors();
        com.reservation_system.Sensor.SensorObserver sensorObserver20 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str7.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str18.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList19);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.flagSensorError(uUID10);
        java.util.UUID uUID12 = null;
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        java.util.UUID uUID14 = null;
        sensorSubsystemFacade0.addSensor(uUID12, sensorType13, uUID14);
        java.util.UUID uUID16 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType17 = null;
        com.reservation_system.Equipment.LabLocation labLocation19 = null;
        sensorSubsystemFacade0.addEquipment(uUID16, equipmentType17, "", labLocation19);
        java.util.UUID uUID21 = null;
        com.reservation_system.Sensor.SensorType sensorType22 = null;
        java.util.UUID uUID23 = null;
        sensorSubsystemFacade0.addSensor(uUID21, sensorType22, uUID23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.addSensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.activateSensor(uUID7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID10);
        java.util.UUID uUID12 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType13 = null;
        com.reservation_system.Equipment.LabLocation labLocation15 = null;
        sensorSubsystemFacade0.addEquipment(uUID12, equipmentType13, "hi!", labLocation15);
        com.reservation_system.Sensor.SensorObserver sensorObserver17 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver17);
        com.reservation_system.Sensor.SensorObserver sensorObserver19 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.flagSensorError(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.removeSensor(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.removeEquipment(uUID11);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList13 = sensorSubsystemFacade0.getAllEquipment();
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList14 = sensorSubsystemFacade0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList14);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList3 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID4 = null;
        sensorSubsystemFacade0.removeEquipment(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList3);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.flagSensorError(uUID1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID3);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.removeSensor(uUID8);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList10 = sensorSubsystemFacade0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.addSensor(uUID8, sensorType9, uUID10);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList3 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID4 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID4);
        java.util.UUID uUID6 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType7 = null;
        com.reservation_system.Equipment.LabLocation labLocation9 = null;
        sensorSubsystemFacade0.addEquipment(uUID6, equipmentType7, "", labLocation9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.activateSensor(uUID5);
        com.reservation_system.Sensor.SensorObserver sensorObserver7 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver7);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList9 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList9);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.flagSensorError(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.removeSensor(uUID9);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensorSubsystemFacade0.getAllUsageLogs();
        java.util.UUID uUID12 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID12);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList14 = sensorSubsystemFacade0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList14);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        com.reservation_system.Sensor.SensorType sensorType2 = null;
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.addSensor(uUID1, sensorType2, uUID3);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList5 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList6 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList9 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID10 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType11 = null;
        com.reservation_system.Equipment.LabLocation labLocation13 = null;
        sensorSubsystemFacade0.addEquipment(uUID10, equipmentType11, "ERROR: Invalid sensorId \u2014 null", labLocation13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList3 = sensorSubsystemFacade0.getAllSensors();
        java.util.List<com.reservation_system.Sensor.Sensor> sensorList4 = sensorSubsystemFacade0.getAllSensors();
        java.util.UUID uUID5 = null;
        java.util.UUID uUID6 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.lang.String str9 = sensorSubsystemFacade0.sendUsageData(uUID5, uUID6, "hi!", localDateTime8);
        java.util.UUID uUID10 = null;
        java.util.UUID uUID11 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.lang.String str14 = sensorSubsystemFacade0.sendUsageData(uUID10, uUID11, "", localDateTime13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str9.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str14.equals("ERROR: Invalid sensorId \u2014 null"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.flagSensorError(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.activateSensor(uUID11);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID8);
        java.util.UUID uUID10 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID10);
        java.util.UUID uUID12 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType13 = null;
        com.reservation_system.Equipment.LabLocation labLocation15 = null;
        sensorSubsystemFacade0.addEquipment(uUID12, equipmentType13, "", labLocation15);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType10 = null;
        com.reservation_system.Equipment.LabLocation labLocation12 = null;
        sensorSubsystemFacade0.addEquipment(uUID9, equipmentType10, "ERROR: Invalid sensorId \u2014 null", labLocation12);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensorSubsystemFacade0.getAllUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList8 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.deactivateSensor(uUID9);
        java.util.UUID uUID11 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType12 = null;
        com.reservation_system.Equipment.LabLocation labLocation14 = null;
        sensorSubsystemFacade0.addEquipment(uUID11, equipmentType12, "ERROR: Invalid sensorId \u2014 null", labLocation14);
        java.lang.Class<?> wildcardClass16 = sensorSubsystemFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        com.reservation_system.Sensor.SensorObserver sensorObserver1 = null;
        sensorSubsystemFacade0.addObserver(sensorObserver1);
        java.util.UUID uUID3 = null;
        sensorSubsystemFacade0.removeEquipment(uUID3);
        java.util.UUID uUID5 = null;
        sensorSubsystemFacade0.setEquipmentDisabled(uUID5);
        java.util.UUID uUID7 = null;
        sensorSubsystemFacade0.removeSensor(uUID7);
        java.util.UUID uUID9 = null;
        sensorSubsystemFacade0.setEquipmentMaintenance(uUID9);
        java.util.UUID uUID11 = null;
        sensorSubsystemFacade0.flagSensorError(uUID11);
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.flagSensorError(uUID13);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList15 = sensorSubsystemFacade0.getAllUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList15);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.reservation_system.Sensor.SensorSubsystemFacade sensorSubsystemFacade0 = new com.reservation_system.Sensor.SensorSubsystemFacade();
        java.util.UUID uUID1 = null;
        sensorSubsystemFacade0.activateSensor(uUID1);
        java.util.UUID uUID3 = null;
        com.reservation_system.Equipment.EquipmentType equipmentType4 = null;
        com.reservation_system.Equipment.LabLocation labLocation6 = null;
        sensorSubsystemFacade0.addEquipment(uUID3, equipmentType4, "", labLocation6);
        java.util.UUID uUID8 = null;
        sensorSubsystemFacade0.setEquipmentAvailable(uUID8);
        java.util.List<com.reservation_system.Equipment.Equipment> equipmentList10 = sensorSubsystemFacade0.getAllEquipment();
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        java.util.UUID uUID13 = null;
        sensorSubsystemFacade0.addSensor(uUID11, sensorType12, uUID13);
        java.util.UUID uUID15 = null;
        java.util.UUID uUID16 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.lang.String str19 = sensorSubsystemFacade0.sendUsageData(uUID15, uUID16, "hi!", localDateTime18);
        java.util.UUID uUID20 = null;
        java.util.UUID uUID21 = null;
        java.time.LocalDateTime localDateTime23 = null;
        java.lang.String str24 = sensorSubsystemFacade0.sendUsageData(uUID20, uUID21, "hi!", localDateTime23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str19.equals("ERROR: Invalid sensorId \u2014 null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "ERROR: Invalid sensorId \u2014 null" + "'", str24.equals("ERROR: Invalid sensorId \u2014 null"));
    }
}

