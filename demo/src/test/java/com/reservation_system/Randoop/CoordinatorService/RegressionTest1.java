package com.reservation_system.Randoop.CoordinatorService;

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "labmanager", "manager1@yorku.ca", "", false);
        java.lang.String str6 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "Faculty", "Faculty", "headlabcoordinator", true);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "headlabcoordinator", "Faculty", "labmanager", false);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "coord@yorku.ca", "data/test-users.csv", "labmanager", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        int int10 = student5.getID();
        java.lang.String str11 = student5.getUserType();
        boolean boolean12 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "Strong1!", "coord2@yorku.ca", "Coordinator", false);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        com.reservation_system.model.Researcher researcher72 = new com.reservation_system.model.Researcher((int) (short) 100, "hi!", "coord2@yorku.ca", "Coordinator", true);
        boolean boolean73 = researcher72.requiresDepartmentApproval();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user77 = coordinatorAccountService66.autoGenerateLabManagerAccount((com.reservation_system.model.User) researcher72, "headlabcoordinator", "coord2@yorku.ca", "headlabcoordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "1) test0507(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "1) test0507(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "labmanager" + "'", str22, "labmanager");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Student" + "'", str23, "Student");
// flaky "1) test0507(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(userOptional34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "labmanager" + "'", str44, "labmanager");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Student" + "'", str45, "Student");
// flaky "1) test0507(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(userOptional56);
// flaky "1) test0507(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 101 + "'", int57 == 101);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(userOptional62);
        org.junit.Assert.assertNotNull(userOptional64);
// flaky "1) test0507(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int65 + "' != '" + 101 + "'", int65 == 101);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user28 = null; // flaky "2) test0508(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)": coordinatorAccountService24.createHeadLabCoordinator("Student", "Coordinator", "Student");
// flaky "2) test0508(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky "2) test0508(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "2) test0508(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "2) test0508(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
// flaky "2) test0508(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "labmanager" + "'", str21, "labmanager");
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "headlabcoordinator", "Faculty", "Coordinator2", true);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "coord@yorku.ca", "Faculty", "Faculty", true);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getName();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coord@yorku.ca" + "'", str7, "coord@yorku.ca");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "headlabcoordinator", "", "Strong1!", false);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(101, "Faculty", "Coordinator", "Manager1", true);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "Student", "labmanager", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) (byte) 10, "Faculty", "Manager1", "Manager1", true);
        java.lang.String str7 = user6.getEmail();
        user6.setApproved(false);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Manager1" + "'", str7, "Manager1");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
        java.lang.String str53 = researcher49.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
// flaky "3) test0516(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "labmanager" + "'", str27, "labmanager");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Student" + "'", str28, "Student");
// flaky "3) test0516(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(userOptional39);
// flaky "3) test0516(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 101 + "'", int41 == 101);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Researcher" + "'", str50, "Researcher");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "coord2@yorku.ca" + "'", str51, "coord2@yorku.ca");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Researcher" + "'", str53, "Researcher");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "Guest", "Student", "data/test-users.csv", true);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(99, "manager1@yorku.ca", "headlabcoordinator", "data/test-users.csv", false);
        java.lang.String str6 = faculty5.getUserType();
        faculty5.setApproved(false);
        boolean boolean9 = faculty5.requiresDepartmentApproval();
        java.lang.String str10 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "coord2@yorku.ca", "Student", "Coordinator", true);
        student5.setApproved(true);
        java.lang.String str8 = student5.getUserType();
        int int9 = student5.getID();
        java.lang.String str10 = student5.getName();
        java.lang.String str11 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "coord2@yorku.ca" + "'", str10, "coord2@yorku.ca");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("coord2@yorku.ca");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService9 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user13 = null; // flaky "4) test0520(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)": coordinatorAccountService9.createHeadLabCoordinator("data/test-users.csv", "coord2@yorku.ca", "Researcher");
// flaky "4) test0520(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "4) test0520(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Strong1!", "Strong1!", "Coordinator", true);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        int int10 = userRepository1.getNextID();
        int int11 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository13.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository13.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository13.getAllUsers();
        int int19 = userRepository13.getNextID();
        java.util.List<com.reservation_system.model.User> userList20 = userRepository13.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean23 = userRepository22.headLabCoordinatorExists();
        boolean boolean24 = userRepository22.headLabCoordinatorExists();
        boolean boolean26 = userRepository22.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional28 = userRepository22.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList29 = userRepository22.getAllUsers();
        userRepository13.saveAllUsers(userList29);
        userRepository1.saveAllUsers(userList29);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertNotNull(userList20);
// flaky "5) test0522(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky "5) test0522(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky "5) test0522(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        boolean boolean21 = userRepository1.emailExists("");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Guest" + "'", str16, "Guest");
// flaky "6) test0523(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "headlabcoordinator", "data/test-users.csv", "data/test-users.csv", true);
        int int6 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Manager1", "", "Strong1!", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.requiresDepartmentApproval();
        student5.setApproved(true);
        java.lang.String str10 = student5.getName();
        java.lang.String str11 = student5.getUserType();
        java.lang.String str12 = student5.getUserType();
        boolean boolean13 = student5.isApproved();
        boolean boolean14 = student5.requiresDepartmentApproval();
        boolean boolean15 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinator" + "'", str10, "Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "coord@yorku.ca", "Faculty", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        java.lang.String str8 = researcher5.getEmail();
        java.lang.String str9 = researcher5.getName();
        java.lang.String str10 = researcher5.getUserType();
        boolean boolean11 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "coord@yorku.ca" + "'", str9, "coord@yorku.ca");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user26 = coordinatorAccountService22.createHeadLabCoordinator("manager1@yorku.ca", "coord@yorku.ca", "Researcher");
// flaky "7) test0528(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "6) test0528(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional14);
// flaky "6) test0528(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "Strong1!", "Guest", "", false);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        java.lang.String str39 = student34.getUserType();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "8) test0530(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "7) test0530(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Strong1!" + "'", str27, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Student" + "'", str36, "Student");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Student" + "'", str39, "Student");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (short) 100, "coord2@yorku.ca", "hi!", "labmanager", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) '#', "Student", "coord2@yorku.ca", "labmanager", false);
        researcher11.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService15 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user19 = coordinatorAccountService15.createHeadLabCoordinator("manager1@yorku.ca", "", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "data/test-users.csv", "", "labmanager", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-users.csv" + "'", str8, "data/test-users.csv");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService9 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest((int) (short) 10, "Coordinator", "", "labmanager", true);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user20 = coordinatorAccountService9.autoGenerateLabManagerAccount((com.reservation_system.model.User) guest15, "Coordinator", "Coordinator2", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
// flaky "9) test0534(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "manager1@yorku.ca", "headlabcoordinator", "Faculty", true);
        researcher5.setApproved(true);
        java.lang.String str8 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager1@yorku.ca" + "'", str8, "manager1@yorku.ca");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest12 = new com.reservation_system.model.Guest((int) (short) 100, "Manager1", "", "Student", false);
        userRepository1.addUser((com.reservation_system.model.User) guest12);
        java.lang.String str14 = guest12.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Manager1" + "'", str14, "Manager1");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) '#', "Student", "coord2@yorku.ca", "labmanager", false);
        researcher11.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService15 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Faculty faculty21 = new com.reservation_system.model.Faculty((int) 'a', "Student", "", "manager1@yorku.ca", false);
        java.lang.String str22 = faculty21.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user26 = coordinatorAccountService15.autoGenerateLabManagerAccount((com.reservation_system.model.User) faculty21, "Coordinator2", "coord@yorku.ca", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "Coordinator", "", "labmanager", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) 'a', "hi!", "Faculty", "headlabcoordinator", true);
        int int7 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "coord@yorku.ca", "Researcher", "hi!", true);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getEmail();
        faculty5.setApproved(false);
        java.lang.String str10 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord@yorku.ca" + "'", str6, "coord@yorku.ca");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (-1), "headlabcoordinator", "manager1@yorku.ca", "", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "coord2@yorku.ca", "Student", "Coordinator", true);
        student5.setApproved(true);
        java.lang.String str8 = student5.getPassword();
        java.lang.String str9 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinator" + "'", str8, "Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "hi!", "Coordinator2", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(99, "", "Faculty", "coord2@yorku.ca", false);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "Guest", "coord@yorku.ca", "Student", false);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "coord@yorku.ca", "Researcher", "hi!", true);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getEmail();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord@yorku.ca" + "'", str6, "coord@yorku.ca");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", 0, "labmanager", "headlabcoordinator", "Student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getUserType();
        java.lang.String str10 = labManager7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student18 = new com.reservation_system.model.Student((int) '4', "Researcher", "data/test-users.csv", "Manager1", false);
        userRepository1.addUser((com.reservation_system.model.User) student18);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getUserType();
        java.lang.String str10 = labManager7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        int int12 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = coordinatorAccountService13.createHeadLabCoordinator("Manager1", "manager1@yorku.ca", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
// flaky "10) test0549(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(35, "hi!", "Student", "Student", true);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getUserType();
        boolean boolean8 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 100, "", "Researcher", "labmanager", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.lang.String str12 = researcher10.getUserType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
// flaky "11) test0551(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "headlabcoordinator", "coord@yorku.ca", "coord@yorku.ca", true);
        java.lang.String str6 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord@yorku.ca" + "'", str6, "coord@yorku.ca");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService23 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator29 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "data/test-users.csv", "", "labmanager", false);
        headLabCoordinator29.setApproved(false);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user35 = coordinatorAccountService23.autoGenerateLabManagerAccount((com.reservation_system.model.User) headLabCoordinator29, "coord2@yorku.ca", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "12) test0553(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "labmanager", "Faculty", "coord2@yorku.ca", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (byte) 100, "Strong1!", "manager1@yorku.ca", "", false);
        user6.setApproved(false);
        boolean boolean9 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "Manager1", "Researcher", "coord2@yorku.ca", true);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) '#', "Student", "coord2@yorku.ca", "labmanager", false);
        researcher11.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService15 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository1.findByEmail("Guest");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userOptional18);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "coord@yorku.ca", "manager1@yorku.ca", "Researcher", false);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager1@yorku.ca" + "'", str6, "manager1@yorku.ca");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "data/test-users.csv", "manager1@yorku.ca", "data/test-users.csv", false);
        java.lang.String str6 = faculty5.getPassword();
        boolean boolean7 = faculty5.isApproved();
        java.lang.Class<?> wildcardClass8 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-users.csv" + "'", str6, "data/test-users.csv");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "Student", "headlabcoordinator", "", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("Faculty");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService11 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService12 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.User user19 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) (byte) 0, "Researcher", "Coordinator", "coord2@yorku.ca", true);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user23 = coordinatorAccountService12.autoGenerateLabManagerAccount(user19, "coord@yorku.ca", "coord2@yorku.ca", "Coordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "13) test0562(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(user19);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        int int6 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService7 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty15 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository9.addUser((com.reservation_system.model.User) faculty15);
        java.util.List<com.reservation_system.model.User> userList17 = userRepository9.getAllUsers();
        int int18 = userRepository9.getNextID();
        com.reservation_system.model.Student student24 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean25 = student24.requiresDepartmentApproval();
        java.lang.String str26 = student24.getUserType();
        student24.setApproved(false);
        student24.setApproved(false);
        int int31 = student24.getID();
        userRepository9.addUser((com.reservation_system.model.User) student24);
        com.reservation_system.repository.UserRepository userRepository34 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional36 = userRepository34.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional38 = userRepository34.findByEmail("headlabcoordinator");
        boolean boolean40 = userRepository34.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList41 = userRepository34.getAllUsers();
        boolean boolean42 = userRepository34.headLabCoordinatorExists();
        boolean boolean43 = userRepository34.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList44 = userRepository34.getAllUsers();
        userRepository9.saveAllUsers(userList44);
        userRepository1.saveAllUsers(userList44);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "14) test0563(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertNotNull(userList17);
