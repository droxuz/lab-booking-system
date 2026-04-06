package com.reservation_system.Randoop.Sensor.Sensor;
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
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.lang.Class<?> wildcardClass4 = sensor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        com.reservation_system.Sensor.SensorState sensorState6 = null;
        sensor3.setState(sensorState6);
        // The following exception was thrown during execution in test generation
        try {
            sensor3.flagError();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.SensorState.flagError(com.reservation_system.Sensor.Sensor)\" because \"this.state\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        com.reservation_system.Sensor.SensorState sensorState4 = sensor3.getState();
        java.lang.Class<?> wildcardClass5 = sensorState4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState5 = null;
        sensor3.setState(sensorState5);
        // The following exception was thrown during execution in test generation
        try {
            sensor3.flagError();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.SensorState.flagError(com.reservation_system.Sensor.Sensor)\" because \"this.state\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        java.lang.String str8 = sensor3.toString();
        sensor3.deactivate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str8.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        java.lang.String str5 = sensor3.getStateName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ACTIVE" + "'", str5.equals("ACTIVE"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState5 = null;
        sensor3.setState(sensorState5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = sensor3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.SensorState.getStateName()\" because \"this.state\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry5 = null;
        sensor3.recordUsage(usageLogEntry5);
        java.util.UUID uUID7 = sensor3.getSensorId();
        java.util.UUID uUID8 = null;
        sensor3.setLinkedEquipmentId(uUID8);
        sensor3.activate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        sensor9.activate();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor9.getState();
        sensor3.setState(sensorState13);
        com.reservation_system.Sensor.SensorType sensorType15 = null;
        sensor3.setSensorType(sensorType15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        sensor3.flagError();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry9 = null;
        sensor3.recordUsage(usageLogEntry9);
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        sensor3.setSensorType(sensorType11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        sensor9.activate();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor9.getState();
        sensor3.setState(sensorState13);
        boolean boolean15 = sensor3.canSendData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        com.reservation_system.Sensor.SensorState sensorState4 = sensor3.getState();
        java.lang.String str5 = sensor3.toString();
        java.util.UUID uUID6 = null;
        sensor3.setLinkedEquipmentId(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str5.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        java.util.UUID uUID12 = null;
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        java.util.UUID uUID14 = null;
        com.reservation_system.Sensor.Sensor sensor15 = new com.reservation_system.Sensor.Sensor(uUID12, sensorType13, uUID14);
        sensor15.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList17 = sensor15.getUsageLogs();
        sensor15.activate();
        com.reservation_system.Sensor.SensorState sensorState19 = sensor15.getState();
        sensor9.setState(sensorState19);
        com.reservation_system.Sensor.SensorState sensorState21 = sensor9.getState();
        sensor3.setState(sensorState21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState21);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.Sensor sensor6 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5);
        sensor6.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor6.getUsageLogs();
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.Sensor sensor12 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11);
        sensor12.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensor12.getUsageLogs();
        sensor12.activate();
        com.reservation_system.Sensor.SensorState sensorState16 = sensor12.getState();
        sensor6.setState(sensorState16);
        com.reservation_system.Sensor.SensorState sensorState18 = sensor6.getState();
        com.reservation_system.Sensor.Sensor sensor19 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState18);
        sensor19.flagError();
        sensor19.flagError();
        com.reservation_system.Sensor.SensorState sensorState22 = null;
        sensor19.setState(sensorState22);
        java.lang.Class<?> wildcardClass24 = sensor19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList9 = sensor3.getUsageLogs();
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        sensor3.setSensorType(sensorType10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        sensor3.flagError();
        java.util.UUID uUID8 = sensor3.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry9 = null;
        sensor3.recordUsage(usageLogEntry9);
        java.util.UUID uUID11 = sensor3.getSensorId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = uUID11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        sensor3.flagError();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor3.getUsageLogs();
        sensor3.activate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        sensor3.deactivate();
        sensor3.deactivate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        java.lang.String str7 = sensor3.toString();
        sensor3.flagError();
        sensor3.deactivate();
        sensor3.activate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str7.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensor3.getUsageLogs();
        sensor3.flagError();
        boolean boolean8 = sensor3.canSendData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry5 = null;
        sensor3.recordUsage(usageLogEntry5);
        java.util.UUID uUID7 = sensor3.getSensorId();
        java.util.UUID uUID8 = null;
        sensor3.setLinkedEquipmentId(uUID8);
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        sensor3.setSensorType(sensorType10);
        com.reservation_system.Sensor.SensorState sensorState12 = sensor3.getState();
        java.lang.Class<?> wildcardClass13 = sensorState12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        com.reservation_system.Sensor.SensorState sensorState4 = sensor3.getState();
        sensor3.deactivate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry5 = null;
        sensor3.recordUsage(usageLogEntry5);
        java.util.UUID uUID7 = sensor3.getSensorId();
        sensor3.activate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        sensor3.flagError();
        java.util.UUID uUID7 = sensor3.getLinkedEquipmentId();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor3.getUsageLogs();
        java.lang.Class<?> wildcardClass9 = usageLogEntryList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry7 = null;
        sensor3.recordUsage(usageLogEntry7);
        java.util.UUID uUID9 = sensor3.getLinkedEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        com.reservation_system.Sensor.SensorType sensorType9 = sensor3.getSensorType();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry10 = null;
        sensor3.recordUsage(usageLogEntry10);
        java.lang.String str12 = sensor3.toString();
        boolean boolean13 = sensor3.canSendData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ERROR}" + "'", str12.equals("Sensor{id=null, type=null, equipment=null, state=ERROR}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        com.reservation_system.Sensor.SensorType sensorType9 = sensor3.getSensorType();
        boolean boolean10 = sensor3.canSendData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry5 = null;
        sensor3.recordUsage(usageLogEntry5);
        java.util.UUID uUID7 = sensor3.getSensorId();
        java.util.UUID uUID8 = null;
        sensor3.setLinkedEquipmentId(uUID8);
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        sensor3.setSensorType(sensorType10);
        com.reservation_system.Sensor.SensorState sensorState12 = sensor3.getState();
        java.lang.Class<?> wildcardClass13 = sensor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        sensor3.deactivate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList9 = sensor3.getUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        java.util.UUID uUID6 = sensor3.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry7 = null;
        sensor3.recordUsage(usageLogEntry7);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList9 = sensor3.getUsageLogs();
        java.util.UUID uUID10 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID11 = null;
        sensor3.setLinkedEquipmentId(uUID11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState5 = null;
        sensor3.setState(sensorState5);
        java.util.UUID uUID7 = null;
        sensor3.setLinkedEquipmentId(uUID7);
        // The following exception was thrown during execution in test generation
        try {
            sensor3.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.SensorState.activate(com.reservation_system.Sensor.Sensor)\" because \"this.state\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        java.lang.String str6 = sensor3.toString();
        java.util.UUID uUID7 = sensor3.getLinkedEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str6.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID6 = sensor3.getSensorId();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        sensor3.setSensorType(sensorType8);
        java.lang.String str10 = sensor3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str10.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        java.util.UUID uUID6 = sensor3.getSensorId();
        java.lang.Class<?> wildcardClass7 = sensor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        java.lang.String str8 = sensor3.toString();
        java.util.UUID uUID9 = null;
        sensor3.setLinkedEquipmentId(uUID9);
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        sensor3.setSensorType(sensorType11);
        java.util.UUID uUID13 = sensor3.getLinkedEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str8.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry7 = null;
        sensor3.recordUsage(usageLogEntry7);
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry9 = null;
        sensor3.recordUsage(usageLogEntry9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        com.reservation_system.Sensor.SensorState sensorState4 = sensor3.getState();
        java.lang.String str5 = sensor3.toString();
        sensor3.flagError();
        sensor3.deactivate();
        java.lang.String str8 = sensor3.getStateName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str5.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "INACTIVE" + "'", str8.equals("INACTIVE"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        boolean boolean5 = sensor3.canSendData();
        sensor3.deactivate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        sensor9.activate();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor9.getState();
        com.reservation_system.Sensor.Sensor sensor14 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5, sensorState13);
        com.reservation_system.Sensor.Sensor sensor15 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState13);
        java.lang.String str16 = sensor15.getStateName();
        java.lang.String str17 = sensor15.getStateName();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList18 = sensor15.getUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ACTIVE" + "'", str16.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ACTIVE" + "'", str17.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList18);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState5 = null;
        sensor3.setState(sensorState5);
        java.util.UUID uUID7 = null;
        sensor3.setLinkedEquipmentId(uUID7);
        java.util.UUID uUID9 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID10 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID11 = sensor3.getLinkedEquipmentId();
        // The following exception was thrown during execution in test generation
        try {
            sensor3.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.SensorState.activate(com.reservation_system.Sensor.Sensor)\" because \"this.state\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState5 = null;
        sensor3.setState(sensorState5);
        java.lang.Class<?> wildcardClass7 = sensor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        com.reservation_system.Sensor.SensorState sensorState6 = null;
        sensor3.setState(sensorState6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = sensor3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.SensorState.getStateName()\" because \"this.state\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        com.reservation_system.Sensor.SensorType sensorType9 = sensor3.getSensorType();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry10 = null;
        sensor3.recordUsage(usageLogEntry10);
        java.lang.String str12 = sensor3.toString();
        java.util.UUID uUID13 = sensor3.getLinkedEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ERROR}" + "'", str12.equals("Sensor{id=null, type=null, equipment=null, state=ERROR}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        sensor3.flagError();
        java.lang.String str6 = sensor3.getStateName();
        java.lang.String str7 = sensor3.getStateName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ERROR" + "'", str6.equals("ERROR"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR" + "'", str7.equals("ERROR"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        sensor3.setSensorType(sensorType8);
        java.util.UUID uUID10 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID11 = sensor3.getLinkedEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        sensor3.flagError();
        java.util.UUID uUID6 = sensor3.getSensorId();
        sensor3.deactivate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        sensor3.deactivate();
        java.util.UUID uUID9 = sensor3.getLinkedEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        sensor3.flagError();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry9 = null;
        sensor3.recordUsage(usageLogEntry9);
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        java.util.UUID uUID13 = null;
        com.reservation_system.Sensor.Sensor sensor14 = new com.reservation_system.Sensor.Sensor(uUID11, sensorType12, uUID13);
        com.reservation_system.Sensor.SensorState sensorState15 = sensor14.getState();
        sensor3.setState(sensorState15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState15);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        sensor3.flagError();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensor3.getUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        com.reservation_system.Sensor.SensorState sensorState4 = sensor3.getState();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID6 = sensor3.getSensorId();
        java.util.UUID uUID7 = null;
        sensor3.setLinkedEquipmentId(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        com.reservation_system.Sensor.SensorState sensorState4 = sensor3.getState();
        java.lang.String str5 = sensor3.toString();
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        sensor3.setSensorType(sensorType6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str5.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        com.reservation_system.Sensor.SensorState sensorState10 = sensor9.getState();
        sensor3.setState(sensorState10);
        java.lang.String str12 = sensor3.getStateName();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor3.getState();
        com.reservation_system.Sensor.SensorType sensorType14 = sensor3.getSensorType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ACTIVE" + "'", str12.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType14);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        sensor3.flagError();
        boolean boolean7 = sensor3.canSendData();
        sensor3.flagError();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        boolean boolean5 = sensor3.canSendData();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensor3.getUsageLogs();
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        sensor3.setSensorType(sensorType7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry5 = null;
        sensor3.recordUsage(usageLogEntry5);
        java.util.UUID uUID7 = sensor3.getSensorId();
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        java.util.UUID uUID10 = null;
        com.reservation_system.Sensor.Sensor sensor11 = new com.reservation_system.Sensor.Sensor(uUID8, sensorType9, uUID10);
        sensor11.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList13 = sensor11.getUsageLogs();
        java.util.UUID uUID14 = null;
        com.reservation_system.Sensor.SensorType sensorType15 = null;
        java.util.UUID uUID16 = null;
        com.reservation_system.Sensor.Sensor sensor17 = new com.reservation_system.Sensor.Sensor(uUID14, sensorType15, uUID16);
        sensor17.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList19 = sensor17.getUsageLogs();
        sensor17.activate();
        com.reservation_system.Sensor.SensorState sensorState21 = sensor17.getState();
        sensor11.setState(sensorState21);
        com.reservation_system.Sensor.SensorState sensorState23 = sensor11.getState();
        sensor3.setState(sensorState23);
        java.lang.Class<?> wildcardClass25 = sensor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        boolean boolean5 = sensor3.canSendData();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry6 = null;
        sensor3.recordUsage(usageLogEntry6);
        sensor3.activate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        boolean boolean5 = sensor3.canSendData();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry6 = null;
        sensor3.recordUsage(usageLogEntry6);
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry8 = null;
        sensor3.recordUsage(usageLogEntry8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList9 = sensor3.getUsageLogs();
        java.util.UUID uUID10 = null;
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        java.util.UUID uUID12 = null;
        java.util.UUID uUID13 = null;
        com.reservation_system.Sensor.SensorType sensorType14 = null;
        java.util.UUID uUID15 = null;
        com.reservation_system.Sensor.Sensor sensor16 = new com.reservation_system.Sensor.Sensor(uUID13, sensorType14, uUID15);
        sensor16.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList18 = sensor16.getUsageLogs();
        java.util.UUID uUID19 = null;
        com.reservation_system.Sensor.SensorType sensorType20 = null;
        java.util.UUID uUID21 = null;
        com.reservation_system.Sensor.Sensor sensor22 = new com.reservation_system.Sensor.Sensor(uUID19, sensorType20, uUID21);
        sensor22.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList24 = sensor22.getUsageLogs();
        sensor22.activate();
        com.reservation_system.Sensor.SensorState sensorState26 = sensor22.getState();
        sensor16.setState(sensorState26);
        com.reservation_system.Sensor.SensorState sensorState28 = sensor16.getState();
        com.reservation_system.Sensor.Sensor sensor29 = new com.reservation_system.Sensor.Sensor(uUID10, sensorType11, uUID12, sensorState28);
        sensor3.setState(sensorState28);
        boolean boolean31 = sensor3.canSendData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        com.reservation_system.Sensor.SensorState sensorState4 = sensor3.getState();
        java.util.UUID uUID5 = sensor3.getSensorId();
        java.lang.String str6 = sensor3.toString();
        java.lang.String str7 = sensor3.getStateName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str6.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ACTIVE" + "'", str7.equals("ACTIVE"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        java.lang.String str7 = sensor3.getStateName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ACTIVE" + "'", str7.equals("ACTIVE"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        java.lang.String str8 = sensor3.toString();
        java.util.UUID uUID9 = null;
        sensor3.setLinkedEquipmentId(uUID9);
        sensor3.deactivate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str8.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.Sensor sensor12 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11);
        sensor12.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensor12.getUsageLogs();
        sensor12.activate();
        com.reservation_system.Sensor.SensorState sensorState16 = sensor12.getState();
        com.reservation_system.Sensor.Sensor sensor17 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8, sensorState16);
        com.reservation_system.Sensor.SensorState sensorState18 = sensor17.getState();
        com.reservation_system.Sensor.Sensor sensor19 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5, sensorState18);
        com.reservation_system.Sensor.Sensor sensor20 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState18);
        java.util.UUID uUID21 = sensor20.getLinkedEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID21);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        com.reservation_system.Sensor.SensorState sensorState10 = sensor9.getState();
        sensor3.setState(sensorState10);
        java.lang.String str12 = sensor3.getStateName();
        java.lang.String str13 = sensor3.getStateName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ACTIVE" + "'", str12.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ACTIVE" + "'", str13.equals("ACTIVE"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        java.lang.String str7 = sensor3.toString();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor3.getUsageLogs();
        java.lang.String str9 = sensor3.getStateName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str7.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ACTIVE" + "'", str9.equals("ACTIVE"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        sensor3.flagError();
        java.util.UUID uUID9 = sensor3.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        java.util.UUID uUID9 = sensor3.getLinkedEquipmentId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = uUID9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        boolean boolean5 = sensor3.canSendData();
        java.lang.String str6 = sensor3.getStateName();
        java.util.UUID uUID7 = sensor3.getLinkedEquipmentId();
        sensor3.deactivate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ACTIVE" + "'", str6.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        sensor3.flagError();
        java.util.UUID uUID8 = sensor3.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry9 = null;
        sensor3.recordUsage(usageLogEntry9);
        boolean boolean11 = sensor3.canSendData();
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        sensor3.setSensorType(sensorType12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        java.lang.String str8 = sensor3.toString();
        java.util.UUID uUID9 = null;
        sensor3.setLinkedEquipmentId(uUID9);
        java.lang.String str11 = sensor3.getStateName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str8.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ACTIVE" + "'", str11.equals("ACTIVE"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.activate();
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        sensor3.setSensorType(sensorType9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState5 = null;
        sensor3.setState(sensorState5);
        java.util.UUID uUID7 = null;
        sensor3.setLinkedEquipmentId(uUID7);
        java.util.UUID uUID9 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID10 = sensor3.getLinkedEquipmentId();
        // The following exception was thrown during execution in test generation
        try {
            sensor3.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.SensorState.activate(com.reservation_system.Sensor.Sensor)\" because \"this.state\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        sensor3.flagError();
        java.util.UUID uUID8 = sensor3.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry9 = null;
        sensor3.recordUsage(usageLogEntry9);
        boolean boolean11 = sensor3.canSendData();
        sensor3.deactivate();
        java.lang.String str13 = sensor3.toString();
        java.lang.String str14 = sensor3.getStateName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=INACTIVE}" + "'", str13.equals("Sensor{id=null, type=null, equipment=null, state=INACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "INACTIVE" + "'", str14.equals("INACTIVE"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        sensor3.flagError();
        java.util.UUID uUID8 = sensor3.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry9 = null;
        sensor3.recordUsage(usageLogEntry9);
        java.util.UUID uUID11 = sensor3.getSensorId();
        java.util.UUID uUID12 = null;
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        java.util.UUID uUID14 = null;
        java.util.UUID uUID15 = null;
        com.reservation_system.Sensor.SensorType sensorType16 = null;
        java.util.UUID uUID17 = null;
        java.util.UUID uUID18 = null;
        com.reservation_system.Sensor.SensorType sensorType19 = null;
        java.util.UUID uUID20 = null;
        com.reservation_system.Sensor.Sensor sensor21 = new com.reservation_system.Sensor.Sensor(uUID18, sensorType19, uUID20);
        sensor21.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList23 = sensor21.getUsageLogs();
        sensor21.activate();
        com.reservation_system.Sensor.SensorState sensorState25 = sensor21.getState();
        com.reservation_system.Sensor.Sensor sensor26 = new com.reservation_system.Sensor.Sensor(uUID15, sensorType16, uUID17, sensorState25);
        com.reservation_system.Sensor.Sensor sensor27 = new com.reservation_system.Sensor.Sensor(uUID12, sensorType13, uUID14, sensorState25);
        java.lang.String str28 = sensor27.getStateName();
        java.lang.String str29 = sensor27.getStateName();
        com.reservation_system.Sensor.SensorType sensorType30 = sensor27.getSensorType();
        java.util.UUID uUID31 = null;
        com.reservation_system.Sensor.SensorType sensorType32 = null;
        java.util.UUID uUID33 = null;
        java.util.UUID uUID34 = null;
        com.reservation_system.Sensor.SensorType sensorType35 = null;
        java.util.UUID uUID36 = null;
        com.reservation_system.Sensor.Sensor sensor37 = new com.reservation_system.Sensor.Sensor(uUID34, sensorType35, uUID36);
        com.reservation_system.Sensor.SensorState sensorState38 = sensor37.getState();
        com.reservation_system.Sensor.Sensor sensor39 = new com.reservation_system.Sensor.Sensor(uUID31, sensorType32, uUID33, sensorState38);
        sensor27.setState(sensorState38);
        sensor3.setState(sensorState38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "ACTIVE" + "'", str28.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "ACTIVE" + "'", str29.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState38);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        java.lang.String str10 = sensor9.getStateName();
        com.reservation_system.Sensor.SensorState sensorState11 = sensor9.getState();
        com.reservation_system.Sensor.SensorState sensorState12 = sensor9.getState();
        sensor3.setState(sensorState12);
        boolean boolean14 = sensor3.canSendData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ACTIVE" + "'", str10.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        com.reservation_system.Sensor.SensorType sensorType9 = sensor3.getSensorType();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry10 = null;
        sensor3.recordUsage(usageLogEntry10);
        java.lang.String str12 = sensor3.toString();
        java.lang.String str13 = sensor3.toString();
        java.lang.String str14 = sensor3.getStateName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ERROR}" + "'", str12.equals("Sensor{id=null, type=null, equipment=null, state=ERROR}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ERROR}" + "'", str13.equals("Sensor{id=null, type=null, equipment=null, state=ERROR}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ERROR" + "'", str14.equals("ERROR"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        boolean boolean5 = sensor3.canSendData();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensor3.getUsageLogs();
        java.lang.String str7 = sensor3.getStateName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ACTIVE" + "'", str7.equals("ACTIVE"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        sensor9.activate();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor9.getState();
        com.reservation_system.Sensor.Sensor sensor14 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5, sensorState13);
        com.reservation_system.Sensor.Sensor sensor15 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState13);
        java.lang.String str16 = sensor15.getStateName();
        java.lang.String str17 = sensor15.getStateName();
        com.reservation_system.Sensor.SensorType sensorType18 = sensor15.getSensorType();
        java.util.UUID uUID19 = sensor15.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ACTIVE" + "'", str16.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ACTIVE" + "'", str17.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID19);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.Sensor sensor6 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5);
        sensor6.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor6.getUsageLogs();
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.Sensor sensor12 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11);
        sensor12.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensor12.getUsageLogs();
        sensor12.activate();
        com.reservation_system.Sensor.SensorState sensorState16 = sensor12.getState();
        sensor6.setState(sensorState16);
        com.reservation_system.Sensor.SensorState sensorState18 = sensor6.getState();
        com.reservation_system.Sensor.Sensor sensor19 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState18);
        sensor19.flagError();
        sensor19.flagError();
        com.reservation_system.Sensor.SensorState sensorState22 = null;
        sensor19.setState(sensorState22);
        java.util.UUID uUID24 = sensor19.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID24);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        boolean boolean5 = sensor3.canSendData();
        java.lang.String str6 = sensor3.getStateName();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry7 = null;
        sensor3.recordUsage(usageLogEntry7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ACTIVE" + "'", str6.equals("ACTIVE"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        java.util.UUID uUID9 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID10 = sensor3.getLinkedEquipmentId();
        sensor3.activate();
        java.lang.String str12 = sensor3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str12.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        com.reservation_system.Sensor.SensorType sensorType9 = sensor3.getSensorType();
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        sensor3.setSensorType(sensorType10);
        sensor3.activate();
        java.lang.String str13 = sensor3.getStateName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ACTIVE" + "'", str13.equals("ACTIVE"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        sensor9.activate();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor9.getState();
        com.reservation_system.Sensor.Sensor sensor14 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5, sensorState13);
        com.reservation_system.Sensor.SensorState sensorState15 = sensor14.getState();
        com.reservation_system.Sensor.Sensor sensor16 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState15);
        boolean boolean17 = sensor16.canSendData();
        com.reservation_system.Sensor.SensorType sensorType18 = sensor16.getSensorType();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList19 = sensor16.getUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList19);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        sensor9.activate();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor9.getState();
        sensor3.setState(sensorState13);
        com.reservation_system.Sensor.SensorState sensorState15 = sensor3.getState();
        sensor3.activate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState15);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensor3.getUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        sensor9.activate();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor9.getState();
        sensor3.setState(sensorState13);
        com.reservation_system.Sensor.SensorState sensorState15 = sensor3.getState();
        java.lang.Class<?> wildcardClass16 = sensor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        java.lang.String str7 = sensor3.toString();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor3.getUsageLogs();
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.Sensor sensor12 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11);
        sensor12.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensor12.getUsageLogs();
        java.util.UUID uUID15 = sensor12.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry16 = null;
        sensor12.recordUsage(usageLogEntry16);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList18 = sensor12.getUsageLogs();
        java.util.UUID uUID19 = sensor12.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState20 = sensor12.getState();
        sensor3.setState(sensorState20);
        java.util.UUID uUID22 = sensor3.getLinkedEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str7.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID22);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.Sensor sensor12 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11);
        sensor12.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensor12.getUsageLogs();
        sensor12.activate();
        com.reservation_system.Sensor.SensorState sensorState16 = sensor12.getState();
        com.reservation_system.Sensor.Sensor sensor17 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8, sensorState16);
        com.reservation_system.Sensor.SensorState sensorState18 = sensor17.getState();
        com.reservation_system.Sensor.Sensor sensor19 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5, sensorState18);
        com.reservation_system.Sensor.Sensor sensor20 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState18);
        sensor20.flagError();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList22 = sensor20.getUsageLogs();
        sensor20.deactivate();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry24 = null;
        sensor20.recordUsage(usageLogEntry24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList22);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        sensor3.flagError();
        java.util.UUID uUID8 = sensor3.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry9 = null;
        sensor3.recordUsage(usageLogEntry9);
        java.util.UUID uUID11 = sensor3.getSensorId();
        sensor3.deactivate();
        java.lang.String str13 = sensor3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=INACTIVE}" + "'", str13.equals("Sensor{id=null, type=null, equipment=null, state=INACTIVE}"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        java.lang.String str8 = sensor3.toString();
        java.util.UUID uUID9 = null;
        sensor3.setLinkedEquipmentId(uUID9);
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        sensor3.setSensorType(sensorType11);
        java.lang.String str13 = sensor3.toString();
        java.lang.Class<?> wildcardClass14 = sensor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str8.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str13.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        java.lang.String str7 = sensor3.toString();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor3.getUsageLogs();
        com.reservation_system.Sensor.SensorType sensorType9 = sensor3.getSensorType();
        boolean boolean10 = sensor3.canSendData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str7.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        boolean boolean5 = sensor3.canSendData();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry6 = null;
        sensor3.recordUsage(usageLogEntry6);
        java.util.UUID uUID8 = sensor3.getSensorId();
        java.lang.String str9 = sensor3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str9.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.lang.String str4 = sensor3.getStateName();
        com.reservation_system.Sensor.SensorState sensorState5 = sensor3.getState();
        com.reservation_system.Sensor.SensorState sensorState6 = sensor3.getState();
        boolean boolean7 = sensor3.canSendData();
        java.util.UUID uUID8 = sensor3.getLinkedEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ACTIVE" + "'", str4.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        com.reservation_system.Sensor.SensorState sensorState4 = sensor3.getState();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID6 = null;
        sensor3.setLinkedEquipmentId(uUID6);
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        java.util.UUID uUID10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        java.util.UUID uUID13 = null;
        com.reservation_system.Sensor.Sensor sensor14 = new com.reservation_system.Sensor.Sensor(uUID11, sensorType12, uUID13);
        sensor14.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList16 = sensor14.getUsageLogs();
        java.util.UUID uUID17 = null;
        com.reservation_system.Sensor.SensorType sensorType18 = null;
        java.util.UUID uUID19 = null;
        com.reservation_system.Sensor.Sensor sensor20 = new com.reservation_system.Sensor.Sensor(uUID17, sensorType18, uUID19);
        sensor20.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList22 = sensor20.getUsageLogs();
        sensor20.activate();
        com.reservation_system.Sensor.SensorState sensorState24 = sensor20.getState();
        sensor14.setState(sensorState24);
        com.reservation_system.Sensor.SensorState sensorState26 = sensor14.getState();
        com.reservation_system.Sensor.Sensor sensor27 = new com.reservation_system.Sensor.Sensor(uUID8, sensorType9, uUID10, sensorState26);
        sensor3.setState(sensorState26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState26);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        sensor3.flagError();
        java.util.UUID uUID8 = sensor3.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry9 = null;
        sensor3.recordUsage(usageLogEntry9);
        boolean boolean11 = sensor3.canSendData();
        sensor3.deactivate();
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        sensor3.setSensorType(sensorType13);
        java.lang.String str15 = sensor3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=INACTIVE}" + "'", str15.equals("Sensor{id=null, type=null, equipment=null, state=INACTIVE}"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList9 = sensor3.getUsageLogs();
        java.lang.Class<?> wildcardClass10 = sensor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        boolean boolean5 = sensor3.canSendData();
        java.lang.String str6 = sensor3.getStateName();
        sensor3.deactivate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ACTIVE" + "'", str6.equals("ACTIVE"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.Sensor sensor6 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5);
        sensor6.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor6.getUsageLogs();
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.Sensor sensor12 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11);
        sensor12.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensor12.getUsageLogs();
        sensor12.activate();
        com.reservation_system.Sensor.SensorState sensorState16 = sensor12.getState();
        sensor6.setState(sensorState16);
        com.reservation_system.Sensor.Sensor sensor18 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState16);
        com.reservation_system.Sensor.SensorType sensorType19 = null;
        sensor18.setSensorType(sensorType19);
        java.lang.String str21 = sensor18.getStateName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "ACTIVE" + "'", str21.equals("ACTIVE"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        sensor3.setSensorType(sensorType8);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList10 = sensor3.getUsageLogs();
        java.lang.Class<?> wildcardClass11 = usageLogEntryList10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        java.util.UUID uUID6 = sensor3.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry7 = null;
        sensor3.recordUsage(usageLogEntry7);
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        sensor3.setSensorType(sensorType9);
        java.lang.Class<?> wildcardClass11 = sensor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        sensor3.flagError();
        boolean boolean7 = sensor3.canSendData();
        java.lang.String str8 = sensor3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ERROR}" + "'", str8.equals("Sensor{id=null, type=null, equipment=null, state=ERROR}"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.Sensor sensor6 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5);
        sensor6.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor6.getUsageLogs();
        sensor6.activate();
        com.reservation_system.Sensor.SensorState sensorState10 = sensor6.getState();
        com.reservation_system.Sensor.Sensor sensor11 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState10);
        java.util.UUID uUID12 = sensor11.getLinkedEquipmentId();
        sensor11.flagError();
        sensor11.flagError();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        com.reservation_system.Sensor.SensorState sensorState4 = sensor3.getState();
        java.util.UUID uUID5 = sensor3.getSensorId();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        sensor9.activate();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor9.getState();
        sensor9.flagError();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList15 = sensor9.getUsageLogs();
        java.util.UUID uUID16 = null;
        com.reservation_system.Sensor.SensorType sensorType17 = null;
        java.util.UUID uUID18 = null;
        java.util.UUID uUID19 = null;
        com.reservation_system.Sensor.SensorType sensorType20 = null;
        java.util.UUID uUID21 = null;
        com.reservation_system.Sensor.Sensor sensor22 = new com.reservation_system.Sensor.Sensor(uUID19, sensorType20, uUID21);
        sensor22.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList24 = sensor22.getUsageLogs();
        java.util.UUID uUID25 = null;
        com.reservation_system.Sensor.SensorType sensorType26 = null;
        java.util.UUID uUID27 = null;
        com.reservation_system.Sensor.Sensor sensor28 = new com.reservation_system.Sensor.Sensor(uUID25, sensorType26, uUID27);
        sensor28.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList30 = sensor28.getUsageLogs();
        sensor28.activate();
        com.reservation_system.Sensor.SensorState sensorState32 = sensor28.getState();
        sensor22.setState(sensorState32);
        com.reservation_system.Sensor.SensorState sensorState34 = sensor22.getState();
        com.reservation_system.Sensor.Sensor sensor35 = new com.reservation_system.Sensor.Sensor(uUID16, sensorType17, uUID18, sensorState34);
        sensor9.setState(sensorState34);
        sensor3.setState(sensorState34);
        com.reservation_system.Sensor.SensorState sensorState38 = sensor3.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState38);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        java.lang.String str6 = sensor3.toString();
        java.util.UUID uUID7 = null;
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        java.util.UUID uUID9 = null;
        java.util.UUID uUID10 = null;
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        java.util.UUID uUID12 = null;
        java.util.UUID uUID13 = null;
        com.reservation_system.Sensor.SensorType sensorType14 = null;
        java.util.UUID uUID15 = null;
        java.util.UUID uUID16 = null;
        com.reservation_system.Sensor.SensorType sensorType17 = null;
        java.util.UUID uUID18 = null;
        com.reservation_system.Sensor.Sensor sensor19 = new com.reservation_system.Sensor.Sensor(uUID16, sensorType17, uUID18);
        sensor19.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList21 = sensor19.getUsageLogs();
        sensor19.activate();
        com.reservation_system.Sensor.SensorState sensorState23 = sensor19.getState();
        com.reservation_system.Sensor.Sensor sensor24 = new com.reservation_system.Sensor.Sensor(uUID13, sensorType14, uUID15, sensorState23);
        java.util.UUID uUID25 = sensor24.getLinkedEquipmentId();
        java.util.UUID uUID26 = null;
        com.reservation_system.Sensor.SensorType sensorType27 = null;
        java.util.UUID uUID28 = null;
        java.util.UUID uUID29 = null;
        com.reservation_system.Sensor.SensorType sensorType30 = null;
        java.util.UUID uUID31 = null;
        java.util.UUID uUID32 = null;
        com.reservation_system.Sensor.SensorType sensorType33 = null;
        java.util.UUID uUID34 = null;
        com.reservation_system.Sensor.Sensor sensor35 = new com.reservation_system.Sensor.Sensor(uUID32, sensorType33, uUID34);
        sensor35.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList37 = sensor35.getUsageLogs();
        sensor35.activate();
        com.reservation_system.Sensor.SensorState sensorState39 = sensor35.getState();
        com.reservation_system.Sensor.Sensor sensor40 = new com.reservation_system.Sensor.Sensor(uUID29, sensorType30, uUID31, sensorState39);
        com.reservation_system.Sensor.SensorState sensorState41 = sensor40.getState();
        com.reservation_system.Sensor.Sensor sensor42 = new com.reservation_system.Sensor.Sensor(uUID26, sensorType27, uUID28, sensorState41);
        sensor24.setState(sensorState41);
        com.reservation_system.Sensor.Sensor sensor44 = new com.reservation_system.Sensor.Sensor(uUID10, sensorType11, uUID12, sensorState41);
        com.reservation_system.Sensor.Sensor sensor45 = new com.reservation_system.Sensor.Sensor(uUID7, sensorType8, uUID9, sensorState41);
        sensor3.setState(sensorState41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str6.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState41);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.Sensor sensor6 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5);
        sensor6.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor6.getUsageLogs();
        sensor6.activate();
        com.reservation_system.Sensor.SensorState sensorState10 = sensor6.getState();
        com.reservation_system.Sensor.Sensor sensor11 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState10);
        java.util.UUID uUID12 = sensor11.getLinkedEquipmentId();
        sensor11.flagError();
        java.util.UUID uUID14 = sensor11.getSensorId();
        com.reservation_system.Sensor.SensorState sensorState15 = sensor11.getState();
        boolean boolean16 = sensor11.canSendData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        sensor3.flagError();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry9 = null;
        sensor3.recordUsage(usageLogEntry9);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor3.getUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        com.reservation_system.Sensor.SensorState sensorState10 = sensor9.getState();
        sensor3.setState(sensorState10);
        java.lang.String str12 = sensor3.getStateName();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor3.getState();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensor3.getUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ACTIVE" + "'", str12.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState5 = null;
        sensor3.setState(sensorState5);
        java.util.UUID uUID7 = null;
        sensor3.setLinkedEquipmentId(uUID7);
        java.util.UUID uUID9 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState10 = sensor3.getState();
        com.reservation_system.Sensor.SensorState sensorState11 = sensor3.getState();
        // The following exception was thrown during execution in test generation
        try {
            sensor3.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.SensorState.deactivate(com.reservation_system.Sensor.Sensor)\" because \"this.state\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorState11);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        sensor3.flagError();
        java.util.UUID uUID7 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID8 = sensor3.getLinkedEquipmentId();
        sensor3.flagError();
        boolean boolean10 = sensor3.canSendData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry5 = null;
        sensor3.recordUsage(usageLogEntry5);
        java.util.UUID uUID7 = sensor3.getSensorId();
        java.util.UUID uUID8 = null;
        sensor3.setLinkedEquipmentId(uUID8);
        java.util.UUID uUID10 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID11 = sensor3.getSensorId();
        java.lang.String str12 = sensor3.toString();
        java.util.UUID uUID13 = null;
        com.reservation_system.Sensor.SensorType sensorType14 = null;
        java.util.UUID uUID15 = null;
        com.reservation_system.Sensor.Sensor sensor16 = new com.reservation_system.Sensor.Sensor(uUID13, sensorType14, uUID15);
        java.util.UUID uUID17 = sensor16.getLinkedEquipmentId();
        boolean boolean18 = sensor16.canSendData();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry19 = null;
        sensor16.recordUsage(usageLogEntry19);
        java.util.UUID uUID21 = sensor16.getSensorId();
        com.reservation_system.Sensor.SensorType sensorType22 = null;
        sensor16.setSensorType(sensorType22);
        java.util.UUID uUID24 = null;
        com.reservation_system.Sensor.SensorType sensorType25 = null;
        java.util.UUID uUID26 = null;
        com.reservation_system.Sensor.Sensor sensor27 = new com.reservation_system.Sensor.Sensor(uUID24, sensorType25, uUID26);
        java.util.UUID uUID28 = sensor27.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState29 = null;
        sensor27.setState(sensorState29);
        java.util.UUID uUID31 = null;
        sensor27.setLinkedEquipmentId(uUID31);
        java.util.UUID uUID33 = sensor27.getLinkedEquipmentId();
        java.util.UUID uUID34 = sensor27.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorType sensorType35 = sensor27.getSensorType();
        java.util.UUID uUID36 = null;
        com.reservation_system.Sensor.SensorType sensorType37 = null;
        java.util.UUID uUID38 = null;
        com.reservation_system.Sensor.Sensor sensor39 = new com.reservation_system.Sensor.Sensor(uUID36, sensorType37, uUID38);
        java.util.UUID uUID40 = sensor39.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry41 = null;
        sensor39.recordUsage(usageLogEntry41);
        java.util.UUID uUID43 = sensor39.getSensorId();
        java.util.UUID uUID44 = null;
        sensor39.setLinkedEquipmentId(uUID44);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList46 = sensor39.getUsageLogs();
        java.util.UUID uUID47 = null;
        com.reservation_system.Sensor.SensorType sensorType48 = null;
        java.util.UUID uUID49 = null;
        com.reservation_system.Sensor.Sensor sensor50 = new com.reservation_system.Sensor.Sensor(uUID47, sensorType48, uUID49);
        sensor50.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList52 = sensor50.getUsageLogs();
        java.util.UUID uUID53 = sensor50.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry54 = null;
        sensor50.recordUsage(usageLogEntry54);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList56 = sensor50.getUsageLogs();
        java.util.UUID uUID57 = sensor50.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState58 = sensor50.getState();
        sensor39.setState(sensorState58);
        sensor27.setState(sensorState58);
        sensor16.setState(sensorState58);
        sensor3.setState(sensorState58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str12.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState58);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        sensor3.flagError();
        java.util.UUID uUID7 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID8 = sensor3.getLinkedEquipmentId();
        sensor3.flagError();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList10 = sensor3.getUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        java.lang.String str8 = sensor3.toString();
        java.util.UUID uUID9 = null;
        sensor3.setLinkedEquipmentId(uUID9);
        sensor3.flagError();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str8.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        java.lang.String str7 = sensor3.toString();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor3.getUsageLogs();
        java.lang.String str9 = sensor3.toString();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList10 = sensor3.getUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str7.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str9.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList10);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensor3.getUsageLogs();
        java.util.UUID uUID7 = null;
        sensor3.setLinkedEquipmentId(uUID7);
        sensor3.flagError();
        java.util.UUID uUID10 = sensor3.getLinkedEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.Sensor sensor6 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5);
        com.reservation_system.Sensor.SensorState sensorState7 = sensor6.getState();
        com.reservation_system.Sensor.Sensor sensor8 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState7);
        sensor8.flagError();
        java.lang.String str10 = sensor8.getStateName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ERROR" + "'", str10.equals("ERROR"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        sensor3.flagError();
        java.util.UUID uUID8 = sensor3.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry9 = null;
        sensor3.recordUsage(usageLogEntry9);
        boolean boolean11 = sensor3.canSendData();
        java.util.UUID uUID12 = sensor3.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID6 = sensor3.getSensorId();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        sensor3.setSensorType(sensorType8);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList10 = sensor3.getUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        sensor3.flagError();
        java.util.UUID uUID8 = sensor3.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry9 = null;
        sensor3.recordUsage(usageLogEntry9);
        java.util.UUID uUID11 = sensor3.getSensorId();
        boolean boolean12 = sensor3.canSendData();
        java.lang.String str13 = sensor3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ERROR}" + "'", str13.equals("Sensor{id=null, type=null, equipment=null, state=ERROR}"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        com.reservation_system.Sensor.SensorType sensorType9 = sensor3.getSensorType();
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        sensor3.setSensorType(sensorType10);
        java.util.UUID uUID12 = sensor3.getSensorId();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor3.getState();
        java.lang.String str14 = sensor3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ERROR}" + "'", str14.equals("Sensor{id=null, type=null, equipment=null, state=ERROR}"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        java.util.UUID uUID9 = sensor3.getSensorId();
        java.util.UUID uUID10 = sensor3.getLinkedEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        java.lang.String str8 = sensor3.toString();
        java.lang.String str9 = sensor3.toString();
        sensor3.activate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str8.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str9.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        sensor3.deactivate();
        java.util.UUID uUID10 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry11 = null;
        sensor3.recordUsage(usageLogEntry11);
        java.lang.String str13 = sensor3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=INACTIVE}" + "'", str13.equals("Sensor{id=null, type=null, equipment=null, state=INACTIVE}"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState5 = null;
        sensor3.setState(sensorState5);
        java.util.UUID uUID7 = null;
        sensor3.setLinkedEquipmentId(uUID7);
        java.util.UUID uUID9 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID10 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID11 = sensor3.getLinkedEquipmentId();
        // The following exception was thrown during execution in test generation
        try {
            sensor3.flagError();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.SensorState.flagError(com.reservation_system.Sensor.Sensor)\" because \"this.state\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry7 = null;
        sensor3.recordUsage(usageLogEntry7);
        sensor3.deactivate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        com.reservation_system.Sensor.SensorState sensorState4 = sensor3.getState();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID6 = null;
        sensor3.setLinkedEquipmentId(uUID6);
        sensor3.deactivate();
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.Sensor sensor12 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11);
        java.lang.String str13 = sensor12.getStateName();
        com.reservation_system.Sensor.SensorState sensorState14 = sensor12.getState();
        sensor3.setState(sensorState14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ACTIVE" + "'", str13.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState14);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        sensor3.flagError();
        java.util.UUID uUID8 = sensor3.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry9 = null;
        sensor3.recordUsage(usageLogEntry9);
        boolean boolean11 = sensor3.canSendData();
        java.lang.String str12 = sensor3.getStateName();
        java.util.UUID uUID13 = sensor3.getLinkedEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ERROR" + "'", str12.equals("ERROR"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        sensor3.flagError();
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        sensor3.setSensorType(sensorType6);
        com.reservation_system.Sensor.SensorState sensorState8 = sensor3.getState();
        java.util.UUID uUID9 = sensor3.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        boolean boolean5 = sensor3.canSendData();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry6 = null;
        sensor3.recordUsage(usageLogEntry6);
        java.util.UUID uUID8 = sensor3.getSensorId();
        com.reservation_system.Sensor.SensorState sensorState9 = sensor3.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState9);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        sensor3.flagError();
        boolean boolean7 = sensor3.canSendData();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry8 = null;
        sensor3.recordUsage(usageLogEntry8);
        java.util.UUID uUID10 = sensor3.getLinkedEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.Sensor sensor6 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5);
        sensor6.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor6.getUsageLogs();
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.Sensor sensor12 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11);
        sensor12.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensor12.getUsageLogs();
        sensor12.activate();
        com.reservation_system.Sensor.SensorState sensorState16 = sensor12.getState();
        sensor6.setState(sensorState16);
        com.reservation_system.Sensor.SensorState sensorState18 = sensor6.getState();
        com.reservation_system.Sensor.Sensor sensor19 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState18);
        sensor19.flagError();
        java.util.UUID uUID21 = sensor19.getLinkedEquipmentId();
        boolean boolean22 = sensor19.canSendData();
        java.util.UUID uUID23 = null;
        sensor19.setLinkedEquipmentId(uUID23);
        sensor19.activate();
        boolean boolean26 = sensor19.canSendData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.Sensor sensor6 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5);
        sensor6.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor6.getUsageLogs();
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.Sensor sensor12 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11);
        sensor12.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensor12.getUsageLogs();
        sensor12.activate();
        com.reservation_system.Sensor.SensorState sensorState16 = sensor12.getState();
        sensor6.setState(sensorState16);
        com.reservation_system.Sensor.SensorState sensorState18 = sensor6.getState();
        com.reservation_system.Sensor.Sensor sensor19 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState18);
        sensor19.flagError();
        java.util.UUID uUID21 = sensor19.getLinkedEquipmentId();
        boolean boolean22 = sensor19.canSendData();
        sensor19.activate();
        java.util.UUID uUID24 = null;
        sensor19.setLinkedEquipmentId(uUID24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        boolean boolean5 = sensor3.canSendData();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry6 = null;
        sensor3.recordUsage(usageLogEntry6);
        java.util.UUID uUID8 = sensor3.getSensorId();
        java.util.UUID uUID9 = null;
        sensor3.setLinkedEquipmentId(uUID9);
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        sensor3.setSensorType(sensorType11);
        sensor3.flagError();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        com.reservation_system.Sensor.SensorType sensorType6 = sensor3.getSensorType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        sensor3.flagError();
        boolean boolean7 = sensor3.canSendData();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry8 = null;
        sensor3.recordUsage(usageLogEntry8);
        sensor3.deactivate();
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        sensor3.setSensorType(sensorType11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.Sensor sensor12 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11);
        sensor12.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensor12.getUsageLogs();
        java.util.UUID uUID15 = null;
        com.reservation_system.Sensor.SensorType sensorType16 = null;
        java.util.UUID uUID17 = null;
        com.reservation_system.Sensor.Sensor sensor18 = new com.reservation_system.Sensor.Sensor(uUID15, sensorType16, uUID17);
        sensor18.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList20 = sensor18.getUsageLogs();
        sensor18.activate();
        com.reservation_system.Sensor.SensorState sensorState22 = sensor18.getState();
        sensor12.setState(sensorState22);
        com.reservation_system.Sensor.SensorState sensorState24 = sensor12.getState();
        com.reservation_system.Sensor.Sensor sensor25 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8, sensorState24);
        sensor3.setState(sensorState24);
        java.util.UUID uUID27 = null;
        sensor3.setLinkedEquipmentId(uUID27);
        com.reservation_system.Sensor.SensorType sensorType29 = sensor3.getSensorType();
        java.util.UUID uUID30 = sensor3.getLinkedEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID30);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        sensor3.flagError();
        boolean boolean7 = sensor3.canSendData();
        sensor3.deactivate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState5 = null;
        sensor3.setState(sensorState5);
        java.util.UUID uUID7 = null;
        sensor3.setLinkedEquipmentId(uUID7);
        java.util.UUID uUID9 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID10 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorType sensorType11 = sensor3.getSensorType();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry12 = null;
        sensor3.recordUsage(usageLogEntry12);
        java.util.UUID uUID14 = null;
        sensor3.setLinkedEquipmentId(uUID14);
        java.util.UUID uUID16 = null;
        sensor3.setLinkedEquipmentId(uUID16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType11);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        sensor9.activate();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor9.getState();
        com.reservation_system.Sensor.Sensor sensor14 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5, sensorState13);
        com.reservation_system.Sensor.Sensor sensor15 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState13);
        java.lang.String str16 = sensor15.getStateName();
        java.lang.String str17 = sensor15.getStateName();
        com.reservation_system.Sensor.SensorState sensorState18 = sensor15.getState();
        com.reservation_system.Sensor.SensorType sensorType19 = sensor15.getSensorType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ACTIVE" + "'", str16.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ACTIVE" + "'", str17.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType19);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry5 = null;
        sensor3.recordUsage(usageLogEntry5);
        java.util.UUID uUID7 = sensor3.getSensorId();
        java.lang.String str8 = sensor3.toString();
        java.util.UUID uUID9 = null;
        sensor3.setLinkedEquipmentId(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str8.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList9 = sensor3.getUsageLogs();
        com.reservation_system.Sensor.SensorType sensorType10 = sensor3.getSensorType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        com.reservation_system.Sensor.SensorType sensorType9 = sensor3.getSensorType();
        com.reservation_system.Sensor.SensorState sensorState10 = sensor3.getState();
        sensor3.deactivate();
        com.reservation_system.Sensor.SensorType sensorType12 = sensor3.getSensorType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType12);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        java.lang.String str8 = sensor3.toString();
        java.util.UUID uUID9 = null;
        sensor3.setLinkedEquipmentId(uUID9);
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        sensor3.setSensorType(sensorType11);
        java.lang.String str13 = sensor3.toString();
        java.util.UUID uUID14 = null;
        com.reservation_system.Sensor.SensorType sensorType15 = null;
        java.util.UUID uUID16 = null;
        java.util.UUID uUID17 = null;
        com.reservation_system.Sensor.SensorType sensorType18 = null;
        java.util.UUID uUID19 = null;
        java.util.UUID uUID20 = null;
        com.reservation_system.Sensor.SensorType sensorType21 = null;
        java.util.UUID uUID22 = null;
        com.reservation_system.Sensor.Sensor sensor23 = new com.reservation_system.Sensor.Sensor(uUID20, sensorType21, uUID22);
        sensor23.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList25 = sensor23.getUsageLogs();
        sensor23.activate();
        com.reservation_system.Sensor.SensorState sensorState27 = sensor23.getState();
        com.reservation_system.Sensor.Sensor sensor28 = new com.reservation_system.Sensor.Sensor(uUID17, sensorType18, uUID19, sensorState27);
        com.reservation_system.Sensor.SensorState sensorState29 = sensor28.getState();
        com.reservation_system.Sensor.Sensor sensor30 = new com.reservation_system.Sensor.Sensor(uUID14, sensorType15, uUID16, sensorState29);
        sensor3.setState(sensorState29);
        com.reservation_system.Sensor.SensorType sensorType32 = sensor3.getSensorType();
        com.reservation_system.Sensor.SensorType sensorType33 = null;
        sensor3.setSensorType(sensorType33);
        com.reservation_system.Sensor.SensorType sensorType35 = sensor3.getSensorType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str8.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str13.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType35);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        java.lang.String str7 = sensor3.toString();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor3.getUsageLogs();
        java.util.UUID uUID9 = sensor3.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str7.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        com.reservation_system.Sensor.SensorState sensorState4 = sensor3.getState();
        java.util.UUID uUID5 = sensor3.getSensorId();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        sensor9.activate();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor9.getState();
        sensor9.flagError();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList15 = sensor9.getUsageLogs();
        java.util.UUID uUID16 = null;
        com.reservation_system.Sensor.SensorType sensorType17 = null;
        java.util.UUID uUID18 = null;
        java.util.UUID uUID19 = null;
        com.reservation_system.Sensor.SensorType sensorType20 = null;
        java.util.UUID uUID21 = null;
        com.reservation_system.Sensor.Sensor sensor22 = new com.reservation_system.Sensor.Sensor(uUID19, sensorType20, uUID21);
        sensor22.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList24 = sensor22.getUsageLogs();
        java.util.UUID uUID25 = null;
        com.reservation_system.Sensor.SensorType sensorType26 = null;
        java.util.UUID uUID27 = null;
        com.reservation_system.Sensor.Sensor sensor28 = new com.reservation_system.Sensor.Sensor(uUID25, sensorType26, uUID27);
        sensor28.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList30 = sensor28.getUsageLogs();
        sensor28.activate();
        com.reservation_system.Sensor.SensorState sensorState32 = sensor28.getState();
        sensor22.setState(sensorState32);
        com.reservation_system.Sensor.SensorState sensorState34 = sensor22.getState();
        com.reservation_system.Sensor.Sensor sensor35 = new com.reservation_system.Sensor.Sensor(uUID16, sensorType17, uUID18, sensorState34);
        sensor9.setState(sensorState34);
        sensor3.setState(sensorState34);
        sensor3.flagError();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState34);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.Sensor sensor6 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5);
        sensor6.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor6.getUsageLogs();
        sensor6.activate();
        com.reservation_system.Sensor.SensorState sensorState10 = sensor6.getState();
        com.reservation_system.Sensor.Sensor sensor11 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState10);
        com.reservation_system.Sensor.SensorState sensorState12 = sensor11.getState();
        java.lang.String str13 = sensor11.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str13.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        sensor3.flagError();
        java.util.UUID uUID9 = sensor3.getLinkedEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        boolean boolean5 = sensor3.canSendData();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry6 = null;
        sensor3.recordUsage(usageLogEntry6);
        java.util.UUID uUID8 = sensor3.getSensorId();
        java.util.UUID uUID9 = null;
        sensor3.setLinkedEquipmentId(uUID9);
        sensor3.deactivate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.Sensor sensor6 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = sensor6.getLinkedEquipmentId();
        java.util.UUID uUID8 = sensor6.getLinkedEquipmentId();
        java.util.UUID uUID9 = sensor6.getSensorId();
        com.reservation_system.Sensor.SensorState sensorState10 = sensor6.getState();
        com.reservation_system.Sensor.Sensor sensor11 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState10);
        java.util.UUID uUID12 = null;
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        java.util.UUID uUID14 = null;
        com.reservation_system.Sensor.Sensor sensor15 = new com.reservation_system.Sensor.Sensor(uUID12, sensorType13, uUID14);
        sensor15.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList17 = sensor15.getUsageLogs();
        sensor15.activate();
        com.reservation_system.Sensor.SensorState sensorState19 = sensor15.getState();
        sensor11.setState(sensorState19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState19);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList9 = sensor3.getUsageLogs();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry10 = null;
        sensor3.recordUsage(usageLogEntry10);
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        sensor3.setSensorType(sensorType12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList9);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.Sensor sensor12 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11);
        sensor12.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensor12.getUsageLogs();
        sensor12.activate();
        com.reservation_system.Sensor.SensorState sensorState16 = sensor12.getState();
        com.reservation_system.Sensor.Sensor sensor17 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8, sensorState16);
        com.reservation_system.Sensor.SensorState sensorState18 = sensor17.getState();
        com.reservation_system.Sensor.Sensor sensor19 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5, sensorState18);
        com.reservation_system.Sensor.Sensor sensor20 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState18);
        sensor20.flagError();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList22 = sensor20.getUsageLogs();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry23 = null;
        sensor20.recordUsage(usageLogEntry23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList22);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState5 = null;
        sensor3.setState(sensorState5);
        java.util.UUID uUID7 = null;
        sensor3.setLinkedEquipmentId(uUID7);
        java.util.UUID uUID9 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState10 = sensor3.getState();
        java.util.UUID uUID11 = null;
        sensor3.setLinkedEquipmentId(uUID11);
        // The following exception was thrown during execution in test generation
        try {
            sensor3.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.SensorState.deactivate(com.reservation_system.Sensor.Sensor)\" because \"this.state\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorState10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        java.util.UUID uUID9 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID10 = sensor3.getLinkedEquipmentId();
        sensor3.activate();
        java.lang.Class<?> wildcardClass12 = sensor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        sensor9.activate();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor9.getState();
        sensor3.setState(sensorState13);
        com.reservation_system.Sensor.SensorState sensorState15 = sensor3.getState();
        sensor3.deactivate();
        sensor3.activate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState15);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry5 = null;
        sensor3.recordUsage(usageLogEntry5);
        java.util.UUID uUID7 = sensor3.getSensorId();
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        java.util.UUID uUID10 = null;
        com.reservation_system.Sensor.Sensor sensor11 = new com.reservation_system.Sensor.Sensor(uUID8, sensorType9, uUID10);
        sensor11.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList13 = sensor11.getUsageLogs();
        java.util.UUID uUID14 = null;
        com.reservation_system.Sensor.SensorType sensorType15 = null;
        java.util.UUID uUID16 = null;
        com.reservation_system.Sensor.Sensor sensor17 = new com.reservation_system.Sensor.Sensor(uUID14, sensorType15, uUID16);
        sensor17.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList19 = sensor17.getUsageLogs();
        sensor17.activate();
        com.reservation_system.Sensor.SensorState sensorState21 = sensor17.getState();
        sensor11.setState(sensorState21);
        com.reservation_system.Sensor.SensorState sensorState23 = sensor11.getState();
        sensor3.setState(sensorState23);
        java.util.UUID uUID25 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID26 = null;
        com.reservation_system.Sensor.SensorType sensorType27 = null;
        java.util.UUID uUID28 = null;
        com.reservation_system.Sensor.Sensor sensor29 = new com.reservation_system.Sensor.Sensor(uUID26, sensorType27, uUID28);
        sensor29.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList31 = sensor29.getUsageLogs();
        sensor29.activate();
        com.reservation_system.Sensor.SensorState sensorState33 = sensor29.getState();
        sensor3.setState(sensorState33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState33);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        sensor3.flagError();
        java.util.UUID uUID7 = sensor3.getLinkedEquipmentId();
        boolean boolean8 = sensor3.canSendData();
        sensor3.activate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        sensor3.flagError();
        java.util.UUID uUID8 = sensor3.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry9 = null;
        sensor3.recordUsage(usageLogEntry9);
        boolean boolean11 = sensor3.canSendData();
        sensor3.deactivate();
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        sensor3.setSensorType(sensorType13);
        sensor3.activate();
        sensor3.deactivate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        java.util.UUID uUID6 = sensor3.getSensorId();
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        sensor3.setSensorType(sensorType7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        java.lang.String str7 = sensor3.toString();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor3.getUsageLogs();
        com.reservation_system.Sensor.SensorType sensorType9 = sensor3.getSensorType();
        java.lang.String str10 = sensor3.getStateName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str7.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ACTIVE" + "'", str10.equals("ACTIVE"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState6 = sensor3.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState6);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        sensor3.flagError();
        sensor3.deactivate();
        java.util.UUID uUID9 = sensor3.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        boolean boolean5 = sensor3.canSendData();
        java.lang.String str6 = sensor3.getStateName();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        java.util.UUID uUID10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        java.util.UUID uUID13 = null;
        com.reservation_system.Sensor.Sensor sensor14 = new com.reservation_system.Sensor.Sensor(uUID11, sensorType12, uUID13);
        com.reservation_system.Sensor.SensorState sensorState15 = sensor14.getState();
        java.util.UUID uUID16 = sensor14.getSensorId();
        java.util.UUID uUID17 = null;
        com.reservation_system.Sensor.SensorType sensorType18 = null;
        java.util.UUID uUID19 = null;
        com.reservation_system.Sensor.Sensor sensor20 = new com.reservation_system.Sensor.Sensor(uUID17, sensorType18, uUID19);
        sensor20.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList22 = sensor20.getUsageLogs();
        sensor20.activate();
        com.reservation_system.Sensor.SensorState sensorState24 = sensor20.getState();
        sensor20.flagError();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList26 = sensor20.getUsageLogs();
        java.util.UUID uUID27 = null;
        com.reservation_system.Sensor.SensorType sensorType28 = null;
        java.util.UUID uUID29 = null;
        java.util.UUID uUID30 = null;
        com.reservation_system.Sensor.SensorType sensorType31 = null;
        java.util.UUID uUID32 = null;
        com.reservation_system.Sensor.Sensor sensor33 = new com.reservation_system.Sensor.Sensor(uUID30, sensorType31, uUID32);
        sensor33.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList35 = sensor33.getUsageLogs();
        java.util.UUID uUID36 = null;
        com.reservation_system.Sensor.SensorType sensorType37 = null;
        java.util.UUID uUID38 = null;
        com.reservation_system.Sensor.Sensor sensor39 = new com.reservation_system.Sensor.Sensor(uUID36, sensorType37, uUID38);
        sensor39.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList41 = sensor39.getUsageLogs();
        sensor39.activate();
        com.reservation_system.Sensor.SensorState sensorState43 = sensor39.getState();
        sensor33.setState(sensorState43);
        com.reservation_system.Sensor.SensorState sensorState45 = sensor33.getState();
        com.reservation_system.Sensor.Sensor sensor46 = new com.reservation_system.Sensor.Sensor(uUID27, sensorType28, uUID29, sensorState45);
        sensor20.setState(sensorState45);
        sensor14.setState(sensorState45);
        com.reservation_system.Sensor.Sensor sensor49 = new com.reservation_system.Sensor.Sensor(uUID8, sensorType9, uUID10, sensorState45);
        sensor3.setState(sensorState45);
        java.util.UUID uUID51 = null;
        sensor3.setLinkedEquipmentId(uUID51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ACTIVE" + "'", str6.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState45);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry5 = null;
        sensor3.recordUsage(usageLogEntry5);
        java.util.UUID uUID7 = sensor3.getSensorId();
        java.util.UUID uUID8 = null;
        sensor3.setLinkedEquipmentId(uUID8);
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        sensor3.setSensorType(sensorType10);
        com.reservation_system.Sensor.SensorState sensorState12 = sensor3.getState();
        java.util.UUID uUID13 = null;
        sensor3.setLinkedEquipmentId(uUID13);
        boolean boolean15 = sensor3.canSendData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        sensor3.flagError();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        sensor3.setSensorType(sensorType8);
        java.util.UUID uUID10 = null;
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        java.util.UUID uUID12 = null;
        com.reservation_system.Sensor.Sensor sensor13 = new com.reservation_system.Sensor.Sensor(uUID10, sensorType11, uUID12);
        sensor13.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList15 = sensor13.getUsageLogs();
        sensor13.activate();
        com.reservation_system.Sensor.SensorState sensorState17 = sensor13.getState();
        sensor3.setState(sensorState17);
        com.reservation_system.Sensor.SensorType sensorType19 = sensor3.getSensorType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType19);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        sensor3.setSensorType(sensorType8);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList10 = sensor3.getUsageLogs();
        java.lang.String str11 = sensor3.getStateName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ACTIVE" + "'", str11.equals("ACTIVE"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry5 = null;
        sensor3.recordUsage(usageLogEntry5);
        java.util.UUID uUID7 = sensor3.getSensorId();
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        java.util.UUID uUID10 = null;
        com.reservation_system.Sensor.Sensor sensor11 = new com.reservation_system.Sensor.Sensor(uUID8, sensorType9, uUID10);
        sensor11.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList13 = sensor11.getUsageLogs();
        java.util.UUID uUID14 = null;
        com.reservation_system.Sensor.SensorType sensorType15 = null;
        java.util.UUID uUID16 = null;
        com.reservation_system.Sensor.Sensor sensor17 = new com.reservation_system.Sensor.Sensor(uUID14, sensorType15, uUID16);
        sensor17.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList19 = sensor17.getUsageLogs();
        sensor17.activate();
        com.reservation_system.Sensor.SensorState sensorState21 = sensor17.getState();
        sensor11.setState(sensorState21);
        com.reservation_system.Sensor.SensorState sensorState23 = sensor11.getState();
        sensor3.setState(sensorState23);
        java.util.UUID uUID25 = sensor3.getLinkedEquipmentId();
        sensor3.flagError();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID25);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        com.reservation_system.Sensor.SensorState sensorState4 = sensor3.getState();
        java.lang.String str5 = sensor3.toString();
        sensor3.deactivate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str5.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        boolean boolean5 = sensor3.canSendData();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry6 = null;
        sensor3.recordUsage(usageLogEntry6);
        java.util.UUID uUID8 = sensor3.getSensorId();
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        sensor3.setSensorType(sensorType9);
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        java.util.UUID uUID13 = null;
        com.reservation_system.Sensor.Sensor sensor14 = new com.reservation_system.Sensor.Sensor(uUID11, sensorType12, uUID13);
        java.util.UUID uUID15 = sensor14.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState16 = null;
        sensor14.setState(sensorState16);
        java.util.UUID uUID18 = null;
        sensor14.setLinkedEquipmentId(uUID18);
        java.util.UUID uUID20 = sensor14.getLinkedEquipmentId();
        java.util.UUID uUID21 = sensor14.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorType sensorType22 = sensor14.getSensorType();
        java.util.UUID uUID23 = null;
        com.reservation_system.Sensor.SensorType sensorType24 = null;
        java.util.UUID uUID25 = null;
        com.reservation_system.Sensor.Sensor sensor26 = new com.reservation_system.Sensor.Sensor(uUID23, sensorType24, uUID25);
        java.util.UUID uUID27 = sensor26.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry28 = null;
        sensor26.recordUsage(usageLogEntry28);
        java.util.UUID uUID30 = sensor26.getSensorId();
        java.util.UUID uUID31 = null;
        sensor26.setLinkedEquipmentId(uUID31);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList33 = sensor26.getUsageLogs();
        java.util.UUID uUID34 = null;
        com.reservation_system.Sensor.SensorType sensorType35 = null;
        java.util.UUID uUID36 = null;
        com.reservation_system.Sensor.Sensor sensor37 = new com.reservation_system.Sensor.Sensor(uUID34, sensorType35, uUID36);
        sensor37.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList39 = sensor37.getUsageLogs();
        java.util.UUID uUID40 = sensor37.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry41 = null;
        sensor37.recordUsage(usageLogEntry41);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList43 = sensor37.getUsageLogs();
        java.util.UUID uUID44 = sensor37.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState45 = sensor37.getState();
        sensor26.setState(sensorState45);
        sensor14.setState(sensorState45);
        sensor3.setState(sensorState45);
        java.lang.Class<?> wildcardClass49 = sensor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.lang.String str4 = sensor3.getStateName();
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.SensorType sensorType6 = null;
        java.util.UUID uUID7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        java.util.UUID uUID10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        java.util.UUID uUID13 = null;
        com.reservation_system.Sensor.Sensor sensor14 = new com.reservation_system.Sensor.Sensor(uUID11, sensorType12, uUID13);
        sensor14.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList16 = sensor14.getUsageLogs();
        sensor14.activate();
        com.reservation_system.Sensor.SensorState sensorState18 = sensor14.getState();
        com.reservation_system.Sensor.Sensor sensor19 = new com.reservation_system.Sensor.Sensor(uUID8, sensorType9, uUID10, sensorState18);
        com.reservation_system.Sensor.SensorState sensorState20 = sensor19.getState();
        com.reservation_system.Sensor.Sensor sensor21 = new com.reservation_system.Sensor.Sensor(uUID5, sensorType6, uUID7, sensorState20);
        sensor3.setState(sensorState20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ACTIVE" + "'", str4.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState20);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        com.reservation_system.Sensor.SensorState sensorState4 = sensor3.getState();
        java.util.UUID uUID5 = sensor3.getSensorId();
        java.lang.String str6 = sensor3.getStateName();
        java.util.UUID uUID7 = sensor3.getSensorId();
        java.lang.String str8 = sensor3.getStateName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ACTIVE" + "'", str6.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ACTIVE" + "'", str8.equals("ACTIVE"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        sensor3.flagError();
        java.util.UUID uUID8 = sensor3.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry9 = null;
        sensor3.recordUsage(usageLogEntry9);
        boolean boolean11 = sensor3.canSendData();
        java.lang.String str12 = sensor3.getStateName();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry13 = null;
        sensor3.recordUsage(usageLogEntry13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ERROR" + "'", str12.equals("ERROR"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        com.reservation_system.Sensor.SensorState sensorState4 = sensor3.getState();
        java.util.UUID uUID5 = sensor3.getSensorId();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensor3.getUsageLogs();
        java.lang.String str7 = sensor3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str7.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        java.util.UUID uUID12 = null;
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        java.util.UUID uUID14 = null;
        com.reservation_system.Sensor.Sensor sensor15 = new com.reservation_system.Sensor.Sensor(uUID12, sensorType13, uUID14);
        sensor15.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList17 = sensor15.getUsageLogs();
        sensor15.activate();
        com.reservation_system.Sensor.SensorState sensorState19 = sensor15.getState();
        sensor9.setState(sensorState19);
        com.reservation_system.Sensor.SensorState sensorState21 = sensor9.getState();
        com.reservation_system.Sensor.Sensor sensor22 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5, sensorState21);
        com.reservation_system.Sensor.Sensor sensor23 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState21);
        java.util.UUID uUID24 = sensor23.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID24);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        sensor3.flagError();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor3.getUsageLogs();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry9 = null;
        sensor3.recordUsage(usageLogEntry9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        sensor9.activate();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor9.getState();
        com.reservation_system.Sensor.Sensor sensor14 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5, sensorState13);
        com.reservation_system.Sensor.SensorState sensorState15 = sensor14.getState();
        com.reservation_system.Sensor.Sensor sensor16 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState15);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList17 = sensor16.getUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList17);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        boolean boolean5 = sensor3.canSendData();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry6 = null;
        sensor3.recordUsage(usageLogEntry6);
        java.util.UUID uUID8 = sensor3.getSensorId();
        sensor3.flagError();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.Sensor sensor6 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5);
        sensor6.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor6.getUsageLogs();
        sensor6.activate();
        com.reservation_system.Sensor.SensorState sensorState10 = sensor6.getState();
        com.reservation_system.Sensor.Sensor sensor11 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState10);
        java.util.UUID uUID12 = sensor11.getLinkedEquipmentId();
        java.util.UUID uUID13 = sensor11.getLinkedEquipmentId();
        sensor11.deactivate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        com.reservation_system.Sensor.SensorType sensorType9 = sensor3.getSensorType();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry10 = null;
        sensor3.recordUsage(usageLogEntry10);
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        sensor3.setSensorType(sensorType12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType9);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.Sensor sensor6 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5);
        java.util.UUID uUID7 = sensor6.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry8 = null;
        sensor6.recordUsage(usageLogEntry8);
        java.util.UUID uUID10 = sensor6.getSensorId();
        java.util.UUID uUID11 = null;
        sensor6.setLinkedEquipmentId(uUID11);
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        sensor6.setSensorType(sensorType13);
        com.reservation_system.Sensor.SensorState sensorState15 = sensor6.getState();
        com.reservation_system.Sensor.Sensor sensor16 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState15);
        java.lang.String str17 = sensor16.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str17.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        java.util.UUID uUID6 = sensor3.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry7 = null;
        sensor3.recordUsage(usageLogEntry7);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList9 = sensor3.getUsageLogs();
        java.util.UUID uUID10 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState11 = sensor3.getState();
        java.lang.String str12 = sensor3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str12.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        boolean boolean5 = sensor3.canSendData();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry6 = null;
        sensor3.recordUsage(usageLogEntry6);
        java.util.UUID uUID8 = sensor3.getSensorId();
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        sensor3.setSensorType(sensorType9);
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        java.util.UUID uUID13 = null;
        com.reservation_system.Sensor.Sensor sensor14 = new com.reservation_system.Sensor.Sensor(uUID11, sensorType12, uUID13);
        java.util.UUID uUID15 = sensor14.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState16 = null;
        sensor14.setState(sensorState16);
        java.util.UUID uUID18 = null;
        sensor14.setLinkedEquipmentId(uUID18);
        java.util.UUID uUID20 = sensor14.getLinkedEquipmentId();
        java.util.UUID uUID21 = sensor14.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorType sensorType22 = sensor14.getSensorType();
        java.util.UUID uUID23 = null;
        com.reservation_system.Sensor.SensorType sensorType24 = null;
        java.util.UUID uUID25 = null;
        com.reservation_system.Sensor.Sensor sensor26 = new com.reservation_system.Sensor.Sensor(uUID23, sensorType24, uUID25);
        java.util.UUID uUID27 = sensor26.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry28 = null;
        sensor26.recordUsage(usageLogEntry28);
        java.util.UUID uUID30 = sensor26.getSensorId();
        java.util.UUID uUID31 = null;
        sensor26.setLinkedEquipmentId(uUID31);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList33 = sensor26.getUsageLogs();
        java.util.UUID uUID34 = null;
        com.reservation_system.Sensor.SensorType sensorType35 = null;
        java.util.UUID uUID36 = null;
        com.reservation_system.Sensor.Sensor sensor37 = new com.reservation_system.Sensor.Sensor(uUID34, sensorType35, uUID36);
        sensor37.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList39 = sensor37.getUsageLogs();
        java.util.UUID uUID40 = sensor37.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry41 = null;
        sensor37.recordUsage(usageLogEntry41);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList43 = sensor37.getUsageLogs();
        java.util.UUID uUID44 = sensor37.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState45 = sensor37.getState();
        sensor26.setState(sensorState45);
        sensor14.setState(sensorState45);
        sensor3.setState(sensorState45);
        java.util.UUID uUID49 = null;
        sensor3.setLinkedEquipmentId(uUID49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState45);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        sensor9.activate();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor9.getState();
        sensor3.setState(sensorState13);
        com.reservation_system.Sensor.SensorState sensorState15 = sensor3.getState();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry16 = null;
        sensor3.recordUsage(usageLogEntry16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState15);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.Sensor sensor6 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5);
        sensor6.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor6.getUsageLogs();
        sensor6.activate();
        com.reservation_system.Sensor.SensorState sensorState10 = sensor6.getState();
        com.reservation_system.Sensor.Sensor sensor11 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState10);
        java.util.UUID uUID12 = sensor11.getLinkedEquipmentId();
        java.util.UUID uUID13 = null;
        com.reservation_system.Sensor.SensorType sensorType14 = null;
        java.util.UUID uUID15 = null;
        java.util.UUID uUID16 = null;
        com.reservation_system.Sensor.SensorType sensorType17 = null;
        java.util.UUID uUID18 = null;
        java.util.UUID uUID19 = null;
        com.reservation_system.Sensor.SensorType sensorType20 = null;
        java.util.UUID uUID21 = null;
        com.reservation_system.Sensor.Sensor sensor22 = new com.reservation_system.Sensor.Sensor(uUID19, sensorType20, uUID21);
        sensor22.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList24 = sensor22.getUsageLogs();
        sensor22.activate();
        com.reservation_system.Sensor.SensorState sensorState26 = sensor22.getState();
        com.reservation_system.Sensor.Sensor sensor27 = new com.reservation_system.Sensor.Sensor(uUID16, sensorType17, uUID18, sensorState26);
        com.reservation_system.Sensor.SensorState sensorState28 = sensor27.getState();
        com.reservation_system.Sensor.Sensor sensor29 = new com.reservation_system.Sensor.Sensor(uUID13, sensorType14, uUID15, sensorState28);
        sensor11.setState(sensorState28);
        com.reservation_system.Sensor.SensorType sensorType31 = null;
        sensor11.setSensorType(sensorType31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState28);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.Sensor sensor6 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5);
        sensor6.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor6.getUsageLogs();
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.Sensor sensor12 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11);
        sensor12.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensor12.getUsageLogs();
        sensor12.activate();
        com.reservation_system.Sensor.SensorState sensorState16 = sensor12.getState();
        sensor6.setState(sensorState16);
        com.reservation_system.Sensor.SensorState sensorState18 = sensor6.getState();
        com.reservation_system.Sensor.Sensor sensor19 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState18);
        sensor19.flagError();
        sensor19.flagError();
        java.util.UUID uUID22 = null;
        sensor19.setLinkedEquipmentId(uUID22);
        sensor19.flagError();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState18);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = null;
        sensor3.setLinkedEquipmentId(uUID4);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        com.reservation_system.Sensor.SensorState sensorState4 = sensor3.getState();
        java.lang.String str5 = sensor3.toString();
        sensor3.flagError();
        sensor3.deactivate();
        java.util.UUID uUID8 = null;
        sensor3.setLinkedEquipmentId(uUID8);
        com.reservation_system.Sensor.SensorType sensorType10 = sensor3.getSensorType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str5.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType10);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        sensor3.flagError();
        java.util.UUID uUID8 = sensor3.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry9 = null;
        sensor3.recordUsage(usageLogEntry9);
        java.util.UUID uUID11 = sensor3.getSensorId();
        java.util.UUID uUID12 = null;
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        java.util.UUID uUID14 = null;
        com.reservation_system.Sensor.Sensor sensor15 = new com.reservation_system.Sensor.Sensor(uUID12, sensorType13, uUID14);
        sensor15.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList17 = sensor15.getUsageLogs();
        sensor15.activate();
        com.reservation_system.Sensor.SensorState sensorState19 = sensor15.getState();
        sensor3.setState(sensorState19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState19);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        sensor3.flagError();
        java.lang.String str6 = sensor3.getStateName();
        boolean boolean7 = sensor3.canSendData();
        java.util.UUID uUID8 = null;
        sensor3.setLinkedEquipmentId(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ERROR" + "'", str6.equals("ERROR"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        java.lang.String str7 = sensor3.toString();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor3.getUsageLogs();
        com.reservation_system.Sensor.SensorType sensorType9 = sensor3.getSensorType();
        com.reservation_system.Sensor.SensorState sensorState10 = sensor3.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str7.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState10);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        boolean boolean5 = sensor3.canSendData();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensor3.getUsageLogs();
        sensor3.activate();
        java.lang.String str8 = sensor3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str8.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        sensor3.flagError();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        sensor3.setSensorType(sensorType8);
        java.util.UUID uUID10 = sensor3.getSensorId();
        java.util.UUID uUID11 = null;
        sensor3.setLinkedEquipmentId(uUID11);
        java.util.UUID uUID13 = null;
        com.reservation_system.Sensor.SensorType sensorType14 = null;
        java.util.UUID uUID15 = null;
        com.reservation_system.Sensor.Sensor sensor16 = new com.reservation_system.Sensor.Sensor(uUID13, sensorType14, uUID15);
        sensor16.activate();
        java.util.UUID uUID18 = sensor16.getLinkedEquipmentId();
        java.util.UUID uUID19 = null;
        com.reservation_system.Sensor.SensorType sensorType20 = null;
        java.util.UUID uUID21 = null;
        com.reservation_system.Sensor.Sensor sensor22 = new com.reservation_system.Sensor.Sensor(uUID19, sensorType20, uUID21);
        com.reservation_system.Sensor.SensorState sensorState23 = sensor22.getState();
        sensor16.setState(sensorState23);
        sensor3.setState(sensorState23);
        com.reservation_system.Sensor.SensorType sensorType26 = null;
        sensor3.setSensorType(sensorType26);
        java.util.UUID uUID28 = sensor3.getLinkedEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID28);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        java.lang.String str10 = sensor9.getStateName();
        com.reservation_system.Sensor.SensorState sensorState11 = sensor9.getState();
        com.reservation_system.Sensor.SensorState sensorState12 = sensor9.getState();
        sensor3.setState(sensorState12);
        sensor3.activate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ACTIVE" + "'", str10.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState12);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensor3.getUsageLogs();
        java.util.UUID uUID7 = null;
        sensor3.setLinkedEquipmentId(uUID7);
        java.util.UUID uUID9 = sensor3.getLinkedEquipmentId();
        sensor3.deactivate();
        sensor3.activate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        com.reservation_system.Sensor.SensorState sensorState4 = sensor3.getState();
        java.util.UUID uUID5 = sensor3.getSensorId();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensor3.getUsageLogs();
        boolean boolean7 = sensor3.canSendData();
        com.reservation_system.Sensor.SensorState sensorState8 = sensor3.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.Sensor sensor6 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5);
        com.reservation_system.Sensor.SensorState sensorState7 = sensor6.getState();
        com.reservation_system.Sensor.Sensor sensor8 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState7);
        com.reservation_system.Sensor.SensorState sensorState9 = sensor8.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState9);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.Sensor sensor12 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11);
        sensor12.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensor12.getUsageLogs();
        sensor12.activate();
        com.reservation_system.Sensor.SensorState sensorState16 = sensor12.getState();
        com.reservation_system.Sensor.Sensor sensor17 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8, sensorState16);
        com.reservation_system.Sensor.SensorState sensorState18 = sensor17.getState();
        com.reservation_system.Sensor.Sensor sensor19 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5, sensorState18);
        com.reservation_system.Sensor.Sensor sensor20 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState18);
        boolean boolean21 = sensor20.canSendData();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList22 = sensor20.getUsageLogs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList22);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.Sensor sensor6 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5);
        sensor6.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor6.getUsageLogs();
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.Sensor sensor12 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11);
        sensor12.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensor12.getUsageLogs();
        sensor12.activate();
        com.reservation_system.Sensor.SensorState sensorState16 = sensor12.getState();
        sensor6.setState(sensorState16);
        com.reservation_system.Sensor.SensorState sensorState18 = sensor6.getState();
        com.reservation_system.Sensor.Sensor sensor19 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState18);
        sensor19.flagError();
        java.util.UUID uUID21 = sensor19.getLinkedEquipmentId();
        sensor19.activate();
        com.reservation_system.Sensor.SensorType sensorType23 = null;
        sensor19.setSensorType(sensorType23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID21);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.Sensor sensor6 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5);
        sensor6.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor6.getUsageLogs();
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.Sensor sensor12 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11);
        sensor12.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensor12.getUsageLogs();
        sensor12.activate();
        com.reservation_system.Sensor.SensorState sensorState16 = sensor12.getState();
        sensor6.setState(sensorState16);
        com.reservation_system.Sensor.SensorState sensorState18 = sensor6.getState();
        com.reservation_system.Sensor.Sensor sensor19 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState18);
        sensor19.flagError();
        java.util.UUID uUID21 = sensor19.getLinkedEquipmentId();
        java.util.UUID uUID22 = sensor19.getLinkedEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID22);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        com.reservation_system.Sensor.SensorState sensorState4 = sensor3.getState();
        java.util.UUID uUID5 = sensor3.getSensorId();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensor3.getUsageLogs();
        boolean boolean7 = sensor3.canSendData();
        com.reservation_system.Sensor.SensorState sensorState8 = null;
        sensor3.setState(sensorState8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        com.reservation_system.Sensor.SensorState sensorState10 = sensor9.getState();
        sensor3.setState(sensorState10);
        java.lang.String str12 = sensor3.getStateName();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor3.getState();
        java.util.UUID uUID14 = sensor3.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ACTIVE" + "'", str12.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID14);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        sensor9.activate();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor9.getState();
        sensor9.flagError();
        com.reservation_system.Sensor.SensorType sensorType15 = sensor9.getSensorType();
        com.reservation_system.Sensor.SensorState sensorState16 = sensor9.getState();
        com.reservation_system.Sensor.Sensor sensor17 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5, sensorState16);
        com.reservation_system.Sensor.Sensor sensor18 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState16);
        sensor18.deactivate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState16);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensor3.getUsageLogs();
        sensor3.flagError();
        com.reservation_system.Sensor.SensorType sensorType8 = sensor3.getSensorType();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry9 = null;
        sensor3.recordUsage(usageLogEntry9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType8);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.Sensor sensor12 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11);
        sensor12.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensor12.getUsageLogs();
        sensor12.activate();
        com.reservation_system.Sensor.SensorState sensorState16 = sensor12.getState();
        com.reservation_system.Sensor.Sensor sensor17 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8, sensorState16);
        com.reservation_system.Sensor.SensorState sensorState18 = sensor17.getState();
        com.reservation_system.Sensor.Sensor sensor19 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5, sensorState18);
        com.reservation_system.Sensor.Sensor sensor20 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState18);
        com.reservation_system.Sensor.SensorState sensorState21 = sensor20.getState();
        java.lang.String str22 = sensor20.toString();
        java.util.UUID uUID23 = sensor20.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str22.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID23);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry5 = null;
        sensor3.recordUsage(usageLogEntry5);
        java.util.UUID uUID7 = sensor3.getSensorId();
        java.lang.String str8 = sensor3.toString();
        com.reservation_system.Sensor.SensorState sensorState9 = sensor3.getState();
        sensor3.deactivate();
        boolean boolean11 = sensor3.canSendData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str8.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        boolean boolean5 = sensor3.canSendData();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry6 = null;
        sensor3.recordUsage(usageLogEntry6);
        java.util.UUID uUID8 = sensor3.getSensorId();
        java.util.UUID uUID9 = null;
        sensor3.setLinkedEquipmentId(uUID9);
        sensor3.flagError();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        java.lang.String str7 = sensor3.toString();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor3.getUsageLogs();
        com.reservation_system.Sensor.SensorType sensorType9 = sensor3.getSensorType();
        sensor3.activate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str7.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType9);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry5 = null;
        sensor3.recordUsage(usageLogEntry5);
        sensor3.activate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.Sensor sensor12 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11);
        sensor12.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensor12.getUsageLogs();
        sensor12.activate();
        com.reservation_system.Sensor.SensorState sensorState16 = sensor12.getState();
        com.reservation_system.Sensor.Sensor sensor17 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8, sensorState16);
        com.reservation_system.Sensor.SensorState sensorState18 = sensor17.getState();
        com.reservation_system.Sensor.Sensor sensor19 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5, sensorState18);
        com.reservation_system.Sensor.Sensor sensor20 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState18);
        sensor20.flagError();
        java.util.UUID uUID22 = sensor20.getLinkedEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID22);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        java.lang.String str8 = sensor3.toString();
        java.util.UUID uUID9 = null;
        sensor3.setLinkedEquipmentId(uUID9);
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        sensor3.setSensorType(sensorType11);
        java.lang.String str13 = sensor3.toString();
        java.util.UUID uUID14 = null;
        sensor3.setLinkedEquipmentId(uUID14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str8.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str13.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        boolean boolean5 = sensor3.canSendData();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry6 = null;
        sensor3.recordUsage(usageLogEntry6);
        java.util.UUID uUID8 = sensor3.getSensorId();
        java.util.UUID uUID9 = sensor3.getLinkedEquipmentId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = uUID9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry5 = null;
        sensor3.recordUsage(usageLogEntry5);
        java.util.UUID uUID7 = sensor3.getSensorId();
        java.lang.String str8 = sensor3.toString();
        com.reservation_system.Sensor.SensorState sensorState9 = sensor3.getState();
        sensor3.deactivate();
        com.reservation_system.Sensor.SensorType sensorType11 = sensor3.getSensorType();
        boolean boolean12 = sensor3.canSendData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str8.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry5 = null;
        sensor3.recordUsage(usageLogEntry5);
        java.util.UUID uUID7 = sensor3.getSensorId();
        java.util.UUID uUID8 = null;
        sensor3.setLinkedEquipmentId(uUID8);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList10 = sensor3.getUsageLogs();
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        java.util.UUID uUID13 = null;
        com.reservation_system.Sensor.Sensor sensor14 = new com.reservation_system.Sensor.Sensor(uUID11, sensorType12, uUID13);
        sensor14.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList16 = sensor14.getUsageLogs();
        java.util.UUID uUID17 = sensor14.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry18 = null;
        sensor14.recordUsage(usageLogEntry18);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList20 = sensor14.getUsageLogs();
        java.util.UUID uUID21 = sensor14.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState22 = sensor14.getState();
        sensor3.setState(sensorState22);
        sensor3.activate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState22);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        sensor9.activate();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor9.getState();
        sensor3.setState(sensorState13);
        java.lang.String str15 = sensor3.toString();
        sensor3.activate();
        com.reservation_system.Sensor.SensorType sensorType17 = null;
        sensor3.setSensorType(sensorType17);
        boolean boolean19 = sensor3.canSendData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str15.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        java.util.UUID uUID9 = sensor3.getSensorId();
        com.reservation_system.Sensor.SensorState sensorState10 = sensor3.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState10);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        java.lang.String str8 = sensor3.toString();
        com.reservation_system.Sensor.SensorType sensorType9 = null;
        sensor3.setSensorType(sensorType9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str8.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry5 = null;
        sensor3.recordUsage(usageLogEntry5);
        java.util.UUID uUID7 = sensor3.getSensorId();
        java.util.UUID uUID8 = null;
        sensor3.setLinkedEquipmentId(uUID8);
        java.util.UUID uUID10 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID11 = null;
        sensor3.setLinkedEquipmentId(uUID11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        sensor3.flagError();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        java.lang.String str7 = sensor3.toString();
        java.util.UUID uUID8 = sensor3.getSensorId();
        java.lang.String str9 = sensor3.toString();
        sensor3.activate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str7.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str9.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.activate();
        sensor3.activate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        com.reservation_system.Sensor.SensorState sensorState4 = sensor3.getState();
        java.util.UUID uUID5 = sensor3.getSensorId();
        java.lang.String str6 = sensor3.getStateName();
        java.lang.String str7 = sensor3.getStateName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ACTIVE" + "'", str6.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ACTIVE" + "'", str7.equals("ACTIVE"));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        sensor9.activate();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor9.getState();
        sensor3.setState(sensorState13);
        java.lang.String str15 = sensor3.toString();
        sensor3.activate();
        com.reservation_system.Sensor.SensorType sensorType17 = null;
        sensor3.setSensorType(sensorType17);
        java.lang.String str19 = sensor3.toString();
        java.lang.String str20 = sensor3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str15.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str19.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str20.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        boolean boolean5 = sensor3.canSendData();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensor3.getUsageLogs();
        java.lang.String str7 = sensor3.toString();
        java.util.UUID uUID8 = sensor3.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str7.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.Sensor sensor12 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11);
        sensor12.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensor12.getUsageLogs();
        sensor12.activate();
        com.reservation_system.Sensor.SensorState sensorState16 = sensor12.getState();
        com.reservation_system.Sensor.Sensor sensor17 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8, sensorState16);
        com.reservation_system.Sensor.SensorState sensorState18 = sensor17.getState();
        com.reservation_system.Sensor.Sensor sensor19 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5, sensorState18);
        com.reservation_system.Sensor.Sensor sensor20 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState18);
        sensor20.flagError();
        java.util.UUID uUID22 = null;
        com.reservation_system.Sensor.SensorType sensorType23 = null;
        java.util.UUID uUID24 = null;
        java.util.UUID uUID25 = null;
        com.reservation_system.Sensor.SensorType sensorType26 = null;
        java.util.UUID uUID27 = null;
        com.reservation_system.Sensor.Sensor sensor28 = new com.reservation_system.Sensor.Sensor(uUID25, sensorType26, uUID27);
        sensor28.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList30 = sensor28.getUsageLogs();
        java.util.UUID uUID31 = null;
        com.reservation_system.Sensor.SensorType sensorType32 = null;
        java.util.UUID uUID33 = null;
        com.reservation_system.Sensor.Sensor sensor34 = new com.reservation_system.Sensor.Sensor(uUID31, sensorType32, uUID33);
        sensor34.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList36 = sensor34.getUsageLogs();
        sensor34.activate();
        com.reservation_system.Sensor.SensorState sensorState38 = sensor34.getState();
        sensor28.setState(sensorState38);
        com.reservation_system.Sensor.SensorState sensorState40 = sensor28.getState();
        com.reservation_system.Sensor.Sensor sensor41 = new com.reservation_system.Sensor.Sensor(uUID22, sensorType23, uUID24, sensorState40);
        sensor20.setState(sensorState40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState40);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.Sensor sensor6 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5);
        sensor6.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor6.getUsageLogs();
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.Sensor sensor12 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11);
        sensor12.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensor12.getUsageLogs();
        sensor12.activate();
        com.reservation_system.Sensor.SensorState sensorState16 = sensor12.getState();
        sensor6.setState(sensorState16);
        com.reservation_system.Sensor.Sensor sensor18 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState16);
        java.lang.String str19 = sensor18.getStateName();
        boolean boolean20 = sensor18.canSendData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ACTIVE" + "'", str19.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        sensor3.deactivate();
        java.util.UUID uUID10 = null;
        sensor3.setLinkedEquipmentId(uUID10);
        sensor3.flagError();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        sensor9.activate();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor9.getState();
        com.reservation_system.Sensor.Sensor sensor14 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5, sensorState13);
        com.reservation_system.Sensor.Sensor sensor15 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState13);
        java.lang.String str16 = sensor15.getStateName();
        sensor15.flagError();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ACTIVE" + "'", str16.equals("ACTIVE"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState5 = null;
        sensor3.setState(sensorState5);
        java.util.UUID uUID7 = null;
        sensor3.setLinkedEquipmentId(uUID7);
        java.util.UUID uUID9 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState10 = sensor3.getState();
        com.reservation_system.Sensor.SensorState sensorState11 = sensor3.getState();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList12 = sensor3.getUsageLogs();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry13 = null;
        sensor3.recordUsage(usageLogEntry13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorState11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList12);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState5 = null;
        sensor3.setState(sensorState5);
        java.util.UUID uUID7 = null;
        sensor3.setLinkedEquipmentId(uUID7);
        java.util.UUID uUID9 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState10 = sensor3.getState();
        com.reservation_system.Sensor.SensorState sensorState11 = sensor3.getState();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList12 = sensor3.getUsageLogs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = sensor3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.Sensor.SensorState.getStateName()\" because \"this.state\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorState11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList12);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.Sensor sensor6 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5);
        sensor6.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor6.getUsageLogs();
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.Sensor sensor12 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11);
        sensor12.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensor12.getUsageLogs();
        sensor12.activate();
        com.reservation_system.Sensor.SensorState sensorState16 = sensor12.getState();
        sensor6.setState(sensorState16);
        com.reservation_system.Sensor.SensorState sensorState18 = sensor6.getState();
        com.reservation_system.Sensor.Sensor sensor19 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState18);
        sensor19.flagError();
        java.util.UUID uUID21 = sensor19.getLinkedEquipmentId();
        boolean boolean22 = sensor19.canSendData();
        java.lang.String str23 = sensor19.getStateName();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList24 = sensor19.getUsageLogs();
        java.lang.String str25 = sensor19.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "ERROR" + "'", str23.equals("ERROR"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ERROR}" + "'", str25.equals("Sensor{id=null, type=null, equipment=null, state=ERROR}"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        sensor3.flagError();
        boolean boolean7 = sensor3.canSendData();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry8 = null;
        sensor3.recordUsage(usageLogEntry8);
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry10 = null;
        sensor3.recordUsage(usageLogEntry10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        java.lang.String str8 = sensor3.toString();
        com.reservation_system.Sensor.SensorType sensorType9 = sensor3.getSensorType();
        boolean boolean10 = sensor3.canSendData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str8.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        sensor9.activate();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor9.getState();
        sensor3.setState(sensorState13);
        java.lang.String str15 = sensor3.toString();
        sensor3.activate();
        com.reservation_system.Sensor.SensorType sensorType17 = null;
        sensor3.setSensorType(sensorType17);
        sensor3.deactivate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str15.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState5 = null;
        sensor3.setState(sensorState5);
        java.util.UUID uUID7 = null;
        sensor3.setLinkedEquipmentId(uUID7);
        java.util.UUID uUID9 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState10 = sensor3.getState();
        com.reservation_system.Sensor.SensorState sensorState11 = sensor3.getState();
        java.lang.Class<?> wildcardClass12 = sensor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorState11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        java.lang.String str8 = sensor3.toString();
        java.util.UUID uUID9 = null;
        sensor3.setLinkedEquipmentId(uUID9);
        com.reservation_system.Sensor.SensorType sensorType11 = null;
        sensor3.setSensorType(sensorType11);
        java.lang.String str13 = sensor3.toString();
        java.util.UUID uUID14 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID15 = null;
        sensor3.setLinkedEquipmentId(uUID15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str8.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str13.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID14);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry5 = null;
        sensor3.recordUsage(usageLogEntry5);
        java.util.UUID uUID7 = sensor3.getSensorId();
        java.util.UUID uUID8 = null;
        sensor3.setLinkedEquipmentId(uUID8);
        java.lang.String str10 = sensor3.toString();
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.SensorType sensorType12 = null;
        java.util.UUID uUID13 = null;
        com.reservation_system.Sensor.Sensor sensor14 = new com.reservation_system.Sensor.Sensor(uUID11, sensorType12, uUID13);
        java.util.UUID uUID15 = sensor14.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry16 = null;
        sensor14.recordUsage(usageLogEntry16);
        java.util.UUID uUID18 = sensor14.getSensorId();
        java.util.UUID uUID19 = null;
        sensor14.setLinkedEquipmentId(uUID19);
        java.util.UUID uUID21 = sensor14.getLinkedEquipmentId();
        java.util.UUID uUID22 = sensor14.getSensorId();
        java.util.UUID uUID23 = null;
        sensor14.setLinkedEquipmentId(uUID23);
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry25 = null;
        sensor14.recordUsage(usageLogEntry25);
        java.lang.String str27 = sensor14.getStateName();
        java.util.UUID uUID28 = null;
        com.reservation_system.Sensor.SensorType sensorType29 = null;
        java.util.UUID uUID30 = null;
        com.reservation_system.Sensor.Sensor sensor31 = new com.reservation_system.Sensor.Sensor(uUID28, sensorType29, uUID30);
        java.util.UUID uUID32 = sensor31.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState33 = null;
        sensor31.setState(sensorState33);
        java.util.UUID uUID35 = null;
        sensor31.setLinkedEquipmentId(uUID35);
        java.util.UUID uUID37 = sensor31.getLinkedEquipmentId();
        java.util.UUID uUID38 = sensor31.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorType sensorType39 = sensor31.getSensorType();
        java.util.UUID uUID40 = null;
        com.reservation_system.Sensor.SensorType sensorType41 = null;
        java.util.UUID uUID42 = null;
        com.reservation_system.Sensor.Sensor sensor43 = new com.reservation_system.Sensor.Sensor(uUID40, sensorType41, uUID42);
        java.util.UUID uUID44 = sensor43.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry45 = null;
        sensor43.recordUsage(usageLogEntry45);
        java.util.UUID uUID47 = sensor43.getSensorId();
        java.util.UUID uUID48 = null;
        sensor43.setLinkedEquipmentId(uUID48);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList50 = sensor43.getUsageLogs();
        java.util.UUID uUID51 = null;
        com.reservation_system.Sensor.SensorType sensorType52 = null;
        java.util.UUID uUID53 = null;
        com.reservation_system.Sensor.Sensor sensor54 = new com.reservation_system.Sensor.Sensor(uUID51, sensorType52, uUID53);
        sensor54.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList56 = sensor54.getUsageLogs();
        java.util.UUID uUID57 = sensor54.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry58 = null;
        sensor54.recordUsage(usageLogEntry58);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList60 = sensor54.getUsageLogs();
        java.util.UUID uUID61 = sensor54.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState62 = sensor54.getState();
        sensor43.setState(sensorState62);
        sensor31.setState(sensorState62);
        sensor14.setState(sensorState62);
        sensor3.setState(sensorState62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str10.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ACTIVE" + "'", str27.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState62);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        java.lang.String str7 = sensor3.toString();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList8 = sensor3.getUsageLogs();
        sensor3.flagError();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str7.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList8);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        com.reservation_system.Sensor.SensorState sensorState4 = sensor3.getState();
        java.util.UUID uUID5 = sensor3.getSensorId();
        java.lang.String str6 = sensor3.getStateName();
        java.util.UUID uUID7 = sensor3.getSensorId();
        java.util.UUID uUID8 = sensor3.getLinkedEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ACTIVE" + "'", str6.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        com.reservation_system.Sensor.Sensor sensor6 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5);
        com.reservation_system.Sensor.SensorState sensorState7 = sensor6.getState();
        java.util.UUID uUID8 = sensor6.getSensorId();
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        com.reservation_system.Sensor.Sensor sensor12 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11);
        sensor12.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList14 = sensor12.getUsageLogs();
        sensor12.activate();
        com.reservation_system.Sensor.SensorState sensorState16 = sensor12.getState();
        sensor12.flagError();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList18 = sensor12.getUsageLogs();
        java.util.UUID uUID19 = null;
        com.reservation_system.Sensor.SensorType sensorType20 = null;
        java.util.UUID uUID21 = null;
        java.util.UUID uUID22 = null;
        com.reservation_system.Sensor.SensorType sensorType23 = null;
        java.util.UUID uUID24 = null;
        com.reservation_system.Sensor.Sensor sensor25 = new com.reservation_system.Sensor.Sensor(uUID22, sensorType23, uUID24);
        sensor25.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList27 = sensor25.getUsageLogs();
        java.util.UUID uUID28 = null;
        com.reservation_system.Sensor.SensorType sensorType29 = null;
        java.util.UUID uUID30 = null;
        com.reservation_system.Sensor.Sensor sensor31 = new com.reservation_system.Sensor.Sensor(uUID28, sensorType29, uUID30);
        sensor31.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList33 = sensor31.getUsageLogs();
        sensor31.activate();
        com.reservation_system.Sensor.SensorState sensorState35 = sensor31.getState();
        sensor25.setState(sensorState35);
        com.reservation_system.Sensor.SensorState sensorState37 = sensor25.getState();
        com.reservation_system.Sensor.Sensor sensor38 = new com.reservation_system.Sensor.Sensor(uUID19, sensorType20, uUID21, sensorState37);
        sensor12.setState(sensorState37);
        sensor6.setState(sensorState37);
        com.reservation_system.Sensor.Sensor sensor41 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState37);
        com.reservation_system.Sensor.SensorType sensorType42 = sensor41.getSensorType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType42);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        java.util.UUID uUID9 = null;
        com.reservation_system.Sensor.SensorType sensorType10 = null;
        java.util.UUID uUID11 = null;
        java.util.UUID uUID12 = null;
        com.reservation_system.Sensor.SensorType sensorType13 = null;
        java.util.UUID uUID14 = null;
        com.reservation_system.Sensor.Sensor sensor15 = new com.reservation_system.Sensor.Sensor(uUID12, sensorType13, uUID14);
        sensor15.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList17 = sensor15.getUsageLogs();
        sensor15.activate();
        com.reservation_system.Sensor.SensorState sensorState19 = sensor15.getState();
        com.reservation_system.Sensor.Sensor sensor20 = new com.reservation_system.Sensor.Sensor(uUID9, sensorType10, uUID11, sensorState19);
        com.reservation_system.Sensor.SensorState sensorState21 = sensor20.getState();
        com.reservation_system.Sensor.Sensor sensor22 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8, sensorState21);
        com.reservation_system.Sensor.Sensor sensor23 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5, sensorState21);
        com.reservation_system.Sensor.SensorState sensorState24 = sensor23.getState();
        com.reservation_system.Sensor.Sensor sensor25 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState24);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        sensor3.flagError();
        java.util.UUID uUID8 = null;
        sensor3.setLinkedEquipmentId(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry5 = null;
        sensor3.recordUsage(usageLogEntry5);
        java.lang.Class<?> wildcardClass7 = sensor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList6 = sensor3.getUsageLogs();
        com.reservation_system.Sensor.SensorType sensorType7 = sensor3.getSensorType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType7);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        com.reservation_system.Sensor.SensorType sensorType9 = sensor3.getSensorType();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry10 = null;
        sensor3.recordUsage(usageLogEntry10);
        com.reservation_system.Sensor.SensorType sensorType12 = sensor3.getSensorType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType12);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        com.reservation_system.Sensor.SensorState sensorState10 = sensor9.getState();
        sensor3.setState(sensorState10);
        sensor3.deactivate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        java.util.UUID uUID3 = null;
        com.reservation_system.Sensor.SensorType sensorType4 = null;
        java.util.UUID uUID5 = null;
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        sensor9.activate();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor9.getState();
        com.reservation_system.Sensor.Sensor sensor14 = new com.reservation_system.Sensor.Sensor(uUID3, sensorType4, uUID5, sensorState13);
        java.util.UUID uUID15 = sensor14.getLinkedEquipmentId();
        java.util.UUID uUID16 = null;
        com.reservation_system.Sensor.SensorType sensorType17 = null;
        java.util.UUID uUID18 = null;
        java.util.UUID uUID19 = null;
        com.reservation_system.Sensor.SensorType sensorType20 = null;
        java.util.UUID uUID21 = null;
        java.util.UUID uUID22 = null;
        com.reservation_system.Sensor.SensorType sensorType23 = null;
        java.util.UUID uUID24 = null;
        com.reservation_system.Sensor.Sensor sensor25 = new com.reservation_system.Sensor.Sensor(uUID22, sensorType23, uUID24);
        sensor25.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList27 = sensor25.getUsageLogs();
        sensor25.activate();
        com.reservation_system.Sensor.SensorState sensorState29 = sensor25.getState();
        com.reservation_system.Sensor.Sensor sensor30 = new com.reservation_system.Sensor.Sensor(uUID19, sensorType20, uUID21, sensorState29);
        com.reservation_system.Sensor.SensorState sensorState31 = sensor30.getState();
        com.reservation_system.Sensor.Sensor sensor32 = new com.reservation_system.Sensor.Sensor(uUID16, sensorType17, uUID18, sensorState31);
        sensor14.setState(sensorState31);
        com.reservation_system.Sensor.Sensor sensor34 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2, sensorState31);
        java.util.UUID uUID35 = null;
        com.reservation_system.Sensor.SensorType sensorType36 = null;
        java.util.UUID uUID37 = null;
        com.reservation_system.Sensor.Sensor sensor38 = new com.reservation_system.Sensor.Sensor(uUID35, sensorType36, uUID37);
        java.util.UUID uUID39 = sensor38.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry40 = null;
        sensor38.recordUsage(usageLogEntry40);
        java.util.UUID uUID42 = sensor38.getSensorId();
        java.util.UUID uUID43 = null;
        sensor38.setLinkedEquipmentId(uUID43);
        java.util.UUID uUID45 = sensor38.getLinkedEquipmentId();
        java.util.UUID uUID46 = sensor38.getSensorId();
        java.util.UUID uUID47 = null;
        sensor38.setLinkedEquipmentId(uUID47);
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry49 = null;
        sensor38.recordUsage(usageLogEntry49);
        java.lang.String str51 = sensor38.getStateName();
        java.util.UUID uUID52 = null;
        com.reservation_system.Sensor.SensorType sensorType53 = null;
        java.util.UUID uUID54 = null;
        com.reservation_system.Sensor.Sensor sensor55 = new com.reservation_system.Sensor.Sensor(uUID52, sensorType53, uUID54);
        java.util.UUID uUID56 = sensor55.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState57 = null;
        sensor55.setState(sensorState57);
        java.util.UUID uUID59 = null;
        sensor55.setLinkedEquipmentId(uUID59);
        java.util.UUID uUID61 = sensor55.getLinkedEquipmentId();
        java.util.UUID uUID62 = sensor55.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorType sensorType63 = sensor55.getSensorType();
        java.util.UUID uUID64 = null;
        com.reservation_system.Sensor.SensorType sensorType65 = null;
        java.util.UUID uUID66 = null;
        com.reservation_system.Sensor.Sensor sensor67 = new com.reservation_system.Sensor.Sensor(uUID64, sensorType65, uUID66);
        java.util.UUID uUID68 = sensor67.getLinkedEquipmentId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry69 = null;
        sensor67.recordUsage(usageLogEntry69);
        java.util.UUID uUID71 = sensor67.getSensorId();
        java.util.UUID uUID72 = null;
        sensor67.setLinkedEquipmentId(uUID72);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList74 = sensor67.getUsageLogs();
        java.util.UUID uUID75 = null;
        com.reservation_system.Sensor.SensorType sensorType76 = null;
        java.util.UUID uUID77 = null;
        com.reservation_system.Sensor.Sensor sensor78 = new com.reservation_system.Sensor.Sensor(uUID75, sensorType76, uUID77);
        sensor78.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList80 = sensor78.getUsageLogs();
        java.util.UUID uUID81 = sensor78.getSensorId();
        com.reservation_system.Sensor.UsageLogEntry usageLogEntry82 = null;
        sensor78.recordUsage(usageLogEntry82);
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList84 = sensor78.getUsageLogs();
        java.util.UUID uUID85 = sensor78.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState86 = sensor78.getState();
        sensor67.setState(sensorState86);
        sensor55.setState(sensorState86);
        sensor38.setState(sensorState86);
        sensor34.setState(sensorState86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "ACTIVE" + "'", str51.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState86);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.UUID uUID5 = sensor3.getLinkedEquipmentId();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        com.reservation_system.Sensor.SensorState sensorState10 = sensor9.getState();
        sensor3.setState(sensorState10);
        java.lang.String str12 = sensor3.getStateName();
        java.lang.String str13 = sensor3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ACTIVE" + "'", str12.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Sensor{id=null, type=null, equipment=null, state=ACTIVE}" + "'", str13.equals("Sensor{id=null, type=null, equipment=null, state=ACTIVE}"));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        com.reservation_system.Sensor.SensorType sensorType8 = null;
        sensor3.setSensorType(sensorType8);
        java.util.UUID uUID10 = sensor3.getLinkedEquipmentId();
        sensor3.flagError();
        sensor3.deactivate();
        sensor3.flagError();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        boolean boolean5 = sensor3.canSendData();
        java.lang.String str6 = sensor3.getStateName();
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        sensor3.flagError();
        java.lang.String str9 = sensor3.getStateName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ACTIVE" + "'", str6.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ERROR" + "'", str9.equals("ERROR"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        java.util.UUID uUID4 = sensor3.getLinkedEquipmentId();
        com.reservation_system.Sensor.SensorState sensorState5 = null;
        sensor3.setState(sensorState5);
        com.reservation_system.Sensor.SensorState sensorState7 = sensor3.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorState7);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        sensor3.activate();
        boolean boolean7 = sensor3.canSendData();
        sensor3.deactivate();
        sensor3.flagError();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.util.UUID uUID0 = null;
        com.reservation_system.Sensor.SensorType sensorType1 = null;
        java.util.UUID uUID2 = null;
        com.reservation_system.Sensor.Sensor sensor3 = new com.reservation_system.Sensor.Sensor(uUID0, sensorType1, uUID2);
        sensor3.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList5 = sensor3.getUsageLogs();
        java.util.UUID uUID6 = null;
        com.reservation_system.Sensor.SensorType sensorType7 = null;
        java.util.UUID uUID8 = null;
        com.reservation_system.Sensor.Sensor sensor9 = new com.reservation_system.Sensor.Sensor(uUID6, sensorType7, uUID8);
        sensor9.activate();
        java.util.List<com.reservation_system.Sensor.UsageLogEntry> usageLogEntryList11 = sensor9.getUsageLogs();
        sensor9.activate();
        com.reservation_system.Sensor.SensorState sensorState13 = sensor9.getState();
        sensor3.setState(sensorState13);
        java.lang.String str15 = sensor3.getStateName();
        com.reservation_system.Sensor.SensorType sensorType16 = sensor3.getSensorType();
        sensor3.deactivate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageLogEntryList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ACTIVE" + "'", str15.equals("ACTIVE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorType16);
    }
}

