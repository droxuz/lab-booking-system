package com.reservation_system.Randoop.CoordinatorService;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "labmanager", "coord@yorku.ca", "Coordinator", true);
        guest5.setApproved(false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(2, "Researcher", "Faculty", "data/test-users.csv", true);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "headlabcoordinator", "Student", "headlabcoordinator", false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        boolean boolean23 = userRepository1.emailExists("Strong1!");
        com.reservation_system.model.Student student29 = new com.reservation_system.model.Student(100, "manager1@yorku.ca", "Student", "coord2@yorku.ca", false);
        java.lang.String str30 = student29.getName();
        userRepository1.addUser((com.reservation_system.model.User) student29);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "1) test1504(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional14);
// flaky "1) test1504(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
// flaky "1) test1504(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "manager1@yorku.ca" + "'", str30, "manager1@yorku.ca");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(98, "coord@yorku.ca", "", "hi!", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        com.reservation_system.model.LabManager labManager30 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        labManager30.setApproved(true);
        boolean boolean33 = labManager30.isApproved();
        java.lang.String str34 = labManager30.getUserType();
        java.lang.String str35 = labManager30.getPassword();
        java.lang.String str36 = labManager30.getPassword();
        java.lang.String str37 = labManager30.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user41 = coordinatorAccountService24.autoGenerateLabManagerAccount((com.reservation_system.model.User) labManager30, "", "Student", "coord@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
// flaky "2) test1506(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 103 + "'", int12 == 103);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "labmanager" + "'", str22, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "labmanager" + "'", str34, "labmanager");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Coordinator2" + "'", str35, "Coordinator2");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Coordinator2" + "'", str36, "Coordinator2");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "labmanager" + "'", str37, "labmanager");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository17.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository17.findByEmail("headlabcoordinator");
        boolean boolean23 = userRepository17.emailExists("Manager1");
        boolean boolean24 = userRepository17.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository17.findByEmail("Coordinator");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository17.getAllUsers();
        userRepository1.saveAllUsers(userList27);
        int int29 = userRepository1.getNextID();
        int int30 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
// flaky "3) test1507(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 103 + "'", int12 == 103);
// flaky "2) test1507(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "2) test1507(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertNotNull(userOptional21);
// flaky "1) test1507(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky "1) test1507(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(userList27);
// flaky "1) test1507(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 103 + "'", int29 == 103);
// flaky "1) test1507(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 103 + "'", int30 == 103);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(101, "manager1@yorku.ca", "Coordinator", "manager1@yorku.ca", false);
        labManager5.setApproved(false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "manager1@yorku.ca", "manager1@yorku.ca", "Coordinator2", false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str6 = guest5.getPassword();
        guest5.setApproved(false);
        int int9 = guest5.getID();
        java.lang.String str10 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        boolean boolean5 = userRepository1.emailExists("");
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        java.lang.String str12 = faculty11.getUserType();
        java.lang.String str13 = faculty11.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        boolean boolean16 = userRepository1.emailExists("headlabcoordinator");
// flaky "4) test1511(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "3) test1511(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
// flaky "3) test1511(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str6 = labManager5.getEmail();
        labManager5.setApproved(true);
        java.lang.String str9 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Faculty", "", "labmanager", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        com.reservation_system.model.Guest guest54 = new com.reservation_system.model.Guest((int) (short) 0, "coord2@yorku.ca", "Researcher", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) guest54);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "5) test1514(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "4) test1514(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "labmanager" + "'", str19, "labmanager");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Student" + "'", str20, "Student");
// flaky "4) test1514(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userList38);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
            com.reservation_system.model.User user15 = coordinatorAccountService11.createHeadLabCoordinator("Coordinator2", "Strong1!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "6) test1515(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        boolean boolean18 = userRepository1.emailExists("labmanager");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "7) test1516(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "5) test1516(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "Researcher", "data/test-users.csv", "hi!", false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getUserType();
        student5.setApproved(true);
        java.lang.String str12 = student5.getUserType();
        java.lang.String str13 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinator" + "'", str8, "Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.User user8 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) 'a', "coord@yorku.ca", "coord2@yorku.ca", "Strong1!", false);
        java.lang.String str9 = user8.getEmail();
        userRepository1.addUser(user8);
        com.reservation_system.model.Student student16 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean17 = student16.requiresDepartmentApproval();
        java.lang.String str18 = student16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student16);
        java.lang.String str20 = student16.getPassword();
        boolean boolean21 = student16.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "coord2@yorku.ca" + "'", str9, "coord2@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "manager1@yorku.ca", "Coordinator", "coord2@yorku.ca", true);
        java.lang.String str6 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord2@yorku.ca" + "'", str6, "coord2@yorku.ca");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "", "coord@yorku.ca", "Coordinator", true);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord@yorku.ca" + "'", str6, "coord@yorku.ca");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-users.csv", (int) (byte) 10, "Manager1", "Researcher", "Strong1!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "labmanager", "Coordinator2", "", false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository22.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository22.findByEmail("headlabcoordinator");
        boolean boolean28 = userRepository22.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList29 = userRepository22.getAllUsers();
        boolean boolean30 = userRepository22.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList31 = userRepository22.getAllUsers();
        userRepository1.saveAllUsers(userList31);
        java.util.Optional<com.reservation_system.model.User> userOptional34 = userRepository1.findByEmail("Guest");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "8) test1524(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional14);
// flaky "6) test1524(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList17);
// flaky "5) test1524(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertNotNull(userOptional26);
// flaky "2) test1524(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userOptional34);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 100, "", "Researcher", "labmanager", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository14 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean16 = userRepository14.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService17 = new com.reservation_system.services.CoordinatorAccountService(userRepository14);
        int int18 = userRepository14.getNextID();
        java.util.List<com.reservation_system.model.User> userList19 = userRepository14.getAllUsers();
        userRepository1.saveAllUsers(userList19);
        java.util.Optional<com.reservation_system.model.User> userOptional22 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean24 = userRepository1.emailExists("Researcher");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
// flaky "9) test1525(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 103 + "'", int4 == 103);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky "7) test1525(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Coordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("Researcher");
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("Coordinator");
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager23 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str24 = labManager23.getUserType();
        java.lang.String str25 = labManager23.getPassword();
        userRepository17.addUser((com.reservation_system.model.User) labManager23);
        boolean boolean27 = userRepository17.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher33 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository17.addUser((com.reservation_system.model.User) researcher33);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService35 = new com.reservation_system.services.CoordinatorAccountService(userRepository17);
        com.reservation_system.model.Guest guest41 = new com.reservation_system.model.Guest(0, "Guest", "headlabcoordinator", "Faculty", false);
        userRepository17.addUser((com.reservation_system.model.User) guest41);
        java.util.List<com.reservation_system.model.User> userList43 = userRepository17.getAllUsers();
        userRepository1.saveAllUsers(userList43);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "10) test1526(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "labmanager" + "'", str24, "labmanager");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Student" + "'", str25, "Student");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(userList43);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "coord2@yorku.ca", "", "coord2@yorku.ca", false);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService19 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "11) test1528(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional14);
// flaky "8) test1528(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "Coordinator", "labmanager", "Guest", false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Guest", "labmanager", "Manager1", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "coord2@yorku.ca", "Strong1!", "data/test-users.csv", true);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "headlabcoordinator", "Student", "", false);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getName();
        boolean boolean8 = labManager5.isApproved();
        int int9 = labManager5.getID();
        java.lang.String str10 = labManager5.getName();
        java.lang.Class<?> wildcardClass11 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "manager1@yorku.ca", "headlabcoordinator", "headlabcoordinator", false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "labmanager", "", "hi!", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        java.util.List<com.reservation_system.model.User> userList24 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional28 = userRepository26.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository26.findByEmail("headlabcoordinator");
        boolean boolean32 = userRepository26.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository26.getAllUsers();
        boolean boolean35 = userRepository26.emailExists("");
        com.reservation_system.model.LabManager labManager41 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str42 = labManager41.getEmail();
        java.lang.String str43 = labManager41.getUserType();
        userRepository26.addUser((com.reservation_system.model.User) labManager41);
        boolean boolean46 = userRepository26.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList47 = userRepository26.getAllUsers();
        boolean boolean48 = userRepository26.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService49 = new com.reservation_system.services.CoordinatorAccountService(userRepository26);
        com.reservation_system.repository.UserRepository userRepository51 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean52 = userRepository51.headLabCoordinatorExists();
        boolean boolean53 = userRepository51.headLabCoordinatorExists();
        boolean boolean55 = userRepository51.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional57 = userRepository51.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList58 = userRepository51.getAllUsers();
        userRepository26.saveAllUsers(userList58);
        userRepository1.saveAllUsers(userList58);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Student" + "'", str21, "Student");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertNotNull(userOptional30);
// flaky "12) test1535(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(userList33);
// flaky "9) test1535(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Faculty" + "'", str42, "Faculty");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "labmanager" + "'", str43, "labmanager");
// flaky "6) test1535(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
// flaky "3) test1535(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(userOptional57);
        org.junit.Assert.assertNotNull(userList58);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        boolean boolean12 = userRepository1.emailExists("headlabcoordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "13) test1536(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "10) test1536(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("coord2@yorku.ca");
        int int6 = userRepository1.getNextID();
        com.reservation_system.model.Guest guest12 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str13 = guest12.getPassword();
        boolean boolean14 = guest12.isApproved();
        java.lang.String str15 = guest12.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) guest12);
        boolean boolean18 = userRepository1.emailExists("Student");
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
// flaky "14) test1537(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "11) test1537(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 103 + "'", int6 == 103);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coordinator2" + "'", str15, "Coordinator2");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Coordinator2", "coord2@yorku.ca", "", false);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        int int5 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("data/test-users.csv");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService10 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "15) test1539(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 103 + "'", int5 == 103);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.User user8 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) 'a', "coord@yorku.ca", "coord2@yorku.ca", "Strong1!", false);
        java.lang.String str9 = user8.getEmail();
        userRepository1.addUser(user8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "coord2@yorku.ca" + "'", str9, "coord2@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService24 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
// flaky "16) test1541(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 103 + "'", int22 == 103);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "coord@yorku.ca", "Researcher", "Strong1!", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getPassword();
        researcher5.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Strong1!" + "'", str7, "Strong1!");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService11 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user15 = coordinatorAccountService11.createHeadLabCoordinator("Coordinator", "labmanager", "Manager1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(2, "data/test-users.csv", "Faculty", "Coordinator2", false);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        boolean boolean9 = labManager5.requiresDepartmentApproval();
        java.lang.String str10 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass11 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "Coordinator2", "hi!", "", true);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "labmanager", "Researcher", "headlabcoordinator", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("coord2@yorku.ca");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService9 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user14 = coordinatorAccountService9.autoGenerateLabManagerAccount(user10, "data/test-users.csv", "Strong1!", "coord@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository1.findByEmail("Strong1!");
        java.lang.Class<?> wildcardClass25 = userOptional24.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        com.reservation_system.model.Guest guest36 = new com.reservation_system.model.Guest(32, "Coordinator", "data/test-users.csv", "Guest", false);
        java.lang.String str37 = guest36.getUserType();
        guest36.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) guest36);
        boolean boolean41 = guest36.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "17) test1550(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(userList27);