// flaky "8) test0563(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Student" + "'", str26, "Student");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertNotNull(userOptional36);
        org.junit.Assert.assertNotNull(userOptional38);
// flaky "7) test0563(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(userList44);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "coord2@yorku.ca", "Student", "hi!", false);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Manager1", "coord2@yorku.ca", "Manager1", true);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (short) -1, "Guest", "headlabcoordinator", "headlabcoordinator", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.requiresDepartmentApproval();
        int int8 = student5.getID();
        java.lang.String str9 = student5.getEmail();
        java.lang.String str10 = student5.getEmail();
        java.lang.String str11 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinator" + "'", str9, "Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinator" + "'", str10, "Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) 100, "manager1@yorku.ca", "Manager1", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        java.lang.Class<?> wildcardClass11 = guest9.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "data/test-users.csv", "", "Coordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass7 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "coord@yorku.ca", "Coordinator", "labmanager", true);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        java.lang.String str24 = labManager20.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
// flaky "15) test0571(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "labmanager" + "'", str22, "labmanager");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "labmanager" + "'", str24, "labmanager");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "Coordinator", "Coordinator", "manager1@yorku.ca", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        boolean boolean8 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Coordinator", "coord2@yorku.ca", "manager1@yorku.ca", false);
        java.lang.String str6 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinator" + "'", str6, "Coordinator");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Strong1!", 101, "coord2@yorku.ca", "Coordinator", "Manager1", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Strong1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        int int53 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "labmanager" + "'", str27, "labmanager");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Student" + "'", str28, "Student");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(userOptional39);
// flaky "16) test0575(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 101 + "'", int41 == 101);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Researcher" + "'", str50, "Researcher");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "coord2@yorku.ca" + "'", str51, "coord2@yorku.ca");
// flaky "9) test0575(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 101 + "'", int53 == 101);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (-1), "coord@yorku.ca", "Manager1", "Coordinator", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        java.util.Optional<com.reservation_system.model.User> userOptional68 = userRepository1.findByEmail("Manager1");
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
// flaky "17) test0577(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 101 + "'", int57 == 101);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(userOptional62);
        org.junit.Assert.assertNotNull(userOptional64);
// flaky "10) test0577(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int65 + "' != '" + 101 + "'", int65 == 101);
        org.junit.Assert.assertNotNull(userOptional68);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        int int37 = userRepository1.getNextID();
        com.reservation_system.model.LabManager labManager43 = new com.reservation_system.model.LabManager((int) ' ', "manager1@yorku.ca", "Student", "coord2@yorku.ca", false);
        boolean boolean44 = labManager43.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager43);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
// flaky "18) test0578(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 101 + "'", int37 == 101);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "labmanager", "coord2@yorku.ca", "Strong1!", false);
        researcher5.setApproved(false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "coord2@yorku.ca", "Student", "Coordinator", true);
        student5.setApproved(true);
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getPassword();
        student5.setApproved(false);
        java.lang.String str13 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinator" + "'", str10, "Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Coordinator", "Guest", "", true);
        labManager5.setApproved(false);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "data/test-users.csv", "Coordinator", "Faculty", true);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        boolean boolean23 = guest18.isApproved();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "headlabcoordinator", "", "coord2@yorku.ca", false);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "Researcher", "data/test-users.csv", "Manager1", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user21 = coordinatorAccountService17.createHeadLabCoordinator("headlabcoordinator", "Manager1", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coordinator" + "'", str15, "Coordinator");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean29 = userRepository28.headLabCoordinatorExists();
        boolean boolean30 = userRepository28.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional32 = userRepository28.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService33 = new com.reservation_system.services.CoordinatorAccountService(userRepository28);
        com.reservation_system.repository.UserRepository userRepository35 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional37 = userRepository35.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional39 = userRepository35.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList40 = userRepository35.getAllUsers();
        int int41 = userRepository35.getNextID();
        java.util.List<com.reservation_system.model.User> userList42 = userRepository35.getAllUsers();
        userRepository28.saveAllUsers(userList42);
        userRepository1.saveAllUsers(userList42);
        java.util.Optional<com.reservation_system.model.User> userOptional46 = userRepository1.findByEmail("data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(userOptional32);
        org.junit.Assert.assertNotNull(userOptional37);
        org.junit.Assert.assertNotNull(userOptional39);
        org.junit.Assert.assertNotNull(userList40);
// flaky "19) test0587(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 101 + "'", int41 == 101);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertNotNull(userOptional46);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "Coordinator", "Guest", "Guest", false);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(101, "Student", "coord2@yorku.ca", "Researcher", false);
        java.lang.String str6 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str10 = labManager9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        java.lang.String str12 = labManager9.getUserType();
        boolean boolean13 = labManager9.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str6 = labManager5.getUserType();
        int int7 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        boolean boolean5 = userRepository1.emailExists("");
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager13 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str14 = labManager13.getUserType();
        java.lang.String str15 = labManager13.getPassword();
        userRepository7.addUser((com.reservation_system.model.User) labManager13);
        boolean boolean17 = userRepository7.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList18 = userRepository7.getAllUsers();
        userRepository1.saveAllUsers(userList18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "labmanager" + "'", str14, "labmanager");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str6 = labManager5.getEmail();
        int int7 = labManager5.getID();
        boolean boolean8 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "Researcher", "Strong1!", "coord2@yorku.ca", true);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "labmanager", "manager1@yorku.ca", "manager1@yorku.ca", false);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "headlabcoordinator", "Manager1", "Coordinator", false);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        com.reservation_system.repository.UserRepository userRepository42 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean44 = userRepository42.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService45 = new com.reservation_system.services.CoordinatorAccountService(userRepository42);
        java.util.List<com.reservation_system.model.User> userList46 = userRepository42.getAllUsers();
        userRepository1.saveAllUsers(userList46);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Researcher" + "'", str27, "Researcher");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Researcher" + "'", str29, "Researcher");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Faculty" + "'", str37, "Faculty");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Faculty" + "'", str39, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(userList46);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        java.lang.Class<?> wildcardClass4 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "", "Coordinator", "", false);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
        com.reservation_system.model.LabManager labManager23 = new com.reservation_system.model.LabManager((-1), "coord@yorku.ca", "headlabcoordinator", "", false);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user27 = coordinatorAccountService17.autoGenerateLabManagerAccount((com.reservation_system.model.User) labManager23, "Strong1!", "headlabcoordinator", "manager1@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coordinator" + "'", str15, "Coordinator");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "headlabcoordinator", "headlabcoordinator", "Guest", false);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "manager1@yorku.ca", "Coordinator", "labmanager", false);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService12 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = coordinatorAccountService12.createHeadLabCoordinator("hi!", "manager1@yorku.ca", "labmanager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
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
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        boolean boolean25 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
// flaky "20) test0604(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("labmanager");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
// flaky "21) test0605(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Guest" + "'", str16, "Guest");
        org.junit.Assert.assertNotNull(userOptional21);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Manager1", "Faculty", "", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getUserType();
        student5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        boolean boolean13 = userRepository1.emailExists("Coordinator");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("Student");
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean20 = userRepository18.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional22 = userRepository18.findByEmail("coord2@yorku.ca");
        int int23 = userRepository18.getNextID();
        java.util.List<com.reservation_system.model.User> userList24 = userRepository18.getAllUsers();
        userRepository1.saveAllUsers(userList24);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userOptional22);
