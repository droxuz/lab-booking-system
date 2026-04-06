package com.reservation_system.Randoop.CoordinatorService;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        boolean boolean8 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest12 = new com.reservation_system.model.Guest((int) (short) 100, "Manager1", "", "Student", false);
        userRepository1.addUser((com.reservation_system.model.User) guest12);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        boolean boolean16 = userRepository1.emailExists("coord@yorku.ca");
        com.reservation_system.model.Researcher researcher22 = new com.reservation_system.model.Researcher((int) (short) 1, "", "", "coord@yorku.ca", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher22);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService24 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService25 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
// flaky "1) test1002(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "1) test1002(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList14);
// flaky "1) test1002(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user10 = coordinatorAccountService6.createHeadLabCoordinator("Manager1", "Coordinator2", "Coordinator");
// flaky "2) test1003(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky "2) test1003(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        int int11 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "3) test1004(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "Coordinator", "Guest", "data/test-users.csv", false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "headlabcoordinator", "Coordinator2", "Researcher", true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService21 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional23 = userRepository1.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList24 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("manager1@yorku.ca");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userOptional26);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "labmanager", "coord2@yorku.ca", "Faculty", true);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "Coordinator", "headlabcoordinator", "Manager1", false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "Coordinator2", "coord2@yorku.ca", "Faculty", true);
        labManager5.setApproved(false);
        int int8 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService19 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator25 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "coord@yorku.ca", "", "coord@yorku.ca", true);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user29 = coordinatorAccountService19.autoGenerateLabManagerAccount((com.reservation_system.model.User) headLabCoordinator25, "Coordinator", "Researcher", "Strong1!");
// flaky "4) test1011(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is already registered.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "Guest", "", "hi!", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("Manager1");
        com.reservation_system.model.Student student11 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean12 = student11.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) student11);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService14 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        int int15 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "5) test1013(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "3) test1013(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "Faculty", "Student", "Coordinator", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinator" + "'", str7, "Coordinator");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "Researcher", "Coordinator2", "coord@yorku.ca", false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "", "labmanager", "Student", true);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean21 = userRepository1.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService24 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService25 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional27 = userRepository1.findByEmail("");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "6) test1017(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
// flaky "4) test1017(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(userOptional27);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.User user8 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) 'a', "coord@yorku.ca", "coord2@yorku.ca", "Strong1!", false);
        java.lang.String str9 = user8.getEmail();
        userRepository1.addUser(user8);
        com.reservation_system.model.Student student16 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean17 = student16.requiresDepartmentApproval();
        java.lang.String str18 = student16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student16);
        com.reservation_system.model.Faculty faculty25 = new com.reservation_system.model.Faculty((int) (short) -1, "Coordinator", "Guest", "coord2@yorku.ca", true);
        java.lang.String str26 = faculty25.getUserType();
        java.lang.String str27 = faculty25.getUserType();
        java.lang.String str28 = faculty25.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty25);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "coord2@yorku.ca" + "'", str9, "coord2@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Faculty" + "'", str26, "Faculty");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Faculty" + "'", str27, "Faculty");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Faculty" + "'", str28, "Faculty");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "", "Coordinator", "Coordinator2", false);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "Faculty", "Guest", "Manager1", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Coordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("Researcher");
        com.reservation_system.repository.UserRepository userRepository14 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository14.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository14.findByEmail("headlabcoordinator");
        boolean boolean20 = userRepository14.emailExists("");
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository22.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository22.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository22.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList28 = userRepository22.getAllUsers();
        userRepository14.saveAllUsers(userList28);
        userRepository1.saveAllUsers(userList28);
        com.reservation_system.model.Student student36 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean37 = student36.requiresDepartmentApproval();
        boolean boolean38 = student36.requiresDepartmentApproval();
        student36.setApproved(true);
        java.lang.String str41 = student36.getName();
        java.lang.String str42 = student36.getUserType();
        java.lang.String str43 = student36.getUserType();
        boolean boolean44 = student36.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) student36);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "7) test1021(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Coordinator" + "'", str41, "Coordinator");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Student" + "'", str42, "Student");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Student" + "'", str43, "Student");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(32, "manager1@yorku.ca", "Coordinator", "Coordinator", false);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getName();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinator" + "'", str7, "Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getPassword();
        boolean boolean8 = student5.isApproved();
        java.lang.String str9 = student5.getUserType();
        java.lang.Class<?> wildcardClass10 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService11 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str18 = researcher17.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = coordinatorAccountService11.autoGenerateLabManagerAccount((com.reservation_system.model.User) researcher17, "Manager1", "labmanager", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Researcher" + "'", str18, "Researcher");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "Researcher", "data/test-users.csv", "Manager1", false);
        int int6 = student5.getID();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "manager1@yorku.ca", "Strong1!", "Guest", false);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getUserType();
        java.lang.String str10 = labManager7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        int int12 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        int int15 = userRepository1.getNextID();
        boolean boolean17 = userRepository1.emailExists("data/test-users.csv");
        com.reservation_system.repository.UserRepository userRepository19 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty25 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository19.addUser((com.reservation_system.model.User) faculty25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository19.getAllUsers();
        int int28 = userRepository19.getNextID();
        java.util.List<com.reservation_system.model.User> userList29 = userRepository19.getAllUsers();
        userRepository1.saveAllUsers(userList29);
        java.lang.Class<?> wildcardClass31 = userList29.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
// flaky "8) test1028(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 102 + "'", int12 == 102);
        org.junit.Assert.assertNotNull(userList14);
// flaky "5) test1028(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
// flaky "2) test1028(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userList27);
// flaky "1) test1028(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 102 + "'", int28 == 102);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "", "Strong1!", "manager1@yorku.ca", true);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "Researcher", "data/test-users.csv", "Manager1", false);
        int int6 = student5.getID();
        java.lang.String str7 = student5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 100, "", "Researcher", "labmanager", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        com.reservation_system.model.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
// flaky "9) test1031(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService7 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Faculty faculty13 = new com.reservation_system.model.Faculty((int) (short) 0, "coord@yorku.ca", "Researcher", "hi!", true);
        java.lang.String str14 = faculty13.getName();
        java.lang.String str15 = faculty13.getEmail();
        java.lang.String str16 = faculty13.getEmail();
        java.lang.String str17 = faculty13.getUserType();
        boolean boolean18 = faculty13.isApproved();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = coordinatorAccountService7.autoGenerateLabManagerAccount((com.reservation_system.model.User) faculty13, "Guest", "Researcher", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "coord@yorku.ca" + "'", str14, "coord@yorku.ca");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Researcher" + "'", str15, "Researcher");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student26 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str27 = student26.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) student26);
        boolean boolean29 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean32 = userRepository31.headLabCoordinatorExists();
        boolean boolean33 = userRepository31.headLabCoordinatorExists();
        boolean boolean35 = userRepository31.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional37 = userRepository31.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList38 = userRepository31.getAllUsers();
        userRepository1.saveAllUsers(userList38);
        com.reservation_system.model.LabManager labManager45 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str46 = labManager45.getUserType();
        java.lang.String str47 = labManager45.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager45);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService49 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Researcher researcher55 = new com.reservation_system.model.Researcher(10, "coord@yorku.ca", "Faculty", "Faculty", true);
        java.lang.String str56 = researcher55.getUserType();
        boolean boolean57 = researcher55.requiresDepartmentApproval();
        java.lang.String str58 = researcher55.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher55);
        java.lang.String str60 = researcher55.getEmail();
        java.lang.String str61 = researcher55.getUserType();
        java.lang.String str62 = researcher55.getUserType();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "10) test1033(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Strong1!" + "'", str27, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
// flaky "6) test1033(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(userOptional37);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "labmanager" + "'", str46, "labmanager");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Student" + "'", str47, "Student");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Researcher" + "'", str56, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Faculty" + "'", str58, "Faculty");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Faculty" + "'", str60, "Faculty");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Researcher" + "'", str61, "Researcher");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Researcher" + "'", str62, "Researcher");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "data/test-users.csv", "coord2@yorku.ca", "data/test-users.csv", false);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getUserType();
        int int8 = guest5.getID();
        java.lang.String str9 = guest5.getEmail();
        java.lang.String str10 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-users.csv" + "'", str6, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "coord2@yorku.ca" + "'", str9, "coord2@yorku.ca");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "coord2@yorku.ca", "coord2@yorku.ca", "coord@yorku.ca", false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "manager1@yorku.ca", "Coordinator2", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        int int4 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean8 = userRepository6.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository6.findByEmail("coord2@yorku.ca");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository6.getAllUsers();
        userRepository1.saveAllUsers(userList11);
        com.reservation_system.model.Researcher researcher18 = new com.reservation_system.model.Researcher(98, "Student", "Manager1", "Researcher", true);
        java.lang.String str19 = researcher18.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) researcher18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
// flaky "11) test1037(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
// flaky "7) test1037(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Researcher" + "'", str19, "Researcher");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "coord2@yorku.ca", "Student", "Coordinator", true);
        student5.setApproved(true);
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinator" + "'", str10, "Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "headlabcoordinator", "Student", "data/test-users.csv", false);
        java.lang.String str6 = student5.getEmail();
        student5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService11 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService12 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("manager1@yorku.ca");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "headlabcoordinator", "", "coord2@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(false);
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean21 = userRepository1.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService24 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService25 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService26 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest32 = new com.reservation_system.model.Guest(100, "Coordinator2", "Coordinator", "Guest", false);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user36 = coordinatorAccountService26.autoGenerateLabManagerAccount((com.reservation_system.model.User) guest32, "", "Faculty", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
// flaky "12) test1042(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.emailExists("Student");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
// flaky "13) test1043(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "Coordinator", "Guest", "Student", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.requiresDepartmentApproval();
        student5.setApproved(true);
        java.lang.String str10 = student5.getName();
        java.lang.String str11 = student5.getUserType();
        java.lang.String str12 = student5.getUserType();
        java.lang.String str13 = student5.getName();
        java.lang.String str14 = student5.getUserType();
        java.lang.String str15 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinator" + "'", str10, "Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinator" + "'", str13, "Coordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Manager1", "Coordinator", "coord@yorku.ca", true);
        headLabCoordinator5.setApproved(true);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "headlabcoordinator", "Coordinator2", "Coordinator2", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinator2" + "'", str7, "Coordinator2");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str6 = guest5.getPassword();
        guest5.setApproved(false);
        java.lang.String str9 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Guest", "coord2@yorku.ca", "coord@yorku.ca", false);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass8 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord@yorku.ca" + "'", str6, "coord@yorku.ca");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "Coordinator", "Student", "Strong1!", true);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "Coordinator", "data/test-users.csv", "Guest", false);
        int int6 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Coordinator2", (int) (byte) 1, "manager1@yorku.ca", "manager1@yorku.ca", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Coordinator2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        boolean boolean5 = userRepository1.emailExists("");
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        java.lang.String str12 = faculty11.getUserType();
        java.lang.String str13 = faculty11.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository16.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository16.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository16.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList22 = userRepository16.getAllUsers();
        boolean boolean24 = userRepository16.emailExists("Student");
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean28 = userRepository26.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository26.findByEmail("coord2@yorku.ca");
        int int31 = userRepository26.getNextID();
        java.util.List<com.reservation_system.model.User> userList32 = userRepository26.getAllUsers();
        userRepository16.saveAllUsers(userList32);
        userRepository1.saveAllUsers(userList32);
        int int35 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService36 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
// flaky "14) test1053(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList22);
// flaky "8) test1053(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky "3) test1053(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(userOptional30);
// flaky "2) test1053(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 102 + "'", int31 == 102);
        org.junit.Assert.assertNotNull(userList32);