// flaky "12) test1550(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 103 + "'", int30 == 103);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Guest" + "'", str37, "Guest");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository11.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository11.findByEmail("headlabcoordinator");
        boolean boolean17 = userRepository11.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository11.getAllUsers();
        boolean boolean20 = userRepository11.emailExists("");
        com.reservation_system.model.LabManager labManager26 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str27 = labManager26.getEmail();
        java.lang.String str28 = labManager26.getUserType();
        userRepository11.addUser((com.reservation_system.model.User) labManager26);
        boolean boolean30 = userRepository11.headLabCoordinatorExists();
        com.reservation_system.model.Student student36 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str37 = student36.getPassword();
        userRepository11.addUser((com.reservation_system.model.User) student36);
        boolean boolean39 = userRepository11.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository41 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean42 = userRepository41.headLabCoordinatorExists();
        boolean boolean43 = userRepository41.headLabCoordinatorExists();
        boolean boolean45 = userRepository41.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional47 = userRepository41.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList48 = userRepository41.getAllUsers();
        userRepository11.saveAllUsers(userList48);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator55 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "", "", "labmanager", false);
        userRepository11.addUser((com.reservation_system.model.User) headLabCoordinator55);
        java.lang.String str57 = headLabCoordinator55.getUserType();
        boolean boolean58 = headLabCoordinator55.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator55);
        int int60 = headLabCoordinator55.getID();
        org.junit.Assert.assertNotNull(userOptional3);
// flaky "18) test1551(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userOptional15);
// flaky "13) test1551(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userList18);
// flaky "7) test1551(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Faculty" + "'", str27, "Faculty");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "labmanager" + "'", str28, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Strong1!" + "'", str37, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
// flaky "4) test1551(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(userOptional47);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "headlabcoordinator" + "'", str57, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("Faculty");
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
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
        int int27 = userRepository6.getNextID();
        java.util.List<com.reservation_system.model.User> userList28 = userRepository6.getAllUsers();
        userRepository1.saveAllUsers(userList28);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "labmanager" + "'", str13, "labmanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userOptional25);
// flaky "19) test1552(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 103 + "'", int27 == 103);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "", "Guest", "Coordinator", true);
        java.lang.String str6 = labManager5.getName();
        boolean boolean7 = labManager5.isApproved();
        java.lang.String str8 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student10 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean11 = student10.requiresDepartmentApproval();
        boolean boolean12 = student10.requiresDepartmentApproval();
        student10.setApproved(true);
        java.lang.String str15 = student10.getName();
        userRepository1.addUser((com.reservation_system.model.User) student10);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService17 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("labmanager");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coordinator" + "'", str15, "Coordinator");
        org.junit.Assert.assertNotNull(userOptional19);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        com.reservation_system.model.Guest guest32 = new com.reservation_system.model.Guest(100, "headlabcoordinator", "Manager1", "Coordinator2", false);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user36 = coordinatorAccountService26.autoGenerateLabManagerAccount((com.reservation_system.model.User) guest32, "coord@yorku.ca", "manager1@yorku.ca", "coord@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "20) test1555(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
// flaky "14) test1555(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean11 = userRepository1.emailExists("Student");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "Manager1", "Faculty", "Coordinator", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "hi!", "Coordinator2", "data/test-users.csv", false);
        java.lang.String str6 = student5.getName();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "Student", "Faculty", "headlabcoordinator", true);
        int int6 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "data/test-users.csv", "", "labmanager", false);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        int int19 = userRepository1.getNextID();
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        int int21 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "21) test1561(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 103 + "'", int19 == 103);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "15) test1561(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 103 + "'", int21 == 103);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService25 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean27 = userRepository1.emailExists("labmanager");
        java.util.Optional<com.reservation_system.model.User> userOptional29 = userRepository1.findByEmail("Coordinator2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertNotNull(userList24);
// flaky "22) test1562(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(userOptional29);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.User user20 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "Coordinator2", "Coordinator", "Guest", false);
        int int6 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator11 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "Strong1!", "Student", "", false);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user15 = coordinatorAccountService5.autoGenerateLabManagerAccount((com.reservation_system.model.User) headLabCoordinator11, "", "Manager1", "coord@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(99, "Coordinator", "Strong1!", "Manager1", true);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "Strong1!", "Student", "labmanager", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        int int30 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager38 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str39 = labManager38.getUserType();
        java.lang.String str40 = labManager38.getPassword();
        userRepository32.addUser((com.reservation_system.model.User) labManager38);
        com.reservation_system.repository.UserRepository userRepository43 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager49 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str50 = labManager49.getUserType();
        java.lang.String str51 = labManager49.getPassword();
        userRepository43.addUser((com.reservation_system.model.User) labManager49);
        boolean boolean53 = userRepository43.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository55 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean56 = userRepository55.headLabCoordinatorExists();
        boolean boolean57 = userRepository55.headLabCoordinatorExists();
        boolean boolean59 = userRepository55.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional61 = userRepository55.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList62 = userRepository55.getAllUsers();
        userRepository43.saveAllUsers(userList62);
        userRepository32.saveAllUsers(userList62);
        userRepository1.saveAllUsers(userList62);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "23) test1568(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Strong1!" + "'", str27, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
// flaky "16) test1568(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 103 + "'", int30 == 103);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "labmanager" + "'", str39, "labmanager");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Student" + "'", str40, "Student");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "labmanager" + "'", str50, "labmanager");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Student" + "'", str51, "Student");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
// flaky "8) test1568(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(userOptional61);
        org.junit.Assert.assertNotNull(userList62);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(98, "coord@yorku.ca", "Student", "Manager1", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(2, "labmanager", "Coordinator", "Faculty", true);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "labmanager", "Guest", "Researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager12);
        boolean boolean15 = userRepository1.emailExists("Faculty");
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        int int17 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userList16);
// flaky "24) test1572(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 103 + "'", int17 == 103);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "Researcher", "Researcher", "Coordinator2", false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) (short) 1, "Faculty", "", "manager1@yorku.ca", true);
        int int7 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.User user8 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) 'a', "coord@yorku.ca", "coord2@yorku.ca", "Strong1!", false);
        java.lang.String str9 = user8.getEmail();
        userRepository1.addUser(user8);
        boolean boolean11 = user8.isApproved();
        user8.setApproved(false);
        java.lang.String str14 = user8.getEmail();
        user8.setApproved(false);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "coord2@yorku.ca" + "'", str9, "coord2@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "coord2@yorku.ca" + "'", str14, "coord2@yorku.ca");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        com.reservation_system.model.Researcher researcher26 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str27 = researcher26.getUserType();
        java.lang.String str28 = researcher26.getUserType();
        java.lang.String str29 = researcher26.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher26);
        com.reservation_system.model.Faculty faculty36 = new com.reservation_system.model.Faculty((int) (short) 0, "coord@yorku.ca", "Researcher", "hi!", true);
        java.lang.String str37 = faculty36.getUserType();
        int int38 = faculty36.getID();
        java.lang.String str39 = faculty36.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty36);
        java.lang.String str41 = faculty36.getUserType();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "25) test1576(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional14);
// flaky "17) test1576(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Researcher" + "'", str27, "Researcher");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Researcher" + "'", str29, "Researcher");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Faculty" + "'", str37, "Faculty");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Faculty" + "'", str39, "Faculty");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Faculty" + "'", str41, "Faculty");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "Coordinator", "", "headlabcoordinator", true);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(2, "coord2@yorku.ca", "headlabcoordinator", "Manager1", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService7 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean11 = userRepository9.emailExists("headlabcoordinator");
        int int12 = userRepository9.getNextID();
        int int13 = userRepository9.getNextID();
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty21 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository15.addUser((com.reservation_system.model.User) faculty21);
        java.util.List<com.reservation_system.model.User> userList23 = userRepository15.getAllUsers();
        int int24 = userRepository15.getNextID();
        java.util.List<com.reservation_system.model.User> userList25 = userRepository15.getAllUsers();
        userRepository9.saveAllUsers(userList25);
        userRepository1.saveAllUsers(userList25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "26) test1579(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 103 + "'", int12 == 103);
// flaky "18) test1579(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 103 + "'", int13 == 103);
        org.junit.Assert.assertNotNull(userList23);
// flaky "9) test1579(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 103 + "'", int24 == 103);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Researcher", "Student", "Coordinator2", true);
        java.lang.String str6 = guest5.getEmail();
        java.lang.String str7 = guest5.getUserType();
        int int8 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "headlabcoordinator", "coord@yorku.ca", "Strong1!", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coord@yorku.ca" + "'", str7, "coord@yorku.ca");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        boolean boolean20 = userRepository1.emailExists("data/test-users.csv");
        int int21 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional23 = userRepository1.findByEmail("Coordinator2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "27) test1582(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 103 + "'", int21 == 103);
        org.junit.Assert.assertNotNull(userOptional23);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(99, "Student", "coord2@yorku.ca", "Strong1!", false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 32, "hi!", "Coordinator2", "Student", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "headlabcoordinator", "manager1@yorku.ca", "", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        boolean boolean7 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "Guest", "Faculty", "Coordinator2", true);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        boolean boolean5 = userRepository1.emailExists("");
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager13 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str14 = labManager13.getUserType();
        java.lang.String str15 = labManager13.getPassword();
        userRepository7.addUser((com.reservation_system.model.User) labManager13);
        boolean boolean17 = userRepository7.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher23 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository7.addUser((com.reservation_system.model.User) researcher23);
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository7.findByEmail("data/test-users.csv");
        int int27 = userRepository7.getNextID();
        java.util.List<com.reservation_system.model.User> userList28 = userRepository7.getAllUsers();
        userRepository1.saveAllUsers(userList28);
        boolean boolean31 = userRepository1.emailExists("Researcher");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "labmanager" + "'", str14, "labmanager");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userOptional26);
// flaky "28) test1587(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 103 + "'", int27 == 103);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "Coordinator", "hi!", "data/test-users.csv", false);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "manager1@yorku.ca", "headlabcoordinator", "Manager1", true);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
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
        boolean boolean41 = userRepository1.emailExists("Faculty");
        com.reservation_system.model.LabManager labManager47 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str48 = labManager47.getUserType();
        java.lang.String str49 = labManager47.getUserType();
        java.lang.String str50 = labManager47.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager47);
        boolean boolean52 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "29) test1590(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "labmanager" + "'", str19, "labmanager");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Student" + "'", str20, "Student");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "labmanager" + "'", str48, "labmanager");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "labmanager" + "'", str49, "labmanager");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "labmanager" + "'", str50, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "headlabcoordinator", "Guest", "headlabcoordinator", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository1.findByEmail("Guest");
        java.util.Optional<com.reservation_system.model.User> userOptional32 = userRepository1.findByEmail("Coordinator2");
        int int33 = userRepository1.getNextID();
        boolean boolean34 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