// flaky "22) test0607(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "Student", "Manager1", "Researcher", true);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "coord@yorku.ca", "coord@yorku.ca", "manager1@yorku.ca", false);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "headlabcoordinator", "coord2@yorku.ca", "data/test-users.csv", true);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user10 = coordinatorAccountService6.createHeadLabCoordinator("Researcher", "Faculty", "Coordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(99, "coord2@yorku.ca", "Strong1!", "manager1@yorku.ca", false);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "data/test-users.csv", "Coordinator2", "", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinator2" + "'", str7, "Coordinator2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        int int6 = guest5.getID();
        guest5.setApproved(false);
        boolean boolean9 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "Coordinator2", "Researcher", "coord@yorku.ca", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getPassword();
        java.lang.Class<?> wildcardClass8 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coord@yorku.ca" + "'", str7, "coord@yorku.ca");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getID();
        java.lang.String str9 = student5.getEmail();
        student5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinator" + "'", str9, "Coordinator");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 10, "hi!", "manager1@yorku.ca", "hi!", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Faculty", "labmanager", "", true);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "Strong1!", "coord@yorku.ca", "coord2@yorku.ca", false);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        com.reservation_system.model.Guest guest16 = new com.reservation_system.model.Guest((int) (byte) -1, "coord2@yorku.ca", "coord2@yorku.ca", "hi!", true);
        java.lang.String str17 = guest16.getUserType();
        java.lang.String str18 = guest16.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) guest16);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Guest" + "'", str17, "Guest");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "coord2@yorku.ca" + "'", str18, "coord2@yorku.ca");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("Researcher");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        int int7 = userRepository1.getNextID();
        boolean boolean9 = userRepository1.emailExists("Manager1");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "23) test0621(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "headlabcoordinator", "Strong1!", "manager1@yorku.ca", false);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(2, "Strong1!", "coord@yorku.ca", "hi!", false);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("Faculty");
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "headlabcoordinator", "Researcher", "manager1@yorku.ca", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "", "", "hi!", true);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "Coordinator2", "coord@yorku.ca", "Researcher", true);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        com.reservation_system.model.Faculty faculty37 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository31.addUser((com.reservation_system.model.User) faculty37);
        java.util.List<com.reservation_system.model.User> userList39 = userRepository31.getAllUsers();
        int int40 = userRepository31.getNextID();
        com.reservation_system.model.Student student46 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean47 = student46.requiresDepartmentApproval();
        java.lang.String str48 = student46.getUserType();
        student46.setApproved(false);
        student46.setApproved(false);
        int int53 = student46.getID();
        userRepository31.addUser((com.reservation_system.model.User) student46);
        java.lang.String str55 = student46.getUserType();
        java.lang.String str56 = student46.getName();
        userRepository1.addUser((com.reservation_system.model.User) student46);
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
        org.junit.Assert.assertNotNull(userList39);