// flaky "1) test1053(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 102 + "'", int35 == 102);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getName();
        java.lang.String str8 = labManager5.getUserType();
        labManager5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.requiresDepartmentApproval();
        student5.setApproved(true);
        java.lang.String str10 = student5.getName();
        java.lang.String str11 = student5.getUserType();
        java.lang.String str12 = student5.getUserType();
        boolean boolean13 = student5.isApproved();
        boolean boolean14 = student5.requiresDepartmentApproval();
        java.lang.String str15 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinator" + "'", str10, "Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coordinator" + "'", str15, "Coordinator");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getUserType();
        java.lang.String str10 = labManager7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        int int12 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager20 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str21 = labManager20.getEmail();
        java.lang.String str22 = labManager20.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager20);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService24 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user28 = coordinatorAccountService24.createHeadLabCoordinator("hi!", "Student", "coord@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
// flaky "15) test1056(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 102 + "'", int12 == 102);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "labmanager" + "'", str22, "labmanager");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.requiresDepartmentApproval();
        student5.setApproved(true);
        java.lang.String str10 = student5.getName();
        java.lang.String str11 = student5.getUserType();
        student5.setApproved(false);
        java.lang.String str14 = student5.getEmail();
        java.lang.String str15 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinator" + "'", str10, "Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coordinator" + "'", str14, "Coordinator");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "Coordinator", "Strong1!", "Researcher", true);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean8 = userRepository6.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService9 = new com.reservation_system.services.CoordinatorAccountService(userRepository6);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService10 = new com.reservation_system.services.CoordinatorAccountService(userRepository6);
        boolean boolean11 = userRepository6.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager17 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        userRepository6.addUser((com.reservation_system.model.User) labManager17);
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean22 = userRepository20.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository20.findByEmail("Researcher");
        boolean boolean25 = userRepository20.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository27 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional29 = userRepository27.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional31 = userRepository27.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList32 = userRepository27.getAllUsers();
        userRepository20.saveAllUsers(userList32);
        userRepository6.saveAllUsers(userList32);
        userRepository1.saveAllUsers(userList32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "16) test1059(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(userOptional29);
        org.junit.Assert.assertNotNull(userOptional31);
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager17 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str18 = labManager17.getUserType();
        java.lang.String str19 = labManager17.getPassword();
        userRepository11.addUser((com.reservation_system.model.User) labManager17);
        java.lang.String str21 = labManager17.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager17);
        java.lang.String str23 = labManager17.getName();
        java.lang.String str24 = labManager17.getEmail();
        java.lang.String str25 = labManager17.getUserType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "labmanager" + "'", str21, "labmanager");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Faculty" + "'", str24, "Faculty");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "labmanager" + "'", str25, "labmanager");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "Strong1!", "Faculty", "coord@yorku.ca", true);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "manager1@yorku.ca", "headlabcoordinator", "hi!", false);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        int int10 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("manager1@yorku.ca");
        int int13 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "17) test1063(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 102 + "'", int10 == 102);
        org.junit.Assert.assertNotNull(userOptional12);
// flaky "9) test1063(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 102 + "'", int13 == 102);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager17 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str18 = labManager17.getUserType();
        java.lang.String str19 = labManager17.getPassword();
        userRepository11.addUser((com.reservation_system.model.User) labManager17);
        boolean boolean21 = userRepository11.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher27 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher27);
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager36 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str37 = labManager36.getUserType();
        java.lang.String str38 = labManager36.getPassword();
        userRepository30.addUser((com.reservation_system.model.User) labManager36);
        boolean boolean40 = userRepository30.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher46 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository30.addUser((com.reservation_system.model.User) researcher46);
        java.util.Optional<com.reservation_system.model.User> userOptional49 = userRepository30.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService50 = new com.reservation_system.services.CoordinatorAccountService(userRepository30);
        int int51 = userRepository30.getNextID();
        java.util.List<com.reservation_system.model.User> userList52 = userRepository30.getAllUsers();
        userRepository11.saveAllUsers(userList52);
        userRepository1.saveAllUsers(userList52);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService55 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "labmanager" + "'", str37, "labmanager");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Student" + "'", str38, "Student");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(userOptional49);
// flaky "18) test1064(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 102 + "'", int51 == 102);
        org.junit.Assert.assertNotNull(userList52);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "coord2@yorku.ca", "", "Guest", false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Student student12 = new com.reservation_system.model.Student((int) '4', "Researcher", "data/test-users.csv", "Manager1", false);
        student12.setApproved(true);
        java.lang.String str15 = student12.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user19 = coordinatorAccountService6.autoGenerateLabManagerAccount((com.reservation_system.model.User) student12, "coord2@yorku.ca", "", "Coordinator2");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-users.csv", 97, "Coordinator2", "coord2@yorku.ca", "Manager1", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "headlabcoordinator", "Student", "Manager1", false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService11 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator17 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "labmanager", "manager1@yorku.ca", "Researcher", true);
        int int18 = headLabCoordinator17.getID();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = coordinatorAccountService11.autoGenerateLabManagerAccount((com.reservation_system.model.User) headLabCoordinator17, "headlabcoordinator", "coord2@yorku.ca", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is already registered.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "", "headlabcoordinator", "Student", false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator11 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "Researcher", "", "Coordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("manager1@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional14);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "coord@yorku.ca", "Researcher", "Strong1!", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getPassword();
        java.lang.String str8 = researcher5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Strong1!" + "'", str7, "Strong1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "headlabcoordinator", "", "Faculty", true);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager12);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService14 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = coordinatorAccountService14.createHeadLabCoordinator("Manager1", "", "Coordinator2");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService19 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest(0, "Guest", "headlabcoordinator", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) guest25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository29 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty35 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository29.addUser((com.reservation_system.model.User) faculty35);
        java.util.List<com.reservation_system.model.User> userList37 = userRepository29.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService38 = new com.reservation_system.services.CoordinatorAccountService(userRepository29);
        com.reservation_system.model.LabManager labManager44 = new com.reservation_system.model.LabManager((int) (byte) 0, "", "Student", "Faculty", false);
        userRepository29.addUser((com.reservation_system.model.User) labManager44);
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional49 = userRepository47.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional51 = userRepository47.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList52 = userRepository47.getAllUsers();
        userRepository29.saveAllUsers(userList52);
        userRepository1.saveAllUsers(userList52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(userOptional49);
        org.junit.Assert.assertNotNull(userOptional51);
        org.junit.Assert.assertNotNull(userList52);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "Coordinator2", "Researcher", "coord@yorku.ca", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getPassword();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coord@yorku.ca" + "'", str7, "coord@yorku.ca");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "labmanager", "hi!", "manager1@yorku.ca", true);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "hi!", "Strong1!", "labmanager", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("coord@yorku.ca");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        int int7 = userRepository1.getNextID();
        int int8 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
// flaky "19) test1079(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
// flaky "10) test1079(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 102 + "'", int8 == 102);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "coord@yorku.ca", "Manager1", "Student", false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "Faculty", "manager1@yorku.ca", "", true);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getPassword();
        java.lang.String str9 = labManager5.getUserType();
        java.lang.String str10 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "labmanager", "manager1@yorku.ca", "", false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "Guest", "Manager1", "", true);
        boolean boolean6 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "Coordinator2", "Strong1!", "Researcher", true);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(101, "coord2@yorku.ca", "headlabcoordinator", "", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coord2@yorku.ca" + "'", str7, "coord2@yorku.ca");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Manager1", "headlabcoordinator", "coord@yorku.ca", true);
        java.lang.String str6 = researcher5.getName();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Manager1" + "'", str6, "Manager1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "Student", "labmanager", "Coordinator2", true);
        java.lang.String str6 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinator2" + "'", str6, "Coordinator2");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(102, "labmanager", "Coordinator2", "labmanager", false);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("coord2@yorku.ca", 2, "labmanager", "headlabcoordinator", "Coordinator2", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: coord2@yorku.ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "labmanager", "manager1@yorku.ca", "Researcher", true);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "manager1@yorku.ca" + "'", str7, "manager1@yorku.ca");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService7 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator13 = new com.reservation_system.model.HeadLabCoordinator(97, "hi!", "Coordinator", "manager1@yorku.ca", true);
        java.lang.String str14 = headLabCoordinator13.getUserType();
        java.lang.String str15 = headLabCoordinator13.getEmail();
        java.lang.String str16 = headLabCoordinator13.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user20 = coordinatorAccountService7.autoGenerateLabManagerAccount((com.reservation_system.model.User) headLabCoordinator13, "Student", "", "coord@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "headlabcoordinator" + "'", str14, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coordinator" + "'", str15, "Coordinator");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Student", "data/test-users.csv", "hi!", true);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "data/test-users.csv", "", "labmanager", false);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        int int7 = headLabCoordinator5.getID();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        java.lang.String str10 = headLabCoordinator5.getName();
        java.lang.String str11 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "data/test-users.csv" + "'", str10, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService12 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator18 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "Researcher", "labmanager", "Coordinator", true);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = coordinatorAccountService12.autoGenerateLabManagerAccount((com.reservation_system.model.User) headLabCoordinator18, "Strong1!", "Manager1", "manager1@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is already registered.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("data/test-users.csv");
        com.reservation_system.model.User user27 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) (byte) 10, "Faculty", "Manager1", "Manager1", true);
        int int28 = user27.getID();
        userRepository1.addUser(user27);
        boolean boolean31 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList32 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional34 = userRepository1.findByEmail("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService35 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user39 = coordinatorAccountService35.createHeadLabCoordinator("Manager1", "", "coord2@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userOptional34);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        boolean boolean12 = userRepository1.emailExists("Faculty");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = coordinatorAccountService13.createHeadLabCoordinator("coord2@yorku.ca", "manager1@yorku.ca", "manager1@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getName();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getName();
        java.lang.String str10 = student5.getUserType();
        boolean boolean11 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinator" + "'", str7, "Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinator" + "'", str9, "Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Researcher", "", "Student", false);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        boolean boolean9 = labManager5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass10 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "manager1@yorku.ca", "Coordinator2", "Guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("manager1@yorku.ca", (int) (byte) 0, "coord2@yorku.ca", "", "labmanager", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: manager1@yorku.ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService19 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest(0, "Guest", "headlabcoordinator", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) guest25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository1.getAllUsers();
        com.reservation_system.model.Researcher researcher33 = new com.reservation_system.model.Researcher((int) (short) -1, "labmanager", "coord2@yorku.ca", "Strong1!", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher33);
        com.reservation_system.model.Researcher researcher40 = new com.reservation_system.model.Researcher((int) (short) -1, "Manager1", "headlabcoordinator", "coord@yorku.ca", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher40);
        boolean boolean42 = researcher40.isApproved();
        java.lang.String str43 = researcher40.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Researcher" + "'", str43, "Researcher");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 97, "headlabcoordinator", "", "hi!", false);
        java.lang.String str7 = user6.getName();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService7 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean9 = userRepository1.emailExists("coord@yorku.ca");
        com.reservation_system.model.Student student15 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean16 = student15.requiresDepartmentApproval();
        java.lang.String str17 = student15.getName();
        java.lang.String str18 = student15.getUserType();
        java.lang.String str19 = student15.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student15);
        int int21 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
// flaky "20) test1104(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coordinator" + "'", str17, "Coordinator");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
// flaky "11) test1104(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 102 + "'", int21 == 102);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "coord@yorku.ca", "coord2@yorku.ca", "Coordinator", true);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getUserType();
        java.lang.String str10 = labManager7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        int int12 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        int int15 = userRepository1.getNextID();
        boolean boolean17 = userRepository1.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
// flaky "21) test1106(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 102 + "'", int12 == 102);
        org.junit.Assert.assertNotNull(userList14);
// flaky "12) test1106(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
// flaky "4) test1106(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userOptional19);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.model.Student student9 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean10 = student9.isApproved();
        java.lang.String str11 = student9.getName();
        userRepository1.addUser((com.reservation_system.model.User) student9);
        java.lang.String str13 = student9.getUserType();
        java.lang.String str14 = student9.getUserType();
        boolean boolean15 = student9.isApproved();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinator" + "'", str11, "Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean21 = userRepository1.emailExists("labmanager");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService22 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user26 = coordinatorAccountService22.createHeadLabCoordinator("Coordinator2", "Researcher", "Strong1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
// flaky "22) test1108(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "Strong1!", "Faculty", "coord@yorku.ca", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "Guest", "Coordinator2", "Coordinator", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinator2" + "'", str7, "Coordinator2");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "manager1@yorku.ca", "data/test-users.csv", "headlabcoordinator", false);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("coord@yorku.ca");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        boolean boolean5 = userRepository1.emailExists("");
        int int6 = userRepository1.getNextID();
        boolean boolean8 = userRepository1.emailExists("Guest");
// flaky "23) test1113(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "13) test1113(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 102 + "'", int6 == 102);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "data/test-users.csv", "manager1@yorku.ca", "", false);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Manager1", 0, "Coordinator", "coord@yorku.ca", "coord2@yorku.ca", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Manager1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        int int8 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "24) test1116(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 102 + "'", int8 == 102);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager12);
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager21 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str22 = labManager21.getUserType();
        java.lang.String str23 = labManager21.getPassword();
        userRepository15.addUser((com.reservation_system.model.User) labManager21);
        boolean boolean25 = userRepository15.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher31 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository15.addUser((com.reservation_system.model.User) researcher31);
        java.util.Optional<com.reservation_system.model.User> userOptional34 = userRepository15.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService35 = new com.reservation_system.services.CoordinatorAccountService(userRepository15);
        com.reservation_system.repository.UserRepository userRepository37 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager43 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str44 = labManager43.getUserType();
        java.lang.String str45 = labManager43.getPassword();
        userRepository37.addUser((com.reservation_system.model.User) labManager43);
        boolean boolean47 = userRepository37.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher53 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository37.addUser((com.reservation_system.model.User) researcher53);
        java.util.Optional<com.reservation_system.model.User> userOptional56 = userRepository37.findByEmail("data/test-users.csv");
        int int57 = userRepository37.getNextID();
        java.util.List<com.reservation_system.model.User> userList58 = userRepository37.getAllUsers();
        userRepository15.saveAllUsers(userList58);
        userRepository1.saveAllUsers(userList58);
        java.util.Optional<com.reservation_system.model.User> userOptional62 = userRepository1.findByEmail("Strong1!");
        com.reservation_system.repository.UserRepository userRepository64 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager70 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str71 = labManager70.getUserType();
        java.lang.String str72 = labManager70.getPassword();
        userRepository64.addUser((com.reservation_system.model.User) labManager70);
        com.reservation_system.repository.UserRepository userRepository75 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean76 = userRepository75.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList77 = userRepository75.getAllUsers();
        int int78 = userRepository75.getNextID();
        com.reservation_system.repository.UserRepository userRepository80 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean82 = userRepository80.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional84 = userRepository80.findByEmail("coord2@yorku.ca");
        java.util.List<com.reservation_system.model.User> userList85 = userRepository80.getAllUsers();
        userRepository75.saveAllUsers(userList85);
        userRepository64.saveAllUsers(userList85);
        userRepository1.saveAllUsers(userList85);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "labmanager" + "'", str22, "labmanager");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Student" + "'", str23, "Student");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(userOptional34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "labmanager" + "'", str44, "labmanager");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Student" + "'", str45, "Student");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(userOptional56);