// flaky "30) test1592(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 103 + "'", int4 == 103);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertNotNull(userOptional32);
// flaky "19) test1592(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 103 + "'", int33 == 103);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("labmanager");
        int int4 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userOptional3);
// flaky "31) test1593(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 103 + "'", int4 == 103);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 100, "", "Researcher", "labmanager", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService14 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.LabManager labManager20 = new com.reservation_system.model.LabManager((int) '#', "coord2@yorku.ca", "coord2@yorku.ca", "Student", false);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user24 = coordinatorAccountService14.autoGenerateLabManagerAccount((com.reservation_system.model.User) labManager20, "hi!", "Manager1", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
// flaky "32) test1594(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 103 + "'", int4 == 103);
        org.junit.Assert.assertNotNull(userOptional13);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Student", "Coordinator", "coord2@yorku.ca", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "data/test-users.csv", "", "headlabcoordinator", true);
        boolean boolean6 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "Manager1", "coord@yorku.ca", "Researcher", false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "data/test-users.csv", "Faculty", "labmanager", false);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "Strong1!", "labmanager", "Guest", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "coord@yorku.ca", "labmanager", "Coordinator2", true);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student10 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean11 = student10.requiresDepartmentApproval();
        boolean boolean12 = student10.requiresDepartmentApproval();
        student10.setApproved(true);
        java.lang.String str15 = student10.getName();
        userRepository1.addUser((com.reservation_system.model.User) student10);
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository1.findByEmail("coord@yorku.ca");
        boolean boolean20 = userRepository1.emailExists("coord@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coordinator" + "'", str15, "Coordinator");
        org.junit.Assert.assertNotNull(userOptional18);
// flaky "33) test1601(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(99, "manager1@yorku.ca", "", "hi!", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.requiresDepartmentApproval();
        student5.setApproved(true);
        java.lang.String str10 = student5.getName();
        java.lang.String str11 = student5.getUserType();
        java.lang.String str12 = student5.getUserType();
        java.lang.String str13 = student5.getName();
        java.lang.String str14 = student5.getUserType();
        java.lang.String str15 = student5.getPassword();
        java.lang.String str16 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinator" + "'", str10, "Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinator" + "'", str13, "Coordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "Coordinator", "labmanager", "labmanager", true);
        java.lang.String str6 = labManager5.getUserType();
        int int7 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Researcher", "Student", "Coordinator2", true);
        java.lang.String str6 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "hi!", "Guest", "", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "headlabcoordinator", "Student", "", false);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getName();
        boolean boolean8 = labManager5.isApproved();
        int int9 = labManager5.getID();
        java.lang.String str10 = labManager5.getUserType();
        java.lang.String str11 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "Student", "headlabcoordinator", "", true);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "labmanager", "", "", false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str13 = labManager12.getUserType();
        java.lang.String str14 = labManager12.getUserType();
        java.lang.String str15 = labManager12.getUserType();
        boolean boolean16 = labManager12.requiresDepartmentApproval();
        java.lang.String str17 = labManager12.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user21 = coordinatorAccountService6.autoGenerateLabManagerAccount((com.reservation_system.model.User) labManager12, "manager1@yorku.ca", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "labmanager" + "'", str13, "labmanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "labmanager" + "'", str14, "labmanager");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "labmanager" + "'", str15, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "labmanager" + "'", str17, "labmanager");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        boolean boolean46 = user39.isApproved();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(userList27);
// flaky "34) test1611(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 103 + "'", int30 == 103);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "coord2@yorku.ca" + "'", str40, "coord2@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "Strong1!", "manager1@yorku.ca", "", false);
        java.lang.String str6 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager1@yorku.ca" + "'", str6, "manager1@yorku.ca");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.model.Student student9 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean10 = student9.isApproved();
        java.lang.String str11 = student9.getName();
        userRepository1.addUser((com.reservation_system.model.User) student9);
        student9.setApproved(false);
        boolean boolean15 = student9.isApproved();
        java.lang.String str16 = student9.getUserType();
        java.lang.String str17 = student9.getUserType();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinator" + "'", str11, "Coordinator");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Strong1!", 100, "coord@yorku.ca", "Coordinator", "manager1@yorku.ca", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Strong1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) ' ', "Coordinator", "Guest", "Coordinator2", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(102, "labmanager", "Coordinator2", "Faculty", false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        boolean boolean23 = userRepository1.emailExists("manager1@yorku.ca");
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager31 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str32 = labManager31.getUserType();
        java.lang.String str33 = labManager31.getPassword();
        userRepository25.addUser((com.reservation_system.model.User) labManager31);
        boolean boolean35 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher41 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository25.addUser((com.reservation_system.model.User) researcher41);
        java.util.Optional<com.reservation_system.model.User> userOptional44 = userRepository25.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService45 = new com.reservation_system.services.CoordinatorAccountService(userRepository25);
        int int46 = userRepository25.getNextID();
        com.reservation_system.repository.UserRepository userRepository48 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager54 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str55 = labManager54.getUserType();
        java.lang.String str56 = labManager54.getPassword();
        userRepository48.addUser((com.reservation_system.model.User) labManager54);
        boolean boolean58 = userRepository48.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher64 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository48.addUser((com.reservation_system.model.User) researcher64);
        java.util.Optional<com.reservation_system.model.User> userOptional67 = userRepository48.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService68 = new com.reservation_system.services.CoordinatorAccountService(userRepository48);
        int int69 = userRepository48.getNextID();
        java.util.List<com.reservation_system.model.User> userList70 = userRepository48.getAllUsers();
        userRepository25.saveAllUsers(userList70);
        userRepository1.saveAllUsers(userList70);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "35) test1617(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "labmanager" + "'", str32, "labmanager");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Student" + "'", str33, "Student");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(userOptional44);
// flaky "20) test1617(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 103 + "'", int46 == 103);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "labmanager" + "'", str55, "labmanager");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Student" + "'", str56, "Student");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(userOptional67);
// flaky "10) test1617(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int69 + "' != '" + 103 + "'", int69 == 103);
        org.junit.Assert.assertNotNull(userList70);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(2, "headlabcoordinator", "Researcher", "Coordinator", true);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(98, "Faculty", "Guest", "coord2@yorku.ca", true);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Guest", "coord2@yorku.ca", "coord@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        boolean boolean41 = userRepository1.emailExists("Faculty");
        com.reservation_system.model.LabManager labManager47 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str48 = labManager47.getUserType();
        java.lang.String str49 = labManager47.getUserType();
        java.lang.String str50 = labManager47.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager47);
        java.lang.String str52 = labManager47.getEmail();
        java.lang.String str53 = labManager47.getUserType();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "36) test1621(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "labmanager" + "'", str19, "labmanager");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Student" + "'", str20, "Student");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "labmanager" + "'", str48, "labmanager");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "labmanager" + "'", str49, "labmanager");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "labmanager" + "'", str50, "labmanager");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "labmanager" + "'", str53, "labmanager");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        com.reservation_system.repository.UserRepository userRepository23 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager29 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str30 = labManager29.getUserType();
        java.lang.String str31 = labManager29.getPassword();
        userRepository23.addUser((com.reservation_system.model.User) labManager29);
        boolean boolean33 = userRepository23.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher39 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository23.addUser((com.reservation_system.model.User) researcher39);
        java.util.Optional<com.reservation_system.model.User> userOptional42 = userRepository23.findByEmail("data/test-users.csv");
        int int43 = userRepository23.getNextID();
        java.util.List<com.reservation_system.model.User> userList44 = userRepository23.getAllUsers();
        userRepository1.saveAllUsers(userList44);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService46 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "labmanager" + "'", str30, "labmanager");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Student" + "'", str31, "Student");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(userOptional42);
// flaky "37) test1622(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 103 + "'", int43 == 103);
        org.junit.Assert.assertNotNull(userList44);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService19 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean23 = userRepository21.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService24 = new com.reservation_system.services.CoordinatorAccountService(userRepository21);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService25 = new com.reservation_system.services.CoordinatorAccountService(userRepository21);
        boolean boolean26 = userRepository21.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager32 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        userRepository21.addUser((com.reservation_system.model.User) labManager32);
        boolean boolean34 = labManager32.requiresDepartmentApproval();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user38 = coordinatorAccountService19.autoGenerateLabManagerAccount((com.reservation_system.model.User) labManager32, "data/test-users.csv", "Manager1", "manager1@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
// flaky "38) test1623(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 103 + "'", int7 == 103);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "labmanager", "Researcher", "hi!", true);
        boolean boolean6 = faculty5.isApproved();
        boolean boolean7 = faculty5.isApproved();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest19 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str20 = guest19.getPassword();
        java.lang.String str21 = guest19.getEmail();
        java.lang.String str22 = guest19.getUserType();
        boolean boolean23 = guest19.isApproved();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user27 = coordinatorAccountService13.autoGenerateLabManagerAccount((com.reservation_system.model.User) guest19, "Strong1!", "Student", "manager1@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coordinator2" + "'", str21, "Coordinator2");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Guest" + "'", str22, "Guest");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "coord2@yorku.ca", "Student", "Manager1", true);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "Guest", "Manager1", "Coordinator2", false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("coord2@yorku.ca");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService9 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user13 = coordinatorAccountService9.createHeadLabCoordinator("", "Researcher", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService36 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Faculty faculty42 = new com.reservation_system.model.Faculty((int) (short) 0, "Researcher", "Manager1", "Guest", false);
        java.lang.String str43 = faculty42.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user47 = coordinatorAccountService36.autoGenerateLabManagerAccount((com.reservation_system.model.User) faculty42, "Researcher", "labmanager", "Coordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Faculty" + "'", str43, "Faculty");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        java.lang.Class<?> wildcardClass28 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
// flaky "39) test1630(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 103 + "'", int7 == 103);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Guest" + "'", str16, "Guest");
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService7 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        int int9 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "40) test1631(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 103 + "'", int9 == 103);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "coord@yorku.ca", "Faculty", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("coord@yorku.ca");
        int int9 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "41) test1633(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "21) test1633(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 103 + "'", int9 == 103);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "Guest", "Researcher", "Researcher", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "coord@yorku.ca", "Researcher", "hi!", true);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getEmail();
        java.lang.String str9 = faculty5.getUserType();
        boolean boolean10 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord@yorku.ca" + "'", str6, "coord@yorku.ca");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("coord2@yorku.ca");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Manager1");
        java.lang.Class<?> wildcardClass11 = userOptional10.getClass();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        java.util.List<com.reservation_system.model.User> userList29 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService30 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "manager1@yorku.ca", "Student", "data/test-users.csv", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        com.reservation_system.model.LabManager labManager52 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str53 = labManager52.getUserType();
        userRepository44.addUser((com.reservation_system.model.User) labManager52);
        boolean boolean56 = userRepository44.emailExists("Coordinator");
        com.reservation_system.model.Student student62 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean63 = student62.requiresDepartmentApproval();
        java.lang.String str64 = student62.getUserType();
        int int65 = student62.getID();
        userRepository44.addUser((com.reservation_system.model.User) student62);
        java.util.List<com.reservation_system.model.User> userList67 = userRepository44.getAllUsers();
        userRepository1.saveAllUsers(userList67);
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "labmanager" + "'", str53, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Student" + "'", str64, "Student");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 35 + "'", int65 == 35);
        org.junit.Assert.assertNotNull(userList67);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        java.lang.String str20 = guest14.getName();
        java.lang.String str21 = guest14.getUserType();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