// flaky "24) test0628(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 101 + "'", int40 == 101);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Student" + "'", str48, "Student");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Student" + "'", str55, "Student");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Coordinator" + "'", str56, "Coordinator");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "manager1@yorku.ca", "Faculty", "", false);
        int int6 = researcher5.getID();
        java.lang.Class<?> wildcardClass7 = researcher5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Guest", "headlabcoordinator", "Faculty", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 52, "coord2@yorku.ca", "manager1@yorku.ca", "Strong1!", false);
        user6.setApproved(true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService9 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository8 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository8.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository8.findByEmail("headlabcoordinator");
        boolean boolean14 = userRepository8.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository8.getAllUsers();
        boolean boolean17 = userRepository8.emailExists("");
        com.reservation_system.model.LabManager labManager23 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str24 = labManager23.getEmail();
        java.lang.String str25 = labManager23.getUserType();
        userRepository8.addUser((com.reservation_system.model.User) labManager23);
        boolean boolean28 = userRepository8.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList29 = userRepository8.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean33 = userRepository31.emailExists("data/test-users.csv");
        boolean boolean35 = userRepository31.emailExists("");
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
        userRepository31.saveAllUsers(userList58);
        userRepository8.saveAllUsers(userList58);
        java.util.List<com.reservation_system.model.User> userList61 = userRepository8.getAllUsers();
        userRepository1.saveAllUsers(userList61);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Faculty" + "'", str24, "Faculty");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "labmanager" + "'", str25, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "labmanager" + "'", str44, "labmanager");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Student" + "'", str45, "Student");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(userOptional56);
// flaky "25) test0633(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 101 + "'", int57 == 101);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(userList61);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(35, "Coordinator", "", "hi!", true);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Guest", "labmanager", "Manager1", true);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getPassword();
        java.lang.String str8 = faculty5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Manager1" + "'", str7, "Manager1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Manager1" + "'", str8, "Manager1");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        int int39 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional41 = userRepository1.findByEmail("Coordinator2");
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
// flaky "26) test0636(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 101 + "'", int39 == 101);
        org.junit.Assert.assertNotNull(userOptional41);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("Faculty");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher(10, "coord@yorku.ca", "Faculty", "Faculty", true);
        java.lang.String str10 = researcher9.getUserType();
        java.lang.String str11 = researcher9.getEmail();
        java.lang.String str12 = researcher9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        java.lang.String str14 = researcher9.getUserType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
            com.reservation_system.model.User user17 = coordinatorAccountService13.createHeadLabCoordinator("manager1@yorku.ca", "Manager1", "coord2@yorku.ca");
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
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
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
        java.lang.Class<?> wildcardClass26 = coordinatorAccountService25.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("coord2@yorku.ca");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService9 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user13 = coordinatorAccountService9.createHeadLabCoordinator("manager1@yorku.ca", "Coordinator2", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Strong1!", "Strong1!", "data/test-users.csv", false);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "coord2@yorku.ca", "Coordinator", "coord2@yorku.ca", true);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "hi!", "labmanager", "Coordinator2", true);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinator2" + "'", str6, "Coordinator2");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(99, "coord@yorku.ca", "", "", false);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord@yorku.ca" + "'", str6, "coord@yorku.ca");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "manager1@yorku.ca", "headlabcoordinator", "Faculty", true);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "data/test-users.csv", "Guest", "Coordinator", false);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "data/test-users.csv", "", "labmanager", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("Manager1");
        com.reservation_system.model.Student student11 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean12 = student11.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) student11);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService14 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = coordinatorAccountService14.createHeadLabCoordinator("Manager1", "Coordinator", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
        java.util.List<com.reservation_system.model.User> userList34 = userRepository1.getAllUsers();
        int int35 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
// flaky "27) test0649(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "labmanager" + "'", str29, "labmanager");
        org.junit.Assert.assertNotNull(userList34);
// flaky "11) test0649(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Guest", "Coordinator2", "Strong1!", true);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "headlabcoordinator", "", "headlabcoordinator", true);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "hi!", "Coordinator2", "", false);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "Guest", "Faculty", "", false);
        labManager5.setApproved(true);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = coordinatorAccountService4.createHeadLabCoordinator("Faculty", "", "labmanager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", 98, "Student", "Coordinator2", "Coordinator2", false);
        java.lang.String str7 = user6.getEmail();
        boolean boolean8 = user6.isApproved();
        int int9 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinator2" + "'", str7, "Coordinator2");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) (short) -1, "Coordinator", "manager1@yorku.ca", "Researcher", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Manager1", "Manager1", "hi!", false);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "labmanager", "Student", "Faculty", false);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.emailExists("Student");
        java.lang.Class<?> wildcardClass10 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Manager1", 0, "coord2@yorku.ca", "labmanager", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Manager1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        int int6 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService7 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator13 = new com.reservation_system.model.HeadLabCoordinator(1, "hi!", "manager1@yorku.ca", "Manager1", true);
        int int14 = headLabCoordinator13.getID();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = coordinatorAccountService7.autoGenerateLabManagerAccount((com.reservation_system.model.User) headLabCoordinator13, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "28) test0661(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("coord2@yorku.ca", (int) (byte) 0, "Manager1", "coord2@yorku.ca", "Manager1", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: coord2@yorku.ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user26 = coordinatorAccountService22.createHeadLabCoordinator("labmanager", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "data/test-users.csv", "coord@yorku.ca", "Faculty", false);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        boolean boolean8 = guest5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        com.reservation_system.model.Student student72 = new com.reservation_system.model.Student((int) '4', "", "Coordinator", "Coordinator", true);
        java.lang.String str73 = student72.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user77 = coordinatorAccountService66.autoGenerateLabManagerAccount((com.reservation_system.model.User) student72, "coord2@yorku.ca", "hi!", "manager1@yorku.ca");
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
// flaky "29) test0665(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 101 + "'", int57 == 101);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(userOptional62);
        org.junit.Assert.assertNotNull(userOptional64);
// flaky "12) test0665(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int65 + "' != '" + 101 + "'", int65 == 101);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Student" + "'", str73, "Student");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "", "Coordinator", "Coordinator", true);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("Manager1");
        com.reservation_system.model.Student student11 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean12 = student11.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) student11);
        java.lang.String str14 = student11.getUserType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Guest", "", "headlabcoordinator", true);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user26 = coordinatorAccountService22.createHeadLabCoordinator("Manager1", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
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
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "", "Manager1", "Student", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "manager1@yorku.ca", "coord@yorku.ca", "hi!", false);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        com.reservation_system.model.Student student40 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean41 = student40.requiresDepartmentApproval();
        boolean boolean42 = student40.requiresDepartmentApproval();
        student40.setApproved(true);
        java.lang.String str45 = student40.getName();
        java.lang.String str46 = student40.getUserType();
        java.lang.String str47 = student40.getUserType();
        boolean boolean48 = student40.isApproved();
        boolean boolean49 = student40.requiresDepartmentApproval();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user53 = coordinatorAccountService34.autoGenerateLabManagerAccount((com.reservation_system.model.User) student40, "hi!", "labmanager", "labmanager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
// flaky "30) test0672(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky "13) test0672(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 101 + "'", int29 == 101);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Coordinator" + "'", str45, "Coordinator");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Student" + "'", str46, "Student");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Student" + "'", str47, "Student");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService1 = new com.reservation_system.services.CoordinatorAccountService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user5 = coordinatorAccountService1.createHeadLabCoordinator("data/test-users.csv", "headlabcoordinator", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.repository.UserRepository.headLabCoordinatorExists()\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Manager1", "", "Strong1!", true);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        boolean boolean9 = researcher5.isApproved();
        java.lang.String str10 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "", "Coordinator", "Coordinator", true);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "Researcher", "labmanager", "Coordinator2", false);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "Coordinator", "headlabcoordinator", "coord@yorku.ca", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        boolean boolean8 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 10, "", "", "coord2@yorku.ca", true);
        boolean boolean7 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        com.reservation_system.model.Researcher researcher13 = new com.reservation_system.model.Researcher(1, "manager1@yorku.ca", "Faculty", "", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher13);
        int int15 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "31) test0679(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "data/test-users.csv", "Strong1!", "Faculty", false);
        researcher5.setApproved(true);
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "", "headlabcoordinator", "headlabcoordinator", true);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "headlabcoordinator", "", "Manager1", false);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Manager1", "", "Strong1!", true);
        java.lang.String str6 = researcher5.getEmail();
        researcher5.setApproved(false);
        int int9 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("data/test-users.csv");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "Researcher", "Manager1", "coord2@yorku.ca", true);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("Manager1");
        com.reservation_system.model.Student student11 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean12 = student11.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) student11);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService14 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest20 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str21 = guest20.getPassword();
        boolean boolean22 = guest20.isApproved();
        java.lang.String str23 = guest20.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user27 = coordinatorAccountService14.autoGenerateLabManagerAccount((com.reservation_system.model.User) guest20, "coord@yorku.ca", "Coordinator2", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coordinator2" + "'", str23, "Coordinator2");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "Coordinator", "headlabcoordinator", "coord@yorku.ca", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("coord2@yorku.ca");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("manager1@yorku.ca");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("Student");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userOptional12);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        com.reservation_system.model.User user33 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) 'a', "coord@yorku.ca", "coord2@yorku.ca", "Strong1!", false);
        java.lang.String str34 = user33.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user38 = coordinatorAccountService26.autoGenerateLabManagerAccount(user33, "manager1@yorku.ca", "Faculty", "manager1@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
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
        org.junit.Assert.assertNotNull(user33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Strong1!" + "'", str34, "Strong1!");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        int int10 = userRepository1.getNextID();
        int int11 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService12 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService14 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.LabManager labManager20 = new com.reservation_system.model.LabManager(0, "coord2@yorku.ca", "Faculty", "Researcher", false);
        boolean boolean21 = labManager20.requiresDepartmentApproval();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user25 = coordinatorAccountService14.autoGenerateLabManagerAccount((com.reservation_system.model.User) labManager20, "Coordinator", "Guest", "Strong1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList9);
// flaky "32) test0690(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
// flaky "14) test0690(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Student", "Coordinator2", "data/test-users.csv", true);
        java.lang.String str6 = faculty5.getName();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "hi!", "manager1@yorku.ca", "Faculty", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Guest", "Guest", "Manager1", false);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Coordinator");
        boolean boolean12 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("Guest");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "Manager1", "Strong1!", "Manager1", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Manager1" + "'", str7, "Manager1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Manager1" + "'", str8, "Manager1");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Manager1", "Researcher", "headlabcoordinator", false);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "data/test-users.csv", "coord2@yorku.ca", "data/test-users.csv", false);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getEmail();
        java.lang.String str10 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-users.csv" + "'", str6, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "coord2@yorku.ca" + "'", str9, "coord2@yorku.ca");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "data/test-users.csv" + "'", str10, "data/test-users.csv");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (byte) 0, "Manager1", "coord2@yorku.ca", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Researcher", "data/test-users.csv", "Faculty", true);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "headlabcoordinator", "data/test-users.csv", "data/test-users.csv", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        java.lang.Class<?> wildcardClass8 = guest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
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
        int int28 = userRepository1.getNextID();
        boolean boolean30 = userRepository1.emailExists("manager1@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
// flaky "33) test0702(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userList26);
// flaky "15) test0702(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 101 + "'", int28 == 101);
// flaky "8) test0702(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "", "headlabcoordinator", "Faculty", false);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "coord2@yorku.ca", "hi!", "manager1@yorku.ca", true);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(99, "coord@yorku.ca", "Manager1", "Guest", false);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
        java.lang.Class<?> wildcardClass37 = userRepository1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "hi!", "headlabcoordinator", "", false);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        boolean boolean28 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
// flaky "34) test0708(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Guest" + "'", str16, "Guest");
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        boolean boolean29 = userRepository1.emailExists("Guest");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
// flaky "35) test0709(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository28.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional32 = userRepository28.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository28.getAllUsers();
        int int34 = userRepository28.getNextID();
        java.util.List<com.reservation_system.model.User> userList35 = userRepository28.getAllUsers();
        boolean boolean36 = userRepository28.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList37 = userRepository28.getAllUsers();
        userRepository1.saveAllUsers(userList37);
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
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertNotNull(userOptional32);
        org.junit.Assert.assertNotNull(userList33);
// flaky "36) test0710(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 101 + "'", int34 == 101);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(userList37);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "Coordinator2", "coord@yorku.ca", "data/test-users.csv", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "", "Guest", "Coordinator", true);
        java.lang.String str6 = labManager5.getUserType();
        labManager5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str6 = guest5.getPassword();
        boolean boolean7 = guest5.isApproved();
        int int8 = guest5.getID();
        java.lang.String str9 = guest5.getUserType();
        int int10 = guest5.getID();
        boolean boolean11 = guest5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass12 = guest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "coord2@yorku.ca", "Coordinator2", "headlabcoordinator", true);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager12);
        boolean boolean15 = userRepository1.emailExists("Faculty");
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository17.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository17.findByEmail("headlabcoordinator");
        boolean boolean23 = userRepository17.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList24 = userRepository17.getAllUsers();
        boolean boolean26 = userRepository17.emailExists("");
        com.reservation_system.model.LabManager labManager32 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str33 = labManager32.getEmail();
        java.lang.String str34 = labManager32.getUserType();
        userRepository17.addUser((com.reservation_system.model.User) labManager32);
        boolean boolean37 = userRepository17.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList38 = userRepository17.getAllUsers();
        userRepository1.saveAllUsers(userList38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Faculty" + "'", str33, "Faculty");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "labmanager" + "'", str34, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(userList38);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "coord2@yorku.ca", "Student", "Coordinator", true);
        student5.setApproved(true);
        java.lang.String str8 = student5.getEmail();
        boolean boolean9 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.model.Student student9 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean10 = student9.isApproved();
        java.lang.String str11 = student9.getName();
        userRepository1.addUser((com.reservation_system.model.User) student9);
        boolean boolean13 = student9.requiresDepartmentApproval();
        java.lang.String str14 = student9.getEmail();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinator" + "'", str11, "Coordinator");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coordinator" + "'", str14, "Coordinator");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "manager1@yorku.ca", "Student", "coord2@yorku.ca", false);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService12 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator18 = new com.reservation_system.model.HeadLabCoordinator(10, "Researcher", "coord@yorku.ca", "Student", true);
        java.lang.String str19 = headLabCoordinator18.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user23 = coordinatorAccountService12.autoGenerateLabManagerAccount((com.reservation_system.model.User) headLabCoordinator18, "", "headlabcoordinator", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "headlabcoordinator" + "'", str19, "headlabcoordinator");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        java.lang.String str60 = researcher55.getUserType();
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
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Researcher" + "'", str60, "Researcher");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "coord@yorku.ca", "", "Manager1", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "Strong1!", "headlabcoordinator", "Manager1", false);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        int int10 = userRepository1.getNextID();
        int int11 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService12 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService14 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Faculty faculty20 = new com.reservation_system.model.Faculty((int) (byte) 0, "Strong1!", "Faculty", "coord@yorku.ca", true);
        int int21 = faculty20.getID();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user25 = coordinatorAccountService14.autoGenerateLabManagerAccount((com.reservation_system.model.User) faculty20, "data/test-users.csv", "Coordinator2", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList9);
// flaky "37) test0723(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
// flaky "16) test0723(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        int int10 = userRepository1.getNextID();
        int int11 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService12 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest18 = new com.reservation_system.model.Guest(98, "", "Guest", "", false);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = coordinatorAccountService12.autoGenerateLabManagerAccount((com.reservation_system.model.User) guest18, "Faculty", "coord@yorku.ca", "coord2@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList9);
// flaky "38) test0724(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
// flaky "17) test0724(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "coord@yorku.ca", "", "labmanager", false);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("Manager1");
        int int6 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "39) test0726(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        com.reservation_system.model.Researcher researcher24 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str25 = researcher24.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher24);
        int int27 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Researcher" + "'", str25, "Researcher");
// flaky "40) test0727(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "hi!", "Coordinator", "manager1@yorku.ca", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        java.lang.String str8 = headLabCoordinator5.getName();
        java.lang.String str9 = headLabCoordinator5.getName();
        java.lang.String str10 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinator" + "'", str7, "Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinator" + "'", str10, "Coordinator");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "coord2@yorku.ca" + "'", str9, "coord2@yorku.ca");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "headlabcoordinator", "coord2@yorku.ca", "", false);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(101, "Coordinator2", "data/test-users.csv", "Coordinator", true);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "Manager1", "Researcher", "data/test-users.csv", false);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "Strong1!", "Student", "headlabcoordinator", true);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "", "Strong1!", "", false);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "manager1@yorku.ca", "Faculty", "", false);
        int int6 = researcher5.getID();
        java.lang.String str7 = researcher5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "manager1@yorku.ca" + "'", str7, "manager1@yorku.ca");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "headlabcoordinator", "", "coord2@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(false);
        java.lang.String str9 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "coord2@yorku.ca" + "'", str9, "coord2@yorku.ca");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Researcher", "coord@yorku.ca", "Student", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        boolean boolean8 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(2, "", "data/test-users.csv", "Coordinator", false);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) 'a', "Researcher", "Guest", "Guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "coord@yorku.ca", "Coordinator2", "Faculty", true);
        student5.setApproved(false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Strong1!");
        boolean boolean9 = userRepository1.emailExists("hi!");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "coord2@yorku.ca", "Strong1!", "hi!", true);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "coord2@yorku.ca", "coord@yorku.ca", "Coordinator2", false);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 35, "Coordinator2", "Researcher", "Student", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "hi!", "manager1@yorku.ca", "Manager1", true);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Manager1" + "'", str6, "Manager1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager1@yorku.ca" + "'", str8, "manager1@yorku.ca");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getEmail();
        java.lang.String str8 = guest5.getUserType();
        int int9 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinator2" + "'", str7, "Coordinator2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("coord2@yorku.ca");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("manager1@yorku.ca");
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty18 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository12.addUser((com.reservation_system.model.User) faculty18);
        java.util.List<com.reservation_system.model.User> userList20 = userRepository12.getAllUsers();
        int int21 = userRepository12.getNextID();
        java.util.List<com.reservation_system.model.User> userList22 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList22);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList20);