// flaky "25) test1117(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 102 + "'", int57 == 102);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(userOptional62);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "labmanager" + "'", str71, "labmanager");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Student" + "'", str72, "Student");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(userList77);
// flaky "14) test1117(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int78 + "' != '" + 102 + "'", int78 == 102);
// flaky "5) test1117(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(userOptional84);
        org.junit.Assert.assertNotNull(userList85);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(102, "coord2@yorku.ca", "data/test-users.csv", "Coordinator2", true);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        student5.setApproved(false);
        int int9 = student5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "Coordinator", "Guest", "coord2@yorku.ca", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getPassword();
        faculty5.setApproved(true);
        java.lang.String str11 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "coord2@yorku.ca" + "'", str8, "coord2@yorku.ca");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("coord@yorku.ca", (-1), "Coordinator2", "", "data/test-users.csv", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: coord@yorku.ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        boolean boolean12 = userRepository1.emailExists("Faculty");
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Guest", "labmanager", "Manager1", true);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.model.Student student9 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean10 = student9.isApproved();
        java.lang.String str11 = student9.getName();
        userRepository1.addUser((com.reservation_system.model.User) student9);
        int int13 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService16 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Faculty faculty22 = new com.reservation_system.model.Faculty(99, "Guest", "Student", "coord@yorku.ca", true);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user26 = coordinatorAccountService16.autoGenerateLabManagerAccount((com.reservation_system.model.User) faculty22, "data/test-users.csv", "Strong1!", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinator" + "'", str11, "Coordinator");
// flaky "26) test1124(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 102 + "'", int13 == 102);
        org.junit.Assert.assertNotNull(userOptional15);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "labmanager", "", "Student", true);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        int int4 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str13 = labManager12.getUserType();
        java.lang.String str14 = labManager12.getPassword();
        userRepository6.addUser((com.reservation_system.model.User) labManager12);
        boolean boolean16 = userRepository6.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher22 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository6.addUser((com.reservation_system.model.User) researcher22);
        java.util.Optional<com.reservation_system.model.User> userOptional25 = userRepository6.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService26 = new com.reservation_system.services.CoordinatorAccountService(userRepository6);
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager34 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str35 = labManager34.getUserType();
        java.lang.String str36 = labManager34.getPassword();
        userRepository28.addUser((com.reservation_system.model.User) labManager34);
        boolean boolean38 = userRepository28.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher44 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository28.addUser((com.reservation_system.model.User) researcher44);
        java.util.Optional<com.reservation_system.model.User> userOptional47 = userRepository28.findByEmail("data/test-users.csv");
        int int48 = userRepository28.getNextID();
        java.util.List<com.reservation_system.model.User> userList49 = userRepository28.getAllUsers();
        userRepository6.saveAllUsers(userList49);
        userRepository1.saveAllUsers(userList49);
        com.reservation_system.model.Guest guest57 = new com.reservation_system.model.Guest((int) 'a', "manager1@yorku.ca", "manager1@yorku.ca", "Coordinator2", false);
        userRepository1.addUser((com.reservation_system.model.User) guest57);
        boolean boolean59 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
// flaky "27) test1126(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "labmanager" + "'", str13, "labmanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userOptional25);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "labmanager" + "'", str35, "labmanager");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Student" + "'", str36, "Student");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(userOptional47);
// flaky "15) test1126(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 102 + "'", int48 == 102);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "Guest", "Student", "", true);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "headlabcoordinator", "Guest", "Strong1!", false);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "headlabcoordinator", "Student", "", false);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.String str7 = labManager5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager12);
        com.reservation_system.model.Researcher researcher19 = new com.reservation_system.model.Researcher((int) (short) 1, "headlabcoordinator", "Coordinator2", "Coordinator2", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "Strong1!", "coord@yorku.ca", "headlabcoordinator", false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "Strong1!", "manager1@yorku.ca", "Student", false);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = labManager7.requiresDepartmentApproval();
        java.lang.String str12 = labManager7.getUserType();
        boolean boolean13 = labManager7.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "Guest", "manager1@yorku.ca", "", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean21 = userRepository1.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        int int24 = userRepository1.getNextID();
        com.reservation_system.model.Faculty faculty30 = new com.reservation_system.model.Faculty((int) 'a', "", "Faculty", "manager1@yorku.ca", true);
        boolean boolean31 = faculty30.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) faculty30);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
// flaky "28) test1135(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky "16) test1135(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 102 + "'", int24 == 102);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "", "coord@yorku.ca", "Guest", true);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (byte) 100, "Strong1!", "manager1@yorku.ca", "", false);
        user6.setApproved(false);
        int int9 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "", "Guest", "manager1@yorku.ca", true);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "coord@yorku.ca", "coord@yorku.ca", "data/test-users.csv", false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean21 = userRepository1.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService24 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("Guest");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService27 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user31 = coordinatorAccountService27.createHeadLabCoordinator("manager1@yorku.ca", "coord2@yorku.ca", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
// flaky "29) test1140(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(userOptional26);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "Coordinator", "labmanager", "labmanager", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "Strong1!", "Student", "labmanager", false);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Researcher", "Student", "Coordinator2", true);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getName();
        java.lang.String str9 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService10 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user14 = coordinatorAccountService10.createHeadLabCoordinator("data/test-users.csv", "", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager12);
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean17 = userRepository15.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository15.findByEmail("Researcher");
        boolean boolean20 = userRepository15.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository22.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository22.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository22.getAllUsers();
        userRepository15.saveAllUsers(userList27);
        userRepository1.saveAllUsers(userList27);
        int int30 = userRepository1.getNextID();
        boolean boolean31 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "30) test1145(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(userList27);
// flaky "17) test1145(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 102 + "'", int30 == 102);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        int int6 = labManager5.getID();
        int int7 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "Manager1", "labmanager", "coord2@yorku.ca", true);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getUserType();
        java.lang.String str10 = labManager7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        int int12 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager20 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str21 = labManager20.getEmail();
        java.lang.String str22 = labManager20.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager20);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService24 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Researcher researcher30 = new com.reservation_system.model.Researcher(97, "coord2@yorku.ca", "coord2@yorku.ca", "Researcher", false);
        java.lang.String str31 = researcher30.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher30);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
// flaky "31) test1148(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 102 + "'", int12 == 102);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "labmanager" + "'", str22, "labmanager");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "coord2@yorku.ca" + "'", str31, "coord2@yorku.ca");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("coord@yorku.ca", 1, "", "hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: coord@yorku.ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService19 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user23 = coordinatorAccountService19.createHeadLabCoordinator("coord@yorku.ca", "labmanager", "Coordinator2");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("");
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        boolean boolean16 = userRepository1.emailExists("Manager1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "coord2@yorku.ca", "labmanager", "headlabcoordinator", false);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "coord@yorku.ca", "", "", true);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository10.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository10.findByEmail("headlabcoordinator");
        boolean boolean16 = userRepository10.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("Coordinator2");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService22 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest28 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str29 = guest28.getPassword();
        guest28.setApproved(false);
        int int32 = guest28.getID();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user36 = coordinatorAccountService22.autoGenerateLabManagerAccount((com.reservation_system.model.User) guest28, "manager1@yorku.ca", "Manager1", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("coord2@yorku.ca", (int) (short) 100, "Coordinator", "Coordinator", "coord2@yorku.ca", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: coord2@yorku.ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("coord@yorku.ca", (int) (byte) -1, "Coordinator2", "headlabcoordinator", "labmanager", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: coord@yorku.ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str10 = researcher9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        researcher9.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        int int4 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "32) test1158(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean6 = userRepository5.headLabCoordinatorExists();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        boolean boolean9 = userRepository5.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository5.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList12 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList12);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "", "Researcher", "Guest", true);
        java.lang.String str6 = student5.getName();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "coord2@yorku.ca", "Student", "headlabcoordinator", true);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(98, "Manager1", "labmanager", "manager1@yorku.ca", false);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student26 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str27 = student26.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) student26);
        com.reservation_system.model.Student student34 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean35 = student34.requiresDepartmentApproval();
        java.lang.String str36 = student34.getUserType();
        int int37 = student34.getID();
        userRepository1.addUser((com.reservation_system.model.User) student34);
        boolean boolean40 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean42 = userRepository1.emailExists("Researcher");
        com.reservation_system.repository.UserRepository userRepository44 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional46 = userRepository44.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional48 = userRepository44.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList49 = userRepository44.getAllUsers();
        int int50 = userRepository44.getNextID();
        java.util.List<com.reservation_system.model.User> userList51 = userRepository44.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository53 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean54 = userRepository53.headLabCoordinatorExists();
        boolean boolean55 = userRepository53.headLabCoordinatorExists();
        boolean boolean57 = userRepository53.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional59 = userRepository53.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList60 = userRepository53.getAllUsers();
        userRepository44.saveAllUsers(userList60);
        userRepository1.saveAllUsers(userList60);
        java.util.Optional<com.reservation_system.model.User> userOptional64 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList65 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Strong1!" + "'", str27, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Student" + "'", str36, "Student");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(userOptional46);
        org.junit.Assert.assertNotNull(userOptional48);
        org.junit.Assert.assertNotNull(userList49);
// flaky "33) test1163(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 102 + "'", int50 == 102);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(userOptional59);
        org.junit.Assert.assertNotNull(userList60);
        org.junit.Assert.assertNotNull(userOptional64);
        org.junit.Assert.assertNotNull(userList65);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository10.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository10.findByEmail("headlabcoordinator");
        boolean boolean16 = userRepository10.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService20 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Researcher researcher26 = new com.reservation_system.model.Researcher((int) (byte) 0, "", "Manager1", "Student", false);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user30 = coordinatorAccountService20.autoGenerateLabManagerAccount((com.reservation_system.model.User) researcher26, "", "Coordinator2", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "labmanager", "Coordinator", "Strong1!", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Coordinator");
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean13 = userRepository12.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository12.getAllUsers();
        int int15 = userRepository12.getNextID();
        com.reservation_system.model.Researcher researcher21 = new com.reservation_system.model.Researcher((int) (byte) 100, "", "Researcher", "labmanager", true);
        userRepository12.addUser((com.reservation_system.model.User) researcher21);
        java.util.List<com.reservation_system.model.User> userList23 = userRepository12.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean27 = userRepository25.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService28 = new com.reservation_system.services.CoordinatorAccountService(userRepository25);
        int int29 = userRepository25.getNextID();
        java.util.List<com.reservation_system.model.User> userList30 = userRepository25.getAllUsers();
        userRepository12.saveAllUsers(userList30);
        userRepository1.saveAllUsers(userList30);
        java.util.Optional<com.reservation_system.model.User> userOptional34 = userRepository1.findByEmail("coord2@yorku.ca");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
// flaky "34) test1166(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky "18) test1166(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 102 + "'", int29 == 102);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userOptional34);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean6 = userRepository5.headLabCoordinatorExists();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        boolean boolean9 = userRepository5.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository5.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList12 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList12);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService16 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user20 = coordinatorAccountService16.createHeadLabCoordinator("Researcher", "Guest", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "", "coord@yorku.ca", "Coordinator", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "Manager1", "Strong1!", "Manager1", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Manager1" + "'", str7, "Manager1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(102, "Coordinator2", "coord@yorku.ca", "Guest", false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        int int19 = userRepository1.getNextID();
        com.reservation_system.model.LabManager labManager25 = new com.reservation_system.model.LabManager(97, "Coordinator2", "headlabcoordinator", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager25);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "35) test1171(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 102 + "'", int19 == 102);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str6 = guest5.getPassword();
        boolean boolean7 = guest5.isApproved();
        int int8 = guest5.getID();
        guest5.setApproved(false);
        boolean boolean11 = guest5.requiresDepartmentApproval();
        java.lang.String str12 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getPassword();
        int int11 = researcher5.getID();
        java.lang.String str12 = researcher5.getUserType();
        java.lang.String str13 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "coord2@yorku.ca" + "'", str10, "coord2@yorku.ca");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "coord@yorku.ca" + "'", str13, "coord@yorku.ca");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) '#', "Student", "coord2@yorku.ca", "labmanager", false);
        researcher11.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService15 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean17 = userRepository1.emailExists("headlabcoordinator");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        int int6 = userRepository1.getNextID();
        boolean boolean8 = userRepository1.emailExists("labmanager");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "36) test1176(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 102 + "'", int6 == 102);