// flaky "42) test1640(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 103 + "'", int7 == 103);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Guest" + "'", str19, "Guest");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Manager1" + "'", str20, "Manager1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Guest" + "'", str21, "Guest");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(100, "Coordinator", "", "labmanager", true);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "manager1@yorku.ca", "Faculty", "", false);
        int int6 = researcher5.getID();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService8 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Researcher researcher14 = new com.reservation_system.model.Researcher(32, "", "Coordinator", "labmanager", false);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = coordinatorAccountService8.autoGenerateLabManagerAccount((com.reservation_system.model.User) researcher14, "Manager1", "coord2@yorku.ca", "Coordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "Coordinator2", "coord2@yorku.ca", "Faculty", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord2@yorku.ca" + "'", str6, "coord2@yorku.ca");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Manager1", "manager1@yorku.ca", "coord@yorku.ca", false);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.requiresDepartmentApproval();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getName();
        boolean boolean10 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "coord@yorku.ca" + "'", str9, "coord@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getUserType();
        java.lang.String str10 = labManager7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        java.lang.String str12 = labManager7.getEmail();
        java.lang.Class<?> wildcardClass13 = labManager7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "data/test-users.csv", "coord@yorku.ca", "Guest", false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(101, "data/test-users.csv", "manager1@yorku.ca", "Guest", false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "data/test-users.csv", "coord2@yorku.ca", "Researcher", false);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "Strong1!", "", "manager1@yorku.ca", false);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository7.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository7.findByEmail("headlabcoordinator");
        boolean boolean13 = userRepository7.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository7.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository16.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository16.findByEmail("headlabcoordinator");
        boolean boolean22 = userRepository16.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList23 = userRepository16.getAllUsers();
        userRepository7.saveAllUsers(userList23);
        boolean boolean26 = userRepository7.emailExists("");
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository28.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional32 = userRepository28.findByEmail("headlabcoordinator");
        boolean boolean34 = userRepository28.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList35 = userRepository28.getAllUsers();
        boolean boolean36 = userRepository28.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList37 = userRepository28.getAllUsers();
        userRepository7.saveAllUsers(userList37);
        userRepository1.saveAllUsers(userList37);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertNotNull(userOptional32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(userList37);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "manager1@yorku.ca", "headlabcoordinator", "Manager1", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        java.util.Optional<com.reservation_system.model.User> userOptional64 = userRepository1.findByEmail("Researcher");
        java.util.List<com.reservation_system.model.User> userList65 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
// flaky "43) test1654(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 103 + "'", int57 == 103);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(userOptional62);
        org.junit.Assert.assertNotNull(userOptional64);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "", "Researcher", "labmanager", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        int int24 = userRepository1.getNextID();
        com.reservation_system.model.Guest guest30 = new com.reservation_system.model.Guest(1, "Coordinator", "coord2@yorku.ca", "manager1@yorku.ca", false);
        userRepository1.addUser((com.reservation_system.model.User) guest30);
        boolean boolean32 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(102, "Student", "Student", "data/test-users.csv", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Researcher");
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository9.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository9.findByEmail("headlabcoordinator");
        boolean boolean15 = userRepository9.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList16 = userRepository9.getAllUsers();
        boolean boolean18 = userRepository9.emailExists("");
        com.reservation_system.model.LabManager labManager24 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str25 = labManager24.getEmail();
        java.lang.String str26 = labManager24.getUserType();
        userRepository9.addUser((com.reservation_system.model.User) labManager24);
        boolean boolean28 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.model.Student student34 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str35 = student34.getPassword();
        userRepository9.addUser((com.reservation_system.model.User) student34);
        com.reservation_system.model.Student student42 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean43 = student42.requiresDepartmentApproval();
        java.lang.String str44 = student42.getUserType();
        int int45 = student42.getID();
        userRepository9.addUser((com.reservation_system.model.User) student42);
        int int47 = userRepository9.getNextID();
        com.reservation_system.repository.UserRepository userRepository49 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager55 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str56 = labManager55.getUserType();
        java.lang.String str57 = labManager55.getPassword();
        userRepository49.addUser((com.reservation_system.model.User) labManager55);
        boolean boolean59 = userRepository49.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository61 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean62 = userRepository61.headLabCoordinatorExists();
        boolean boolean63 = userRepository61.headLabCoordinatorExists();
        boolean boolean65 = userRepository61.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional67 = userRepository61.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList68 = userRepository61.getAllUsers();
        userRepository49.saveAllUsers(userList68);
        userRepository9.saveAllUsers(userList68);
        com.reservation_system.repository.UserRepository userRepository72 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean73 = userRepository72.headLabCoordinatorExists();
        boolean boolean74 = userRepository72.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional76 = userRepository72.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService77 = new com.reservation_system.services.CoordinatorAccountService(userRepository72);
        java.util.List<com.reservation_system.model.User> userList78 = userRepository72.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList79 = userRepository72.getAllUsers();
        userRepository9.saveAllUsers(userList79);
        userRepository1.saveAllUsers(userList79);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Faculty" + "'", str25, "Faculty");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "labmanager" + "'", str26, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Strong1!" + "'", str35, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Student" + "'", str44, "Student");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 36 + "'", int47 == 36);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "labmanager" + "'", str56, "labmanager");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Student" + "'", str57, "Student");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(userOptional67);
        org.junit.Assert.assertNotNull(userList68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(userOptional76);
        org.junit.Assert.assertNotNull(userList78);
        org.junit.Assert.assertNotNull(userList79);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "Student", "Manager1", "Coordinator", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        boolean boolean12 = userRepository1.emailExists("Faculty");
        com.reservation_system.model.Faculty faculty18 = new com.reservation_system.model.Faculty((int) (short) 0, "Coordinator2", "Researcher", "coord@yorku.ca", false);
        java.lang.String str19 = faculty18.getUserType();
        java.lang.String str20 = faculty18.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) faculty18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Researcher" + "'", str20, "Researcher");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "data/test-users.csv", "Coordinator", "coord2@yorku.ca", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Guest", "coord2@yorku.ca", "coord@yorku.ca", false);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass10 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord@yorku.ca" + "'", str6, "coord@yorku.ca");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(99, "Coordinator", "Coordinator", "hi!", true);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "", "", "", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "coord2@yorku.ca", "hi!", "Coordinator", true);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "headlabcoordinator", "Guest", "headlabcoordinator", true);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        boolean boolean26 = userRepository1.emailExists("Student");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36 + "'", int24 == 36);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "Strong1!", "Manager1", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Manager1", "", "Strong1!", true);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getName();
        boolean boolean8 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Manager1" + "'", str7, "Manager1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Faculty", "", "Student", true);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "labmanager", "Researcher", "hi!", true);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getEmail();
        faculty5.setApproved(true);
        faculty5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "hi!", "Student", "", true);
        java.lang.Class<?> wildcardClass6 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "coord2@yorku.ca", "headlabcoordinator", "Faculty", false);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Manager1", "Strong1!", "Manager1", true);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "hi!", "Coordinator", "manager1@yorku.ca", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        java.lang.String str8 = headLabCoordinator5.getName();
        int int9 = headLabCoordinator5.getID();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinator" + "'", str7, "Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        boolean boolean17 = userRepository1.emailExists("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService18 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Manager1", 102, "labmanager", "Strong1!", "Manager1", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Manager1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService19 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList20 = userRepository1.getAllUsers();
        boolean boolean21 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "Guest", "coord@yorku.ca", "", true);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        boolean boolean23 = userRepository1.emailExists("Strong1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.isApproved();
        int int8 = labManager5.getID();
        labManager5.setApproved(false);
        java.lang.String str11 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinator" + "'", str11, "Coordinator");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str6 = labManager5.getEmail();
        int int7 = labManager5.getID();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Manager1" + "'", str9, "Manager1");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        boolean boolean50 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList51 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Strong1!" + "'", str27, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Student" + "'", str36, "Student");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Guest" + "'", str48, "Guest");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(userList51);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(36, "labmanager", "coord@yorku.ca", "", true);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "hi!", "Researcher", "Coordinator", false);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Guest", "Strong1!", "Researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "headlabcoordinator", "data/test-users.csv", "Strong1!", false);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getPassword();
        boolean boolean8 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Strong1!" + "'", str7, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Manager1", "", "Strong1!", true);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getPassword();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        researcher5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Strong1!" + "'", str7, "Strong1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "hi!", "", "hi!", true);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        int int8 = faculty5.getID();
        java.lang.String str9 = faculty5.getUserType();
        boolean boolean10 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "labmanager", "data/test-users.csv", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-users.csv" + "'", str6, "data/test-users.csv");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "coord@yorku.ca", "Coordinator2", "manager1@yorku.ca", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Guest", "Strong1!", "Researcher", false);
        java.lang.String str6 = faculty5.getPassword();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        faculty5.setApproved(true);
        int int10 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        boolean boolean20 = userRepository1.emailExists("manager1@yorku.ca");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService21 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user25 = coordinatorAccountService21.createHeadLabCoordinator("", "", "Manager1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "headlabcoordinator", "Student", "", false);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getName();
        boolean boolean8 = labManager5.isApproved();
        int int9 = labManager5.getID();
        boolean boolean10 = labManager5.isApproved();
        java.lang.String str11 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "Faculty", "Coordinator2", "data/test-users.csv", true);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "data/test-users.csv", "", "labmanager", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getName();
        boolean boolean8 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "data/test-users.csv" + "'", str7, "data/test-users.csv");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional28 = userRepository26.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository26.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository26.getAllUsers();
        int int32 = userRepository26.getNextID();
        java.util.List<com.reservation_system.model.User> userList33 = userRepository26.getAllUsers();
        boolean boolean34 = userRepository26.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList35 = userRepository26.getAllUsers();
        userRepository1.saveAllUsers(userList35);
        com.reservation_system.repository.UserRepository userRepository38 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional40 = userRepository38.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional42 = userRepository38.findByEmail("coord@yorku.ca");
        java.util.List<com.reservation_system.model.User> userList43 = userRepository38.getAllUsers();
        userRepository1.saveAllUsers(userList43);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList14);