// flaky "41) test0747(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest11 = new com.reservation_system.model.Guest(32, "Coordinator", "data/test-users.csv", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) guest11);
        java.lang.String str13 = guest11.getUserType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "coord@yorku.ca", "Student", "", true);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "manager1@yorku.ca", "Strong1!", "", false);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService9 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("");
        org.junit.Assert.assertNotNull(userOptional11);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "", "data/test-users.csv", "Faculty", true);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        int int7 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService9 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user61 = coordinatorAccountService9.autoGenerateLabManagerAccount((com.reservation_system.model.User) headLabCoordinator55, "Strong1!", "Strong1!", "labmanager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Head lab coordinator account is not approved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
// flaky "42) test0753(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Faculty" + "'", str27, "Faculty");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "labmanager" + "'", str28, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Strong1!" + "'", str37, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(userOptional47);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "headlabcoordinator" + "'", str57, "headlabcoordinator");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "Coordinator", "", "Manager1", false);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "manager1@yorku.ca", "Manager1", "Manager1", false);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "hi!", "Coordinator", "manager1@yorku.ca", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) ' ', "", "Student", "Student", true);
        int int7 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "labmanager", "Coordinator2", "Manager1", true);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository1.findByEmail("labmanager");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userOptional24);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        java.lang.String str27 = guest25.getPassword();
        boolean boolean28 = guest25.isApproved();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Faculty" + "'", str27, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "Faculty", "Coordinator2", "Strong1!", true);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "Student", "coord2@yorku.ca", "Student", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(99, "Manager1", "Strong1!", "", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str6 = guest5.getPassword();
        boolean boolean7 = guest5.isApproved();
        int int8 = guest5.getID();
        guest5.setApproved(false);
        boolean boolean11 = guest5.requiresDepartmentApproval();
        guest5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Faculty", "", "labmanager", false);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        labManager5.setApproved(true);
        boolean boolean8 = labManager5.isApproved();
        java.lang.String str9 = labManager5.getUserType();
        java.lang.String str10 = labManager5.getPassword();
        labManager5.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinator2" + "'", str10, "Coordinator2");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService1 = new com.reservation_system.services.CoordinatorAccountService(userRepository0);
        com.reservation_system.model.User user2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = coordinatorAccountService1.autoGenerateLabManagerAccount(user2, "Faculty", "", "Manager1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "Researcher", "Researcher", "hi!", false);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) (short) 1, "hi!", "coord2@yorku.ca", "Guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        boolean boolean7 = userRepository1.emailExists("labmanager");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
// flaky "43) test0770(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.emailExists("Student");
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean13 = userRepository11.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository11.findByEmail("coord2@yorku.ca");
        int int16 = userRepository11.getNextID();
        java.util.List<com.reservation_system.model.User> userList17 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList17);
        java.lang.Class<?> wildcardClass19 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userOptional15);
// flaky "44) test0772(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "hi!", "manager1@yorku.ca", "hi!", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user10 = coordinatorAccountService6.createHeadLabCoordinator("coord2@yorku.ca", "Manager1", "labmanager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "coord2@yorku.ca", "Researcher", "Student", true);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator45 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "", "", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator45);
        java.lang.String str47 = headLabCoordinator45.getUserType();
        java.lang.String str48 = headLabCoordinator45.getUserType();
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "headlabcoordinator" + "'", str47, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "headlabcoordinator" + "'", str48, "headlabcoordinator");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("coord2@yorku.ca", (int) (short) 100, "Student", "Researcher", "coord@yorku.ca", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: coord2@yorku.ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager12);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService14 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.lang.Class<?> wildcardClass15 = coordinatorAccountService14.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Coordinator2", "", "", false);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinator2" + "'", str6, "Coordinator2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        int int2 = userRepository1.getNextID();
// flaky "45) test0780(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "manager1@yorku.ca", "Student", "Coordinator2", true);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "data/test-users.csv", "Manager1", "Strong1!", false);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "data/test-users.csv", "", "Coordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "coord@yorku.ca", "Coordinator2", "Faculty", true);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        java.util.Optional<com.reservation_system.model.User> userOptional51 = userRepository1.findByEmail("Coordinator");
        int int52 = userRepository1.getNextID();
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
// flaky "46) test0786(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 101 + "'", int52 == 101);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "coord2@yorku.ca", "coord2@yorku.ca", "hi!", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getEmail();
        java.lang.String str8 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coord2@yorku.ca" + "'", str7, "coord2@yorku.ca");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        java.util.Optional<com.reservation_system.model.User> userOptional42 = userRepository1.findByEmail("Coordinator");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Researcher" + "'", str27, "Researcher");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Researcher" + "'", str29, "Researcher");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Faculty" + "'", str37, "Faculty");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Faculty" + "'", str39, "Faculty");
        org.junit.Assert.assertNotNull(userOptional42);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "headlabcoordinator", "Student", "", false);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getEmail();
        int int8 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str10 = labManager9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        java.lang.String str12 = labManager9.getUserType();
        java.lang.String str13 = labManager9.getUserType();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "labmanager" + "'", str13, "labmanager");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "Strong1!", "", "Coordinator2", true);
        faculty5.setApproved(true);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.requiresDepartmentApproval();
        student5.setApproved(true);
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getName();
        java.lang.String str12 = student5.getUserType();
        student5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinator" + "'", str11, "Coordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator45 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "", "", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator45);
        com.reservation_system.repository.UserRepository userRepository48 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional50 = userRepository48.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional52 = userRepository48.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList53 = userRepository48.getAllUsers();
        int int54 = userRepository48.getNextID();
        java.util.List<com.reservation_system.model.User> userList55 = userRepository48.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository57 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean58 = userRepository57.headLabCoordinatorExists();
        boolean boolean59 = userRepository57.headLabCoordinatorExists();
        boolean boolean61 = userRepository57.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional63 = userRepository57.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList64 = userRepository57.getAllUsers();
        userRepository48.saveAllUsers(userList64);
        com.reservation_system.repository.UserRepository userRepository67 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional69 = userRepository67.findByEmail("Faculty");
        com.reservation_system.model.LabManager labManager75 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str76 = labManager75.getUserType();
        userRepository67.addUser((com.reservation_system.model.User) labManager75);
        labManager75.setApproved(true);
        userRepository48.addUser((com.reservation_system.model.User) labManager75);
        java.util.List<com.reservation_system.model.User> userList81 = userRepository48.getAllUsers();
        userRepository1.saveAllUsers(userList81);
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
        org.junit.Assert.assertNotNull(userOptional50);
        org.junit.Assert.assertNotNull(userOptional52);
        org.junit.Assert.assertNotNull(userList53);
// flaky "47) test0793(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 101 + "'", int54 == 101);
        org.junit.Assert.assertNotNull(userList55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(userOptional63);
        org.junit.Assert.assertNotNull(userList64);
        org.junit.Assert.assertNotNull(userOptional69);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "labmanager" + "'", str76, "labmanager");
        org.junit.Assert.assertNotNull(userList81);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "Coordinator", "Coordinator", "manager1@yorku.ca", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "manager1@yorku.ca" + "'", str8, "manager1@yorku.ca");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "Researcher", "data/test-users.csv", "coord2@yorku.ca", true);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "Strong1!", "Faculty", "headlabcoordinator", false);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "data/test-users.csv", "", "labmanager", false);
        headLabCoordinator5.setApproved(false);
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        com.reservation_system.model.Researcher researcher25 = new com.reservation_system.model.Researcher((int) (short) -1, "Manager1", "headlabcoordinator", "coord@yorku.ca", true);
        researcher25.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) researcher25);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