// flaky "19) test1176(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(102, "Strong1!", "Strong1!", "manager1@yorku.ca", false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService9 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "labmanager", "coord@yorku.ca", "Coordinator", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "Student", "coord2@yorku.ca", "labmanager", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord2@yorku.ca" + "'", str6, "coord2@yorku.ca");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager12);
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean17 = userRepository15.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository15.findByEmail("Researcher");
        boolean boolean20 = userRepository15.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository22.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository22.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository22.getAllUsers();
        userRepository15.saveAllUsers(userList27);
        userRepository1.saveAllUsers(userList27);
        int int30 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.User user39 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) 'a', "coord@yorku.ca", "coord2@yorku.ca", "Strong1!", false);
        java.lang.String str40 = user39.getEmail();
        userRepository32.addUser(user39);
        boolean boolean42 = user39.isApproved();
        user39.setApproved(false);
        userRepository1.addUser(user39);
        int int46 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(userList27);
// flaky "37) test1180(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 102 + "'", int30 == 102);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "coord2@yorku.ca" + "'", str40, "coord2@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
// flaky "20) test1180(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 102 + "'", int46 == 102);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Manager1", "Strong1!", "", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Manager1" + "'", str7, "Manager1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "Researcher", "Researcher", "Coordinator2", true);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student26 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str27 = student26.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) student26);
        boolean boolean29 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean32 = userRepository31.headLabCoordinatorExists();
        boolean boolean33 = userRepository31.headLabCoordinatorExists();
        boolean boolean35 = userRepository31.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional37 = userRepository31.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList38 = userRepository31.getAllUsers();
        userRepository1.saveAllUsers(userList38);
        com.reservation_system.model.LabManager labManager45 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str46 = labManager45.getUserType();
        java.lang.String str47 = labManager45.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager45);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService49 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Researcher researcher55 = new com.reservation_system.model.Researcher(10, "coord@yorku.ca", "Faculty", "Faculty", true);
        java.lang.String str56 = researcher55.getUserType();
        boolean boolean57 = researcher55.requiresDepartmentApproval();
        java.lang.String str58 = researcher55.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher55);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService60 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Strong1!" + "'", str27, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(userOptional37);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "labmanager" + "'", str46, "labmanager");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Student" + "'", str47, "Student");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Researcher" + "'", str56, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Faculty" + "'", str58, "Faculty");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "Manager1", "hi!", "Researcher", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Strong1!" + "'", str6, "Strong1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "headlabcoordinator", "Student", "", false);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getEmail();
        java.lang.String str8 = labManager5.getUserType();
        labManager5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Researcher", "coord@yorku.ca", "Student", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getName();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("coord2@yorku.ca");
        java.lang.Class<?> wildcardClass13 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(99, "hi!", "Coordinator", "labmanager", false);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getUserType();
        java.lang.String str10 = labManager7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        int int12 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
// flaky "38) test1190(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 102 + "'", int12 == 102);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(99, "headlabcoordinator", "Coordinator2", "labmanager", true);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        boolean boolean10 = userRepository1.emailExists("headlabcoordinator");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getName();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Manager1" + "'", str8, "Manager1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student26 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str27 = student26.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) student26);
        com.reservation_system.model.Student student34 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean35 = student34.requiresDepartmentApproval();
        java.lang.String str36 = student34.getUserType();
        int int37 = student34.getID();
        userRepository1.addUser((com.reservation_system.model.User) student34);
        boolean boolean40 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.model.Guest guest46 = new com.reservation_system.model.Guest((int) (short) 100, "Researcher", "Student", "Coordinator2", true);
        boolean boolean47 = guest46.requiresDepartmentApproval();
        java.lang.String str48 = guest46.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest46);
        java.util.Optional<com.reservation_system.model.User> userOptional51 = userRepository1.findByEmail("labmanager");
        java.util.Optional<com.reservation_system.model.User> userOptional53 = userRepository1.findByEmail("coord2@yorku.ca");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Strong1!" + "'", str27, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Student" + "'", str36, "Student");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Guest" + "'", str48, "Guest");
        org.junit.Assert.assertNotNull(userOptional51);
        org.junit.Assert.assertNotNull(userOptional53);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository10.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository10.findByEmail("headlabcoordinator");
        boolean boolean16 = userRepository10.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService20 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest26 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str27 = guest26.getPassword();
        boolean boolean28 = guest26.isApproved();
        java.lang.String str29 = guest26.getEmail();
        java.lang.String str30 = guest26.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user34 = coordinatorAccountService20.autoGenerateLabManagerAccount((com.reservation_system.model.User) guest26, "Researcher", "Student", "coord@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Coordinator2" + "'", str29, "Coordinator2");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "Coordinator", "headlabcoordinator", "coord@yorku.ca", false);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("data/test-users.csv");
        com.reservation_system.model.User user27 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) (byte) 10, "Faculty", "Manager1", "Manager1", true);
        int int28 = user27.getID();
        userRepository1.addUser(user27);
        boolean boolean31 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList32 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass33 = userRepository1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "coord2@yorku.ca", "hi!", "data/test-users.csv", true);
        java.lang.String str6 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord2@yorku.ca" + "'", str6, "coord2@yorku.ca");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        boolean boolean10 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService11 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean13 = userRepository1.emailExists("data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "Guest", "", "data/test-users.csv", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        boolean boolean13 = userRepository1.emailExists("Coordinator");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest20 = new com.reservation_system.model.Guest((int) (byte) 1, "Researcher", "coord@yorku.ca", "", false);
        userRepository1.addUser((com.reservation_system.model.User) guest20);
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean25 = userRepository24.headLabCoordinatorExists();
        boolean boolean26 = userRepository24.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional28 = userRepository24.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList29 = userRepository24.getAllUsers();
        userRepository1.saveAllUsers(userList29);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        int int4 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository6.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository6.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository6.getAllUsers();
        int int12 = userRepository6.getNextID();
        java.util.List<com.reservation_system.model.User> userList13 = userRepository6.getAllUsers();
        userRepository1.saveAllUsers(userList13);
        boolean boolean16 = userRepository1.emailExists("Coordinator2");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "39) test1203(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
// flaky "21) test1203(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 102 + "'", int12 == 102);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "headlabcoordinator", "Student", "", false);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getEmail();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "", "labmanager", "hi!", true);
        java.lang.String str6 = labManager5.getPassword();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "", "headlabcoordinator", "Faculty", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "Coordinator2", "Coordinator", "Guest", false);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "headlabcoordinator", "Strong1!", "Strong1!", true);
        java.lang.String str6 = student5.getName();
        student5.setApproved(false);
        java.lang.String str9 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Manager1", "", "Strong1!", true);
        java.lang.String str6 = researcher5.getEmail();
        boolean boolean7 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(99, "hi!", "hi!", "Coordinator2", false);
        java.lang.Class<?> wildcardClass6 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(35, "labmanager", "hi!", "Guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 100, "", "Researcher", "labmanager", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService14 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Faculty faculty20 = new com.reservation_system.model.Faculty(99, "manager1@yorku.ca", "headlabcoordinator", "data/test-users.csv", false);
        java.lang.String str21 = faculty20.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user25 = coordinatorAccountService14.autoGenerateLabManagerAccount((com.reservation_system.model.User) faculty20, "", "headlabcoordinator", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
// flaky "40) test1212(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "data/test-users.csv" + "'", str21, "data/test-users.csv");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService19 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user23 = coordinatorAccountService19.createHeadLabCoordinator("manager1@yorku.ca", "Coordinator2", "labmanager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Guest");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService11 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Student student17 = new com.reservation_system.model.Student((int) (short) -1, "coord2@yorku.ca", "Student", "Coordinator", true);
        student17.setApproved(true);
        java.lang.String str20 = student17.getPassword();
        java.lang.String str21 = student17.getUserType();
        student17.setApproved(false);
        java.lang.String str24 = student17.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user28 = coordinatorAccountService11.autoGenerateLabManagerAccount((com.reservation_system.model.User) student17, "manager1@yorku.ca", "Coordinator", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coordinator" + "'", str20, "Coordinator");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Student" + "'", str21, "Student");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Student" + "'", str24, "Student");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "labmanager", "coord@yorku.ca", "Coordinator", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass11 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        int int7 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest14 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str15 = guest14.getPassword();
        boolean boolean16 = guest14.isApproved();
        boolean boolean17 = guest14.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) guest14);
        java.lang.String str19 = guest14.getUserType();
        java.lang.String str20 = guest14.getUserType();
        java.lang.String str21 = guest14.getUserType();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
// flaky "41) test1217(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Guest" + "'", str19, "Guest");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Guest" + "'", str20, "Guest");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Guest" + "'", str21, "Guest");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "Strong1!", "hi!", "Researcher", false);
        java.lang.String str6 = researcher5.getUserType();
        int int7 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "coord2@yorku.ca", "Manager1", "Strong1!", false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.requiresDepartmentApproval();
        java.lang.String str8 = student5.getUserType();
        student5.setApproved(false);
        boolean boolean11 = student5.isApproved();
        boolean boolean12 = student5.isApproved();
        java.lang.String str13 = student5.getUserType();
        student5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "coord@yorku.ca", "Researcher", "Manager1", true);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "", "Coordinator2", "Coordinator2", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 0, "coord2@yorku.ca", "Coordinator2", "", false);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Student", "data/test-users.csv", "coord2@yorku.ca", false);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("coord2@yorku.ca");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("Guest");
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getUserType();
        java.lang.String str18 = labManager16.getPassword();
        userRepository10.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean20 = userRepository10.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional22 = userRepository10.findByEmail("");
        boolean boolean23 = userRepository10.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean26 = userRepository25.headLabCoordinatorExists();
        boolean boolean27 = userRepository25.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional29 = userRepository25.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList30 = userRepository25.getAllUsers();
        userRepository10.saveAllUsers(userList30);
        userRepository1.saveAllUsers(userList30);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "labmanager" + "'", str17, "labmanager");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(userOptional29);
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        boolean boolean12 = userRepository1.emailExists("Faculty");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = coordinatorAccountService13.autoGenerateLabManagerAccount(user14, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "data/test-users.csv", "Student", "Coordinator", false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "", "headlabcoordinator", "Faculty", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Manager1", "", "coord2@yorku.ca", true);
        java.lang.String str6 = student5.getName();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Manager1" + "'", str6, "Manager1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        int int7 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher13 = new com.reservation_system.model.Researcher(32, "", "Coordinator", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher13);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "42) test1230(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "Coordinator", "coord2@yorku.ca", "data/test-users.csv", false);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Strong1!", "Faculty", "coord@yorku.ca", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "labmanager", "manager1@yorku.ca", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "Faculty", "Strong1!", "manager1@yorku.ca", false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 100, "", "Researcher", "labmanager", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.lang.Class<?> wildcardClass12 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
// flaky "43) test1235(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "coord2@yorku.ca", "Faculty", "Researcher", false);
        java.lang.String str6 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        int int7 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean11 = userRepository10.headLabCoordinatorExists();
        boolean boolean12 = userRepository10.headLabCoordinatorExists();
        boolean boolean14 = userRepository10.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository10.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList17);
        boolean boolean20 = userRepository1.emailExists("Researcher");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
// flaky "44) test1238(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 97, "Coordinator2", "Manager1", "hi!", true);
        user6.setApproved(true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        java.lang.String str6 = labManager5.getName();
        labManager5.setApproved(true);
        boolean boolean9 = labManager5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager1@yorku.ca" + "'", str6, "manager1@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(102, "coord@yorku.ca", "hi!", "", true);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "Faculty", "Faculty", "manager1@yorku.ca", false);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "coord@yorku.ca", "headlabcoordinator", "Coordinator2", true);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) '#', "", "Guest", "Guest", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "hi!", "Coordinator", "manager1@yorku.ca", false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        int int6 = guest5.getID();
        int int7 = guest5.getID();
        java.lang.String str8 = guest5.getUserType();
        int int9 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        int int6 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher12 = new com.reservation_system.model.Researcher(32, "Manager1", "coord@yorku.ca", "manager1@yorku.ca", true);
        boolean boolean13 = researcher12.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) researcher12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "45) test1247(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