// flaky "44) test1699(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 101 + "'", int32 == 101);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userOptional40);
        org.junit.Assert.assertNotNull(userOptional42);
        org.junit.Assert.assertNotNull(userList43);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        boolean boolean9 = labManager5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "", "Faculty", "labmanager", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        boolean boolean8 = headLabCoordinator5.isApproved();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        boolean boolean25 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList26 = userRepository1.getAllUsers();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getEmail();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Manager1" + "'", str7, "Manager1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinator2" + "'", str8, "Coordinator2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Coordinator2", (-1), "Faculty", "hi!", "Researcher", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Coordinator2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        com.reservation_system.model.LabManager labManager70 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        labManager70.setApproved(true);
        java.lang.String str73 = labManager70.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager70);
        com.reservation_system.repository.UserRepository userRepository76 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional78 = userRepository76.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional80 = userRepository76.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList81 = userRepository76.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList82 = userRepository76.getAllUsers();
        boolean boolean84 = userRepository76.emailExists("Student");
        com.reservation_system.repository.UserRepository userRepository86 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean88 = userRepository86.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional90 = userRepository86.findByEmail("coord2@yorku.ca");
        int int91 = userRepository86.getNextID();
        java.util.List<com.reservation_system.model.User> userList92 = userRepository86.getAllUsers();
        userRepository76.saveAllUsers(userList92);
        userRepository1.saveAllUsers(userList92);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "labmanager" + "'", str22, "labmanager");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Student" + "'", str23, "Student");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(userOptional34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "labmanager" + "'", str44, "labmanager");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Student" + "'", str45, "Student");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(userOptional56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 101 + "'", int57 == 101);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(userOptional62);
        org.junit.Assert.assertNotNull(userOptional64);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "labmanager" + "'", str73, "labmanager");
        org.junit.Assert.assertNotNull(userOptional78);
        org.junit.Assert.assertNotNull(userOptional80);
        org.junit.Assert.assertNotNull(userList81);
        org.junit.Assert.assertNotNull(userList82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(userOptional90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 101 + "'", int91 == 101);
        org.junit.Assert.assertNotNull(userList92);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        com.reservation_system.model.LabManager labManager31 = new com.reservation_system.model.LabManager(35, "Coordinator2", "Student", "labmanager", true);
        java.lang.String str32 = labManager31.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user36 = coordinatorAccountService25.autoGenerateLabManagerAccount((com.reservation_system.model.User) labManager31, "coord2@yorku.ca", "labmanager", "Coordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "labmanager" + "'", str32, "labmanager");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getUserType();
        student5.setApproved(false);
        boolean boolean10 = student5.isApproved();
        boolean boolean11 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        java.util.List<com.reservation_system.model.User> userList38 = userRepository1.getAllUsers();
        boolean boolean40 = userRepository1.emailExists("Coordinator2");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        java.util.List<com.reservation_system.model.User> userList61 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "labmanager" + "'", str22, "labmanager");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Student" + "'", str23, "Student");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(userOptional34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "labmanager" + "'", str44, "labmanager");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Student" + "'", str45, "Student");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(userOptional56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 101 + "'", int57 == 101);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(userList61);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Faculty", "coord@yorku.ca", "Researcher", false);
        java.lang.String str6 = guest5.getUserType();
        guest5.setApproved(true);
        boolean boolean9 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService7 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Faculty faculty13 = new com.reservation_system.model.Faculty((int) (short) -1, "Coordinator", "Guest", "coord2@yorku.ca", true);
        java.lang.String str14 = faculty13.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = coordinatorAccountService7.autoGenerateLabManagerAccount((com.reservation_system.model.User) faculty13, "coord@yorku.ca", "coord2@yorku.ca", "Coordinator2");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "coord2@yorku.ca" + "'", str14, "coord2@yorku.ca");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "labmanager", "", false);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Researcher", "Manager1", "labmanager", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("coord2@yorku.ca");
        int int6 = userRepository1.getNextID();
        com.reservation_system.model.Guest guest12 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str13 = guest12.getPassword();
        boolean boolean14 = guest12.isApproved();
        java.lang.String str15 = guest12.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) guest12);
        boolean boolean18 = userRepository1.emailExists("Student");
        java.util.List<com.reservation_system.model.User> userList19 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coordinator2" + "'", str15, "Coordinator2");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("coord2@yorku.ca");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService9 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Researcher researcher15 = new com.reservation_system.model.Researcher((int) (byte) -1, "Manager1", "", "Strong1!", true);
        java.lang.String str16 = researcher15.getEmail();
        java.lang.String str17 = researcher15.getUserType();
        java.lang.String str18 = researcher15.getUserType();
        boolean boolean19 = researcher15.isApproved();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user23 = coordinatorAccountService9.autoGenerateLabManagerAccount((com.reservation_system.model.User) researcher15, "hi!", "hi!", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Researcher" + "'", str17, "Researcher");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Researcher" + "'", str18, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Manager1", "Researcher", "", false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        int int5 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Coordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("");
// flaky "45) test1717(com.reservation_system.Randoop.CoordinatorService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional11);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        int int40 = userRepository1.getNextID();
        boolean boolean42 = userRepository1.emailExists("Student");
        int int43 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "labmanager" + "'", str19, "labmanager");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Student" + "'", str20, "Student");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Coordinator");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Strong1!");
        boolean boolean15 = userRepository1.emailExists("hi!");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        com.reservation_system.model.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user21 = coordinatorAccountService16.autoGenerateLabManagerAccount(user17, "Coordinator", "manager1@yorku.ca", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "Faculty", "Coordinator2", "Faculty", true);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean13 = userRepository12.headLabCoordinatorExists();
        boolean boolean14 = userRepository12.headLabCoordinatorExists();
        boolean boolean16 = userRepository12.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository12.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList19);
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager28 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str29 = labManager28.getUserType();
        java.lang.String str30 = labManager28.getPassword();
        userRepository22.addUser((com.reservation_system.model.User) labManager28);
        boolean boolean32 = userRepository22.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher38 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository22.addUser((com.reservation_system.model.User) researcher38);
        java.util.Optional<com.reservation_system.model.User> userOptional41 = userRepository22.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService42 = new com.reservation_system.services.CoordinatorAccountService(userRepository22);
        int int43 = userRepository22.getNextID();
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional47 = userRepository45.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional49 = userRepository45.findByEmail("headlabcoordinator");
        boolean boolean51 = userRepository45.emailExists("Manager1");
        boolean boolean52 = userRepository45.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional54 = userRepository45.findByEmail("Coordinator");
        java.util.List<com.reservation_system.model.User> userList55 = userRepository45.getAllUsers();
        userRepository22.saveAllUsers(userList55);
        userRepository1.saveAllUsers(userList55);
        com.reservation_system.repository.UserRepository userRepository59 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional61 = userRepository59.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional63 = userRepository59.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList64 = userRepository59.getAllUsers();
        int int65 = userRepository59.getNextID();
        java.util.List<com.reservation_system.model.User> userList66 = userRepository59.getAllUsers();
        com.reservation_system.model.Guest guest72 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str73 = guest72.getPassword();
        boolean boolean74 = guest72.isApproved();
        boolean boolean75 = guest72.isApproved();
        userRepository59.addUser((com.reservation_system.model.User) guest72);
        java.util.List<com.reservation_system.model.User> userList77 = userRepository59.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository79 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager85 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str86 = labManager85.getUserType();
        java.lang.String str87 = labManager85.getUserType();
        java.lang.String str88 = labManager85.getUserType();
        userRepository79.addUser((com.reservation_system.model.User) labManager85);
        int int90 = userRepository79.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService91 = new com.reservation_system.services.CoordinatorAccountService(userRepository79);
        java.util.List<com.reservation_system.model.User> userList92 = userRepository79.getAllUsers();
        userRepository59.saveAllUsers(userList92);
        userRepository1.saveAllUsers(userList92);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "labmanager" + "'", str29, "labmanager");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Student" + "'", str30, "Student");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userOptional41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(userOptional47);
        org.junit.Assert.assertNotNull(userOptional49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(userOptional54);
        org.junit.Assert.assertNotNull(userList55);
        org.junit.Assert.assertNotNull(userOptional61);
        org.junit.Assert.assertNotNull(userOptional63);
        org.junit.Assert.assertNotNull(userList64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertNotNull(userList66);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(userList77);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "labmanager" + "'", str86, "labmanager");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "labmanager" + "'", str87, "labmanager");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "labmanager" + "'", str88, "labmanager");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 98 + "'", int90 == 98);
        org.junit.Assert.assertNotNull(userList92);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (short) 100, "Coordinator", "Coordinator", "Student", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(101, "data/test-users.csv", "Researcher", "manager1@yorku.ca", true);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Researcher", "Researcher", "hi!", true);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "Guest", "manager1@yorku.ca", "Guest", false);
        int int6 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService7 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean9 = userRepository1.emailExists("coord@yorku.ca");
        boolean boolean11 = userRepository1.emailExists("manager1@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService34 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.User user38 = coordinatorAccountService34.createHeadLabCoordinator("coord2@yorku.ca", "Coordinator", "Coordinator");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 101 + "'", int29 == 101);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(user38);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 0, "Coordinator", "manager1@yorku.ca", "coord@yorku.ca", false);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(35, "hi!", "Student", "Student", true);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Researcher", "coord@yorku.ca", "Student", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Coordinator2", "manager1@yorku.ca", "coord@yorku.ca", true);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "Coordinator", "Manager1", "data/test-users.csv", true);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository9.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository9.findByEmail("headlabcoordinator");
        boolean boolean15 = userRepository9.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList16 = userRepository9.getAllUsers();
        boolean boolean18 = userRepository9.emailExists("");
        com.reservation_system.model.LabManager labManager24 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str25 = labManager24.getEmail();
        java.lang.String str26 = labManager24.getUserType();
        userRepository9.addUser((com.reservation_system.model.User) labManager24);
        boolean boolean29 = userRepository9.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList30 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList30);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Faculty" + "'", str25, "Faculty");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "labmanager" + "'", str26, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
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
        boolean boolean63 = userRepository1.headLabCoordinatorExists();
        boolean boolean65 = userRepository1.emailExists("Guest");
        boolean boolean67 = userRepository1.emailExists("Coordinator2");
        java.util.List<com.reservation_system.model.User> userList68 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 102 + "'", int50 == 102);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(userOptional59);
        org.junit.Assert.assertNotNull(userList60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(userList68);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("coord@yorku.ca");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService7 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user11 = coordinatorAccountService7.createHeadLabCoordinator("", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "coord2@yorku.ca", "Student", "Coordinator", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        boolean boolean9 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "", "Researcher", "labmanager", true);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(99, "headlabcoordinator", "coord@yorku.ca", "coord2@yorku.ca", false);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (byte) 1, "", "Researcher", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
        int int19 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 102 + "'", int19 == 102);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "Strong1!", "Coordinator", "headlabcoordinator", true);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinator" + "'", str6, "Coordinator");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        int int4 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService7 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "Manager1", "Strong1!", "Manager1", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "Guest", "Researcher", "coord2@yorku.ca", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        com.reservation_system.model.LabManager labManager30 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str31 = labManager30.getUserType();
        java.lang.String str32 = labManager30.getPassword();
        userRepository24.addUser((com.reservation_system.model.User) labManager30);
        boolean boolean34 = userRepository24.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher40 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository24.addUser((com.reservation_system.model.User) researcher40);
        java.util.Optional<com.reservation_system.model.User> userOptional43 = userRepository24.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService44 = new com.reservation_system.services.CoordinatorAccountService(userRepository24);
        int int45 = userRepository24.getNextID();
        java.util.List<com.reservation_system.model.User> userList46 = userRepository24.getAllUsers();
        userRepository1.saveAllUsers(userList46);
        boolean boolean48 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional50 = userRepository1.findByEmail("headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 102 + "'", int22 == 102);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "labmanager" + "'", str31, "labmanager");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Student" + "'", str32, "Student");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(userOptional43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 102 + "'", int45 == 102);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(userOptional50);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        java.util.List<com.reservation_system.model.User> userList23 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService24 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean27 = userRepository26.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest33 = new com.reservation_system.model.Guest((int) (short) 100, "Researcher", "Student", "Coordinator2", true);
        boolean boolean34 = guest33.requiresDepartmentApproval();
        java.lang.String str35 = guest33.getUserType();
        userRepository26.addUser((com.reservation_system.model.User) guest33);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user40 = coordinatorAccountService24.autoGenerateLabManagerAccount((com.reservation_system.model.User) guest33, "hi!", "Coordinator2", "Coordinator2");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "labmanager" + "'", str21, "labmanager");
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Guest" + "'", str35, "Guest");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "Guest", "coord@yorku.ca", "data/test-users.csv", false);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        boolean boolean6 = guest5.isApproved();
        boolean boolean7 = guest5.isApproved();
        boolean boolean8 = guest5.isApproved();
        java.lang.String str9 = guest5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "", "Researcher", "Student", true);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "manager1@yorku.ca", "Manager1", "Coordinator2", false);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "", "coord2@yorku.ca", "data/test-users.csv", false);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        java.util.Optional<com.reservation_system.model.User> userOptional36 = userRepository1.findByEmail("Faculty");
        int int37 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userOptional34);
        org.junit.Assert.assertNotNull(userOptional36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 102 + "'", int37 == 102);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Researcher", "Guest", "Manager1", false);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(103, "Faculty", "hi!", "", false);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
        boolean boolean56 = userRepository1.emailExists("Faculty");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "labmanager" + "'", str37, "labmanager");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Student" + "'", str38, "Student");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(userOptional49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 102 + "'", int51 == 102);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getName();
        boolean boolean8 = labManager5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass9 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getName();
        java.lang.Class<?> wildcardClass8 = guest5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Manager1" + "'", str7, "Manager1");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "data/test-users.csv", "manager1@yorku.ca", "data/test-users.csv", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        boolean boolean23 = labManager17.requiresDepartmentApproval();
        java.lang.String str24 = labManager17.getUserType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "labmanager" + "'", str21, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "labmanager" + "'", str24, "labmanager");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("coord2@yorku.ca");
        int int6 = userRepository1.getNextID();
        boolean boolean8 = userRepository1.emailExists("Strong1!");
        int int9 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("Student");
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("coord@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 102 + "'", int6 == 102);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userOptional13);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        boolean boolean30 = userRepository1.emailExists("Manager1");
        boolean boolean32 = userRepository1.emailExists("manager1@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getPassword();
        int int11 = researcher5.getID();
        int int12 = researcher5.getID();
        java.lang.String str13 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "coord2@yorku.ca" + "'", str10, "coord2@yorku.ca");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "data/test-users.csv" + "'", str13, "data/test-users.csv");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        int int9 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager17 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str18 = labManager17.getUserType();
        java.lang.String str19 = labManager17.getPassword();
        userRepository11.addUser((com.reservation_system.model.User) labManager17);
        boolean boolean21 = userRepository11.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository23 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean24 = userRepository23.headLabCoordinatorExists();
        boolean boolean25 = userRepository23.headLabCoordinatorExists();
        boolean boolean27 = userRepository23.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional29 = userRepository23.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList30 = userRepository23.getAllUsers();
        userRepository11.saveAllUsers(userList30);
        boolean boolean33 = userRepository11.emailExists("manager1@yorku.ca");
        com.reservation_system.repository.UserRepository userRepository35 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional37 = userRepository35.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional39 = userRepository35.findByEmail("headlabcoordinator");
        boolean boolean41 = userRepository35.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList42 = userRepository35.getAllUsers();
        boolean boolean44 = userRepository35.emailExists("");
        com.reservation_system.model.LabManager labManager50 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str51 = labManager50.getEmail();
        java.lang.String str52 = labManager50.getUserType();
        userRepository35.addUser((com.reservation_system.model.User) labManager50);
        boolean boolean54 = userRepository35.headLabCoordinatorExists();
        com.reservation_system.model.Student student60 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str61 = student60.getPassword();
        userRepository35.addUser((com.reservation_system.model.User) student60);
        boolean boolean63 = userRepository35.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository65 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean66 = userRepository65.headLabCoordinatorExists();
        boolean boolean67 = userRepository65.headLabCoordinatorExists();
        boolean boolean69 = userRepository65.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional71 = userRepository65.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList72 = userRepository65.getAllUsers();
        userRepository35.saveAllUsers(userList72);
        boolean boolean74 = userRepository35.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList75 = userRepository35.getAllUsers();
        userRepository11.saveAllUsers(userList75);
        userRepository1.saveAllUsers(userList75);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(userOptional29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(userOptional37);
        org.junit.Assert.assertNotNull(userOptional39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Faculty" + "'", str51, "Faculty");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "labmanager" + "'", str52, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Strong1!" + "'", str61, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(userOptional71);
        org.junit.Assert.assertNotNull(userList72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(userList75);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "headlabcoordinator", "Student", "", false);
        java.lang.String str6 = labManager5.getUserType();
        int int7 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        boolean boolean41 = userRepository1.emailExists("Faculty");
        com.reservation_system.model.LabManager labManager47 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str48 = labManager47.getUserType();
        java.lang.String str49 = labManager47.getUserType();
        java.lang.String str50 = labManager47.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager47);
        labManager47.setApproved(false);
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "labmanager" + "'", str48, "labmanager");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "labmanager" + "'", str49, "labmanager");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "labmanager" + "'", str50, "labmanager");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService9 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService11 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = coordinatorAccountService11.autoGenerateLabManagerAccount(user12, "", "Strong1!", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "Researcher", "", "Coordinator", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "coord2@yorku.ca", "Strong1!", "headlabcoordinator", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Strong1!" + "'", str6, "Strong1!");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "labmanager", "Manager1", "hi!", false);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "Researcher", "", "Coordinator", true);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinator" + "'", str7, "Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "coord2@yorku.ca", "data/test-users.csv", "", true);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
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
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean30 = userRepository28.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService31 = new com.reservation_system.services.CoordinatorAccountService(userRepository28);
        java.util.List<com.reservation_system.model.User> userList32 = userRepository28.getAllUsers();
        com.reservation_system.model.Guest guest38 = new com.reservation_system.model.Guest(32, "Coordinator", "data/test-users.csv", "Guest", false);
        userRepository28.addUser((com.reservation_system.model.User) guest38);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user43 = coordinatorAccountService26.autoGenerateLabManagerAccount((com.reservation_system.model.User) guest38, "Faculty", "data/test-users.csv", "");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "coord2@yorku.ca", "Student", "Coordinator", true);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getID();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "manager1@yorku.ca", "Coordinator2", "Researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "coord2@yorku.ca", "", "data/test-users.csv", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        int int7 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "", "Coordinator2", "Strong1!", true);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        java.lang.String str6 = student5.getName();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinator" + "'", str6, "Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest8 = new com.reservation_system.model.Guest((int) (short) 100, "Researcher", "Student", "Coordinator2", true);
        boolean boolean9 = guest8.requiresDepartmentApproval();
        java.lang.String str10 = guest8.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest8);
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = coordinatorAccountService13.createHeadLabCoordinator("Student", "Manager1", "labmanager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
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
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository1.findByEmail("Guest");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator36 = new com.reservation_system.model.HeadLabCoordinator(99, "Researcher", "", "hi!", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userOptional30);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("Researcher");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty13 = new com.reservation_system.model.Faculty((int) (short) 0, "coord@yorku.ca", "Researcher", "hi!", true);
        java.lang.String str14 = faculty13.getName();
        java.lang.String str15 = faculty13.getEmail();
        java.lang.String str16 = faculty13.getEmail();
        java.lang.String str17 = faculty13.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) faculty13);
        com.reservation_system.model.Researcher researcher24 = new com.reservation_system.model.Researcher((-1), "", "", "", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "coord@yorku.ca" + "'", str14, "coord@yorku.ca");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Researcher" + "'", str15, "Researcher");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(99, "", "hi!", "Faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(98, "Guest", "data/test-users.csv", "hi!", true);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "headlabcoordinator", "data/test-users.csv", "Strong1!", false);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Strong1!" + "'", str6, "Strong1!");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass10 = userList9.getClass();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager26 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str27 = labManager26.getUserType();
        java.lang.String str28 = labManager26.getPassword();
        userRepository20.addUser((com.reservation_system.model.User) labManager26);
        boolean boolean30 = userRepository20.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher36 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository20.addUser((com.reservation_system.model.User) researcher36);
        java.util.Optional<com.reservation_system.model.User> userOptional39 = userRepository20.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService40 = new com.reservation_system.services.CoordinatorAccountService(userRepository20);
        int int41 = userRepository20.getNextID();
        java.util.List<com.reservation_system.model.User> userList42 = userRepository20.getAllUsers();
        userRepository1.saveAllUsers(userList42);
        com.reservation_system.model.Researcher researcher49 = new com.reservation_system.model.Researcher(100, "Guest", "coord2@yorku.ca", "coord@yorku.ca", false);
        java.lang.String str50 = researcher49.getUserType();
        java.lang.String str51 = researcher49.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher49);
        java.util.List<com.reservation_system.model.User> userList53 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList54 = userRepository1.getAllUsers();
        boolean boolean56 = userRepository1.emailExists("headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "labmanager" + "'", str27, "labmanager");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Student" + "'", str28, "Student");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(userOptional39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 102 + "'", int41 == 102);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Researcher" + "'", str50, "Researcher");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "coord2@yorku.ca" + "'", str51, "coord2@yorku.ca");
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertNotNull(userList54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "headlabcoordinator", "Strong1!", "Strong1!", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "headlabcoordinator", "manager1@yorku.ca", "Coordinator2", false);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "", "Strong1!", "Faculty", true);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "labmanager", "coord2@yorku.ca", "Strong1!", false);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "", "headlabcoordinator", "", true);
        int int6 = researcher5.getID();
        java.lang.String str7 = researcher5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Coordinator2", "coord2@yorku.ca", "coord2@yorku.ca", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "headlabcoordinator", "Student", "", false);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getName();
        boolean boolean8 = labManager5.isApproved();
        int int9 = labManager5.getID();
        java.lang.String str10 = labManager5.getUserType();
        java.lang.String str11 = labManager5.getUserType();
        java.lang.String str12 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "coord2@yorku.ca", "hi!", "Coordinator2", true);
        int int6 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "headlabcoordinator", "data/test-users.csv", "Strong1!", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "data/test-users.csv" + "'", str7, "data/test-users.csv");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest11 = new com.reservation_system.model.Guest(32, "Coordinator", "data/test-users.csv", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) guest11);
        java.lang.String str13 = guest11.getEmail();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "data/test-users.csv" + "'", str13, "data/test-users.csv");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService8 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Researcher researcher14 = new com.reservation_system.model.Researcher((int) (short) 100, "hi!", "Coordinator", "Guest", false);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = coordinatorAccountService8.autoGenerateLabManagerAccount((com.reservation_system.model.User) researcher14, "Student", "labmanager", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
        boolean boolean39 = userRepository1.headLabCoordinatorExists();
        boolean boolean41 = userRepository1.emailExists("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService42 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user46 = coordinatorAccountService42.createHeadLabCoordinator("Coordinator2", "Coordinator2", "coord2@yorku.ca");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Strong1!" + "'", str27, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Student" + "'", str36, "Student");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
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
        boolean boolean34 = userRepository1.emailExists("labmanager");
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean37 = userRepository36.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList38 = userRepository36.getAllUsers();
        int int39 = userRepository36.getNextID();
        java.util.List<com.reservation_system.model.User> userList40 = userRepository36.getAllUsers();
        userRepository1.saveAllUsers(userList40);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 102 + "'", int39 == 102);
        org.junit.Assert.assertNotNull(userList40);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(35, "Strong1!", "headlabcoordinator", "Student", false);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Manager1", "Guest", true);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(102, "hi!", "", "", false);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(99, "", "hi!", "Guest", false);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.isApproved();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "Coordinator", "Guest", "coord2@yorku.ca", true);
        java.lang.String str6 = faculty5.getPassword();
        int int7 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord2@yorku.ca" + "'", str6, "coord2@yorku.ca");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "coord2@yorku.ca", "Student", "Coordinator", true);
        student5.setApproved(true);
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getUserType();
        int int10 = student5.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "headlabcoordinator", "data/test-users.csv", "Strong1!", false);
        boolean boolean6 = guest5.isApproved();
        guest5.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getUserType();
        student5.setApproved(true);
        java.lang.String str12 = student5.getUserType();
        java.lang.String str13 = student5.getPassword();
        java.lang.String str14 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinator" + "'", str8, "Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) 100, "manager1@yorku.ca", "Manager1", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userOptional12);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "labmanager", "Researcher", "hi!", true);
        java.lang.String str6 = faculty5.getPassword();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
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
        boolean boolean39 = userRepository1.headLabCoordinatorExists();
        boolean boolean41 = userRepository1.emailExists("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService42 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional44 = userRepository1.findByEmail("Student");
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(userOptional44);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(98, "labmanager", "Researcher", "coord2@yorku.ca", false);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
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
        com.reservation_system.model.User user36 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user40 = coordinatorAccountService35.autoGenerateLabManagerAccount(user36, "Strong1!", "coord2@yorku.ca", "headlabcoordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
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
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Coordinator");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        boolean boolean13 = userRepository1.emailExists("Coordinator2");
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository15.findByEmail("labmanager");
        com.reservation_system.repository.UserRepository userRepository19 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository19.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional23 = userRepository19.findByEmail("coord@yorku.ca");
        java.util.List<com.reservation_system.model.User> userList24 = userRepository19.getAllUsers();
        int int25 = userRepository19.getNextID();
        java.util.List<com.reservation_system.model.User> userList26 = userRepository19.getAllUsers();
        userRepository15.saveAllUsers(userList26);
        userRepository1.saveAllUsers(userList26);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 102 + "'", int25 == 102);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "coord2@yorku.ca", "Manager1", "data/test-users.csv", false);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "headlabcoordinator", "Guest", "Researcher", false);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "headlabcoordinator", "data/test-users.csv", "", false);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "coord2@yorku.ca", "data/test-users.csv", "Manager1", true);
        boolean boolean6 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "Coordinator", "data/test-users.csv", "Guest", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "Manager1", "Faculty", "Faculty", false);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "Coordinator2", "coord@yorku.ca", "Coordinator", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "Strong1!", "", "Manager1", false);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "hi!", "hi!", "hi!", false);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "coord2@yorku.ca", "", "Faculty", true);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        boolean boolean6 = guest5.isApproved();
        boolean boolean7 = guest5.isApproved();
        java.lang.String str8 = guest5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinator2" + "'", str8, "Coordinator2");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "coord@yorku.ca", "Researcher", "", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user7 = coordinatorAccountService3.createHeadLabCoordinator("Faculty", "data/test-users.csv", "Strong1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getEmail();
        java.lang.String str9 = guest5.getUserType();
        boolean boolean10 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Manager1" + "'", str7, "Manager1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinator2" + "'", str8, "Coordinator2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(99, "", "labmanager", "coord@yorku.ca", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean7 = userRepository1.emailExists("Guest");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Student");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getEmail();
        java.lang.String str8 = guest5.getUserType();
        boolean boolean9 = guest5.isApproved();
        guest5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinator2" + "'", str7, "Coordinator2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
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
        boolean boolean63 = userRepository1.headLabCoordinatorExists();
        boolean boolean65 = userRepository1.emailExists("Guest");
        boolean boolean67 = userRepository1.emailExists("Coordinator2");
        boolean boolean69 = userRepository1.emailExists("labmanager");
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 102 + "'", int50 == 102);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(userOptional59);
        org.junit.Assert.assertNotNull(userList60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService12 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest18 = new com.reservation_system.model.Guest((int) ' ', "data/test-users.csv", "coord2@yorku.ca", "data/test-users.csv", false);
        java.lang.String str19 = guest18.getPassword();
        java.lang.String str20 = guest18.getUserType();
        java.lang.String str21 = guest18.getName();
        userRepository1.addUser((com.reservation_system.model.User) guest18);
        int int23 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService24 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "data/test-users.csv" + "'", str19, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Guest" + "'", str20, "Guest");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "data/test-users.csv" + "'", str21, "data/test-users.csv");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 102 + "'", int23 == 102);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Coordinator2", "coord2@yorku.ca", "", false);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository8 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean9 = userRepository8.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository8.getAllUsers();
        int int11 = userRepository8.getNextID();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher((int) (byte) 100, "", "Researcher", "labmanager", true);
        userRepository8.addUser((com.reservation_system.model.User) researcher17);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        boolean boolean21 = userRepository1.emailExists("Researcher");
        com.reservation_system.repository.UserRepository userRepository23 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional25 = userRepository23.findByEmail("Faculty");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService26 = new com.reservation_system.services.CoordinatorAccountService(userRepository23);
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean29 = userRepository28.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList30 = userRepository28.getAllUsers();
        int int31 = userRepository28.getNextID();
        com.reservation_system.model.Researcher researcher37 = new com.reservation_system.model.Researcher((int) (byte) 100, "", "Researcher", "labmanager", true);
        userRepository28.addUser((com.reservation_system.model.User) researcher37);
        com.reservation_system.repository.UserRepository userRepository40 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean41 = userRepository40.headLabCoordinatorExists();
        boolean boolean42 = userRepository40.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional44 = userRepository40.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService45 = new com.reservation_system.services.CoordinatorAccountService(userRepository40);
        com.reservation_system.model.Guest guest51 = new com.reservation_system.model.Guest((int) (short) 100, "Manager1", "", "Student", false);
        userRepository40.addUser((com.reservation_system.model.User) guest51);
        java.util.List<com.reservation_system.model.User> userList53 = userRepository40.getAllUsers();
        userRepository28.saveAllUsers(userList53);
        java.util.List<com.reservation_system.model.User> userList55 = userRepository28.getAllUsers();
        userRepository23.saveAllUsers(userList55);
        userRepository1.saveAllUsers(userList55);
        int int58 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userOptional25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 102 + "'", int31 == 102);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(userOptional44);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertNotNull(userList55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 102 + "'", int58 == 102);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "data/test-users.csv", "coord2@yorku.ca", "data/test-users.csv", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student25 = new com.reservation_system.model.Student((int) (short) -1, "coord2@yorku.ca", "Student", "Coordinator", true);
        java.lang.String str26 = student25.getUserType();
        java.lang.String str27 = student25.getUserType();
        java.lang.String str28 = student25.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student25);
        boolean boolean30 = student25.isApproved();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Student" + "'", str26, "Student");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Student" + "'", str27, "Student");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Student" + "'", str28, "Student");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "data/test-users.csv", "manager1@yorku.ca", "Manager1", false);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        com.reservation_system.model.Guest guest48 = new com.reservation_system.model.Guest(0, "Strong1!", "Researcher", "", true);
        userRepository1.addUser((com.reservation_system.model.User) guest48);
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
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        boolean boolean5 = userRepository1.emailExists("");
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        java.lang.String str12 = faculty11.getUserType();
        java.lang.String str13 = faculty11.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService15 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user19 = coordinatorAccountService15.createHeadLabCoordinator("coord2@yorku.ca", "coord2@yorku.ca", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest12 = new com.reservation_system.model.Guest((int) (short) 100, "Manager1", "", "Student", false);
        userRepository1.addUser((com.reservation_system.model.User) guest12);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("Researcher");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userOptional17);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "Strong1!", "Coordinator", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "Faculty", "Student", "Coordinator", true);
        java.lang.String str6 = researcher5.getName();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService7 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user11 = coordinatorAccountService7.createHeadLabCoordinator("manager1@yorku.ca", "coord2@yorku.ca", "Coordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "Coordinator", "coord@yorku.ca", "Faculty", false);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(101, "hi!", "", "Coordinator2", false);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinator2" + "'", str6, "Coordinator2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "manager1@yorku.ca", "Strong1!", "data/test-users.csv", false);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        int int27 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 102 + "'", int27 == 102);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService7 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
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
        int int21 = userRepository1.getNextID();
        int int22 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager30 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str31 = labManager30.getUserType();
        java.lang.String str32 = labManager30.getPassword();
        userRepository24.addUser((com.reservation_system.model.User) labManager30);
        boolean boolean34 = userRepository24.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher40 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository24.addUser((com.reservation_system.model.User) researcher40);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService42 = new com.reservation_system.services.CoordinatorAccountService(userRepository24);
        java.util.List<com.reservation_system.model.User> userList43 = userRepository24.getAllUsers();
        userRepository1.saveAllUsers(userList43);
        com.reservation_system.model.User user45 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 102 + "'", int21 == 102);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 102 + "'", int22 == 102);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "labmanager" + "'", str31, "labmanager");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Student" + "'", str32, "Student");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(userList43);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getEmail();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager1@yorku.ca" + "'", str6, "manager1@yorku.ca");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinator" + "'", str8, "Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getPassword();
        int int11 = researcher5.getID();
        java.lang.String str12 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass13 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "coord2@yorku.ca" + "'", str10, "coord2@yorku.ca");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "data/test-users.csv", "", "coord2@yorku.ca", false);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        com.reservation_system.model.LabManager labManager35 = new com.reservation_system.model.LabManager(35, "coord@yorku.ca", "", "Student", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager35);
        java.lang.String str37 = labManager35.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "labmanager" + "'", str37, "labmanager");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "data/test-users.csv", "Researcher", "Researcher", true);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(36, "", "Strong1!", "Coordinator2", false);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Manager1", "Guest", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Faculty", "Faculty", "Student", false);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coord@yorku.ca" + "'", str7, "coord@yorku.ca");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "headlabcoordinator", "Faculty", "Guest", true);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "", "Researcher", "coord2@yorku.ca", true);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        boolean boolean9 = labManager5.requiresDepartmentApproval();
        java.lang.String str10 = labManager5.getUserType();
        java.lang.String str11 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "Researcher", "Faculty", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        int int6 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService7 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user11 = coordinatorAccountService7.createHeadLabCoordinator("Manager1", "Faculty", "Coordinator2");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 102 + "'", int6 == 102);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        int int5 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("data/test-users.csv");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean14 = userRepository12.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService15 = new com.reservation_system.services.CoordinatorAccountService(userRepository12);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService16 = new com.reservation_system.services.CoordinatorAccountService(userRepository12);
        boolean boolean17 = userRepository12.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager23 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        userRepository12.addUser((com.reservation_system.model.User) labManager23);
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager32 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str33 = labManager32.getUserType();
        java.lang.String str34 = labManager32.getPassword();
        userRepository26.addUser((com.reservation_system.model.User) labManager32);
        boolean boolean36 = userRepository26.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher42 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository26.addUser((com.reservation_system.model.User) researcher42);
        java.util.Optional<com.reservation_system.model.User> userOptional45 = userRepository26.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService46 = new com.reservation_system.services.CoordinatorAccountService(userRepository26);
        com.reservation_system.repository.UserRepository userRepository48 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager54 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str55 = labManager54.getUserType();
        java.lang.String str56 = labManager54.getPassword();
        userRepository48.addUser((com.reservation_system.model.User) labManager54);
        boolean boolean58 = userRepository48.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher64 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository48.addUser((com.reservation_system.model.User) researcher64);
        java.util.Optional<com.reservation_system.model.User> userOptional67 = userRepository48.findByEmail("data/test-users.csv");
        int int68 = userRepository48.getNextID();
        java.util.List<com.reservation_system.model.User> userList69 = userRepository48.getAllUsers();
        userRepository26.saveAllUsers(userList69);
        userRepository12.saveAllUsers(userList69);
        java.util.Optional<com.reservation_system.model.User> userOptional73 = userRepository12.findByEmail("Strong1!");
        com.reservation_system.repository.UserRepository userRepository75 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean76 = userRepository75.headLabCoordinatorExists();
        boolean boolean77 = userRepository75.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional79 = userRepository75.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService80 = new com.reservation_system.services.CoordinatorAccountService(userRepository75);
        java.util.List<com.reservation_system.model.User> userList81 = userRepository75.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList82 = userRepository75.getAllUsers();
        userRepository12.saveAllUsers(userList82);
        userRepository1.saveAllUsers(userList82);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 102 + "'", int5 == 102);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "labmanager" + "'", str33, "labmanager");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Student" + "'", str34, "Student");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(userOptional45);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "labmanager" + "'", str55, "labmanager");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Student" + "'", str56, "Student");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(userOptional67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 102 + "'", int68 == 102);
        org.junit.Assert.assertNotNull(userList69);
        org.junit.Assert.assertNotNull(userOptional73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(userOptional79);
        org.junit.Assert.assertNotNull(userList81);
        org.junit.Assert.assertNotNull(userList82);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str6 = student5.getPassword();
        boolean boolean7 = student5.requiresDepartmentApproval();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Strong1!" + "'", str6, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "Coordinator", "Guest", "coord2@yorku.ca", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getPassword();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "coord2@yorku.ca" + "'", str8, "coord2@yorku.ca");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
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
        com.reservation_system.repository.UserRepository userRepository53 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean55 = userRepository53.emailExists("data/test-users.csv");
        boolean boolean57 = userRepository53.emailExists("");
        com.reservation_system.repository.UserRepository userRepository59 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager65 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str66 = labManager65.getUserType();
        java.lang.String str67 = labManager65.getPassword();
        userRepository59.addUser((com.reservation_system.model.User) labManager65);
        boolean boolean69 = userRepository59.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher75 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository59.addUser((com.reservation_system.model.User) researcher75);
        java.util.Optional<com.reservation_system.model.User> userOptional78 = userRepository59.findByEmail("data/test-users.csv");
        int int79 = userRepository59.getNextID();
        java.util.List<com.reservation_system.model.User> userList80 = userRepository59.getAllUsers();
        userRepository53.saveAllUsers(userList80);
        userRepository1.saveAllUsers(userList80);
        boolean boolean83 = userRepository1.headLabCoordinatorExists();
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "labmanager" + "'", str66, "labmanager");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Student" + "'", str67, "Student");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(userOptional78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 102 + "'", int79 == 102);
        org.junit.Assert.assertNotNull(userList80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("coord2@yorku.ca");
        boolean boolean14 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean18 = userRepository17.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional22 = userRepository20.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository20.findByEmail("headlabcoordinator");
        boolean boolean26 = userRepository20.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository20.getAllUsers();
        boolean boolean29 = userRepository20.emailExists("");
        com.reservation_system.model.LabManager labManager35 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str36 = labManager35.getEmail();
        java.lang.String str37 = labManager35.getUserType();
        userRepository20.addUser((com.reservation_system.model.User) labManager35);
        boolean boolean39 = userRepository20.headLabCoordinatorExists();
        com.reservation_system.model.Student student45 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str46 = student45.getPassword();
        userRepository20.addUser((com.reservation_system.model.User) student45);
        boolean boolean48 = userRepository20.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository50 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean51 = userRepository50.headLabCoordinatorExists();
        boolean boolean52 = userRepository50.headLabCoordinatorExists();
        boolean boolean54 = userRepository50.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional56 = userRepository50.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList57 = userRepository50.getAllUsers();
        userRepository20.saveAllUsers(userList57);
        userRepository17.saveAllUsers(userList57);
        userRepository1.saveAllUsers(userList57);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Faculty" + "'", str36, "Faculty");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "labmanager" + "'", str37, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Strong1!" + "'", str46, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(userOptional56);
        org.junit.Assert.assertNotNull(userList57);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "manager1@yorku.ca", "Guest", "Coordinator", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("Faculty");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher(0, "Researcher", "data/test-users.csv", "Faculty", false);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user14 = coordinatorAccountService4.autoGenerateLabManagerAccount((com.reservation_system.model.User) researcher10, "Faculty", "Strong1!", "Manager1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getUserType();
        student5.setApproved(true);
        student5.setApproved(false);
        java.lang.String str14 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinator" + "'", str8, "Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("coord@yorku.ca", (int) (short) 10, "hi!", "", "coord2@yorku.ca", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: coord@yorku.ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "labmanager", "", "Student", false);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "Student", "coord@yorku.ca", "Strong1!", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
        int int21 = userRepository1.getNextID();
        int int22 = userRepository1.getNextID();
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService24 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 102 + "'", int21 == 102);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 102 + "'", int22 == 102);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        int int10 = userRepository1.getNextID();
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager(0, "headlabcoordinator", "coord@yorku.ca", "coord@yorku.ca", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean19 = userRepository1.emailExists("");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 102 + "'", int10 == 102);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "", "headlabcoordinator", "labmanager", true);
        boolean boolean6 = researcher5.isApproved();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.emailExists("Student");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService10 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user14 = coordinatorAccountService10.createHeadLabCoordinator("Manager1", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Researcher", "Student", "Coordinator2", true);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        guest5.setApproved(false);
        java.lang.String str10 = guest5.getUserType();
        java.lang.String str11 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
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
        boolean boolean66 = userRepository1.emailExists("Manager1");
        int int67 = userRepository1.getNextID();
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 102 + "'", int50 == 102);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(userOptional59);
        org.junit.Assert.assertNotNull(userList60);
        org.junit.Assert.assertNotNull(userOptional64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 102 + "'", int67 == 102);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(35, "hi!", "Student", "Student", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "data/test-users.csv", "", "Coordinator", false);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinator" + "'", str6, "Coordinator");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "", "coord@yorku.ca", "Researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-users.csv", 101, "headlabcoordinator", "coord@yorku.ca", "Guest", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (-1), "labmanager", "labmanager", "labmanager", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(35, "labmanager", "coord@yorku.ca", "data/test-users.csv", false);
        java.lang.String str8 = researcher7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int10 = researcher7.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository13.addUser((com.reservation_system.model.User) faculty19);
        java.util.List<com.reservation_system.model.User> userList21 = userRepository13.getAllUsers();
        userRepository1.saveAllUsers(userList21);
        com.reservation_system.model.Guest guest28 = new com.reservation_system.model.Guest((int) (byte) 0, "Coordinator2", "Student", "Faculty", false);
        boolean boolean29 = guest28.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest28);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
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
        java.lang.String str20 = guest14.getUserType();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Guest" + "'", str16, "Guest");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Guest" + "'", str20, "Guest");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "Strong1!", "data/test-users.csv", "hi!", false);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        boolean boolean7 = headLabCoordinator5.isApproved();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "", "Student", "Faculty", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("coord2@yorku.ca");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("manager1@yorku.ca");
        boolean boolean12 = userRepository1.emailExists("Manager1");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "labmanager", "Guest", "coord2@yorku.ca", true);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("manager1@yorku.ca", (int) (byte) 10, "Guest", "Guest", "coord2@yorku.ca", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: manager1@yorku.ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}