// flaky "48) test0798(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Manager1", "Coordinator", "coord@yorku.ca", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(99, "manager1@yorku.ca", "Manager1", "hi!", false);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "labmanager", "Student", "Coordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(false);
        boolean boolean9 = researcher5.isApproved();
        java.lang.String str10 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "manager1@yorku.ca", "headlabcoordinator", "Faculty", true);
        researcher5.setApproved(true);
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("coord@yorku.ca", (int) (short) -1, "data/test-users.csv", "Student", "Coordinator2", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: coord@yorku.ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 100, "", "Researcher", "labmanager", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("");
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean16 = userRepository15.headLabCoordinatorExists();
        boolean boolean17 = userRepository15.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository19 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean20 = userRepository19.headLabCoordinatorExists();
        boolean boolean21 = userRepository19.headLabCoordinatorExists();
        boolean boolean23 = userRepository19.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional25 = userRepository19.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList26 = userRepository19.getAllUsers();
        userRepository15.saveAllUsers(userList26);
        java.util.List<com.reservation_system.model.User> userList28 = userRepository15.getAllUsers();
        userRepository1.saveAllUsers(userList28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
// flaky "49) test0804(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(userOptional25);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.requiresDepartmentApproval();
        student5.setApproved(true);
        java.lang.String str10 = student5.getName();
        java.lang.String str11 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinator" + "'", str10, "Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "", "Coordinator", "Coordinator", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
        com.reservation_system.repository.UserRepository userRepository60 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean61 = userRepository60.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList62 = userRepository60.getAllUsers();
        int int63 = userRepository60.getNextID();
        com.reservation_system.repository.UserRepository userRepository65 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean67 = userRepository65.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional69 = userRepository65.findByEmail("coord2@yorku.ca");
        java.util.List<com.reservation_system.model.User> userList70 = userRepository65.getAllUsers();
        userRepository60.saveAllUsers(userList70);
        userRepository1.saveAllUsers(userList70);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "labmanager" + "'", str13, "labmanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userOptional25);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "labmanager" + "'", str35, "labmanager");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Student" + "'", str36, "Student");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(userOptional47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 102 + "'", int48 == 102);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 102 + "'", int63 == 102);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(userOptional69);
        org.junit.Assert.assertNotNull(userList70);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "hi!", "Coordinator2", "data/test-users.csv", false);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "coord2@yorku.ca", "Student", "Coordinator", true);
        student5.setApproved(true);
        java.lang.String str8 = student5.getUserType();
        int int9 = student5.getID();
        boolean boolean10 = student5.isApproved();
        java.lang.String str11 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "manager1@yorku.ca", "", "Student", true);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService11 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = coordinatorAccountService11.autoGenerateLabManagerAccount(user12, "labmanager", "Student", "labmanager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "hi!", "Coordinator", "manager1@yorku.ca", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(98, "labmanager", "hi!", "Researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        boolean boolean26 = userRepository1.emailExists("Coordinator");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 102 + "'", int10 == 102);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(2, "Researcher", "hi!", "headlabcoordinator", true);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "coord2@yorku.ca", "Student", "Coordinator", true);
        student5.setApproved(true);
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getUserType();
        java.lang.String str11 = student5.getUserType();
        java.lang.String str12 = student5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "coord2@yorku.ca" + "'", str12, "coord2@yorku.ca");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService32 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user36 = coordinatorAccountService32.createHeadLabCoordinator("hi!", "", "Guest");
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
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "manager1@yorku.ca", "Coordinator2", "manager1@yorku.ca", true);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "data/test-users.csv", "Researcher", "coord2@yorku.ca", true);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(2, "data/test-users.csv", "headlabcoordinator", "Coordinator2", false);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService12 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest18 = new com.reservation_system.model.Guest((int) (short) 10, "Coordinator", "", "labmanager", true);
        boolean boolean19 = guest18.requiresDepartmentApproval();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user23 = coordinatorAccountService12.autoGenerateLabManagerAccount((com.reservation_system.model.User) guest18, "manager1@yorku.ca", "Strong1!", "Coordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "hi!", "", "labmanager", true);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        int int6 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 102 + "'", int6 == 102);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "headlabcoordinator", "Student", "", false);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getName();
        boolean boolean8 = labManager5.isApproved();
        int int9 = labManager5.getID();
        java.lang.String str10 = labManager5.getUserType();
        java.lang.String str11 = labManager5.getUserType();
        java.lang.String str12 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "data/test-users.csv", "coord2@yorku.ca", "data/test-users.csv", false);
        java.lang.String str6 = guest5.getPassword();
        int int7 = guest5.getID();
        boolean boolean8 = guest5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-users.csv" + "'", str6, "data/test-users.csv");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "", "headlabcoordinator", "manager1@yorku.ca", false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "Coordinator2", "Student", "hi!", true);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(101, "Strong1!", "hi!", "Manager1", true);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("coord2@yorku.ca");
        int int6 = userRepository1.getNextID();
        com.reservation_system.model.Guest guest12 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str13 = guest12.getPassword();
        boolean boolean14 = guest12.isApproved();
        java.lang.String str15 = guest12.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) guest12);
        java.lang.String str17 = guest12.getUserType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 102 + "'", int6 == 102);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coordinator2" + "'", str15, "Coordinator2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Guest" + "'", str17, "Guest");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "hi!", "manager1@yorku.ca", "Strong1!", false);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService21 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Guest" + "'", str16, "Guest");
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "coord@yorku.ca", "Researcher", "hi!", true);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getEmail();
        java.lang.String str9 = faculty5.getPassword();
        java.lang.String str10 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord@yorku.ca" + "'", str6, "coord@yorku.ca");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "coord@yorku.ca", "Researcher", "hi!", true);
        java.lang.String str6 = faculty5.getUserType();
        int int7 = faculty5.getID();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(99, "data/test-users.csv", "", "Guest", true);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "Guest", "", "Coordinator2", false);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(99, "Coordinator", "Strong1!", "Researcher", false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        int int10 = student5.getID();
        java.lang.String str11 = student5.getUserType();
        java.lang.String str12 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        com.reservation_system.model.Student student46 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean47 = student46.requiresDepartmentApproval();
        java.lang.String str48 = student46.getUserType();
        java.lang.String str49 = student46.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student46);
        java.lang.String str51 = student46.getEmail();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Researcher" + "'", str27, "Researcher");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Researcher" + "'", str29, "Researcher");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Faculty" + "'", str37, "Faculty");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Faculty" + "'", str39, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Student" + "'", str48, "Student");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Student" + "'", str49, "Student");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Coordinator" + "'", str51, "Coordinator");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("");
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository9.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository9.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList15);
        java.util.List<com.reservation_system.model.User> userList17 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Student", "Student", "Manager1", false);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "Coordinator", "Strong1!", "Faculty", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Student", "Manager1", "data/test-users.csv", false);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.requiresDepartmentApproval();
        student5.setApproved(true);
        java.lang.String str10 = student5.getName();
        java.lang.String str11 = student5.getUserType();
        java.lang.String str12 = student5.getUserType();
        boolean boolean13 = student5.isApproved();
        java.lang.String str14 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinator" + "'", str10, "Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "headlabcoordinator", "Student", "", false);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getName();
        boolean boolean8 = labManager5.isApproved();
        int int9 = labManager5.getID();
        java.lang.String str10 = labManager5.getName();
        java.lang.String str11 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "coord@yorku.ca", "", "Student", false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "", "hi!", "Manager1", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
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
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "data/test-users.csv", "headlabcoordinator", "manager1@yorku.ca", false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(102, "coord2@yorku.ca", "Manager1", "labmanager", false);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) '4', "headlabcoordinator", "coord2@yorku.ca", "Manager1", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "Strong1!", "Guest", "headlabcoordinator", true);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService23 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user27 = coordinatorAccountService23.createHeadLabCoordinator("Guest", "Student", "Guest");
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
// flaky "50) test0854(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "coord@yorku.ca", "", "Guest", false);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        boolean boolean50 = userRepository1.emailExists("");
        java.util.List<com.reservation_system.model.User> userList51 = userRepository1.getAllUsers();
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(userList51);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user28 = coordinatorAccountService24.createHeadLabCoordinator("labmanager", "", "labmanager");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "labmanager" + "'", str21, "labmanager");
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "Manager1", "coord@yorku.ca", "", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.Class<?> wildcardClass7 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("Researcher");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        int int7 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager15 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str16 = labManager15.getUserType();
        java.lang.String str17 = labManager15.getPassword();
        userRepository9.addUser((com.reservation_system.model.User) labManager15);
        boolean boolean19 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher25 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository9.addUser((com.reservation_system.model.User) researcher25);
        java.util.Optional<com.reservation_system.model.User> userOptional28 = userRepository9.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService29 = new com.reservation_system.services.CoordinatorAccountService(userRepository9);
        int int30 = userRepository9.getNextID();
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager38 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str39 = labManager38.getUserType();
        java.lang.String str40 = labManager38.getPassword();
        userRepository32.addUser((com.reservation_system.model.User) labManager38);
        boolean boolean42 = userRepository32.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher48 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository32.addUser((com.reservation_system.model.User) researcher48);
        java.util.Optional<com.reservation_system.model.User> userOptional51 = userRepository32.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService52 = new com.reservation_system.services.CoordinatorAccountService(userRepository32);
        int int53 = userRepository32.getNextID();
        java.util.List<com.reservation_system.model.User> userList54 = userRepository32.getAllUsers();
        userRepository9.saveAllUsers(userList54);
        userRepository1.saveAllUsers(userList54);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "labmanager" + "'", str16, "labmanager");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 102 + "'", int30 == 102);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "labmanager" + "'", str39, "labmanager");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Student" + "'", str40, "Student");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(userOptional51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 102 + "'", int53 == 102);
        org.junit.Assert.assertNotNull(userList54);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "coord@yorku.ca", "Researcher", "hi!", true);
        java.lang.String str6 = faculty5.getPassword();
        java.lang.Class<?> wildcardClass7 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "headlabcoordinator", "data/test-users.csv", "Strong1!", false);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getEmail();
        int int8 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "data/test-users.csv" + "'", str7, "data/test-users.csv");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        int int10 = userRepository1.getNextID();
        boolean boolean12 = userRepository1.emailExists("Researcher");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 102 + "'", int10 == 102);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService7 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user11 = coordinatorAccountService7.createHeadLabCoordinator("Faculty", "", "coord2@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "coord@yorku.ca", "Faculty", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        boolean boolean8 = researcher5.isApproved();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean27 = userRepository26.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService28 = new com.reservation_system.services.CoordinatorAccountService(userRepository26);
        java.util.List<com.reservation_system.model.User> userList29 = userRepository26.getAllUsers();
        userRepository1.saveAllUsers(userList29);
        java.util.Optional<com.reservation_system.model.User> userOptional32 = userRepository1.findByEmail("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userOptional32);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "labmanager", "Student", "Student", true);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest12 = new com.reservation_system.model.Guest((int) (short) 100, "Manager1", "", "Student", false);
        userRepository1.addUser((com.reservation_system.model.User) guest12);
        int int14 = userRepository1.getNextID();
        int int15 = userRepository1.getNextID();
        int int16 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository1.findByEmail("Manager1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 102 + "'", int16 == 102);
        org.junit.Assert.assertNotNull(userOptional18);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "coord@yorku.ca", "hi!", "labmanager", true);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        com.reservation_system.repository.UserRepository userRepository52 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional54 = userRepository52.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional56 = userRepository52.findByEmail("headlabcoordinator");
        boolean boolean58 = userRepository52.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList59 = userRepository52.getAllUsers();
        boolean boolean61 = userRepository52.emailExists("");
        com.reservation_system.model.LabManager labManager67 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str68 = labManager67.getEmail();
        java.lang.String str69 = labManager67.getUserType();
        userRepository52.addUser((com.reservation_system.model.User) labManager67);
        boolean boolean71 = userRepository52.headLabCoordinatorExists();
        com.reservation_system.model.Student student77 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str78 = student77.getPassword();
        userRepository52.addUser((com.reservation_system.model.User) student77);
        boolean boolean80 = userRepository52.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository82 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean83 = userRepository82.headLabCoordinatorExists();
        boolean boolean84 = userRepository82.headLabCoordinatorExists();
        boolean boolean86 = userRepository82.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional88 = userRepository82.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList89 = userRepository82.getAllUsers();
        userRepository52.saveAllUsers(userList89);
        boolean boolean91 = userRepository52.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList92 = userRepository52.getAllUsers();
        userRepository1.saveAllUsers(userList92);
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
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertNotNull(userOptional54);
        org.junit.Assert.assertNotNull(userOptional56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Faculty" + "'", str68, "Faculty");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "labmanager" + "'", str69, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Strong1!" + "'", str78, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(userOptional88);
        org.junit.Assert.assertNotNull(userList89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(userList92);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "coord@yorku.ca", "labmanager", "Student", true);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        int int4 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean8 = userRepository6.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository6.findByEmail("coord2@yorku.ca");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository6.getAllUsers();
        userRepository1.saveAllUsers(userList11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("hi!");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("coord@yorku.ca", 97, "Researcher", "", "Strong1!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: coord@yorku.ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(2, "data/test-users.csv", "Manager1", "data/test-users.csv", true);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "hi!", "coord@yorku.ca", "manager1@yorku.ca", false);
        int int6 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService23 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user27 = coordinatorAccountService23.createHeadLabCoordinator("hi!", "Student", "Coordinator2");
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
// flaky "51) test0875(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user21 = coordinatorAccountService17.createHeadLabCoordinator("manager1@yorku.ca", "Strong1!", "Strong1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coordinator" + "'", str15, "Coordinator");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator45 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "", "", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator45);
        java.util.Optional<com.reservation_system.model.User> userOptional48 = userRepository1.findByEmail("Coordinator");
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
        org.junit.Assert.assertNotNull(userOptional48);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "headlabcoordinator", "Coordinator2", "Coordinator2", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Coordinator2", "labmanager", "headlabcoordinator", true);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        java.lang.String str20 = guest14.getEmail();
        java.lang.String str21 = guest14.getName();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Guest" + "'", str16, "Guest");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Student" + "'", str20, "Student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Researcher" + "'", str21, "Researcher");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "", "Researcher", "Researcher", false);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
        java.util.List<com.reservation_system.model.User> userList45 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "labmanager" + "'", str21, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Strong1!" + "'", str30, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(userOptional40);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(userList45);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Faculty", "data/test-users.csv", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "data/test-users.csv", "coord2@yorku.ca", "data/test-users.csv", false);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getName();
        java.lang.String str9 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-users.csv" + "'", str6, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-users.csv" + "'", str8, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "data/test-users.csv" + "'", str9, "data/test-users.csv");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) 100, "manager1@yorku.ca", "Manager1", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Manager1", "", "Strong1!", true);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        boolean boolean9 = researcher5.isApproved();
        boolean boolean10 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "Faculty", "hi!", "coord@yorku.ca", true);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.User user8 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) 'a', "coord@yorku.ca", "coord2@yorku.ca", "Strong1!", false);
        java.lang.String str9 = user8.getEmail();
        userRepository1.addUser(user8);
        com.reservation_system.model.Student student16 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean17 = student16.requiresDepartmentApproval();
        java.lang.String str18 = student16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student16);
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("Researcher");
        boolean boolean23 = userRepository1.emailExists("Coordinator");
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "coord2@yorku.ca" + "'", str9, "coord2@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "manager1@yorku.ca", "hi!", "", false);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) 'a', "coord@yorku.ca", "coord2@yorku.ca", "Strong1!", false);
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Strong1!" + "'", str7, "Strong1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Strong1!" + "'", str8, "Strong1!");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        int int10 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 102 + "'", int10 == 102);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "headlabcoordinator", "Student", "", false);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getName();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(101, "coord2@yorku.ca", "headlabcoordinator", "", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Coordinator2", (-1), "Faculty", "labmanager", "manager1@yorku.ca", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Coordinator2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        boolean boolean28 = userRepository26.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository26.findByEmail("coord2@yorku.ca");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository26.getAllUsers();
        userRepository1.saveAllUsers(userList31);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Student" + "'", str21, "Student");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "", "Faculty", "labmanager", false);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        com.reservation_system.model.Faculty faculty31 = new com.reservation_system.model.Faculty((int) '#', "data/test-users.csv", "manager1@yorku.ca", "data/test-users.csv", false);
        java.lang.String str32 = faculty31.getPassword();
        boolean boolean33 = faculty31.isApproved();
        java.lang.String str34 = faculty31.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty31);
        com.reservation_system.model.Researcher researcher41 = new com.reservation_system.model.Researcher((int) (byte) -1, "Manager1", "", "Strong1!", true);
        boolean boolean42 = researcher41.isApproved();
        java.lang.String str43 = researcher41.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) researcher41);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "data/test-users.csv" + "'", str32, "data/test-users.csv");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Faculty" + "'", str34, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Strong1!" + "'", str43, "Strong1!");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(98, "Strong1!", "Manager1", "Faculty", false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        java.util.List<com.reservation_system.model.User> userList52 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "labmanager" + "'", str13, "labmanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userOptional25);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "labmanager" + "'", str35, "labmanager");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Student" + "'", str36, "Student");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(userOptional47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 102 + "'", int48 == 102);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertNotNull(userList52);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str6 = guest5.getPassword();
        guest5.setApproved(false);
        guest5.setApproved(false);
        java.lang.String str11 = guest5.getEmail();
        java.lang.String str12 = guest5.getName();
        guest5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinator2" + "'", str11, "Coordinator2");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Manager1" + "'", str12, "Manager1");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.model.Student student9 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean10 = student9.isApproved();
        java.lang.String str11 = student9.getName();
        userRepository1.addUser((com.reservation_system.model.User) student9);
        int int13 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService16 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean17 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinator" + "'", str11, "Coordinator");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 102 + "'", int13 == 102);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (-1), "", "Researcher", "Faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        boolean boolean40 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList41 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass42 = userRepository1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        boolean boolean5 = userRepository1.emailExists("");
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        java.lang.String str12 = faculty11.getUserType();
        java.lang.String str13 = faculty11.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        boolean boolean15 = faculty11.isApproved();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(99, "", "labmanager", "coord@yorku.ca", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "Researcher", "", "coord@yorku.ca", true);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "manager1@yorku.ca", "Coordinator2", "coord2@yorku.ca", false);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "labmanager", "Faculty", "Coordinator2", true);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "Manager1", "coord2@yorku.ca", "Guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "manager1@yorku.ca", "data/test-users.csv", "Student", false);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        boolean boolean30 = userRepository1.emailExists("labmanager");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Strong1!" + "'", str27, "Strong1!");