// flaky "22) test1247(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 102 + "'", int5 == 102);
// flaky "6) test1247(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 102 + "'", int6 == 102);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        boolean boolean20 = userRepository1.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional22 = userRepository1.findByEmail("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userOptional22);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        boolean boolean21 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService22 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "labmanager", "Faculty", "Coordinator2", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "data/test-users.csv", "Coordinator", "Researcher", true);
        headLabCoordinator5.setApproved(true);
        java.lang.String str8 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        boolean boolean5 = userRepository1.emailExists("");
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        java.lang.String str12 = faculty11.getUserType();
        java.lang.String str13 = faculty11.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        com.reservation_system.model.Student student20 = new com.reservation_system.model.Student(101, "hi!", "data/test-users.csv", "", false);
        userRepository1.addUser((com.reservation_system.model.User) student20);
        com.reservation_system.repository.UserRepository userRepository23 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean24 = userRepository23.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService25 = new com.reservation_system.services.CoordinatorAccountService(userRepository23);
        com.reservation_system.model.Guest guest31 = new com.reservation_system.model.Guest((int) (byte) 100, "manager1@yorku.ca", "Manager1", "Student", true);
        userRepository23.addUser((com.reservation_system.model.User) guest31);
        userRepository1.addUser((com.reservation_system.model.User) guest31);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 0, "", "hi!", "labmanager", true);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "coord@yorku.ca", "hi!", "", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean21 = userRepository1.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean26 = userRepository24.emailExists("data/test-users.csv");
        boolean boolean28 = userRepository24.emailExists("");
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager36 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str37 = labManager36.getUserType();
        java.lang.String str38 = labManager36.getPassword();
        userRepository30.addUser((com.reservation_system.model.User) labManager36);
        boolean boolean40 = userRepository30.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher46 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository30.addUser((com.reservation_system.model.User) researcher46);
        java.util.Optional<com.reservation_system.model.User> userOptional49 = userRepository30.findByEmail("data/test-users.csv");
        int int50 = userRepository30.getNextID();
        java.util.List<com.reservation_system.model.User> userList51 = userRepository30.getAllUsers();
        userRepository24.saveAllUsers(userList51);
        userRepository1.saveAllUsers(userList51);
        java.util.Optional<com.reservation_system.model.User> userOptional55 = userRepository1.findByEmail("labmanager");
        boolean boolean57 = userRepository1.emailExists("coord@yorku.ca");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
// flaky "46) test1255(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "labmanager" + "'", str37, "labmanager");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Student" + "'", str38, "Student");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(userOptional49);
// flaky "23) test1255(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 102 + "'", int50 == 102);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertNotNull(userOptional55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "", "Coordinator", "", true);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "Researcher", "manager1@yorku.ca", "coord@yorku.ca", false);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) 'a', "hi!", "Faculty", "headlabcoordinator", true);
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getName();
        java.lang.String str9 = user6.getEmail();
        boolean boolean10 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        boolean boolean13 = userRepository1.emailExists("Coordinator");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest20 = new com.reservation_system.model.Guest((int) (byte) 1, "Researcher", "coord@yorku.ca", "", false);
        userRepository1.addUser((com.reservation_system.model.User) guest20);
        java.lang.String str22 = guest20.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "coord@yorku.ca" + "'", str22, "coord@yorku.ca");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Guest", "coord2@yorku.ca", "coord@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getPassword();
        boolean boolean8 = researcher5.isApproved();
        java.lang.String str9 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coord@yorku.ca" + "'", str7, "coord@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "coord2@yorku.ca" + "'", str9, "coord2@yorku.ca");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "Manager1", "coord@yorku.ca", "manager1@yorku.ca", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        int int7 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean11 = userRepository10.headLabCoordinatorExists();
        boolean boolean12 = userRepository10.headLabCoordinatorExists();
        boolean boolean14 = userRepository10.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository10.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList17);
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional22 = userRepository20.findByEmail("Faculty");
        com.reservation_system.model.LabManager labManager28 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str29 = labManager28.getUserType();
        userRepository20.addUser((com.reservation_system.model.User) labManager28);
        labManager28.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) labManager28);
        java.util.Optional<com.reservation_system.model.User> userOptional35 = userRepository1.findByEmail("Coordinator2");
        boolean boolean36 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
// flaky "47) test1262(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "labmanager" + "'", str29, "labmanager");
        org.junit.Assert.assertNotNull(userOptional35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        int int10 = userRepository1.getNextID();
        int int11 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService12 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = coordinatorAccountService12.createHeadLabCoordinator("data/test-users.csv", "Manager1", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList9);
// flaky "48) test1263(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 102 + "'", int10 == 102);
// flaky "24) test1263(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager12);
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean17 = userRepository15.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository15.findByEmail("Researcher");
        boolean boolean20 = userRepository15.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository22.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository22.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository22.getAllUsers();
        userRepository15.saveAllUsers(userList27);
        userRepository1.saveAllUsers(userList27);
        com.reservation_system.model.Student student35 = new com.reservation_system.model.Student((int) (short) 100, "coord@yorku.ca", "Coordinator2", "Faculty", true);
        java.lang.String str36 = student35.getUserType();
        boolean boolean37 = student35.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) student35);
        int int39 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Student" + "'", str36, "Student");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
// flaky "49) test1264(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 102 + "'", int39 == 102);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getUserType();
        java.lang.String str10 = labManager7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        int int12 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("Student");
        boolean boolean18 = userRepository1.emailExists("Guest");
        boolean boolean20 = userRepository1.emailExists("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService21 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
// flaky "50) test1265(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 102 + "'", int12 == 102);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "headlabcoordinator", "Student", "", false);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        boolean boolean7 = labManager5.isApproved();
        boolean boolean8 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Faculty", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Student student10 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean11 = student10.requiresDepartmentApproval();
        java.lang.String str12 = student10.getPassword();
        java.lang.String str13 = student10.getEmail();
        java.lang.String str14 = student10.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student10);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinator" + "'", str13, "Coordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "Student", "", "Strong1!", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.model.Student student9 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean10 = student9.isApproved();
        java.lang.String str11 = student9.getName();
        userRepository1.addUser((com.reservation_system.model.User) student9);
        boolean boolean13 = student9.requiresDepartmentApproval();
        java.lang.String str14 = student9.getUserType();
        int int15 = student9.getID();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinator" + "'", str11, "Coordinator");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        int int10 = userRepository1.getNextID();
        int int11 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService12 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList9);
// flaky "51) test1271(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 102 + "'", int10 == 102);
// flaky "25) test1271(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest11 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str12 = guest11.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = coordinatorAccountService5.autoGenerateLabManagerAccount((com.reservation_system.model.User) guest11, "Manager1", "manager1@yorku.ca", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("data/test-users.csv");
        boolean boolean21 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "Faculty", "manager1@yorku.ca", "", false);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager18 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str19 = labManager18.getUserType();
        java.lang.String str20 = labManager18.getPassword();
        userRepository12.addUser((com.reservation_system.model.User) labManager18);
        boolean boolean22 = userRepository12.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher28 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository12.addUser((com.reservation_system.model.User) researcher28);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService30 = new com.reservation_system.services.CoordinatorAccountService(userRepository12);
        com.reservation_system.model.Guest guest36 = new com.reservation_system.model.Guest(0, "Guest", "headlabcoordinator", "Faculty", false);
        userRepository12.addUser((com.reservation_system.model.User) guest36);
        java.util.List<com.reservation_system.model.User> userList38 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList38);
        java.util.Optional<com.reservation_system.model.User> userOptional41 = userRepository1.findByEmail("Guest");
        java.util.Optional<com.reservation_system.model.User> userOptional43 = userRepository1.findByEmail("Researcher");
        boolean boolean44 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "labmanager" + "'", str19, "labmanager");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Student" + "'", str20, "Student");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(userOptional41);
        org.junit.Assert.assertNotNull(userOptional43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "data/test-users.csv", "coord@yorku.ca", "Faculty", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "data/test-users.csv" + "'", str7, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "coord@yorku.ca" + "'", str8, "coord@yorku.ca");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean21 = userRepository1.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService24 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean27 = userRepository26.headLabCoordinatorExists();
        boolean boolean28 = userRepository26.headLabCoordinatorExists();
        boolean boolean30 = userRepository26.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional32 = userRepository26.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository26.getAllUsers();
        userRepository1.saveAllUsers(userList33);
        com.reservation_system.model.Student student40 = new com.reservation_system.model.Student((int) '4', "data/test-users.csv", "Guest", "coord@yorku.ca", true);
        java.lang.String str41 = student40.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) student40);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
// flaky "52) test1277(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(userOptional32);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "coord@yorku.ca" + "'", str41, "coord@yorku.ca");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("coord@yorku.ca");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository10.findByEmail("Faculty");
        com.reservation_system.model.LabManager labManager18 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str19 = labManager18.getUserType();
        userRepository10.addUser((com.reservation_system.model.User) labManager18);
        userRepository1.addUser((com.reservation_system.model.User) labManager18);
        int int22 = userRepository1.getNextID();
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "labmanager" + "'", str19, "labmanager");
// flaky "53) test1278(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 102 + "'", int22 == 102);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "coord2@yorku.ca", "coord2@yorku.ca", "Student", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 100, "", "Researcher", "labmanager", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean14 = userRepository13.headLabCoordinatorExists();
        boolean boolean15 = userRepository13.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository13.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService18 = new com.reservation_system.services.CoordinatorAccountService(userRepository13);
        com.reservation_system.model.Guest guest24 = new com.reservation_system.model.Guest((int) (short) 100, "Manager1", "", "Student", false);
        userRepository13.addUser((com.reservation_system.model.User) guest24);
        java.util.List<com.reservation_system.model.User> userList26 = userRepository13.getAllUsers();
        userRepository1.saveAllUsers(userList26);
        java.util.List<com.reservation_system.model.User> userList28 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass29 = userList28.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
// flaky "54) test1280(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "labmanager", "manager1@yorku.ca", "hi!", false);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService12 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean14 = userRepository1.emailExists("labmanager");
        int int15 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
// flaky "55) test1282(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "26) test1282(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "Researcher", "", "Coordinator", true);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        java.lang.Class<?> wildcardClass8 = headLabCoordinator5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinator" + "'", str7, "Coordinator");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "", "Manager1", "labmanager", true);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager12);
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean17 = userRepository15.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository15.findByEmail("Researcher");
        boolean boolean20 = userRepository15.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository22.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository22.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository22.getAllUsers();
        userRepository15.saveAllUsers(userList27);
        userRepository1.saveAllUsers(userList27);
        int int30 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList31 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(userList27);
// flaky "56) test1285(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 102 + "'", int30 == 102);
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "", "Researcher", "Researcher", true);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(102, "headlabcoordinator", "labmanager", "", false);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "Student", "hi!", "", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "Student", "", "manager1@yorku.ca", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "headlabcoordinator", "data/test-users.csv", "Strong1!", false);
        guest5.setApproved(false);
        java.lang.String str8 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-users.csv" + "'", str8, "data/test-users.csv");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean14 = userRepository13.headLabCoordinatorExists();
        boolean boolean15 = userRepository13.headLabCoordinatorExists();
        boolean boolean17 = userRepository13.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository13.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList20 = userRepository13.getAllUsers();
        userRepository1.saveAllUsers(userList20);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService22 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.LabManager labManager28 = new com.reservation_system.model.LabManager(99, "coord@yorku.ca", "", "", false);
        java.lang.String str29 = labManager28.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user33 = coordinatorAccountService22.autoGenerateLabManagerAccount((com.reservation_system.model.User) labManager28, "Strong1!", "labmanager", "manager1@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "coord@yorku.ca" + "'", str29, "coord@yorku.ca");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService21 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        int int22 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList23 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional25 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional27 = userRepository1.findByEmail("Strong1!");
        int int28 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
// flaky "57) test1292(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 102 + "'", int22 == 102);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userOptional25);
        org.junit.Assert.assertNotNull(userOptional27);
// flaky "27) test1292(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 102 + "'", int28 == 102);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        java.lang.String str6 = student5.getName();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinator" + "'", str6, "Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("");
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean17 = userRepository16.headLabCoordinatorExists();
        boolean boolean18 = userRepository16.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository16.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository16.getAllUsers();
        userRepository1.saveAllUsers(userList21);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService23 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "coord2@yorku.ca", "Coordinator", "coord@yorku.ca", false);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student26 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str27 = student26.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) student26);
        boolean boolean29 = student26.isApproved();
        java.lang.String str30 = student26.getUserType();
        java.lang.String str31 = student26.getUserType();
        java.lang.String str32 = student26.getPassword();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Strong1!" + "'", str27, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Student" + "'", str30, "Student");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Student" + "'", str31, "Student");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Strong1!" + "'", str32, "Strong1!");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("Faculty");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher(10, "coord@yorku.ca", "Faculty", "Faculty", true);
        java.lang.String str10 = researcher9.getUserType();
        java.lang.String str11 = researcher9.getEmail();
        java.lang.String str12 = researcher9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        int int14 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
// flaky "58) test1297(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.model.Student student9 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean10 = student9.isApproved();
        java.lang.String str11 = student9.getName();
        userRepository1.addUser((com.reservation_system.model.User) student9);
        int int13 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService16 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean18 = userRepository1.emailExists("Coordinator2");
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean21 = userRepository20.headLabCoordinatorExists();
        boolean boolean22 = userRepository20.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository20.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService25 = new com.reservation_system.services.CoordinatorAccountService(userRepository20);
        java.util.List<com.reservation_system.model.User> userList26 = userRepository20.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList27 = userRepository20.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList28 = userRepository20.getAllUsers();
        userRepository1.saveAllUsers(userList28);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinator" + "'", str11, "Coordinator");
// flaky "59) test1298(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 102 + "'", int13 == 102);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager17 = new com.reservation_system.model.LabManager((int) (short) -1, "Guest", "coord@yorku.ca", "", true);
        java.lang.String str18 = labManager17.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager17);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "labmanager", "Faculty", "Researcher", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "Student", "headlabcoordinator", "", true);
        java.lang.String str6 = faculty5.getPassword();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(98, "coord@yorku.ca", "", "hi!", false);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "Manager1", "Coordinator", "manager1@yorku.ca", false);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str10 = labManager9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        labManager9.setApproved(true);
        java.lang.String str14 = labManager9.getEmail();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "Researcher", "Faculty", "", false);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "headlabcoordinator", "", "headlabcoordinator", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "hi!", "coord2@yorku.ca", "Manager1", false);
        java.lang.String str6 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "", "Faculty", "manager1@yorku.ca", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (byte) 100, "Strong1!", "manager1@yorku.ca", "", false);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        int int7 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        int int10 = userRepository1.getNextID();
        com.reservation_system.model.Faculty faculty16 = new com.reservation_system.model.Faculty((int) (short) -1, "coord2@yorku.ca", "data/test-users.csv", "hi!", false);
        java.lang.String str17 = faculty16.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty16);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
// flaky "60) test1310(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "28) test1310(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 102 + "'", int10 == 102);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "coord2@yorku.ca" + "'", str17, "coord2@yorku.ca");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("Manager1");
        com.reservation_system.model.Student student11 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean12 = student11.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) student11);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService14 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Student student20 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Manager1", "Guest", true);
        student20.setApproved(true);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user26 = coordinatorAccountService14.autoGenerateLabManagerAccount((com.reservation_system.model.User) student20, "", "Guest", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getPassword();
        boolean boolean8 = student5.isApproved();
        java.lang.String str9 = student5.getUserType();
        student5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Researcher", "Student", "Coordinator2", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "coord@yorku.ca", "data/test-users.csv", "manager1@yorku.ca", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(102, "Faculty", "labmanager", "", true);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "hi!", "Coordinator", "manager1@yorku.ca", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        java.lang.String str8 = headLabCoordinator5.getName();
        java.lang.String str9 = headLabCoordinator5.getName();
        java.lang.String str10 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinator" + "'", str7, "Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "manager1@yorku.ca" + "'", str10, "manager1@yorku.ca");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean13 = userRepository12.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository12.getAllUsers();
        int int15 = userRepository12.getNextID();
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean19 = userRepository17.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository17.findByEmail("coord2@yorku.ca");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository17.getAllUsers();
        userRepository12.saveAllUsers(userList22);
        userRepository1.saveAllUsers(userList22);
        java.util.List<com.reservation_system.model.User> userList25 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
// flaky "61) test1317(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        int int8 = researcher5.getID();
        boolean boolean9 = researcher5.isApproved();
        researcher5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "labmanager", "Coordinator2", "", true);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "hi!", "coord2@yorku.ca", "Manager1", false);
        researcher5.setApproved(true);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(2, "Coordinator2", "Researcher", "hi!", false);
        labManager5.setApproved(true);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 99, "coord@yorku.ca", "Coordinator", "labmanager", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(35, "Guest", "", "coord2@yorku.ca", true);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository8 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository8.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository8.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList13 = userRepository8.getAllUsers();
        int int14 = userRepository8.getNextID();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository8.getAllUsers();
        userRepository1.saveAllUsers(userList15);
        com.reservation_system.model.Researcher researcher22 = new com.reservation_system.model.Researcher((int) (byte) 100, "", "Researcher", "labmanager", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher22);
        java.lang.String str24 = researcher22.getUserType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Researcher" + "'", str24, "Researcher");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        int int10 = userRepository1.getNextID();
        int int11 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService12 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean15 = userRepository1.emailExists("Student");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService16 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.User user20 = coordinatorAccountService16.createHeadLabCoordinator("Strong1!", "Coordinator2", "manager1@yorku.ca");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(user20);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Student", "Coordinator2", "data/test-users.csv", true);
        java.lang.String str6 = faculty5.getPassword();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-users.csv" + "'", str6, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository10.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository10.findByEmail("headlabcoordinator");
        boolean boolean16 = userRepository10.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList17);
        boolean boolean20 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional22 = userRepository1.findByEmail("Researcher");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userOptional22);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (short) 100, "hi!", "", "manager1@yorku.ca", true);
        java.lang.String str7 = user6.getName();
        java.lang.String str8 = user6.getEmail();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "data/test-users.csv", "manager1@yorku.ca", "data/test-users.csv", false);
        java.lang.String str6 = faculty5.getPassword();
        boolean boolean7 = faculty5.isApproved();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getEmail();
        java.lang.String str10 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-users.csv" + "'", str6, "data/test-users.csv");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "manager1@yorku.ca" + "'", str9, "manager1@yorku.ca");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(101, "hi!", "", "Coordinator2", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService21 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        int int22 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository24.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional28 = userRepository24.findByEmail("headlabcoordinator");
        boolean boolean30 = userRepository24.emailExists("Manager1");
        boolean boolean31 = userRepository24.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional33 = userRepository24.findByEmail("Coordinator");
        java.util.List<com.reservation_system.model.User> userList34 = userRepository24.getAllUsers();
        userRepository1.saveAllUsers(userList34);
        boolean boolean37 = userRepository1.emailExists("manager1@yorku.ca");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService38 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.LabManager labManager44 = new com.reservation_system.model.LabManager(0, "coord2@yorku.ca", "Faculty", "Researcher", false);
        boolean boolean45 = labManager44.requiresDepartmentApproval();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user49 = coordinatorAccountService38.autoGenerateLabManagerAccount((com.reservation_system.model.User) labManager44, "Faculty", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 102 + "'", int22 == 102);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(userOptional33);
        org.junit.Assert.assertNotNull(userList34);
// flaky "62) test1331(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "coord@yorku.ca", "manager1@yorku.ca", "", false);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Guest");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService11 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user15 = coordinatorAccountService11.createHeadLabCoordinator("Coordinator", "Coordinator2", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "hi!", "Coordinator2", "data/test-users.csv", false);
        student5.setApproved(true);
        student5.setApproved(true);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService21 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        int int22 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository24.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional28 = userRepository24.findByEmail("headlabcoordinator");
        boolean boolean30 = userRepository24.emailExists("Manager1");
        boolean boolean31 = userRepository24.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional33 = userRepository24.findByEmail("Coordinator");
        java.util.List<com.reservation_system.model.User> userList34 = userRepository24.getAllUsers();
        userRepository1.saveAllUsers(userList34);
        boolean boolean37 = userRepository1.emailExists("manager1@yorku.ca");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService38 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user42 = coordinatorAccountService38.createHeadLabCoordinator("coord@yorku.ca", "Strong1!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 102 + "'", int22 == 102);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(userOptional33);
        org.junit.Assert.assertNotNull(userList34);
// flaky "63) test1335(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "headlabcoordinator", "Student", "", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "Researcher", "hi!", "coord2@yorku.ca", true);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository8 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository8.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository8.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList13 = userRepository8.getAllUsers();
        int int14 = userRepository8.getNextID();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository8.getAllUsers();
        userRepository1.saveAllUsers(userList15);
        com.reservation_system.model.Researcher researcher22 = new com.reservation_system.model.Researcher((int) (byte) 100, "", "Researcher", "labmanager", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher22);
        int int24 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("manager1@yorku.ca");
        int int27 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 102 + "'", int24 == 102);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 102 + "'", int27 == 102);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "data/test-users.csv", "Coordinator2", "", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getEmail();
        java.lang.String str9 = faculty5.getUserType();
        int int10 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinator2" + "'", str8, "Coordinator2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "data/test-users.csv", "coord@yorku.ca", "Manager1", false);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(101, "Strong1!", "", "Manager1", true);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("manager1@yorku.ca", 52, "Student", "Guest", "manager1@yorku.ca", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: manager1@yorku.ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest10 = new com.reservation_system.model.Guest(0, "labmanager", "Coordinator2", "Researcher", false);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user14 = coordinatorAccountService4.autoGenerateLabManagerAccount((com.reservation_system.model.User) guest10, "headlabcoordinator", "Coordinator", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "64) test1343(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "Coordinator2", "headlabcoordinator", "labmanager", false);
        java.lang.String str6 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(98, "Researcher", "coord2@yorku.ca", "", true);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = coordinatorAccountService13.createHeadLabCoordinator("", "Coordinator2", "manager1@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("coord2@yorku.ca");
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("Coordinator");
        java.lang.Class<?> wildcardClass6 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "data/test-users.csv", "Coordinator2", "", true);
        boolean boolean6 = faculty5.isApproved();
        int int7 = faculty5.getID();
        boolean boolean8 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "data/test-users.csv", "Faculty", "Researcher", true);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 100, "", "Researcher", "labmanager", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "labmanager", "", "Coordinator", false);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService9 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService11 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.User user19 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) (byte) 1, "manager1@yorku.ca", "coord2@yorku.ca", "Coordinator2", true);
        userRepository1.addUser(user19);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(user19);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService19 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest(0, "Guest", "headlabcoordinator", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) guest25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService28 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Student student34 = new com.reservation_system.model.Student((int) (short) -1, "coord2@yorku.ca", "Student", "Coordinator", true);
        student34.setApproved(true);
        java.lang.String str37 = student34.getUserType();
        java.lang.String str38 = student34.getUserType();
        java.lang.String str39 = student34.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) student34);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Student" + "'", str37, "Student");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Student" + "'", str38, "Student");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Coordinator" + "'", str39, "Coordinator");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean21 = userRepository1.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService24 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService25 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator31 = new com.reservation_system.model.HeadLabCoordinator(1, "hi!", "manager1@yorku.ca", "Manager1", true);
        int int32 = headLabCoordinator31.getID();
        com.reservation_system.model.User user36 = coordinatorAccountService25.autoGenerateLabManagerAccount((com.reservation_system.model.User) headLabCoordinator31, "Researcher", "data/test-users.csv", "coord2@yorku.ca");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(user36);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "manager1@yorku.ca", "Faculty", "labmanager", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "", "", "coord2@yorku.ca", true);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("coord2@yorku.ca");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService9 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user13 = coordinatorAccountService9.createHeadLabCoordinator("Coordinator", "hi!", "Coordinator2");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "Faculty", "coord2@yorku.ca", "", false);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (byte) 100, "Coordinator", "data/test-users.csv", "", true);
        boolean boolean7 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Coordinator2", "", "Coordinator2", false);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        int int4 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str13 = labManager12.getUserType();
        java.lang.String str14 = labManager12.getPassword();
        userRepository6.addUser((com.reservation_system.model.User) labManager12);
        boolean boolean16 = userRepository6.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher22 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository6.addUser((com.reservation_system.model.User) researcher22);
        java.util.Optional<com.reservation_system.model.User> userOptional25 = userRepository6.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService26 = new com.reservation_system.services.CoordinatorAccountService(userRepository6);
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager34 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str35 = labManager34.getUserType();
        java.lang.String str36 = labManager34.getPassword();
        userRepository28.addUser((com.reservation_system.model.User) labManager34);
        boolean boolean38 = userRepository28.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher44 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository28.addUser((com.reservation_system.model.User) researcher44);
        java.util.Optional<com.reservation_system.model.User> userOptional47 = userRepository28.findByEmail("data/test-users.csv");
        int int48 = userRepository28.getNextID();
        java.util.List<com.reservation_system.model.User> userList49 = userRepository28.getAllUsers();
        userRepository6.saveAllUsers(userList49);
        userRepository1.saveAllUsers(userList49);
        java.util.Optional<com.reservation_system.model.User> userOptional53 = userRepository1.findByEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 103 + "'", int4 == 103);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "labmanager" + "'", str13, "labmanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userOptional25);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "labmanager" + "'", str35, "labmanager");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Student" + "'", str36, "Student");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(userOptional47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 103 + "'", int48 == 103);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertNotNull(userOptional53);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "", "headlabcoordinator", "hi!", false);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Researcher", "Student", "Coordinator2", true);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "manager1@yorku.ca", "Manager1", "", true);
        labManager5.setApproved(true);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Guest", "Manager1", "Coordinator", true);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "", "labmanager", "Coordinator", true);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager12);
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager21 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str22 = labManager21.getUserType();
        java.lang.String str23 = labManager21.getPassword();
        userRepository15.addUser((com.reservation_system.model.User) labManager21);
        boolean boolean25 = userRepository15.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher31 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository15.addUser((com.reservation_system.model.User) researcher31);
        java.util.Optional<com.reservation_system.model.User> userOptional34 = userRepository15.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService35 = new com.reservation_system.services.CoordinatorAccountService(userRepository15);
        com.reservation_system.repository.UserRepository userRepository37 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager43 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str44 = labManager43.getUserType();
        java.lang.String str45 = labManager43.getPassword();
        userRepository37.addUser((com.reservation_system.model.User) labManager43);
        boolean boolean47 = userRepository37.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher53 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository37.addUser((com.reservation_system.model.User) researcher53);
        java.util.Optional<com.reservation_system.model.User> userOptional56 = userRepository37.findByEmail("data/test-users.csv");
        int int57 = userRepository37.getNextID();
        java.util.List<com.reservation_system.model.User> userList58 = userRepository37.getAllUsers();
        userRepository15.saveAllUsers(userList58);
        userRepository1.saveAllUsers(userList58);
        java.util.Optional<com.reservation_system.model.User> userOptional62 = userRepository1.findByEmail("Strong1!");
        java.util.Optional<com.reservation_system.model.User> userOptional64 = userRepository1.findByEmail("labmanager");
        int int65 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService66 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Faculty faculty72 = new com.reservation_system.model.Faculty((int) '#', "labmanager", "", "", true);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user76 = coordinatorAccountService66.autoGenerateLabManagerAccount((com.reservation_system.model.User) faculty72, "Coordinator2", "hi!", "headlabcoordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "labmanager" + "'", str22, "labmanager");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Student" + "'", str23, "Student");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(userOptional34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "labmanager" + "'", str44, "labmanager");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Student" + "'", str45, "Student");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(userOptional56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 103 + "'", int57 == 103);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(userOptional62);
        org.junit.Assert.assertNotNull(userOptional64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 103 + "'", int65 == 103);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "", "Guest", "data/test-users.csv", false);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        boolean boolean8 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService7 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user11 = coordinatorAccountService7.createHeadLabCoordinator("coord2@yorku.ca", "data/test-users.csv", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "data/test-users.csv", "Coordinator2", "coord@yorku.ca", false);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "Guest", "manager1@yorku.ca", "manager1@yorku.ca", false);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager12);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService14 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = coordinatorAccountService14.createHeadLabCoordinator("data/test-users.csv", "", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "", "Coordinator", "hi!", false);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository10.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository10.findByEmail("headlabcoordinator");
        boolean boolean16 = userRepository10.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList17);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager27 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str28 = labManager27.getUserType();
        java.lang.String str29 = labManager27.getUserType();
        java.lang.String str30 = labManager27.getUserType();
        userRepository21.addUser((com.reservation_system.model.User) labManager27);
        int int32 = userRepository21.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService33 = new com.reservation_system.services.CoordinatorAccountService(userRepository21);
        java.util.List<com.reservation_system.model.User> userList34 = userRepository21.getAllUsers();
        userRepository1.saveAllUsers(userList34);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "65) test1376(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional14);