// flaky "52) test0911(com.reservation_system.Randoop.CoordinatorService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean21 = userRepository20.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList22 = userRepository20.getAllUsers();
        int int23 = userRepository20.getNextID();
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
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager53 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str54 = labManager53.getUserType();
        java.lang.String str55 = labManager53.getPassword();
        userRepository47.addUser((com.reservation_system.model.User) labManager53);
        boolean boolean57 = userRepository47.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher63 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository47.addUser((com.reservation_system.model.User) researcher63);
        java.util.Optional<com.reservation_system.model.User> userOptional66 = userRepository47.findByEmail("data/test-users.csv");
        int int67 = userRepository47.getNextID();
        java.util.List<com.reservation_system.model.User> userList68 = userRepository47.getAllUsers();
        userRepository25.saveAllUsers(userList68);
        userRepository20.saveAllUsers(userList68);
        userRepository1.saveAllUsers(userList68);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coordinator" + "'", str15, "Coordinator");
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 102 + "'", int23 == 102);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "labmanager" + "'", str32, "labmanager");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Student" + "'", str33, "Student");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(userOptional44);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "labmanager" + "'", str54, "labmanager");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Student" + "'", str55, "Student");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(userOptional66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 102 + "'", int67 == 102);
        org.junit.Assert.assertNotNull(userList68);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "Coordinator2", "Student", "labmanager", true);
        java.lang.String str6 = labManager5.getPassword();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) ' ', "headlabcoordinator", "Manager1", "", true);
        boolean boolean7 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
            com.reservation_system.model.User user19 = coordinatorAccountService15.createHeadLabCoordinator("", "Coordinator2", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user32 = coordinatorAccountService28.createHeadLabCoordinator("hi!", "hi!", "Strong1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(2, "coord@yorku.ca", "Researcher", "Student", false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "headlabcoordinator", "hi!", "Guest", false);
        boolean boolean6 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(101, "hi!", "", "Coordinator2", false);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        java.util.Optional<com.reservation_system.model.User> userOptional34 = userRepository1.findByEmail("data/test-users.csv");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 102 + "'", int29 == 102);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userOptional34);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        int int31 = userRepository1.getNextID();
        boolean boolean32 = userRepository1.headLabCoordinatorExists();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 102 + "'", int30 == 102);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 102 + "'", int31 == 102);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        java.util.Optional<com.reservation_system.model.User> userOptional52 = userRepository1.findByEmail("coord2@yorku.ca");
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
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertNotNull(userOptional52);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean7 = userRepository6.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository6.getAllUsers();
        int int9 = userRepository6.getNextID();
        com.reservation_system.model.Researcher researcher15 = new com.reservation_system.model.Researcher((int) (byte) 100, "", "Researcher", "labmanager", true);
        userRepository6.addUser((com.reservation_system.model.User) researcher15);
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean19 = userRepository18.headLabCoordinatorExists();
        boolean boolean20 = userRepository18.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional22 = userRepository18.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService23 = new com.reservation_system.services.CoordinatorAccountService(userRepository18);
        com.reservation_system.model.Guest guest29 = new com.reservation_system.model.Guest((int) (short) 100, "Manager1", "", "Student", false);
        userRepository18.addUser((com.reservation_system.model.User) guest29);
        java.util.List<com.reservation_system.model.User> userList31 = userRepository18.getAllUsers();
        userRepository6.saveAllUsers(userList31);
        java.util.List<com.reservation_system.model.User> userList33 = userRepository6.getAllUsers();
        userRepository1.saveAllUsers(userList33);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService35 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList33);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "coord@yorku.ca", "labmanager", "data/test-users.csv", false);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "Student", "hi!", "hi!", false);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        java.util.Optional<com.reservation_system.model.User> userOptional25 = userRepository23.findByEmail("Faculty");
        com.reservation_system.model.LabManager labManager31 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str32 = labManager31.getUserType();
        userRepository23.addUser((com.reservation_system.model.User) labManager31);
        boolean boolean35 = userRepository23.emailExists("Coordinator");
        com.reservation_system.model.Student student41 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean42 = student41.requiresDepartmentApproval();
        java.lang.String str43 = student41.getUserType();
        int int44 = student41.getID();
        userRepository23.addUser((com.reservation_system.model.User) student41);
        java.lang.String str46 = student41.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user50 = coordinatorAccountService21.autoGenerateLabManagerAccount((com.reservation_system.model.User) student41, "Manager1", "Strong1!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userOptional25);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "labmanager" + "'", str32, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Student" + "'", str43, "Student");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Student" + "'", str46, "Student");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(102, "Manager1", "labmanager", "Manager1", false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "coord@yorku.ca", "hi!", "Guest", true);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "headlabcoordinator", "Student", "", false);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        boolean boolean7 = labManager5.isApproved();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "coord@yorku.ca", "Faculty", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        boolean boolean8 = researcher5.isApproved();
        java.lang.String str9 = researcher5.getUserType();
        int int10 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "labmanager", "Researcher", "", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "manager1@yorku.ca", "Guest", "Faculty", false);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "hi!", "Coordinator", "manager1@yorku.ca", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        java.lang.String str8 = headLabCoordinator5.getName();
        java.lang.String str9 = headLabCoordinator5.getName();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinator" + "'", str7, "Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Faculty", "coord@yorku.ca", "Researcher", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "Guest", "manager1@yorku.ca", "", false);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager1@yorku.ca" + "'", str6, "manager1@yorku.ca");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.requiresDepartmentApproval();
        java.lang.String str8 = student5.getUserType();
        student5.setApproved(false);
        boolean boolean11 = student5.isApproved();
        int int12 = student5.getID();
        java.lang.String str13 = student5.getUserType();
        java.lang.String str14 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coordinator" + "'", str14, "Coordinator");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        com.reservation_system.repository.UserRepository userRepository51 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager57 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str58 = labManager57.getUserType();
        java.lang.String str59 = labManager57.getPassword();
        userRepository51.addUser((com.reservation_system.model.User) labManager57);
        boolean boolean61 = userRepository51.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher67 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository51.addUser((com.reservation_system.model.User) researcher67);
        java.util.Optional<com.reservation_system.model.User> userOptional70 = userRepository51.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService71 = new com.reservation_system.services.CoordinatorAccountService(userRepository51);
        int int72 = userRepository51.getNextID();
        com.reservation_system.repository.UserRepository userRepository74 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager80 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str81 = labManager80.getUserType();
        java.lang.String str82 = labManager80.getPassword();
        userRepository74.addUser((com.reservation_system.model.User) labManager80);
        boolean boolean84 = userRepository74.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher90 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository74.addUser((com.reservation_system.model.User) researcher90);
        java.util.Optional<com.reservation_system.model.User> userOptional93 = userRepository74.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService94 = new com.reservation_system.services.CoordinatorAccountService(userRepository74);
        int int95 = userRepository74.getNextID();
        java.util.List<com.reservation_system.model.User> userList96 = userRepository74.getAllUsers();
        userRepository51.saveAllUsers(userList96);
        userRepository1.saveAllUsers(userList96);
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
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "labmanager" + "'", str58, "labmanager");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Student" + "'", str59, "Student");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(userOptional70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 102 + "'", int72 == 102);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "labmanager" + "'", str81, "labmanager");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Student" + "'", str82, "Student");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(userOptional93);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 102 + "'", int95 == 102);
        org.junit.Assert.assertNotNull(userList96);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "data/test-users.csv", "Coordinator", "Researcher", true);
        headLabCoordinator5.setApproved(true);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getName();
        int int8 = guest5.getID();
        java.lang.String str9 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Manager1" + "'", str7, "Manager1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "headlabcoordinator", "Student", "", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        java.util.Optional<com.reservation_system.model.User> userOptional37 = userRepository1.findByEmail("coord@yorku.ca");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 102 + "'", int22 == 102);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(userOptional33);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userOptional37);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Guest", "Strong1!", "Researcher", false);
        boolean boolean6 = faculty5.isApproved();
        int int7 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 0, "manager1@yorku.ca", "Student", "", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "hi!", "data/test-users.csv", "coord@yorku.ca", false);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(99, "headlabcoordinator", "Student", "data/test-users.csv", true);
        java.lang.String str6 = faculty5.getPassword();
        java.lang.String str7 = faculty5.getUserType();
        faculty5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-users.csv" + "'", str6, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "labmanager", "Researcher", "hi!", true);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getEmail();
        faculty5.setApproved(true);
        java.lang.String str10 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.User user8 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) 'a', "coord@yorku.ca", "coord2@yorku.ca", "Strong1!", false);
        java.lang.String str9 = user8.getEmail();
        userRepository1.addUser(user8);
        boolean boolean11 = user8.isApproved();
        user8.setApproved(false);
        user8.setApproved(true);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "coord2@yorku.ca" + "'", str9, "coord2@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Strong1!", "", "", true);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) (byte) 10, "manager1@yorku.ca", "hi!", "coord@yorku.ca", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getEmail();
        boolean boolean9 = guest5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass10 = guest5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Manager1" + "'", str7, "Manager1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinator2" + "'", str8, "Coordinator2");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "Manager1", "coord2@yorku.ca", "hi!", false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Coordinator");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Strong1!");
        com.reservation_system.model.Guest guest19 = new com.reservation_system.model.Guest((int) (byte) 1, "coord@yorku.ca", "manager1@yorku.ca", "Researcher", false);
        userRepository1.addUser((com.reservation_system.model.User) guest19);
        java.lang.String str21 = guest19.getName();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "coord@yorku.ca" + "'", str21, "coord@yorku.ca");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Coordinator", "Researcher", "hi!", true);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "Coordinator", "Manager1", "coord@yorku.ca", true);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinator" + "'", str6, "Coordinator");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.model.Student student9 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean10 = student9.isApproved();
        java.lang.String str11 = student9.getName();
        userRepository1.addUser((com.reservation_system.model.User) student9);
        java.lang.String str13 = student9.getUserType();
        java.lang.String str14 = student9.getUserType();
        java.lang.String str15 = student9.getUserType();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinator" + "'", str11, "Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "coord@yorku.ca", "Guest", "Guest", false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService64 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
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
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Guest", "coord2@yorku.ca", "coord@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass8 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "data/test-users.csv", "manager1@yorku.ca", "", false);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "labmanager", "", "data/test-users.csv", true);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "coord2@yorku.ca", "Student", "Faculty", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getPassword();
        java.lang.String str8 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService11 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        int int12 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 102 + "'", int12 == 102);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) 100, "manager1@yorku.ca", "Manager1", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository12.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository12.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "hi!", "manager1@yorku.ca", "Manager1", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "Researcher", "coord@yorku.ca", "data/test-users.csv", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Guest", "Strong1!", "labmanager", false);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "labmanager", "coord2@yorku.ca", "Faculty", false);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Manager1", "", "Strong1!", true);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getUserType();
        student5.setApproved(false);
        boolean boolean10 = student5.requiresDepartmentApproval();
        student5.setApproved(true);
        java.lang.String str13 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "Student", "coord2@yorku.ca", "data/test-users.csv", false);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "hi!", "data/test-users.csv", "", false);
        student5.setApproved(true);
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService7 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.lang.Class<?> wildcardClass8 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student10 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean11 = student10.requiresDepartmentApproval();
        java.lang.String str12 = student10.getName();
        java.lang.String str13 = student10.getUserType();
        java.lang.String str14 = student10.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student10);
        int int16 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coordinator" + "'", str12, "Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 102 + "'", int16 == 102);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        java.util.Optional<com.reservation_system.model.User> userOptional44 = userRepository1.findByEmail("manager1@yorku.ca");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService45 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user49 = coordinatorAccountService45.createHeadLabCoordinator("Student", "manager1@yorku.ca", "Student");
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
        org.junit.Assert.assertNotNull(userOptional44);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(99, "coord@yorku.ca", "", "", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "", "Student", "Researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Coordinator2", "Coordinator2", "Faculty", true);
        faculty5.setApproved(true);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService11 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        int int12 = userRepository1.getNextID();
        int int13 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("Coordinator2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 102 + "'", int12 == 102);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 102 + "'", int13 == 102);
        org.junit.Assert.assertNotNull(userOptional15);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "hi!", "Researcher", "Manager1", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
            com.reservation_system.model.User user17 = coordinatorAccountService13.createHeadLabCoordinator("Coordinator2", "labmanager", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-users.csv", (int) (byte) 1, "Faculty", "Coordinator2", "Manager1", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "Student", "Faculty", "Faculty", false);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "Guest", "coord2@yorku.ca", "Strong1!", true);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "Student", "manager1@yorku.ca", "Faculty", false);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "Manager1", "coord2@yorku.ca", "", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("data/test-users.csv");
        int int9 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService9 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        int int10 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 102 + "'", int10 == 102);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", 52, "", "Manager1", "Coordinator2", true);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinator2" + "'", str7, "Coordinator2");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService10 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (byte) 0, "", "Student", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        java.lang.String str18 = labManager16.getUserType();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "labmanager", "Faculty", "Coordinator2", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "data/test-users.csv", "Strong1!", "Faculty", false);
        researcher5.setApproved(true);
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 102, "", "Student", "coord@yorku.ca", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "coord@yorku.ca", "Researcher", "Researcher", true);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Coordinator", 32, "headlabcoordinator", "Researcher", "coord@yorku.ca", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Coordinator");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
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
        boolean boolean30 = student26.requiresDepartmentApproval();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getUserType();
        java.lang.String str10 = labManager7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        int int12 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = coordinatorAccountService13.createHeadLabCoordinator("hi!", "manager1@yorku.ca", "manager1@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 102 + "'", int12 == 102);
    }
}