// flaky "29) test1376(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "labmanager" + "'", str28, "labmanager");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "labmanager" + "'", str29, "labmanager");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "labmanager" + "'", str30, "labmanager");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 103 + "'", int32 == 103);
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "Coordinator2", "headlabcoordinator", "coord2@yorku.ca", true);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getUserType();
        java.lang.String str10 = labManager7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        int int12 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("Student");
        boolean boolean18 = userRepository1.emailExists("Guest");
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        java.lang.Class<?> wildcardClass20 = userRepository1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 103 + "'", int12 == 103);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "", "Strong1!", "coord2@yorku.ca", true);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        int int8 = researcher5.getID();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str10 = labManager9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        boolean boolean13 = userRepository1.emailExists("Coordinator");
        com.reservation_system.model.Student student19 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean20 = student19.requiresDepartmentApproval();
        java.lang.String str21 = student19.getUserType();
        int int22 = student19.getID();
        userRepository1.addUser((com.reservation_system.model.User) student19);
        java.lang.String str24 = student19.getName();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Student" + "'", str21, "Student");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Coordinator" + "'", str24, "Coordinator");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "coord@yorku.ca", "Guest", "manager1@yorku.ca", false);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "", "", "labmanager", false);
        headLabCoordinator5.setApproved(true);
        java.lang.String str8 = headLabCoordinator5.getName();
        int int9 = headLabCoordinator5.getID();
        java.lang.Class<?> wildcardClass10 = headLabCoordinator5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 0, "Coordinator", "data/test-users.csv", "manager1@yorku.ca", true);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Guest", "coord2@yorku.ca", "coord@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coord2@yorku.ca" + "'", str7, "coord2@yorku.ca");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "Faculty", "manager1@yorku.ca", "Researcher", false);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Manager1", "Guest", true);
        student5.setApproved(true);
        java.lang.String str8 = student5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinator" + "'", str8, "Coordinator");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("labmanager");
        boolean boolean21 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService22 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        int int23 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional27 = userRepository25.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional29 = userRepository25.findByEmail("headlabcoordinator");
        boolean boolean31 = userRepository25.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList32 = userRepository25.getAllUsers();
        boolean boolean34 = userRepository25.emailExists("");
        com.reservation_system.model.LabManager labManager40 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str41 = labManager40.getEmail();
        java.lang.String str42 = labManager40.getUserType();
        userRepository25.addUser((com.reservation_system.model.User) labManager40);
        userRepository1.addUser((com.reservation_system.model.User) labManager40);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 103 + "'", int23 == 103);
        org.junit.Assert.assertNotNull(userOptional27);
        org.junit.Assert.assertNotNull(userOptional29);
// flaky "66) test1388(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(userList32);
// flaky "30) test1388(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Faculty" + "'", str41, "Faculty");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "labmanager" + "'", str42, "labmanager");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Strong1!", "labmanager", "headlabcoordinator", false);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "Researcher", "", "Coordinator", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "coord@yorku.ca", "manager1@yorku.ca", "Manager1", false);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "coord2@yorku.ca", "coord2@yorku.ca", "hi!", true);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        java.lang.String str8 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Manager1", "Strong1!", "", true);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService11 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        java.lang.String str18 = faculty17.getUserType();
        java.lang.String str19 = faculty17.getPassword();
        faculty17.setApproved(false);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user25 = coordinatorAccountService11.autoGenerateLabManagerAccount((com.reservation_system.model.User) faculty17, "coord2@yorku.ca", "", "coord2@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("headlabcoordinator");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "67) test1395(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(99, "Coordinator2", "coord@yorku.ca", "coord2@yorku.ca", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "Faculty", "manager1@yorku.ca", "", false);
        java.lang.String str6 = student5.getName();
        boolean boolean7 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Coordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("Researcher");
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "68) test1398(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService19 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest(0, "Guest", "headlabcoordinator", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) guest25);
        java.util.Optional<com.reservation_system.model.User> userOptional28 = userRepository1.findByEmail("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional28);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "Researcher", "coord2@yorku.ca", "Coordinator2", true);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinator2" + "'", str6, "Coordinator2");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "data/test-users.csv", "Strong1!", "Faculty", false);
        researcher5.setApproved(true);
        researcher5.setApproved(true);
        boolean boolean10 = researcher5.isApproved();
        boolean boolean11 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "manager1@yorku.ca", "hi!", "", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        int int7 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest14 = new com.reservation_system.model.Guest((int) (short) 100, "Researcher", "Student", "Coordinator2", true);
        boolean boolean15 = guest14.requiresDepartmentApproval();
        java.lang.String str16 = guest14.getUserType();
        guest14.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) guest14);
        java.util.List<com.reservation_system.model.User> userList20 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty26 = new com.reservation_system.model.Faculty(52, "manager1@yorku.ca", "Strong1!", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty26);
        java.lang.String str28 = faculty26.getUserType();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 103 + "'", int7 == 103);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Guest" + "'", str16, "Guest");
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Faculty" + "'", str28, "Faculty");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository4.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository4.findByEmail("headlabcoordinator");
        boolean boolean10 = userRepository4.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository4.getAllUsers();
        boolean boolean13 = userRepository4.emailExists("");
        com.reservation_system.model.LabManager labManager19 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str20 = labManager19.getEmail();
        java.lang.String str21 = labManager19.getUserType();
        userRepository4.addUser((com.reservation_system.model.User) labManager19);
        boolean boolean23 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.model.Student student29 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str30 = student29.getPassword();
        userRepository4.addUser((com.reservation_system.model.User) student29);
        boolean boolean32 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository34 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean35 = userRepository34.headLabCoordinatorExists();
        boolean boolean36 = userRepository34.headLabCoordinatorExists();
        boolean boolean38 = userRepository34.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional40 = userRepository34.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList41 = userRepository34.getAllUsers();
        userRepository4.saveAllUsers(userList41);
        userRepository1.saveAllUsers(userList41);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService44 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        int int45 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
// flaky "69) test1404(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
// flaky "31) test1404(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "labmanager" + "'", str21, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Strong1!" + "'", str30, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
// flaky "7) test1404(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(userOptional40);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 103 + "'", int45 == 103);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getID();
        java.lang.String str9 = student5.getEmail();
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinator" + "'", str9, "Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "labmanager", "headlabcoordinator", "manager1@yorku.ca", true);
        labManager5.setApproved(false);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Student", "Researcher", "Coordinator", true);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "coord2@yorku.ca", "Faculty", "labmanager", false);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "data/test-users.csv", "Coordinator2", "", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinator2" + "'", str7, "Coordinator2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinator2" + "'", str8, "Coordinator2");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "coord@yorku.ca", "coord@yorku.ca", "Guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coord@yorku.ca" + "'", str7, "coord@yorku.ca");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "Strong1!", "Student", "labmanager", false);
        java.lang.String str6 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Strong1!" + "'", str6, "Strong1!");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "manager1@yorku.ca", "", "Guest", true);
        guest5.setApproved(false);
        int int8 = guest5.getID();
        java.lang.String str9 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getPassword();
        int int10 = labManager5.getID();
        java.lang.String str11 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinator2" + "'", str9, "Coordinator2");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Student", "manager1@yorku.ca", "Researcher", true);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "headlabcoordinator", "Coordinator", "", false);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "Coordinator2", "coord@yorku.ca", "Coordinator", true);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest12 = new com.reservation_system.model.Guest((int) (short) 100, "Manager1", "", "Student", false);
        userRepository1.addUser((com.reservation_system.model.User) guest12);
        int int14 = userRepository1.getNextID();
        int int15 = userRepository1.getNextID();
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        int int17 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 103 + "'", int14 == 103);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 103 + "'", int15 == 103);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 103 + "'", int17 == 103);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "hi!", "coord2@yorku.ca", "Coordinator", false);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(102, "Coordinator2", "hi!", "coord2@yorku.ca", true);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Coordinator");
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean13 = userRepository12.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository12.getAllUsers();
        int int15 = userRepository12.getNextID();
        com.reservation_system.model.Researcher researcher21 = new com.reservation_system.model.Researcher((int) (byte) 100, "", "Researcher", "labmanager", true);
        userRepository12.addUser((com.reservation_system.model.User) researcher21);
        java.util.List<com.reservation_system.model.User> userList23 = userRepository12.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean27 = userRepository25.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService28 = new com.reservation_system.services.CoordinatorAccountService(userRepository25);
        int int29 = userRepository25.getNextID();
        java.util.List<com.reservation_system.model.User> userList30 = userRepository25.getAllUsers();
        userRepository12.saveAllUsers(userList30);
        userRepository1.saveAllUsers(userList30);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService33 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user37 = coordinatorAccountService33.createHeadLabCoordinator("Student", "Coordinator2", "coord@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "70) test1420(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 103 + "'", int15 == 103);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 103 + "'", int29 == 103);
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getName();
        int int8 = student5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinator" + "'", str7, "Coordinator");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(99, "Coordinator", "Faculty", "", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "data/test-users.csv", "", "labmanager", false);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "hi!", "coord2@yorku.ca", "Guest", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "", "Coordinator", "Coordinator2", false);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(98, "Researcher", "", "hi!", true);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "", "Manager1", "labmanager", true);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService9 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        int int10 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository12.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository12.findByEmail("headlabcoordinator");
        boolean boolean18 = userRepository12.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository12.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional23 = userRepository21.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional25 = userRepository21.findByEmail("headlabcoordinator");
        boolean boolean27 = userRepository21.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList28 = userRepository21.getAllUsers();
        userRepository12.saveAllUsers(userList28);
        java.util.List<com.reservation_system.model.User> userList30 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList30);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 103 + "'", int10 == 103);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
// flaky "71) test1429(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertNotNull(userOptional25);
// flaky "32) test1429(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "manager1@yorku.ca", "coord2@yorku.ca", "data/test-users.csv", true);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "data/test-users.csv", "manager1@yorku.ca", "data/test-users.csv", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "data/test-users.csv" + "'", str7, "data/test-users.csv");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("coord2@yorku.ca");
        int int6 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService7 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 103 + "'", int6 == 103);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(99, "", "hi!", "Faculty", true);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest11 = new com.reservation_system.model.Guest(32, "Coordinator", "data/test-users.csv", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) guest11);
        com.reservation_system.model.Researcher researcher18 = new com.reservation_system.model.Researcher((int) (short) 10, "Coordinator", "headlabcoordinator", "headlabcoordinator", true);
        java.lang.String str19 = researcher18.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Researcher" + "'", str19, "Researcher");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Student student19 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean20 = student19.requiresDepartmentApproval();
        boolean boolean21 = student19.requiresDepartmentApproval();
        student19.setApproved(true);
        java.lang.String str24 = student19.getName();
        java.lang.String str25 = student19.getUserType();
        java.lang.String str26 = student19.getUserType();
        java.lang.String str27 = student19.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user31 = coordinatorAccountService13.autoGenerateLabManagerAccount((com.reservation_system.model.User) student19, "manager1@yorku.ca", "", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Coordinator" + "'", str24, "Coordinator");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Student" + "'", str25, "Student");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Student" + "'", str26, "Student");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coordinator" + "'", str27, "Coordinator");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str6 = guest5.getPassword();
        boolean boolean7 = guest5.isApproved();
        int int8 = guest5.getID();
        java.lang.String str9 = guest5.getUserType();
        int int10 = guest5.getID();
        java.lang.String str11 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "Strong1!", "manager1@yorku.ca", "", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Manager1", "", "Strong1!", true);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Strong1!" + "'", str8, "Strong1!");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest12 = new com.reservation_system.model.Guest((int) (short) 100, "Manager1", "", "Student", false);
        userRepository1.addUser((com.reservation_system.model.User) guest12);
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("hi!");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService16 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator22 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "headlabcoordinator", "Researcher", "manager1@yorku.ca", false);
        java.lang.String str23 = headLabCoordinator22.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user27 = coordinatorAccountService16.autoGenerateLabManagerAccount((com.reservation_system.model.User) headLabCoordinator22, "hi!", "hi!", "Coordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Head lab coordinator account is not approved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "headlabcoordinator" + "'", str23, "headlabcoordinator");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getPassword();
        int int11 = researcher5.getID();
        java.lang.String str12 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "coord2@yorku.ca" + "'", str10, "coord2@yorku.ca");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "coord@yorku.ca" + "'", str12, "coord@yorku.ca");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        boolean boolean5 = userRepository1.emailExists("");
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        java.lang.String str12 = faculty11.getUserType();
        java.lang.String str13 = faculty11.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService15 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Student student21 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str22 = student21.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user26 = coordinatorAccountService15.autoGenerateLabManagerAccount((com.reservation_system.model.User) student21, "coord2@yorku.ca", "Coordinator", "coord2@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Student" + "'", str22, "Student");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student26 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str27 = student26.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) student26);
        com.reservation_system.model.Student student34 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean35 = student34.requiresDepartmentApproval();
        java.lang.String str36 = student34.getUserType();
        int int37 = student34.getID();
        userRepository1.addUser((com.reservation_system.model.User) student34);
        boolean boolean40 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.model.Guest guest46 = new com.reservation_system.model.Guest((int) (short) 100, "Researcher", "Student", "Coordinator2", true);
        boolean boolean47 = guest46.requiresDepartmentApproval();
        java.lang.String str48 = guest46.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest46);
        java.util.List<com.reservation_system.model.User> userList50 = userRepository1.getAllUsers();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator56 = new com.reservation_system.model.HeadLabCoordinator(1, "", "Faculty", "labmanager", true);
        java.lang.String str57 = headLabCoordinator56.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator56);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "72) test1442(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Strong1!" + "'", str27, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Student" + "'", str36, "Student");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Guest" + "'", str48, "Guest");
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "headlabcoordinator" + "'", str57, "headlabcoordinator");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "labmanager", "", "hi!", false);
        faculty5.setApproved(false);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "", "Student", "Researcher", true);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getPassword();
        boolean boolean8 = labManager5.requiresDepartmentApproval();
        java.lang.String str9 = labManager5.getPassword();
        java.lang.String str10 = labManager5.getPassword();
        java.lang.String str11 = labManager5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager18 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str19 = labManager18.getUserType();
        java.lang.String str20 = labManager18.getPassword();
        userRepository12.addUser((com.reservation_system.model.User) labManager18);
        boolean boolean22 = userRepository12.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher28 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository12.addUser((com.reservation_system.model.User) researcher28);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService30 = new com.reservation_system.services.CoordinatorAccountService(userRepository12);
        com.reservation_system.model.Guest guest36 = new com.reservation_system.model.Guest(0, "Guest", "headlabcoordinator", "Faculty", false);
        userRepository12.addUser((com.reservation_system.model.User) guest36);
        java.util.List<com.reservation_system.model.User> userList38 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList38);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator45 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "labmanager", "manager1@yorku.ca", "Researcher", true);
        headLabCoordinator45.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator45);
        java.lang.String str49 = headLabCoordinator45.getUserType();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "73) test1445(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "labmanager" + "'", str19, "labmanager");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Student" + "'", str20, "Student");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "headlabcoordinator" + "'", str49, "headlabcoordinator");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "headlabcoordinator", "data/test-users.csv", "Strong1!", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "headlabcoordinator", "Faculty", "labmanager", false);
        guest5.setApproved(true);
        int int8 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinator" + "'", str8, "Coordinator");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Student", "", "Coordinator2", false);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "", "manager1@yorku.ca", "data/test-users.csv", true);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService11 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        int int12 = userRepository1.getNextID();
        int int13 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 103 + "'", int12 == 103);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 103 + "'", int13 == 103);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Coordinator");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Strong1!");
        com.reservation_system.model.Student student19 = new com.reservation_system.model.Student((int) (byte) 10, "", "labmanager", "Coordinator2", true);
        userRepository1.addUser((com.reservation_system.model.User) student19);
        com.reservation_system.model.Guest guest26 = new com.reservation_system.model.Guest((int) (byte) 1, "coord@yorku.ca", "manager1@yorku.ca", "Researcher", false);
        userRepository1.addUser((com.reservation_system.model.User) guest26);
        int int28 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "74) test1452(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 103 + "'", int28 == 103);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        int int10 = userRepository1.getNextID();
        com.reservation_system.model.Student student16 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean17 = student16.requiresDepartmentApproval();
        java.lang.String str18 = student16.getUserType();
        student16.setApproved(false);
        student16.setApproved(false);
        int int23 = student16.getID();
        userRepository1.addUser((com.reservation_system.model.User) student16);
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional28 = userRepository26.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository26.findByEmail("headlabcoordinator");
        boolean boolean32 = userRepository26.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository26.getAllUsers();
        boolean boolean34 = userRepository26.headLabCoordinatorExists();
        boolean boolean35 = userRepository26.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList36 = userRepository26.getAllUsers();
        userRepository1.saveAllUsers(userList36);
        boolean boolean39 = userRepository1.emailExists("Coordinator2");
        boolean boolean40 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 103 + "'", int10 == 103);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertNotNull(userOptional30);
// flaky "75) test1453(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository5.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository5.findByEmail("headlabcoordinator");
        boolean boolean11 = userRepository5.emailExists("Manager1");
        boolean boolean12 = userRepository5.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository5.findByEmail("Coordinator");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList15);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService17 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional9);
// flaky "76) test1454(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "labmanager", "labmanager", "manager1@yorku.ca", false);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Coordinator2", (int) (byte) 1, "Student", "coord@yorku.ca", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Coordinator2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(99, "Strong1!", "Coordinator", "headlabcoordinator", false);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "", "Guest", "", false);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "Coordinator", "data/test-users.csv", "Guest", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Coordinator2", "Coordinator2", "Coordinator", false);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "data/test-users.csv", "manager1@yorku.ca", "data/test-users.csv", false);
        java.lang.String str6 = faculty5.getPassword();
        boolean boolean7 = faculty5.isApproved();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-users.csv" + "'", str6, "data/test-users.csv");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "data/test-users.csv" + "'", str9, "data/test-users.csv");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("coord@yorku.ca");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository10.findByEmail("Faculty");
        com.reservation_system.model.LabManager labManager18 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str19 = labManager18.getUserType();
        userRepository10.addUser((com.reservation_system.model.User) labManager18);
        userRepository1.addUser((com.reservation_system.model.User) labManager18);
        int int22 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList23 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "labmanager" + "'", str19, "labmanager");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 103 + "'", int22 == 103);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("Researcher");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        java.lang.Class<?> wildcardClass8 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "coord@yorku.ca", "data/test-users.csv", "manager1@yorku.ca", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "manager1@yorku.ca" + "'", str7, "manager1@yorku.ca");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str10 = labManager9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        boolean boolean13 = userRepository1.emailExists("Coordinator");
        com.reservation_system.model.Student student19 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean20 = student19.requiresDepartmentApproval();
        java.lang.String str21 = student19.getUserType();
        int int22 = student19.getID();
        userRepository1.addUser((com.reservation_system.model.User) student19);
        java.lang.String str24 = student19.getUserType();
        boolean boolean25 = student19.requiresDepartmentApproval();
        java.lang.String str26 = student19.getUserType();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Student" + "'", str21, "Student");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Student" + "'", str24, "Student");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Student" + "'", str26, "Student");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getUserType();
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", 98, "Student", "Coordinator2", "Coordinator2", false);
        boolean boolean7 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "Coordinator2", "data/test-users.csv", "Researcher", true);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "data/test-users.csv", "data/test-users.csv", "manager1@yorku.ca", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "Strong1!", "Coordinator", "Student", false);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService19 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest(0, "Guest", "headlabcoordinator", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) guest25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository1.getAllUsers();
        com.reservation_system.model.Researcher researcher33 = new com.reservation_system.model.Researcher((int) (short) -1, "labmanager", "coord2@yorku.ca", "Strong1!", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher33);
        boolean boolean36 = userRepository1.emailExists("coord2@yorku.ca");
        com.reservation_system.model.Faculty faculty42 = new com.reservation_system.model.Faculty(102, "Student", "Student", "data/test-users.csv", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty42);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "", "", "labmanager", false);
        headLabCoordinator5.setApproved(true);
        java.lang.String str8 = headLabCoordinator5.getName();
        int int9 = headLabCoordinator5.getID();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "Coordinator", "Coordinator2", "coord2@yorku.ca", true);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinator" + "'", str6, "Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getUserType();
        java.lang.String str10 = labManager7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        int int12 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("manager1@yorku.ca");
        com.reservation_system.model.Guest guest23 = new com.reservation_system.model.Guest((int) (short) 100, "Researcher", "Student", "Coordinator2", true);
        boolean boolean24 = guest23.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest23);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 103 + "'", int12 == 103);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "Faculty", "data/test-users.csv", "Strong1!", true);
        java.lang.String str6 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(99, "Coordinator", "Coordinator", "hi!", true);
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "labmanager", "coord2@yorku.ca", "data/test-users.csv", false);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "Strong1!", "Coordinator", "Strong1!", false);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 102, "Student", "Guest", "Faculty", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "Strong1!", "", "Coordinator", true);
        java.lang.String str6 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(102, "coord2@yorku.ca", "", "Strong1!", true);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "Strong1!", "Coordinator", "headlabcoordinator", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "Researcher", "hi!", "coord2@yorku.ca", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean21 = userRepository1.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService24 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList25 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "77) test1484(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "", "headlabcoordinator", "Faculty", false);
        researcher5.setApproved(true);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService10 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (byte) 0, "", "Student", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        com.reservation_system.repository.UserRepository userRepository19 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository19.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional23 = userRepository19.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList24 = userRepository19.getAllUsers();
        userRepository1.saveAllUsers(userList24);
        com.reservation_system.model.Guest guest31 = new com.reservation_system.model.Guest((int) (short) -1, "labmanager", "headlabcoordinator", "", true);
        userRepository1.addUser((com.reservation_system.model.User) guest31);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("coord2@yorku.ca", (int) (byte) 10, "Coordinator", "Student", "coord@yorku.ca", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: coord2@yorku.ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(99, "coord@yorku.ca", "", "", false);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean21 = userRepository1.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList24 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional28 = userRepository26.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository26.findByEmail("headlabcoordinator");
        boolean boolean32 = userRepository26.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository26.getAllUsers();
        boolean boolean35 = userRepository26.emailExists("");
        java.util.List<com.reservation_system.model.User> userList36 = userRepository26.getAllUsers();
        userRepository1.saveAllUsers(userList36);
        java.util.List<com.reservation_system.model.User> userList38 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "78) test1489(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertNotNull(userOptional30);
// flaky "33) test1489(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userList38);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "hi!", "Guest", "coord@yorku.ca", false);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "79) test1491(com.reservation_system.Randoop.CoordinatorService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(35, "labmanager", "Student", "coord2@yorku.ca", false);
        java.lang.String str6 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str6 = labManager5.getEmail();
        boolean boolean7 = labManager5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "", "coord2@yorku.ca", "Strong1!", false);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "coord2@yorku.ca", "Faculty", "Faculty", false);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "Strong1!", "Guest", "Researcher", true);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "Coordinator2", "Student", "Faculty", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "", "headlabcoordinator", "labmanager", true);
        java.lang.String str6 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "labmanager", "data/test-users.csv", "labmanager", true);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getPassword();
        java.lang.String str9 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "Coordinator", "Guest", "coord2@yorku.ca", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        int int8 = faculty5.getID();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }
}
