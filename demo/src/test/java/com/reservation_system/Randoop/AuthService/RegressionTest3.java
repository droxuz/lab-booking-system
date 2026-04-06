package com.reservation_system.Randoop.AuthService;

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
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(32, "headlabcoordinator", "Faculty", "Guest", false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str10 = faculty9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Student");
        int int14 = userRepository1.getNextID();
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(userOptional13);
// flaky "1) test1502(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
// flaky "1) test1502(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        boolean boolean9 = faculty5.isApproved();
        boolean boolean10 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        int int2 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean5 = userRepository4.headLabCoordinatorExists();
        boolean boolean6 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository8 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList9 = userRepository8.getAllUsers();
        boolean boolean10 = userRepository8.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty16 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        java.lang.String str17 = faculty16.getUserType();
        com.reservation_system.model.LabManager labManager23 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str24 = labManager23.getEmail();
        com.reservation_system.model.Researcher researcher30 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean31 = researcher30.isApproved();
        com.reservation_system.model.Faculty faculty37 = new com.reservation_system.model.Faculty((int) (short) 0, "Faculty", "headlabcoordinator", "", true);
        com.reservation_system.model.LabManager labManager43 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str44 = labManager43.getEmail();
        com.reservation_system.model.Faculty faculty50 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str51 = faculty50.getName();
        java.lang.String str52 = faculty50.getName();
        com.reservation_system.model.LabManager labManager58 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str59 = labManager58.getEmail();
        com.reservation_system.model.Faculty faculty65 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        com.reservation_system.model.Faculty faculty71 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str72 = faculty71.getName();
        java.lang.String str73 = faculty71.getName();
        java.lang.String str74 = faculty71.getName();
        com.reservation_system.model.Researcher researcher80 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean81 = researcher80.requiresDepartmentApproval();
        com.reservation_system.model.Faculty faculty87 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        com.reservation_system.model.User[] userArray88 = new com.reservation_system.model.User[] { faculty16, labManager23, researcher30, faculty37, labManager43, faculty50, labManager58, faculty65, faculty71, researcher80, faculty87 };
        java.util.ArrayList<com.reservation_system.model.User> userList89 = new java.util.ArrayList<com.reservation_system.model.User>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<com.reservation_system.model.User>) userList89, userArray88);
        userRepository8.saveAllUsers((java.util.List<com.reservation_system.model.User>) userList89);
        int int92 = userRepository8.getNextID();
        java.util.List<com.reservation_system.model.User> userList93 = userRepository8.getAllUsers();
        userRepository4.saveAllUsers(userList93);
        userRepository1.saveAllUsers(userList93);
        com.reservation_system.services.AuthService authService96 = new com.reservation_system.services.AuthService(userRepository1);
// flaky "2) test1504(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
// flaky "2) test1504(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "1) test1504(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList9);
// flaky "1) test1504(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "headlabcoordinator" + "'", str51, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "headlabcoordinator" + "'", str52, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "headlabcoordinator" + "'", str72, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "headlabcoordinator" + "'", str73, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "headlabcoordinator" + "'", str74, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(userArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 98 + "'", int92 == 98);
        org.junit.Assert.assertNotNull(userList93);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "test@example.com", "Faculty", "Faculty", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "student", "test@example.com", "Student", true);
        java.lang.String str6 = labManager5.getUserType();
        labManager5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Researcher", "WrongPassword1!", "test@example.com", true);
        int int6 = faculty5.getID();
        boolean boolean7 = faculty5.isApproved();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Password1!", "test@example.com", "researcher", false);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "test@example.com", "Andrew", "faculty", true);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional4 = userRepository1.findByEmail("test@example.com");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional4);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository8 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList9 = userRepository8.getAllUsers();
        boolean boolean10 = userRepository8.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList13 = userRepository12.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository12.getAllUsers();
        userRepository8.saveAllUsers(userList14);
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository17.getAllUsers();
        boolean boolean19 = userRepository17.headLabCoordinatorExists();
        boolean boolean20 = userRepository17.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository17.getAllUsers();
        userRepository8.saveAllUsers(userList21);
        boolean boolean23 = userRepository8.headLabCoordinatorExists();
        boolean boolean25 = userRepository8.emailExists("Student");
        com.reservation_system.repository.UserRepository userRepository27 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList28 = userRepository27.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList29 = userRepository27.getAllUsers();
        com.reservation_system.services.AuthService authService30 = new com.reservation_system.services.AuthService(userRepository27);
        java.util.Optional<com.reservation_system.model.User> userOptional32 = userRepository27.findByEmail("faculty");
        com.reservation_system.services.AuthService authService33 = new com.reservation_system.services.AuthService(userRepository27);
        java.util.List<com.reservation_system.model.User> userList34 = userRepository27.getAllUsers();
        userRepository8.saveAllUsers(userList34);
        userRepository1.saveAllUsers(userList34);
        java.util.List<com.reservation_system.model.User> userList37 = userRepository1.getAllUsers();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator43 = new com.reservation_system.model.HeadLabCoordinator(10, "headlabcoordinator", "data/test-users.csv", "faculty", false);
        int int44 = headLabCoordinator43.getID();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator43);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userOptional32);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.Faculty faculty15 = new com.reservation_system.model.Faculty((int) '4', "Faculty", "guest", "hi!", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty15);
        java.lang.String str17 = faculty15.getUserType();
        java.lang.String str18 = faculty15.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "researcher", "", "", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "faculty", "Guest", "test@example.com", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "labmanager", "Andrew", "Student", true);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "", "Faculty", true);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        int int6 = faculty5.getID();
        int int7 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        researcher5.setApproved(true);
        java.lang.String str10 = researcher5.getEmail();
        boolean boolean11 = researcher5.isApproved();
        java.lang.String str12 = researcher5.getName();
        java.lang.String str13 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "headlabcoordinator" + "'", str12, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean7 = userRepository1.emailExists("researcher");
        com.reservation_system.services.AuthService authService8 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user11 = authService8.login("student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository7.getAllUsers();
        boolean boolean9 = userRepository7.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty15 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        java.lang.String str16 = faculty15.getUserType();
        com.reservation_system.model.LabManager labManager22 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str23 = labManager22.getEmail();
        com.reservation_system.model.Researcher researcher29 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean30 = researcher29.isApproved();
        com.reservation_system.model.Faculty faculty36 = new com.reservation_system.model.Faculty((int) (short) 0, "Faculty", "headlabcoordinator", "", true);
        com.reservation_system.model.LabManager labManager42 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str43 = labManager42.getEmail();
        com.reservation_system.model.Faculty faculty49 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str50 = faculty49.getName();
        java.lang.String str51 = faculty49.getName();
        com.reservation_system.model.LabManager labManager57 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str58 = labManager57.getEmail();
        com.reservation_system.model.Faculty faculty64 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        com.reservation_system.model.Faculty faculty70 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str71 = faculty70.getName();
        java.lang.String str72 = faculty70.getName();
        java.lang.String str73 = faculty70.getName();
        com.reservation_system.model.Researcher researcher79 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean80 = researcher79.requiresDepartmentApproval();
        com.reservation_system.model.Faculty faculty86 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        com.reservation_system.model.User[] userArray87 = new com.reservation_system.model.User[] { faculty15, labManager22, researcher29, faculty36, labManager42, faculty49, labManager57, faculty64, faculty70, researcher79, faculty86 };
        java.util.ArrayList<com.reservation_system.model.User> userList88 = new java.util.ArrayList<com.reservation_system.model.User>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<com.reservation_system.model.User>) userList88, userArray87);
        userRepository7.saveAllUsers((java.util.List<com.reservation_system.model.User>) userList88);
        userRepository1.saveAllUsers((java.util.List<com.reservation_system.model.User>) userList88);
        java.util.List<com.reservation_system.model.User> userList92 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional94 = userRepository1.findByEmail("hi!");
        com.reservation_system.services.AuthService authService95 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user98 = authService95.login("hi!", "Password1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "headlabcoordinator" + "'", str50, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "headlabcoordinator" + "'", str51, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "headlabcoordinator" + "'", str71, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "headlabcoordinator" + "'", str72, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "headlabcoordinator" + "'", str73, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(userArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(userList92);
        org.junit.Assert.assertNotNull(userOptional94);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator10 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Faculty", "", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator10);
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("Andrew");
        boolean boolean16 = userRepository1.emailExists("Student");
        int int17 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("WrongPassword1!");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator25 = new com.reservation_system.model.HeadLabCoordinator(10, "headlabcoordinator", "data/test-users.csv", "faculty", false);
        java.lang.String str26 = headLabCoordinator25.getEmail();
        java.lang.String str27 = headLabCoordinator25.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator25);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 98 + "'", int17 == 98);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "data/test-users.csv" + "'", str26, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "headlabcoordinator" + "'", str27, "headlabcoordinator");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "data/test-users.csv" + "'", str7, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "Guest", "data/test-users.csv", "", true);
        java.lang.String str6 = researcher5.getName();
        java.lang.String str7 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        boolean boolean13 = userRepository1.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository17.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList19 = userRepository17.getAllUsers();
        com.reservation_system.services.AuthService authService20 = new com.reservation_system.services.AuthService(userRepository17);
        java.util.Optional<com.reservation_system.model.User> userOptional22 = userRepository17.findByEmail("faculty");
        com.reservation_system.services.AuthService authService23 = new com.reservation_system.services.AuthService(userRepository17);
        java.util.List<com.reservation_system.model.User> userList24 = userRepository17.getAllUsers();
        userRepository1.saveAllUsers(userList24);
        int int26 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList27 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertNotNull(userList24);
// flaky "3) test1525(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 101 + "'", int26 == 101);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "Password1!", "researcher", "faculty", false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository5.saveAllUsers(userList11);
        userRepository1.saveAllUsers(userList11);
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        int int15 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService16 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository18.getAllUsers();
        com.reservation_system.services.AuthService authService20 = new com.reservation_system.services.AuthService(userRepository18);
        com.reservation_system.model.LabManager labManager26 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean27 = labManager26.isApproved();
        userRepository18.addUser((com.reservation_system.model.User) labManager26);
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository30.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList32 = userRepository30.getAllUsers();
        userRepository18.saveAllUsers(userList32);
        com.reservation_system.services.AuthService authService34 = new com.reservation_system.services.AuthService(userRepository18);
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean37 = userRepository36.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository39 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList40 = userRepository39.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList41 = userRepository39.getAllUsers();
        userRepository36.saveAllUsers(userList41);
        userRepository18.saveAllUsers(userList41);
        userRepository1.saveAllUsers(userList41);
        int int45 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "4) test1527(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(userList41);
// flaky "3) test1527(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 101 + "'", int45 == 101);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "headlabcoordinator", "student", "Faculty", true);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "guest", "labmanager", "Guest", true);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "student", "Student", "WrongPassword1!", true);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository13.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository13.getAllUsers();
        userRepository1.saveAllUsers(userList15);
        int int17 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService18 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user21 = authService18.login("WrongPassword1!", "Password1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
// flaky "5) test1531(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList5 = userRepository4.getAllUsers();
        com.reservation_system.services.AuthService authService6 = new com.reservation_system.services.AuthService(userRepository4);
        int int7 = userRepository4.getNextID();
        boolean boolean8 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        boolean boolean12 = userRepository10.headLabCoordinatorExists();
        boolean boolean13 = userRepository10.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository10.getAllUsers();
        userRepository4.saveAllUsers(userList14);
        userRepository1.saveAllUsers(userList14);
        com.reservation_system.services.AuthService authService17 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user20 = authService17.login("Password1!", "headlabcoordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
// flaky "6) test1532(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        java.lang.String str12 = labManager11.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        int int14 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository16.getAllUsers();
        com.reservation_system.services.AuthService authService18 = new com.reservation_system.services.AuthService(userRepository16);
        com.reservation_system.model.LabManager labManager24 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean25 = labManager24.isApproved();
        userRepository16.addUser((com.reservation_system.model.User) labManager24);
        com.reservation_system.model.Faculty faculty32 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository16.addUser((com.reservation_system.model.User) faculty32);
        boolean boolean35 = userRepository16.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional37 = userRepository16.findByEmail("researcher");
        int int38 = userRepository16.getNextID();
        com.reservation_system.model.LabManager labManager44 = new com.reservation_system.model.LabManager((int) ' ', "test@example.com", "Password1!", "guest", true);
        userRepository16.addUser((com.reservation_system.model.User) labManager44);
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList48 = userRepository47.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList49 = userRepository47.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository51 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList52 = userRepository51.getAllUsers();
        boolean boolean53 = userRepository51.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository55 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList56 = userRepository55.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList57 = userRepository55.getAllUsers();
        userRepository51.saveAllUsers(userList57);
        userRepository47.saveAllUsers(userList57);
        com.reservation_system.model.Faculty faculty65 = new com.reservation_system.model.Faculty(98, "guest", "Researcher", "student", true);
        userRepository47.addUser((com.reservation_system.model.User) faculty65);
        com.reservation_system.repository.UserRepository userRepository68 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList69 = userRepository68.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList70 = userRepository68.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository72 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList73 = userRepository72.getAllUsers();
        boolean boolean74 = userRepository72.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository76 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList77 = userRepository76.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList78 = userRepository76.getAllUsers();
        userRepository72.saveAllUsers(userList78);
        userRepository68.saveAllUsers(userList78);
        java.util.List<com.reservation_system.model.User> userList81 = userRepository68.getAllUsers();
        userRepository47.saveAllUsers(userList81);
        userRepository16.saveAllUsers(userList81);
        userRepository1.saveAllUsers(userList81);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
// flaky "7) test1533(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(userOptional37);
// flaky "4) test1533(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 101 + "'", int38 == 101);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(userList56);
        org.junit.Assert.assertNotNull(userList57);
        org.junit.Assert.assertNotNull(userList69);
        org.junit.Assert.assertNotNull(userList70);
        org.junit.Assert.assertNotNull(userList73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(userList77);
        org.junit.Assert.assertNotNull(userList78);
        org.junit.Assert.assertNotNull(userList81);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "Password1!", "test@example.com", "data/test-users.csv", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("test@example.com");
        boolean boolean7 = userRepository1.emailExists("labmanager");
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        boolean boolean11 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService12 = new com.reservation_system.services.AuthService(userRepository9);
        int int13 = userRepository9.getNextID();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "8) test1535(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "5) test1535(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "2) test1535(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        boolean boolean8 = headLabCoordinator5.isApproved();
        headLabCoordinator5.setApproved(true);
        java.lang.String str11 = headLabCoordinator5.getUserType();
        java.lang.String str12 = headLabCoordinator5.getUserType();
        boolean boolean13 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "headlabcoordinator" + "'", str12, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getEmail();
        java.lang.String str7 = guest5.getEmail();
        java.lang.String str8 = guest5.getUserType();
        boolean boolean9 = guest5.isApproved();
        guest5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "test@example.com", "student", "Faculty", false);
        boolean boolean6 = guest5.isApproved();
        java.lang.String str7 = guest5.getUserType();
        java.lang.Class<?> wildcardClass8 = guest5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        int int6 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean10 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList13 = userRepository12.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository12.getAllUsers();
        userRepository9.saveAllUsers(userList14);
        userRepository1.saveAllUsers(userList14);
        boolean boolean18 = userRepository1.emailExists("Andrew");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "9) test1539(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "headlabcoordinator", "WrongPassword1!", "", false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "test@example.com", "labmanager", "headlabcoordinator", true);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository5.saveAllUsers(userList11);
        userRepository1.saveAllUsers(userList11);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "researcher", "Password1!", "Faculty", false);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "guest", "Faculty", "headlabcoordinator", true);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", 98, "data/test-users.csv", "Faculty", "Password1!", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "Andrew", "WrongPassword1!", "Guest", true);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "researcher", "faculty", "guest", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "headlabcoordinator", "data/test-users.csv", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getName();
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        java.lang.String str10 = researcher5.getName();
        java.lang.String str11 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "data/test-users.csv" + "'", str11, "data/test-users.csv");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "Student", "Password1!", "researcher", false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getEmail();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.Class<?> wildcardClass10 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "faculty", "Andrew", "WrongPassword1!", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "researcher", "faculty", "hi!", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        boolean boolean8 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "hi!", "Password1!", "test@example.com", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(99, "", "student", "Guest", false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        java.lang.String str10 = faculty9.getUserType();
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str17 = labManager16.getEmail();
        com.reservation_system.model.Researcher researcher23 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean24 = researcher23.isApproved();
        com.reservation_system.model.Faculty faculty30 = new com.reservation_system.model.Faculty((int) (short) 0, "Faculty", "headlabcoordinator", "", true);
        com.reservation_system.model.LabManager labManager36 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str37 = labManager36.getEmail();
        com.reservation_system.model.Faculty faculty43 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str44 = faculty43.getName();
        java.lang.String str45 = faculty43.getName();
        com.reservation_system.model.LabManager labManager51 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str52 = labManager51.getEmail();
        com.reservation_system.model.Faculty faculty58 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        com.reservation_system.model.Faculty faculty64 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str65 = faculty64.getName();
        java.lang.String str66 = faculty64.getName();
        java.lang.String str67 = faculty64.getName();
        com.reservation_system.model.Researcher researcher73 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean74 = researcher73.requiresDepartmentApproval();
        com.reservation_system.model.Faculty faculty80 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        com.reservation_system.model.User[] userArray81 = new com.reservation_system.model.User[] { faculty9, labManager16, researcher23, faculty30, labManager36, faculty43, labManager51, faculty58, faculty64, researcher73, faculty80 };
        java.util.ArrayList<com.reservation_system.model.User> userList82 = new java.util.ArrayList<com.reservation_system.model.User>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<com.reservation_system.model.User>) userList82, userArray81);
        userRepository1.saveAllUsers((java.util.List<com.reservation_system.model.User>) userList82);
        int int85 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList86 = userRepository1.getAllUsers();
        boolean boolean87 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService88 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "headlabcoordinator" + "'", str44, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "headlabcoordinator" + "'", str45, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "headlabcoordinator" + "'", str65, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "headlabcoordinator" + "'", str66, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "headlabcoordinator" + "'", str67, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(userArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 98 + "'", int85 == 98);
        org.junit.Assert.assertNotNull(userList86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean8 = userRepository7.headLabCoordinatorExists();
        int int9 = userRepository7.getNextID();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository7.getAllUsers();
        userRepository1.saveAllUsers(userList10);
        int int12 = userRepository1.getNextID();
        boolean boolean14 = userRepository1.emailExists("Student");
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository16.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList18 = userRepository16.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        boolean boolean22 = userRepository20.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList25 = userRepository24.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList26 = userRepository24.getAllUsers();
        userRepository20.saveAllUsers(userList26);
        userRepository16.saveAllUsers(userList26);
        com.reservation_system.model.Faculty faculty34 = new com.reservation_system.model.Faculty(98, "guest", "Researcher", "student", true);
        userRepository16.addUser((com.reservation_system.model.User) faculty34);
        com.reservation_system.repository.UserRepository userRepository37 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList38 = userRepository37.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList39 = userRepository37.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository41 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList42 = userRepository41.getAllUsers();
        boolean boolean43 = userRepository41.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList46 = userRepository45.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList47 = userRepository45.getAllUsers();
        userRepository41.saveAllUsers(userList47);
        userRepository37.saveAllUsers(userList47);
        java.util.List<com.reservation_system.model.User> userList50 = userRepository37.getAllUsers();
        userRepository16.saveAllUsers(userList50);
        userRepository1.saveAllUsers(userList50);
        java.lang.Class<?> wildcardClass53 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository7.getAllUsers();
        boolean boolean9 = userRepository7.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty15 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        java.lang.String str16 = faculty15.getUserType();
        com.reservation_system.model.LabManager labManager22 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str23 = labManager22.getEmail();
        com.reservation_system.model.Researcher researcher29 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean30 = researcher29.isApproved();
        com.reservation_system.model.Faculty faculty36 = new com.reservation_system.model.Faculty((int) (short) 0, "Faculty", "headlabcoordinator", "", true);
        com.reservation_system.model.LabManager labManager42 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str43 = labManager42.getEmail();
        com.reservation_system.model.Faculty faculty49 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str50 = faculty49.getName();
        java.lang.String str51 = faculty49.getName();
        com.reservation_system.model.LabManager labManager57 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str58 = labManager57.getEmail();
        com.reservation_system.model.Faculty faculty64 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        com.reservation_system.model.Faculty faculty70 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str71 = faculty70.getName();
        java.lang.String str72 = faculty70.getName();
        java.lang.String str73 = faculty70.getName();
        com.reservation_system.model.Researcher researcher79 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean80 = researcher79.requiresDepartmentApproval();
        com.reservation_system.model.Faculty faculty86 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        com.reservation_system.model.User[] userArray87 = new com.reservation_system.model.User[] { faculty15, labManager22, researcher29, faculty36, labManager42, faculty49, labManager57, faculty64, faculty70, researcher79, faculty86 };
        java.util.ArrayList<com.reservation_system.model.User> userList88 = new java.util.ArrayList<com.reservation_system.model.User>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<com.reservation_system.model.User>) userList88, userArray87);
        userRepository7.saveAllUsers((java.util.List<com.reservation_system.model.User>) userList88);
        userRepository1.saveAllUsers((java.util.List<com.reservation_system.model.User>) userList88);
        java.util.List<com.reservation_system.model.User> userList92 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService93 = new com.reservation_system.services.AuthService(userRepository1);
        int int94 = userRepository1.getNextID();
        boolean boolean96 = userRepository1.emailExists("faculty");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "headlabcoordinator" + "'", str50, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "headlabcoordinator" + "'", str51, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "headlabcoordinator" + "'", str71, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "headlabcoordinator" + "'", str72, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "headlabcoordinator" + "'", str73, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(userArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(userList92);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 98 + "'", int94 == 98);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager14 = new com.reservation_system.model.LabManager((int) 'a', "labmanager", "Password1!", "faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager14);
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository17.getAllUsers();
        com.reservation_system.services.AuthService authService19 = new com.reservation_system.services.AuthService(userRepository17);
        com.reservation_system.model.LabManager labManager25 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean26 = labManager25.isApproved();
        userRepository17.addUser((com.reservation_system.model.User) labManager25);
        com.reservation_system.model.Faculty faculty33 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository17.addUser((com.reservation_system.model.User) faculty33);
        boolean boolean36 = userRepository17.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional38 = userRepository17.findByEmail("researcher");
        com.reservation_system.repository.UserRepository userRepository40 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList41 = userRepository40.getAllUsers();
        com.reservation_system.services.AuthService authService42 = new com.reservation_system.services.AuthService(userRepository40);
        com.reservation_system.model.LabManager labManager48 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean49 = labManager48.isApproved();
        userRepository40.addUser((com.reservation_system.model.User) labManager48);
        boolean boolean52 = userRepository40.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList53 = userRepository40.getAllUsers();
        userRepository17.saveAllUsers(userList53);
        userRepository1.saveAllUsers(userList53);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(userOptional38);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(userList53);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (-1), "headlabcoordinator", "WrongPassword1!", "faculty", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("hi!");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", 101, "hi!", "Student", "Student", false);
        boolean boolean7 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "student", "data/test-users.csv", "headlabcoordinator", true);
        int int6 = labManager5.getID();
        java.lang.String str7 = labManager5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "data/test-users.csv" + "'", str7, "data/test-users.csv");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList7);
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        boolean boolean12 = userRepository10.headLabCoordinatorExists();
        boolean boolean13 = userRepository10.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList14);
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        boolean boolean18 = userRepository1.emailExists("Student");
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList20 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional22 = userRepository1.findByEmail("faculty");
        java.util.List<com.reservation_system.model.User> userList23 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList26 = userRepository25.getAllUsers();
        com.reservation_system.services.AuthService authService27 = new com.reservation_system.services.AuthService(userRepository25);
        com.reservation_system.services.AuthService authService28 = new com.reservation_system.services.AuthService(userRepository25);
        boolean boolean29 = userRepository25.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList30 = userRepository25.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository32.getAllUsers();
        boolean boolean34 = userRepository32.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList37 = userRepository36.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList38 = userRepository36.getAllUsers();
        userRepository32.saveAllUsers(userList38);
        com.reservation_system.repository.UserRepository userRepository41 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList42 = userRepository41.getAllUsers();
        boolean boolean43 = userRepository41.headLabCoordinatorExists();
        boolean boolean44 = userRepository41.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList45 = userRepository41.getAllUsers();
        userRepository32.saveAllUsers(userList45);
        boolean boolean47 = userRepository32.headLabCoordinatorExists();
        boolean boolean49 = userRepository32.emailExists("Student");
        com.reservation_system.repository.UserRepository userRepository51 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList52 = userRepository51.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList53 = userRepository51.getAllUsers();
        com.reservation_system.services.AuthService authService54 = new com.reservation_system.services.AuthService(userRepository51);
        java.util.Optional<com.reservation_system.model.User> userOptional56 = userRepository51.findByEmail("faculty");
        com.reservation_system.services.AuthService authService57 = new com.reservation_system.services.AuthService(userRepository51);
        java.util.List<com.reservation_system.model.User> userList58 = userRepository51.getAllUsers();
        userRepository32.saveAllUsers(userList58);
        userRepository25.saveAllUsers(userList58);
        userRepository1.saveAllUsers(userList58);
        com.reservation_system.services.AuthService authService62 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean64 = userRepository1.emailExists("researcher");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertNotNull(userOptional56);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "", "WrongPassword1!", "headlabcoordinator", false);
        headLabCoordinator5.setApproved(false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator10 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Faculty", "", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator10);
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList13 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean16 = userRepository15.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository18.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList20 = userRepository18.getAllUsers();
        userRepository15.saveAllUsers(userList20);
        userRepository1.saveAllUsers(userList20);
        int int23 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 98 + "'", int23 == 98);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "test@example.com", "Guest", "labmanager", false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList5 = userRepository4.getAllUsers();
        boolean boolean6 = userRepository4.headLabCoordinatorExists();
        boolean boolean8 = userRepository4.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository4.findByEmail("Faculty");
        int int11 = userRepository4.getNextID();
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository13.getAllUsers();
        com.reservation_system.services.AuthService authService15 = new com.reservation_system.services.AuthService(userRepository13);
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository13.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository13.getAllUsers();
        userRepository4.saveAllUsers(userList18);
        userRepository1.saveAllUsers(userList18);
        boolean boolean22 = userRepository1.emailExists("");
        boolean boolean24 = userRepository1.emailExists("test@example.com");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 98 + "'", int11 == 98);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "", "faculty", "student", false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        boolean boolean8 = headLabCoordinator5.isApproved();
        headLabCoordinator5.setApproved(true);
        java.lang.String str11 = headLabCoordinator5.getUserType();
        java.lang.String str12 = headLabCoordinator5.getUserType();
        int int13 = headLabCoordinator5.getID();
        java.lang.String str14 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "headlabcoordinator" + "'", str12, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 98 + "'", int13 == 98);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "headlabcoordinator" + "'", str14, "headlabcoordinator");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "Password1!", "", "test@example.com", true);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("headlabcoordinator");
        int int8 = userRepository1.getNextID();
        int int9 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService11 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "", "test@example.com", "Guest", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        java.lang.String str10 = faculty9.getUserType();
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str17 = labManager16.getEmail();
        com.reservation_system.model.Researcher researcher23 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean24 = researcher23.isApproved();
        com.reservation_system.model.Faculty faculty30 = new com.reservation_system.model.Faculty((int) (short) 0, "Faculty", "headlabcoordinator", "", true);
        com.reservation_system.model.LabManager labManager36 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str37 = labManager36.getEmail();
        com.reservation_system.model.Faculty faculty43 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str44 = faculty43.getName();
        java.lang.String str45 = faculty43.getName();
        com.reservation_system.model.LabManager labManager51 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str52 = labManager51.getEmail();
        com.reservation_system.model.Faculty faculty58 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        com.reservation_system.model.Faculty faculty64 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str65 = faculty64.getName();
        java.lang.String str66 = faculty64.getName();
        java.lang.String str67 = faculty64.getName();
        com.reservation_system.model.Researcher researcher73 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean74 = researcher73.requiresDepartmentApproval();
        com.reservation_system.model.Faculty faculty80 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        com.reservation_system.model.User[] userArray81 = new com.reservation_system.model.User[] { faculty9, labManager16, researcher23, faculty30, labManager36, faculty43, labManager51, faculty58, faculty64, researcher73, faculty80 };
        java.util.ArrayList<com.reservation_system.model.User> userList82 = new java.util.ArrayList<com.reservation_system.model.User>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<com.reservation_system.model.User>) userList82, userArray81);
        userRepository1.saveAllUsers((java.util.List<com.reservation_system.model.User>) userList82);
        int int85 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService86 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean87 = userRepository1.headLabCoordinatorExists();
        int int88 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "headlabcoordinator" + "'", str44, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "headlabcoordinator" + "'", str45, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "headlabcoordinator" + "'", str65, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "headlabcoordinator" + "'", str66, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "headlabcoordinator" + "'", str67, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(userArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 98 + "'", int85 == 98);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 98 + "'", int88 == 98);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        int int19 = userRepository1.getNextID();
        int int20 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList23 = userRepository22.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList24 = userRepository22.getAllUsers();
        com.reservation_system.services.AuthService authService25 = new com.reservation_system.services.AuthService(userRepository22);
        com.reservation_system.repository.UserRepository userRepository27 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList28 = userRepository27.getAllUsers();
        com.reservation_system.services.AuthService authService29 = new com.reservation_system.services.AuthService(userRepository27);
        com.reservation_system.model.LabManager labManager35 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean36 = labManager35.isApproved();
        userRepository27.addUser((com.reservation_system.model.User) labManager35);
        com.reservation_system.model.Faculty faculty43 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository27.addUser((com.reservation_system.model.User) faculty43);
        int int45 = userRepository27.getNextID();
        int int46 = userRepository27.getNextID();
        java.util.List<com.reservation_system.model.User> userList47 = userRepository27.getAllUsers();
        userRepository22.saveAllUsers(userList47);
        java.util.List<com.reservation_system.model.User> userList49 = userRepository22.getAllUsers();
        userRepository1.saveAllUsers(userList49);
        java.util.List<com.reservation_system.model.User> userList51 = userRepository1.getAllUsers();
        int int52 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService53 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 98 + "'", int20 == 98);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 98 + "'", int45 == 98);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 98 + "'", int46 == 98);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 98 + "'", int52 == 98);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        researcher5.setApproved(false);
        int int8 = researcher5.getID();
        researcher5.setApproved(true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(35, "", "student", "", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("faculty");
        int int9 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService10 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user13 = authService10.login("Password1!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) (short) 1, "", "Guest", "", false);
        boolean boolean7 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(102, "Student", "faculty", "Password1!", true);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.services.AuthService authService12 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.Researcher researcher18 = new com.reservation_system.model.Researcher(10, "Password1!", "Password1!", "headlabcoordinator", true);
        java.lang.String str19 = researcher18.getUserType();
        java.lang.String str20 = researcher18.getUserType();
        java.lang.String str21 = researcher18.getUserType();
        researcher18.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) researcher18);
        boolean boolean25 = researcher18.requiresDepartmentApproval();
        java.lang.String str26 = researcher18.getName();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Researcher" + "'", str19, "Researcher");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Researcher" + "'", str20, "Researcher");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Researcher" + "'", str21, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Password1!" + "'", str26, "Password1!");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "Faculty", "Guest", "", true);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        int int9 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user10 = authService7.login("Andrew", "Password1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "headlabcoordinator", "test@example.com", "faculty", false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Faculty");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.User user19 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) (byte) 1, "faculty", "Andrew", "hi!", true);
        user19.setApproved(false);
        userRepository1.addUser(user19);
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService24 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
// flaky "10) test1585(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
// flaky "6) test1585(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "", "hi!", "student", false);
        java.lang.String str6 = faculty5.getPassword();
        boolean boolean7 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository5.saveAllUsers(userList11);
        userRepository1.saveAllUsers(userList11);
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        int int15 = userRepository1.getNextID();
        java.lang.Class<?> wildcardClass16 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "11) test1587(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean10 = faculty8.requiresDepartmentApproval();
        boolean boolean11 = faculty8.requiresDepartmentApproval();
        faculty8.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository8 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList9 = userRepository8.getAllUsers();
        boolean boolean10 = userRepository8.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList13 = userRepository12.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository12.getAllUsers();
        userRepository8.saveAllUsers(userList14);
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository17.getAllUsers();
        boolean boolean19 = userRepository17.headLabCoordinatorExists();
        boolean boolean20 = userRepository17.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository17.getAllUsers();
        userRepository8.saveAllUsers(userList21);
        boolean boolean23 = userRepository8.headLabCoordinatorExists();
        boolean boolean25 = userRepository8.emailExists("Student");
        boolean boolean26 = userRepository8.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList27 = userRepository8.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional29 = userRepository8.findByEmail("faculty");
        java.util.List<com.reservation_system.model.User> userList30 = userRepository8.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository32.getAllUsers();
        com.reservation_system.services.AuthService authService34 = new com.reservation_system.services.AuthService(userRepository32);
        com.reservation_system.services.AuthService authService35 = new com.reservation_system.services.AuthService(userRepository32);
        boolean boolean36 = userRepository32.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList37 = userRepository32.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository39 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList40 = userRepository39.getAllUsers();
        boolean boolean41 = userRepository39.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository43 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList44 = userRepository43.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList45 = userRepository43.getAllUsers();
        userRepository39.saveAllUsers(userList45);
        com.reservation_system.repository.UserRepository userRepository48 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList49 = userRepository48.getAllUsers();
        boolean boolean50 = userRepository48.headLabCoordinatorExists();
        boolean boolean51 = userRepository48.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList52 = userRepository48.getAllUsers();
        userRepository39.saveAllUsers(userList52);
        boolean boolean54 = userRepository39.headLabCoordinatorExists();
        boolean boolean56 = userRepository39.emailExists("Student");
        com.reservation_system.repository.UserRepository userRepository58 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList59 = userRepository58.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList60 = userRepository58.getAllUsers();
        com.reservation_system.services.AuthService authService61 = new com.reservation_system.services.AuthService(userRepository58);
        java.util.Optional<com.reservation_system.model.User> userOptional63 = userRepository58.findByEmail("faculty");
        com.reservation_system.services.AuthService authService64 = new com.reservation_system.services.AuthService(userRepository58);
        java.util.List<com.reservation_system.model.User> userList65 = userRepository58.getAllUsers();
        userRepository39.saveAllUsers(userList65);
        userRepository32.saveAllUsers(userList65);
        userRepository8.saveAllUsers(userList65);
        userRepository1.saveAllUsers(userList65);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userOptional29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(userList44);
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertNotNull(userList60);
        org.junit.Assert.assertNotNull(userOptional63);
        org.junit.Assert.assertNotNull(userList65);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "faculty", "Faculty", "student", true);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        java.lang.String str10 = faculty9.getUserType();
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str17 = labManager16.getEmail();
        com.reservation_system.model.Researcher researcher23 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean24 = researcher23.isApproved();
        com.reservation_system.model.Faculty faculty30 = new com.reservation_system.model.Faculty((int) (short) 0, "Faculty", "headlabcoordinator", "", true);
        com.reservation_system.model.LabManager labManager36 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str37 = labManager36.getEmail();
        com.reservation_system.model.Faculty faculty43 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str44 = faculty43.getName();
        java.lang.String str45 = faculty43.getName();
        com.reservation_system.model.LabManager labManager51 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str52 = labManager51.getEmail();
        com.reservation_system.model.Faculty faculty58 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        com.reservation_system.model.Faculty faculty64 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str65 = faculty64.getName();
        java.lang.String str66 = faculty64.getName();
        java.lang.String str67 = faculty64.getName();
        com.reservation_system.model.Researcher researcher73 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean74 = researcher73.requiresDepartmentApproval();
        com.reservation_system.model.Faculty faculty80 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        com.reservation_system.model.User[] userArray81 = new com.reservation_system.model.User[] { faculty9, labManager16, researcher23, faculty30, labManager36, faculty43, labManager51, faculty58, faculty64, researcher73, faculty80 };
        java.util.ArrayList<com.reservation_system.model.User> userList82 = new java.util.ArrayList<com.reservation_system.model.User>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<com.reservation_system.model.User>) userList82, userArray81);
        userRepository1.saveAllUsers((java.util.List<com.reservation_system.model.User>) userList82);
        int int85 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional87 = userRepository1.findByEmail("");
        com.reservation_system.services.AuthService authService88 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.User user95 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) '4', "guest", "Faculty", "researcher", false);
        java.lang.String str96 = user95.getEmail();
        userRepository1.addUser(user95);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "headlabcoordinator" + "'", str44, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "headlabcoordinator" + "'", str45, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "headlabcoordinator" + "'", str65, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "headlabcoordinator" + "'", str66, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "headlabcoordinator" + "'", str67, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(userArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 98 + "'", int85 == 98);
        org.junit.Assert.assertNotNull(userOptional87);
        org.junit.Assert.assertNotNull(user95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "Faculty" + "'", str96, "Faculty");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "Guest", "", "test@example.com", true);
        researcher5.setApproved(true);
        researcher5.setApproved(true);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 102, "headlabcoordinator", "headlabcoordinator", "test@example.com", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getEmail();
        boolean boolean10 = researcher5.isApproved();
        java.lang.String str11 = researcher5.getUserType();
        java.lang.String str12 = researcher5.getUserType();
        int int13 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "faculty", "headlabcoordinator", "test@example.com", true);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository5.saveAllUsers(userList11);
        userRepository1.saveAllUsers(userList11);
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(98, "guest", "Researcher", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty19);
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList23 = userRepository22.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList24 = userRepository22.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository26.getAllUsers();
        boolean boolean28 = userRepository26.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository30.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList32 = userRepository30.getAllUsers();
        userRepository26.saveAllUsers(userList32);
        userRepository22.saveAllUsers(userList32);
        java.util.List<com.reservation_system.model.User> userList35 = userRepository22.getAllUsers();
        userRepository1.saveAllUsers(userList35);
        java.util.Optional<com.reservation_system.model.User> userOptional38 = userRepository1.findByEmail("");
        int int39 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService40 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean42 = userRepository1.emailExists("test@example.com");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userOptional38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 99 + "'", int39 == 99);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.services.AuthService authService12 = new com.reservation_system.services.AuthService(userRepository1);
        int int13 = userRepository1.getNextID();
        boolean boolean15 = userRepository1.emailExists("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("labmanager");
        com.reservation_system.model.Researcher researcher23 = new com.reservation_system.model.Researcher((int) (short) 100, "guest", "hi!", "data/test-users.csv", true);
        java.lang.String str24 = researcher23.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher23);
        boolean boolean27 = userRepository1.emailExists("guest");
        java.util.List<com.reservation_system.model.User> userList28 = userRepository1.getAllUsers();
        int int29 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Researcher" + "'", str24, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 101 + "'", int29 == 101);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "researcher", "researcher", "Guest", true);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator7 = new com.reservation_system.model.HeadLabCoordinator(100, "guest", "guest", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator7);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(99, "Researcher", "student", "Password1!", true);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "", "", "labmanager", false);
        researcher5.setApproved(true);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository6.getAllUsers();
        com.reservation_system.services.AuthService authService8 = new com.reservation_system.services.AuthService(userRepository6);
        com.reservation_system.model.LabManager labManager14 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean15 = labManager14.isApproved();
        userRepository6.addUser((com.reservation_system.model.User) labManager14);
        com.reservation_system.model.Faculty faculty22 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository6.addUser((com.reservation_system.model.User) faculty22);
        int int24 = userRepository6.getNextID();
        int int25 = userRepository6.getNextID();
        java.util.List<com.reservation_system.model.User> userList26 = userRepository6.getAllUsers();
        userRepository1.saveAllUsers(userList26);
        java.util.Optional<com.reservation_system.model.User> userOptional29 = userRepository1.findByEmail("labmanager");
        com.reservation_system.model.Researcher researcher35 = new com.reservation_system.model.Researcher((int) ' ', "Student", "Password1!", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher35);
        java.util.List<com.reservation_system.model.User> userList37 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService38 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userOptional29);
        org.junit.Assert.assertNotNull(userList37);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getName();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator15 = new com.reservation_system.model.HeadLabCoordinator(10, "headlabcoordinator", "data/test-users.csv", "faculty", false);
        java.lang.String str16 = headLabCoordinator15.getEmail();
        java.lang.String str17 = headLabCoordinator15.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator15);
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        com.reservation_system.services.AuthService authService22 = new com.reservation_system.services.AuthService(userRepository20);
        com.reservation_system.model.LabManager labManager28 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean29 = labManager28.isApproved();
        userRepository20.addUser((com.reservation_system.model.User) labManager28);
        boolean boolean32 = userRepository20.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository20.getAllUsers();
        userRepository1.saveAllUsers(userList33);
        java.util.Optional<com.reservation_system.model.User> userOptional36 = userRepository1.findByEmail("headlabcoordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional38 = userRepository1.findByEmail("hi!");
        com.reservation_system.repository.UserRepository userRepository40 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList41 = userRepository40.getAllUsers();
        com.reservation_system.services.AuthService authService42 = new com.reservation_system.services.AuthService(userRepository40);
        com.reservation_system.model.LabManager labManager48 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean49 = labManager48.isApproved();
        userRepository40.addUser((com.reservation_system.model.User) labManager48);
        com.reservation_system.model.Faculty faculty56 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository40.addUser((com.reservation_system.model.User) faculty56);
        int int58 = userRepository40.getNextID();
        com.reservation_system.repository.UserRepository userRepository60 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList61 = userRepository60.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList62 = userRepository60.getAllUsers();
        com.reservation_system.services.AuthService authService63 = new com.reservation_system.services.AuthService(userRepository60);
        java.util.Optional<com.reservation_system.model.User> userOptional65 = userRepository60.findByEmail("faculty");
        com.reservation_system.services.AuthService authService66 = new com.reservation_system.services.AuthService(userRepository60);
        java.util.List<com.reservation_system.model.User> userList67 = userRepository60.getAllUsers();
        int int68 = userRepository60.getNextID();
        com.reservation_system.repository.UserRepository userRepository70 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList71 = userRepository70.getAllUsers();
        boolean boolean72 = userRepository70.headLabCoordinatorExists();
        boolean boolean73 = userRepository70.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator79 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Faculty", "", true);
        userRepository70.addUser((com.reservation_system.model.User) headLabCoordinator79);
        boolean boolean81 = userRepository70.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList82 = userRepository70.getAllUsers();
        userRepository60.saveAllUsers(userList82);
        userRepository40.saveAllUsers(userList82);
        userRepository1.saveAllUsers(userList82);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "data/test-users.csv" + "'", str16, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "headlabcoordinator" + "'", str17, "headlabcoordinator");
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userOptional36);
        org.junit.Assert.assertNotNull(userOptional38);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 101 + "'", int58 == 101);
        org.junit.Assert.assertNotNull(userList61);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertNotNull(userOptional65);
        org.junit.Assert.assertNotNull(userList67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 101 + "'", int68 == 101);
        org.junit.Assert.assertNotNull(userList71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(userList82);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "Researcher", "researcher", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        int int6 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass8 = userList7.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "Faculty", "", "", false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Password1!", "Guest", "guest", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        boolean boolean8 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "faculty", "headlabcoordinator", "WrongPassword1!", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "faculty", "researcher", "Faculty", false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository7.getAllUsers();
        boolean boolean9 = userRepository7.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty15 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        java.lang.String str16 = faculty15.getUserType();
        com.reservation_system.model.LabManager labManager22 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str23 = labManager22.getEmail();
        com.reservation_system.model.Researcher researcher29 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean30 = researcher29.isApproved();
        com.reservation_system.model.Faculty faculty36 = new com.reservation_system.model.Faculty((int) (short) 0, "Faculty", "headlabcoordinator", "", true);
        com.reservation_system.model.LabManager labManager42 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str43 = labManager42.getEmail();
        com.reservation_system.model.Faculty faculty49 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str50 = faculty49.getName();
        java.lang.String str51 = faculty49.getName();
        com.reservation_system.model.LabManager labManager57 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str58 = labManager57.getEmail();
        com.reservation_system.model.Faculty faculty64 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        com.reservation_system.model.Faculty faculty70 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str71 = faculty70.getName();
        java.lang.String str72 = faculty70.getName();
        java.lang.String str73 = faculty70.getName();
        com.reservation_system.model.Researcher researcher79 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean80 = researcher79.requiresDepartmentApproval();
        com.reservation_system.model.Faculty faculty86 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        com.reservation_system.model.User[] userArray87 = new com.reservation_system.model.User[] { faculty15, labManager22, researcher29, faculty36, labManager42, faculty49, labManager57, faculty64, faculty70, researcher79, faculty86 };
        java.util.ArrayList<com.reservation_system.model.User> userList88 = new java.util.ArrayList<com.reservation_system.model.User>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<com.reservation_system.model.User>) userList88, userArray87);
        userRepository7.saveAllUsers((java.util.List<com.reservation_system.model.User>) userList88);
        userRepository1.saveAllUsers((java.util.List<com.reservation_system.model.User>) userList88);
        java.util.List<com.reservation_system.model.User> userList92 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService93 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean95 = userRepository1.emailExists("student");
        boolean boolean96 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "headlabcoordinator" + "'", str50, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "headlabcoordinator" + "'", str51, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "headlabcoordinator" + "'", str71, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "headlabcoordinator" + "'", str72, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "headlabcoordinator" + "'", str73, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(userArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(userList92);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "Researcher", "researcher", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getUserType();
        researcher5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean9 = userRepository1.emailExists("researcher");
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean12 = userRepository11.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty18 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        userRepository11.addUser((com.reservation_system.model.User) faculty18);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator25 = new com.reservation_system.model.HeadLabCoordinator(10, "headlabcoordinator", "data/test-users.csv", "faculty", false);
        java.lang.String str26 = headLabCoordinator25.getEmail();
        java.lang.String str27 = headLabCoordinator25.getUserType();
        userRepository11.addUser((com.reservation_system.model.User) headLabCoordinator25);
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository30.getAllUsers();
        com.reservation_system.services.AuthService authService32 = new com.reservation_system.services.AuthService(userRepository30);
        com.reservation_system.model.LabManager labManager38 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean39 = labManager38.isApproved();
        userRepository30.addUser((com.reservation_system.model.User) labManager38);
        boolean boolean42 = userRepository30.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList43 = userRepository30.getAllUsers();
        userRepository11.saveAllUsers(userList43);
        userRepository1.saveAllUsers(userList43);
        java.util.Optional<com.reservation_system.model.User> userOptional47 = userRepository1.findByEmail("data/test-users.csv");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "data/test-users.csv" + "'", str26, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "headlabcoordinator" + "'", str27, "headlabcoordinator");
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertNotNull(userOptional47);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        int int9 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService10 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user13 = authService10.login("Researcher", "faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
// flaky "12) test1614(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "Researcher", "Faculty", "guest", false);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getPassword();
        boolean boolean9 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "Password1!", "Password1!", "labmanager", false);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        int int19 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("");
        com.reservation_system.model.Researcher researcher27 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        java.lang.String str28 = researcher27.getUserType();
        boolean boolean29 = researcher27.requiresDepartmentApproval();
        java.lang.String str30 = researcher27.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher27);
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList34 = userRepository33.getAllUsers();
        com.reservation_system.services.AuthService authService35 = new com.reservation_system.services.AuthService(userRepository33);
        com.reservation_system.model.LabManager labManager41 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean42 = labManager41.isApproved();
        userRepository33.addUser((com.reservation_system.model.User) labManager41);
        com.reservation_system.services.AuthService authService44 = new com.reservation_system.services.AuthService(userRepository33);
        boolean boolean46 = userRepository33.emailExists("");
        boolean boolean47 = userRepository33.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList48 = userRepository33.getAllUsers();
        userRepository1.saveAllUsers(userList48);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Researcher" + "'", str30, "Researcher");
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
// flaky "13) test1617(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(userList48);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean6 = labManager5.isApproved();
        labManager5.setApproved(true);
        java.lang.String str9 = labManager5.getUserType();
        java.lang.String str10 = labManager5.getUserType();
        java.lang.String str11 = labManager5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "researcher", "Student", "Andrew", false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository5.saveAllUsers(userList11);
        userRepository1.saveAllUsers(userList11);
        com.reservation_system.services.AuthService authService14 = new com.reservation_system.services.AuthService(userRepository1);
        int int15 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository17.getAllUsers();
        boolean boolean19 = userRepository17.headLabCoordinatorExists();
        boolean boolean20 = userRepository17.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository17.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository23 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList24 = userRepository23.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList25 = userRepository23.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository27 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList28 = userRepository27.getAllUsers();
        boolean boolean29 = userRepository27.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList32 = userRepository31.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList33 = userRepository31.getAllUsers();
        userRepository27.saveAllUsers(userList33);
        userRepository23.saveAllUsers(userList33);
        com.reservation_system.repository.UserRepository userRepository37 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList38 = userRepository37.getAllUsers();
        com.reservation_system.services.AuthService authService39 = new com.reservation_system.services.AuthService(userRepository37);
        com.reservation_system.model.LabManager labManager45 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean46 = labManager45.isApproved();
        userRepository37.addUser((com.reservation_system.model.User) labManager45);
        com.reservation_system.repository.UserRepository userRepository49 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList50 = userRepository49.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList51 = userRepository49.getAllUsers();
        userRepository37.saveAllUsers(userList51);
        userRepository23.saveAllUsers(userList51);
        userRepository17.saveAllUsers(userList51);
        userRepository1.saveAllUsers(userList51);
        java.util.List<com.reservation_system.model.User> userList56 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional58 = userRepository1.findByEmail("Student");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
// flaky "14) test1620(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertNotNull(userList18);
// flaky "7) test1620(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky "3) test1620(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList28);
// flaky "2) test1620(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertNotNull(userList56);
        org.junit.Assert.assertNotNull(userOptional58);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean8 = userRepository7.headLabCoordinatorExists();
        int int9 = userRepository7.getNextID();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository7.getAllUsers();
        userRepository1.saveAllUsers(userList10);
        int int12 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator18 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "Guest", "", "Andrew", false);
        java.lang.String str19 = headLabCoordinator18.getName();
        java.lang.String str20 = headLabCoordinator18.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator18);
        org.junit.Assert.assertNotNull(userList2);
// flaky "15) test1621(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Guest" + "'", str19, "Guest");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "headlabcoordinator" + "'", str20, "headlabcoordinator");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "faculty", "student", "Andrew", false);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getEmail();
        boolean boolean8 = guest5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "Student", "Student", "test@example.com", false);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        boolean boolean7 = userRepository1.emailExists("student");
        com.reservation_system.model.Guest guest13 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        userRepository1.addUser((com.reservation_system.model.User) guest13);
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("Researcher");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (byte) 1, "data/test-users.csv", "Andrew", "guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "labmanager", "test@example.com", "data/test-users.csv", true);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getName();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "labmanager", "hi!", "", false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (byte) 1, "data/test-users.csv", "hi!", "Password1!", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Researcher", "Andrew", "data/test-users.csv", true);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "labmanager", "", "headlabcoordinator", false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str10 = faculty9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        faculty9.setApproved(false);
        java.lang.String str14 = faculty9.getUserType();
        int int15 = faculty9.getID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList7);
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        boolean boolean12 = userRepository10.headLabCoordinatorExists();
        boolean boolean13 = userRepository10.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList14);
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        boolean boolean18 = userRepository1.emailExists("Student");
        com.reservation_system.services.AuthService authService19 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean22 = userRepository21.headLabCoordinatorExists();
        int int23 = userRepository21.getNextID();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean26 = userRepository25.headLabCoordinatorExists();
        int int27 = userRepository25.getNextID();
        java.util.List<com.reservation_system.model.User> userList28 = userRepository25.getAllUsers();
        userRepository21.saveAllUsers(userList28);
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList32 = userRepository31.getAllUsers();
        com.reservation_system.services.AuthService authService33 = new com.reservation_system.services.AuthService(userRepository31);
        int int34 = userRepository31.getNextID();
        boolean boolean35 = userRepository31.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository37 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList38 = userRepository37.getAllUsers();
        boolean boolean39 = userRepository37.headLabCoordinatorExists();
        boolean boolean40 = userRepository37.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList41 = userRepository37.getAllUsers();
        userRepository31.saveAllUsers(userList41);
        java.util.Optional<com.reservation_system.model.User> userOptional44 = userRepository31.findByEmail("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional46 = userRepository31.findByEmail("faculty");
        int int47 = userRepository31.getNextID();
        boolean boolean49 = userRepository31.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository51 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList52 = userRepository51.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList53 = userRepository51.getAllUsers();
        userRepository31.saveAllUsers(userList53);
        userRepository21.saveAllUsers(userList53);
        userRepository1.saveAllUsers(userList53);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 98 + "'", int23 == 98);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 98 + "'", int27 == 98);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 98 + "'", int34 == 98);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(userOptional44);
        org.junit.Assert.assertNotNull(userOptional46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 98 + "'", int47 == 98);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(userList53);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Guest guest10 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str11 = guest10.getName();
        java.lang.String str12 = guest10.getName();
        java.lang.String str13 = guest10.getEmail();
        guest10.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) guest10);
        java.util.List<com.reservation_system.model.User> userList17 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository19 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList20 = userRepository19.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository19.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository23 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList24 = userRepository23.getAllUsers();
        boolean boolean25 = userRepository23.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository27 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList28 = userRepository27.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList29 = userRepository27.getAllUsers();
        userRepository23.saveAllUsers(userList29);
        userRepository19.saveAllUsers(userList29);
        java.util.List<com.reservation_system.model.User> userList32 = userRepository19.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList33 = userRepository19.getAllUsers();
        userRepository1.saveAllUsers(userList33);
        java.util.List<com.reservation_system.model.User> userList35 = userRepository1.getAllUsers();
        int int36 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Password1!" + "'", str13, "Password1!");
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 98 + "'", int36 == 98);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-users.csv", "Andrew", "", false);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(102, "Student", "", "Guest", true);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getName();
        int int8 = guest5.getID();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getPassword();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "researcher", "researcher", "Andrew", true);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "student", "Andrew", "guest", false);
        java.lang.String str6 = student5.getPassword();
        boolean boolean7 = student5.requiresDepartmentApproval();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Password1!", "guest", "Researcher", true);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository5.saveAllUsers(userList11);
        userRepository1.saveAllUsers(userList11);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "data/test-users.csv", "labmanager", "hi!", true);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "hi!", "labmanager", "Student", false);
        java.lang.String str6 = labManager5.getName();
        boolean boolean7 = labManager5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "labmanager", "", "hi!", true);
        labManager5.setApproved(true);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "", "hi!", "Student", false);
        int int6 = researcher5.getID();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Password1!", "researcher", "researcher", true);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "data/test-users.csv", "", "student", false);
        student5.setApproved(true);
        boolean boolean8 = student5.isApproved();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "Researcher", "Andrew", false);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("labmanager");
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList12 = userRepository10.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository14 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository14.getAllUsers();
        boolean boolean16 = userRepository14.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository18.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList20 = userRepository18.getAllUsers();
        userRepository14.saveAllUsers(userList20);
        userRepository10.saveAllUsers(userList20);
        boolean boolean23 = userRepository10.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList24 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList24);
        java.util.List<com.reservation_system.model.User> userList26 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList29 = userRepository28.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList30 = userRepository28.getAllUsers();
        com.reservation_system.services.AuthService authService31 = new com.reservation_system.services.AuthService(userRepository28);
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList34 = userRepository33.getAllUsers();
        com.reservation_system.services.AuthService authService35 = new com.reservation_system.services.AuthService(userRepository33);
        com.reservation_system.model.LabManager labManager41 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean42 = labManager41.isApproved();
        userRepository33.addUser((com.reservation_system.model.User) labManager41);
        com.reservation_system.model.Faculty faculty49 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository33.addUser((com.reservation_system.model.User) faculty49);
        int int51 = userRepository33.getNextID();
        int int52 = userRepository33.getNextID();
        java.util.List<com.reservation_system.model.User> userList53 = userRepository33.getAllUsers();
        userRepository28.saveAllUsers(userList53);
        userRepository1.saveAllUsers(userList53);
        java.util.Optional<com.reservation_system.model.User> userOptional57 = userRepository1.findByEmail("WrongPassword1!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 98 + "'", int51 == 98);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 98 + "'", int52 == 98);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertNotNull(userOptional57);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "faculty", "student", "WrongPassword1!", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "Researcher", "guest", "guest", true);
        boolean boolean6 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList7);
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        boolean boolean12 = userRepository10.headLabCoordinatorExists();
        boolean boolean13 = userRepository10.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList14);
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        boolean boolean18 = userRepository1.emailExists("Student");
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList20 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional22 = userRepository1.findByEmail("faculty");
        java.util.List<com.reservation_system.model.User> userList23 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList26 = userRepository25.getAllUsers();
        com.reservation_system.services.AuthService authService27 = new com.reservation_system.services.AuthService(userRepository25);
        com.reservation_system.services.AuthService authService28 = new com.reservation_system.services.AuthService(userRepository25);
        boolean boolean29 = userRepository25.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList30 = userRepository25.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository32.getAllUsers();
        boolean boolean34 = userRepository32.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList37 = userRepository36.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList38 = userRepository36.getAllUsers();
        userRepository32.saveAllUsers(userList38);
        com.reservation_system.repository.UserRepository userRepository41 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList42 = userRepository41.getAllUsers();
        boolean boolean43 = userRepository41.headLabCoordinatorExists();
        boolean boolean44 = userRepository41.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList45 = userRepository41.getAllUsers();
        userRepository32.saveAllUsers(userList45);
        boolean boolean47 = userRepository32.headLabCoordinatorExists();
        boolean boolean49 = userRepository32.emailExists("Student");
        com.reservation_system.repository.UserRepository userRepository51 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList52 = userRepository51.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList53 = userRepository51.getAllUsers();
        com.reservation_system.services.AuthService authService54 = new com.reservation_system.services.AuthService(userRepository51);
        java.util.Optional<com.reservation_system.model.User> userOptional56 = userRepository51.findByEmail("faculty");
        com.reservation_system.services.AuthService authService57 = new com.reservation_system.services.AuthService(userRepository51);
        java.util.List<com.reservation_system.model.User> userList58 = userRepository51.getAllUsers();
        userRepository32.saveAllUsers(userList58);
        userRepository25.saveAllUsers(userList58);
        userRepository1.saveAllUsers(userList58);
        java.lang.Class<?> wildcardClass62 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertNotNull(userOptional56);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        java.lang.String str10 = faculty9.getUserType();
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str17 = labManager16.getEmail();
        com.reservation_system.model.Researcher researcher23 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean24 = researcher23.isApproved();
        com.reservation_system.model.Faculty faculty30 = new com.reservation_system.model.Faculty((int) (short) 0, "Faculty", "headlabcoordinator", "", true);
        com.reservation_system.model.LabManager labManager36 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str37 = labManager36.getEmail();
        com.reservation_system.model.Faculty faculty43 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str44 = faculty43.getName();
        java.lang.String str45 = faculty43.getName();
        com.reservation_system.model.LabManager labManager51 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str52 = labManager51.getEmail();
        com.reservation_system.model.Faculty faculty58 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        com.reservation_system.model.Faculty faculty64 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str65 = faculty64.getName();
        java.lang.String str66 = faculty64.getName();
        java.lang.String str67 = faculty64.getName();
        com.reservation_system.model.Researcher researcher73 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean74 = researcher73.requiresDepartmentApproval();
        com.reservation_system.model.Faculty faculty80 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        com.reservation_system.model.User[] userArray81 = new com.reservation_system.model.User[] { faculty9, labManager16, researcher23, faculty30, labManager36, faculty43, labManager51, faculty58, faculty64, researcher73, faculty80 };
        java.util.ArrayList<com.reservation_system.model.User> userList82 = new java.util.ArrayList<com.reservation_system.model.User>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<com.reservation_system.model.User>) userList82, userArray81);
        userRepository1.saveAllUsers((java.util.List<com.reservation_system.model.User>) userList82);
        int int85 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService86 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean87 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest93 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str94 = guest93.getEmail();
        java.lang.String str95 = guest93.getEmail();
        guest93.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) guest93);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "headlabcoordinator" + "'", str44, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "headlabcoordinator" + "'", str45, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "headlabcoordinator" + "'", str65, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "headlabcoordinator" + "'", str66, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "headlabcoordinator" + "'", str67, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(userArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 98 + "'", int85 == 98);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Password1!" + "'", str94, "Password1!");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "Password1!" + "'", str95, "Password1!");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "student", "student", "Researcher", false);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(36, "labmanager", "data/test-users.csv", "researcher", true);
        int int6 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList7);
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        boolean boolean12 = userRepository10.headLabCoordinatorExists();
        boolean boolean13 = userRepository10.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList14);
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        boolean boolean18 = userRepository1.emailExists("Student");
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList22 = userRepository20.getAllUsers();
        com.reservation_system.services.AuthService authService23 = new com.reservation_system.services.AuthService(userRepository20);
        java.util.Optional<com.reservation_system.model.User> userOptional25 = userRepository20.findByEmail("faculty");
        com.reservation_system.services.AuthService authService26 = new com.reservation_system.services.AuthService(userRepository20);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository20.getAllUsers();
        userRepository1.saveAllUsers(userList27);
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository1.findByEmail("Researcher");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository1.getAllUsers();
        boolean boolean33 = userRepository1.emailExists("labmanager");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userOptional25);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        int int9 = userRepository1.getNextID();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository5.saveAllUsers(userList11);
        userRepository1.saveAllUsers(userList11);
        com.reservation_system.services.AuthService authService14 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator20 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str21 = headLabCoordinator20.getUserType();
        int int22 = headLabCoordinator20.getID();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator20);
        java.lang.String str24 = headLabCoordinator20.getName();
        boolean boolean25 = headLabCoordinator20.isApproved();
        java.lang.String str26 = headLabCoordinator20.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "headlabcoordinator" + "'", str21, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "headlabcoordinator" + "'", str24, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "headlabcoordinator" + "'", str26, "headlabcoordinator");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList7);
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        boolean boolean12 = userRepository10.headLabCoordinatorExists();
        boolean boolean13 = userRepository10.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList14);
        com.reservation_system.services.AuthService authService16 = new com.reservation_system.services.AuthService(userRepository1);
        int int17 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService18 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str10 = faculty9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Student");
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        boolean boolean16 = userRepository1.emailExists("labmanager");
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository1.findByEmail("hi!");
        boolean boolean20 = userRepository1.emailExists("data/test-users.csv");
        java.lang.Class<?> wildcardClass21 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository5.saveAllUsers(userList11);
        userRepository1.saveAllUsers(userList11);
        com.reservation_system.services.AuthService authService14 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator20 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str21 = headLabCoordinator20.getUserType();
        int int22 = headLabCoordinator20.getID();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator20);
        boolean boolean24 = headLabCoordinator20.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "headlabcoordinator" + "'", str21, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository5.saveAllUsers(userList11);
        userRepository1.saveAllUsers(userList11);
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("");
        com.reservation_system.services.AuthService authService17 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService18 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user21 = authService18.login("test@example.com", "student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository5.saveAllUsers(userList11);
        userRepository1.saveAllUsers(userList11);
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList16 = userRepository15.getAllUsers();
        com.reservation_system.services.AuthService authService17 = new com.reservation_system.services.AuthService(userRepository15);
        com.reservation_system.model.LabManager labManager23 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean24 = labManager23.isApproved();
        userRepository15.addUser((com.reservation_system.model.User) labManager23);
        com.reservation_system.repository.UserRepository userRepository27 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList28 = userRepository27.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList29 = userRepository27.getAllUsers();
        userRepository15.saveAllUsers(userList29);
        userRepository1.saveAllUsers(userList29);
        com.reservation_system.model.Student student37 = new com.reservation_system.model.Student((int) (short) -1, "Password1!", "faculty", "faculty", true);
        java.lang.String str38 = student37.getPassword();
        java.lang.String str39 = student37.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student37);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "faculty" + "'", str38, "faculty");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Student" + "'", str39, "Student");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.isApproved();
        java.lang.String str8 = headLabCoordinator5.getPassword();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "data/test-users.csv", "labmanager", "labmanager", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager(35, "Student", "Guest", "", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager12);
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator10 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Faculty", "", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator10);
        java.lang.String str12 = headLabCoordinator10.getEmail();
        java.lang.String str13 = headLabCoordinator10.getEmail();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "Password1!", "Researcher", "test@example.com", false);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", (int) (short) 100, "faculty", "Andrew", "Researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "student", "Researcher", "faculty", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        boolean boolean9 = student5.isApproved();
        boolean boolean10 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "Password1!", "student", "Faculty", true);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (byte) 100, "guest", "Researcher", "test@example.com", false);
        java.lang.String str7 = user6.getEmail();
        boolean boolean8 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "guest", "test@example.com", "labmanager", false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "WrongPassword1!", "guest", "", true);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "guest", "headlabcoordinator", "labmanager", false);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "faculty", "Student", "faculty", true);
        labManager5.setApproved(true);
        java.lang.String str8 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "Password1!", "Andrew", "headlabcoordinator", false);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList12 = userRepository11.getAllUsers();
        boolean boolean13 = userRepository11.headLabCoordinatorExists();
        boolean boolean15 = userRepository11.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository11.findByEmail("Faculty");
        int int18 = userRepository11.getNextID();
        java.util.List<com.reservation_system.model.User> userList19 = userRepository11.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList20 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList20);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "headlabcoordinator", "Password1!", "", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository13.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository13.getAllUsers();
        userRepository1.saveAllUsers(userList15);
        boolean boolean18 = userRepository1.emailExists("labmanager");
        com.reservation_system.model.Researcher researcher24 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str25 = researcher24.getUserType();
        boolean boolean26 = researcher24.isApproved();
        java.lang.String str27 = researcher24.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher24);
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository1.findByEmail("test@example.com");
        java.util.Optional<com.reservation_system.model.User> userOptional32 = userRepository1.findByEmail("WrongPassword1!");
        java.util.Optional<com.reservation_system.model.User> userOptional34 = userRepository1.findByEmail("student");
        java.lang.Class<?> wildcardClass35 = userOptional34.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Researcher" + "'", str25, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "student" + "'", str27, "student");
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertNotNull(userOptional32);
        org.junit.Assert.assertNotNull(userOptional34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "hi!", "student", "data/test-users.csv", false);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "Researcher", "Andrew", "Guest", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        boolean boolean7 = userRepository1.emailExists("data/test-users.csv");
        com.reservation_system.services.AuthService authService8 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "", "", "data/test-users.csv", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "Faculty", "Faculty", "faculty", true);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Guest guest10 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str11 = guest10.getName();
        java.lang.String str12 = guest10.getName();
        java.lang.String str13 = guest10.getEmail();
        guest10.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) guest10);
        java.util.List<com.reservation_system.model.User> userList17 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("test@example.com");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Password1!" + "'", str13, "Password1!");
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userOptional19);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        com.reservation_system.services.AuthService authService19 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean21 = userRepository1.emailExists("WrongPassword1!");
        com.reservation_system.model.Student student27 = new com.reservation_system.model.Student((int) (byte) -1, "", "faculty", "test@example.com", true);
        userRepository1.addUser((com.reservation_system.model.User) student27);
        com.reservation_system.services.AuthService authService29 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList32 = userRepository31.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList33 = userRepository31.getAllUsers();
        com.reservation_system.services.AuthService authService34 = new com.reservation_system.services.AuthService(userRepository31);
        java.util.Optional<com.reservation_system.model.User> userOptional36 = userRepository31.findByEmail("faculty");
        com.reservation_system.services.AuthService authService37 = new com.reservation_system.services.AuthService(userRepository31);
        java.util.List<com.reservation_system.model.User> userList38 = userRepository31.getAllUsers();
        int int39 = userRepository31.getNextID();
        com.reservation_system.repository.UserRepository userRepository41 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList42 = userRepository41.getAllUsers();
        boolean boolean43 = userRepository41.headLabCoordinatorExists();
        boolean boolean44 = userRepository41.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator50 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Faculty", "", true);
        userRepository41.addUser((com.reservation_system.model.User) headLabCoordinator50);
        boolean boolean52 = userRepository41.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList53 = userRepository41.getAllUsers();
        userRepository31.saveAllUsers(userList53);
        userRepository1.saveAllUsers(userList53);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userOptional36);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 99 + "'", int39 == 99);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(userList53);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Password1!", "faculty", "faculty", true);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getID();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getEmail();
        java.lang.String str10 = student5.getUserType();
        java.lang.String str11 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "headlabcoordinator", "data/test-users.csv", "faculty", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        java.lang.String str8 = headLabCoordinator5.getName();
        java.lang.String str9 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "data/test-users.csv" + "'", str7, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        java.lang.String str11 = faculty5.getEmail();
        boolean boolean12 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "test@example.com", "data/test-users.csv", "Andrew", true);
        boolean boolean6 = labManager5.isApproved();
        int int7 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "student", "guest", "hi!", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager15 = new com.reservation_system.model.LabManager((-1), "guest", "researcher", "Faculty", true);
        labManager15.setApproved(true);
        int int18 = labManager15.getID();
        userRepository1.addUser((com.reservation_system.model.User) labManager15);
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("WrongPassword1!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(userOptional21);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "Researcher", "Guest", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "guest", "Student", "Guest", true);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (byte) 100, "Password1!", "researcher", "Andrew", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "Guest", "guest", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "researcher", "", "data/test-users.csv", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "researcher", "WrongPassword1!", "WrongPassword1!", true);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "faculty", "hi!", "Student", false);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "student", "researcher", "student", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        int int19 = userRepository1.getNextID();
        int int20 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional23 = userRepository1.findByEmail("WrongPassword1!");
        java.util.List<com.reservation_system.model.User> userList24 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator15 = new com.reservation_system.model.HeadLabCoordinator(10, "headlabcoordinator", "data/test-users.csv", "faculty", false);
        java.lang.String str16 = headLabCoordinator15.getEmail();
        java.lang.String str17 = headLabCoordinator15.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator15);
        java.lang.String str19 = headLabCoordinator15.getEmail();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "data/test-users.csv" + "'", str16, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "headlabcoordinator" + "'", str17, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "data/test-users.csv" + "'", str19, "data/test-users.csv");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.services.AuthService authService2 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean4 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository7.getAllUsers();
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository7);
        com.reservation_system.model.LabManager labManager15 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean16 = labManager15.isApproved();
        userRepository7.addUser((com.reservation_system.model.User) labManager15);
        com.reservation_system.services.AuthService authService18 = new com.reservation_system.services.AuthService(userRepository7);
        boolean boolean20 = userRepository7.emailExists("");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository7.getAllUsers();
        userRepository1.saveAllUsers(userList21);
        java.util.List<com.reservation_system.model.User> userList23 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "test@example.com", "data/test-users.csv", "Andrew", true);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        int int19 = userRepository1.getNextID();
        int int20 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
        com.reservation_system.model.Researcher researcher27 = new com.reservation_system.model.Researcher((int) (byte) 0, "labmanager", "Andrew", "researcher", true);
        java.lang.String str28 = researcher27.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher27);
        com.reservation_system.model.Researcher researcher35 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str36 = researcher35.getUserType();
        boolean boolean37 = researcher35.isApproved();
        java.lang.String str38 = researcher35.getEmail();
        boolean boolean39 = researcher35.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) researcher35);
        java.util.List<com.reservation_system.model.User> userList41 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Researcher" + "'", str36, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "student" + "'", str38, "student");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(userList41);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "test@example.com", "researcher", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        int int19 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("");
        com.reservation_system.model.Student student27 = new com.reservation_system.model.Student(35, "Guest", "WrongPassword1!", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) student27);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator34 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "headlabcoordinator", "labmanager", "", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator34);
        java.lang.String str36 = headLabCoordinator34.getName();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "headlabcoordinator" + "'", str36, "headlabcoordinator");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository13.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository13.getAllUsers();
        userRepository1.saveAllUsers(userList15);
        boolean boolean18 = userRepository1.emailExists("labmanager");
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        userRepository1.saveAllUsers(userList21);
        java.util.List<com.reservation_system.model.User> userList23 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList24 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "labmanager", "data/test-users.csv", "hi!", false);
        java.lang.String str6 = headLabCoordinator5.getName();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository5.saveAllUsers(userList11);
        userRepository1.saveAllUsers(userList11);
        com.reservation_system.services.AuthService authService14 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator20 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str21 = headLabCoordinator20.getUserType();
        int int22 = headLabCoordinator20.getID();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator20);
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList26 = userRepository25.getAllUsers();
        boolean boolean27 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository29 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList30 = userRepository29.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList31 = userRepository29.getAllUsers();
        userRepository25.saveAllUsers(userList31);
        com.reservation_system.repository.UserRepository userRepository34 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList35 = userRepository34.getAllUsers();
        boolean boolean36 = userRepository34.headLabCoordinatorExists();
        boolean boolean37 = userRepository34.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList38 = userRepository34.getAllUsers();
        userRepository25.saveAllUsers(userList38);
        boolean boolean40 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService41 = new com.reservation_system.services.AuthService(userRepository25);
        java.util.List<com.reservation_system.model.User> userList42 = userRepository25.getAllUsers();
        userRepository1.saveAllUsers(userList42);
        java.util.List<com.reservation_system.model.User> userList44 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList45 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "headlabcoordinator" + "'", str21, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertNotNull(userList44);
        org.junit.Assert.assertNotNull(userList45);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "Researcher", "faculty", "Andrew", true);
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
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        boolean boolean13 = userRepository1.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService15 = new com.reservation_system.services.AuthService(userRepository1);
        int int16 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService17 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user20 = authService17.login("Guest", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager14 = new com.reservation_system.model.LabManager((int) 'a', "labmanager", "Password1!", "faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager14);
        java.lang.String str16 = labManager14.getUserType();
        labManager14.setApproved(false);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "labmanager" + "'", str16, "labmanager");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "hi!", "Andrew", "guest", false);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator10 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Faculty", "", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator10);
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService13 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = authService13.login("faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList7);
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        boolean boolean12 = userRepository10.headLabCoordinatorExists();
        boolean boolean13 = userRepository10.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList14);
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        boolean boolean18 = userRepository1.emailExists("Student");
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList20 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList23 = userRepository22.getAllUsers();
        boolean boolean24 = userRepository22.headLabCoordinatorExists();
        boolean boolean26 = userRepository22.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional28 = userRepository22.findByEmail("Faculty");
        int int29 = userRepository22.getNextID();
        boolean boolean30 = userRepository22.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository32.getAllUsers();
        com.reservation_system.services.AuthService authService34 = new com.reservation_system.services.AuthService(userRepository32);
        com.reservation_system.model.LabManager labManager40 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean41 = labManager40.isApproved();
        userRepository32.addUser((com.reservation_system.model.User) labManager40);
        com.reservation_system.model.Faculty faculty48 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository32.addUser((com.reservation_system.model.User) faculty48);
        boolean boolean51 = userRepository32.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional53 = userRepository32.findByEmail("researcher");
        com.reservation_system.repository.UserRepository userRepository55 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList56 = userRepository55.getAllUsers();
        com.reservation_system.services.AuthService authService57 = new com.reservation_system.services.AuthService(userRepository55);
        com.reservation_system.model.LabManager labManager63 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean64 = labManager63.isApproved();
        userRepository55.addUser((com.reservation_system.model.User) labManager63);
        boolean boolean67 = userRepository55.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList68 = userRepository55.getAllUsers();
        userRepository32.saveAllUsers(userList68);
        userRepository22.saveAllUsers(userList68);
        userRepository1.saveAllUsers(userList68);
        com.reservation_system.services.AuthService authService72 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user75 = authService72.login("Password1!", "Andrew");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 99 + "'", int29 == 99);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(userOptional53);
        org.junit.Assert.assertNotNull(userList56);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(userList68);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList7);
        int int9 = userRepository1.getNextID();
        int int10 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator16 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Guest", "", "faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator16);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        java.lang.String str10 = faculty8.getName();
        boolean boolean11 = faculty8.requiresDepartmentApproval();
        boolean boolean12 = faculty8.isApproved();
        java.lang.String str13 = faculty8.getUserType();
        boolean boolean14 = faculty8.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "guest", "WrongPassword1!", "test@example.com", false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Guest guest10 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str11 = guest10.getName();
        java.lang.String str12 = guest10.getName();
        java.lang.String str13 = guest10.getEmail();
        guest10.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) guest10);
        java.util.List<com.reservation_system.model.User> userList17 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository19 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList20 = userRepository19.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository19.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository23 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList24 = userRepository23.getAllUsers();
        boolean boolean25 = userRepository23.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository27 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList28 = userRepository27.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList29 = userRepository27.getAllUsers();
        userRepository23.saveAllUsers(userList29);
        userRepository19.saveAllUsers(userList29);
        java.util.List<com.reservation_system.model.User> userList32 = userRepository19.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList33 = userRepository19.getAllUsers();
        userRepository1.saveAllUsers(userList33);
        java.util.List<com.reservation_system.model.User> userList35 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList36 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Password1!" + "'", str13, "Password1!");
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userList36);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        int int6 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager13 = new com.reservation_system.model.LabManager((int) ' ', "test@example.com", "Password1!", "guest", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager13);
        java.lang.Class<?> wildcardClass15 = labManager13.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "headlabcoordinator", "faculty", "Andrew", false);
        java.lang.String str6 = guest5.getEmail();
        java.lang.String str7 = guest5.getEmail();
        boolean boolean8 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "headlabcoordinator", "data/test-users.csv", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest11 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        guest11.setApproved(true);
        guest11.setApproved(true);
        guest11.setApproved(false);
        java.lang.String str18 = guest11.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest11);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Guest" + "'", str18, "Guest");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        int int6 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.Researcher researcher13 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean14 = researcher13.isApproved();
        java.lang.String str15 = researcher13.getEmail();
        java.lang.String str16 = researcher13.getUserType();
        java.lang.String str17 = researcher13.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher13);
        com.reservation_system.model.Researcher researcher24 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "data/test-users.csv", "test@example.com", true);
        int int25 = researcher24.getID();
        userRepository1.addUser((com.reservation_system.model.User) researcher24);
        java.lang.String str27 = researcher24.getEmail();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "data/test-users.csv" + "'", str27, "data/test-users.csv");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "headlabcoordinator", "Andrew", "Faculty", false);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Andrew" + "'", str8, "Andrew");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "Researcher", "Student", "guest", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "data/test-users.csv", "", "student", false);
        student5.setApproved(true);
        java.lang.String str8 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "student", "researcher", "student", true);
        java.lang.String str6 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "guest", "hi!", "headlabcoordinator", true);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        int int10 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        boolean boolean13 = userRepository1.emailExists("Researcher");
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList16 = userRepository15.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList17 = userRepository15.getAllUsers();
        com.reservation_system.services.AuthService authService18 = new com.reservation_system.services.AuthService(userRepository15);
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        com.reservation_system.services.AuthService authService22 = new com.reservation_system.services.AuthService(userRepository20);
        com.reservation_system.model.LabManager labManager28 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean29 = labManager28.isApproved();
        userRepository20.addUser((com.reservation_system.model.User) labManager28);
        com.reservation_system.model.Faculty faculty36 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository20.addUser((com.reservation_system.model.User) faculty36);
        int int38 = userRepository20.getNextID();
        int int39 = userRepository20.getNextID();
        java.util.List<com.reservation_system.model.User> userList40 = userRepository20.getAllUsers();
        userRepository15.saveAllUsers(userList40);
        java.util.List<com.reservation_system.model.User> userList42 = userRepository15.getAllUsers();
        userRepository1.saveAllUsers(userList42);
        boolean boolean44 = userRepository1.headLabCoordinatorExists();
        boolean boolean45 = userRepository1.headLabCoordinatorExists();
        java.lang.Class<?> wildcardClass46 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 99 + "'", int38 == 99);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 99 + "'", int39 == 99);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Password1!", "WrongPassword1!", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getName();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        boolean boolean10 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str11 = headLabCoordinator5.getUserType();
        java.lang.String str12 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "headlabcoordinator" + "'", str12, "headlabcoordinator");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        boolean boolean7 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "headlabcoordinator", "Student", "student", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getPassword();
        java.lang.Class<?> wildcardClass8 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Password1!", "faculty", "faculty", true);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getID();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "Password1!", "WrongPassword1!", "student", true);
        java.lang.String str6 = researcher5.getUserType();
        int int7 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Andrew", "researcher", "test@example.com", true);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(102, "Student", "", "test@example.com", false);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "labmanager", "faculty", "researcher", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        int int19 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("");
        com.reservation_system.model.Student student27 = new com.reservation_system.model.Student(35, "Guest", "WrongPassword1!", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) student27);
        java.lang.String str29 = student27.getUserType();
        java.lang.String str30 = student27.getUserType();
        boolean boolean31 = student27.isApproved();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Student" + "'", str29, "Student");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Student" + "'", str30, "Student");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        boolean boolean10 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository13.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository13.getAllUsers();
        userRepository1.saveAllUsers(userList15);
        boolean boolean18 = userRepository1.emailExists("labmanager");
        int int19 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "student", "hi!", "labmanager", false);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean8 = userRepository7.headLabCoordinatorExists();
        int int9 = userRepository7.getNextID();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository7.getAllUsers();
        userRepository1.saveAllUsers(userList10);
        boolean boolean13 = userRepository1.emailExists("Researcher");
        com.reservation_system.services.AuthService authService14 = new com.reservation_system.services.AuthService(userRepository1);
        java.lang.Class<?> wildcardClass15 = authService14.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository5.saveAllUsers(userList11);
        userRepository1.saveAllUsers(userList11);
        com.reservation_system.services.AuthService authService14 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator20 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str21 = headLabCoordinator20.getUserType();
        int int22 = headLabCoordinator20.getID();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator20);
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList26 = userRepository25.getAllUsers();
        boolean boolean27 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository29 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList30 = userRepository29.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList31 = userRepository29.getAllUsers();
        userRepository25.saveAllUsers(userList31);
        com.reservation_system.repository.UserRepository userRepository34 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList35 = userRepository34.getAllUsers();
        boolean boolean36 = userRepository34.headLabCoordinatorExists();
        boolean boolean37 = userRepository34.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList38 = userRepository34.getAllUsers();
        userRepository25.saveAllUsers(userList38);
        boolean boolean40 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService41 = new com.reservation_system.services.AuthService(userRepository25);
        java.util.List<com.reservation_system.model.User> userList42 = userRepository25.getAllUsers();
        userRepository1.saveAllUsers(userList42);
        java.util.Optional<com.reservation_system.model.User> userOptional45 = userRepository1.findByEmail("");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "headlabcoordinator" + "'", str21, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertNotNull(userOptional45);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        boolean boolean13 = userRepository1.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService15 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.Researcher researcher21 = new com.reservation_system.model.Researcher((int) (byte) 10, "researcher", "Researcher", "", false);
        boolean boolean22 = researcher21.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) researcher21);
        java.util.List<com.reservation_system.model.User> userList24 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("Researcher");
        com.reservation_system.services.AuthService authService27 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userOptional26);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        java.lang.String str8 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("WrongPassword1!");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator14 = new com.reservation_system.model.HeadLabCoordinator(99, "Andrew", "guest", "Researcher", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator14);
        int int16 = headLabCoordinator14.getID();
        java.lang.String str17 = headLabCoordinator14.getEmail();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "guest" + "'", str17, "guest");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("Password1!");
        com.reservation_system.services.AuthService authService6 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        int int6 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.Researcher researcher13 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean14 = researcher13.isApproved();
        java.lang.String str15 = researcher13.getEmail();
        java.lang.String str16 = researcher13.getUserType();
        java.lang.String str17 = researcher13.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher13);
        com.reservation_system.model.Researcher researcher24 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "data/test-users.csv", "test@example.com", true);
        int int25 = researcher24.getID();
        userRepository1.addUser((com.reservation_system.model.User) researcher24);
        com.reservation_system.model.LabManager labManager32 = new com.reservation_system.model.LabManager((int) (byte) 100, "Faculty", "Password1!", "Student", true);
        java.lang.String str33 = labManager32.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) labManager32);
        java.lang.String str35 = labManager32.getUserType();
        java.lang.String str36 = labManager32.getName();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Password1!" + "'", str33, "Password1!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "labmanager" + "'", str35, "labmanager");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Faculty" + "'", str36, "Faculty");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(36, "test@example.com", "Password1!", "hi!", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        int int6 = userRepository1.getNextID();
        boolean boolean8 = userRepository1.emailExists("Guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "hi!", "data/test-users.csv", false);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getName();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getName();
        java.lang.String str12 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "headlabcoordinator" + "'", str12, "headlabcoordinator");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        int int8 = faculty5.getID();
        java.lang.String str9 = faculty5.getPassword();
        java.lang.String str10 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository13.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository13.getAllUsers();
        userRepository1.saveAllUsers(userList15);
        int int17 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService18 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user21 = authService18.login("headlabcoordinator", "faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "test@example.com", "Andrew", "labmanager", true);
        int int6 = student5.getID();
        java.lang.String str7 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "hi!", "Password1!", "WrongPassword1!", true);
        int int6 = faculty5.getID();
        java.lang.String str7 = faculty5.getPassword();
        java.lang.String str8 = faculty5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "WrongPassword1!" + "'", str7, "WrongPassword1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "WrongPassword1!" + "'", str8, "WrongPassword1!");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Faculty");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student18 = new com.reservation_system.model.Student((int) (short) -1, "Password1!", "faculty", "faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) student18);
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService22 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository7.getAllUsers();
        boolean boolean9 = userRepository7.headLabCoordinatorExists();
        boolean boolean10 = userRepository7.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository7.getAllUsers();
        userRepository1.saveAllUsers(userList11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("faculty");
        boolean boolean18 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "test@example.com", "", "Faculty", true);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "", "WrongPassword1!", "Password1!", false);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean8 = userRepository7.headLabCoordinatorExists();
        int int9 = userRepository7.getNextID();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository7.getAllUsers();
        userRepository1.saveAllUsers(userList10);
        boolean boolean13 = userRepository1.emailExists("Researcher");
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "hi!", "Password1!", "test@example.com", false);
        java.lang.String str6 = student5.getPassword();
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        int int19 = userRepository1.getNextID();
        int int20 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional23 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList24 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository26.getAllUsers();
        com.reservation_system.services.AuthService authService28 = new com.reservation_system.services.AuthService(userRepository26);
        int int29 = userRepository26.getNextID();
        boolean boolean30 = userRepository26.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository32.getAllUsers();
        boolean boolean34 = userRepository32.headLabCoordinatorExists();
        boolean boolean35 = userRepository32.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList36 = userRepository32.getAllUsers();
        userRepository26.saveAllUsers(userList36);
        java.util.Optional<com.reservation_system.model.User> userOptional39 = userRepository26.findByEmail("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional41 = userRepository26.findByEmail("faculty");
        int int42 = userRepository26.getNextID();
        boolean boolean44 = userRepository26.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository46 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList47 = userRepository46.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList48 = userRepository46.getAllUsers();
        userRepository26.saveAllUsers(userList48);
        userRepository1.saveAllUsers(userList48);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 101 + "'", int29 == 101);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userOptional39);
        org.junit.Assert.assertNotNull(userOptional41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 101 + "'", int42 == 101);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(userList48);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "", "Researcher", "Guest", true);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "Guest", "faculty", "Faculty", true);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository5.saveAllUsers(userList11);
        userRepository1.saveAllUsers(userList11);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService16 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean17 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "", "labmanager", "Guest", true);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "test@example.com", "Researcher", "test@example.com", true);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "Andrew", "Student", "", false);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList7);
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        boolean boolean12 = userRepository10.headLabCoordinatorExists();
        boolean boolean13 = userRepository10.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList14);
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList17 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList7);
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        boolean boolean12 = userRepository10.headLabCoordinatorExists();
        boolean boolean13 = userRepository10.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList14);
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        boolean boolean18 = userRepository1.emailExists("Student");
        com.reservation_system.services.AuthService authService19 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean21 = userRepository1.emailExists("labmanager");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "guest", "faculty", "Student", true);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "Researcher", "guest", "researcher", true);
        java.lang.String str6 = headLabCoordinator5.getName();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "Andrew", "headlabcoordinator", "Password1!", true);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "guest", "student", "Faculty", true);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "faculty", "researcher", "Andrew", false);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository13.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository13.getAllUsers();
        userRepository1.saveAllUsers(userList15);
        com.reservation_system.services.AuthService authService17 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean19 = userRepository1.emailExists("");
        int int20 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Andrew", "student", "guest", false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = authService3.login("labmanager", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "hi!", "Researcher", "test@example.com", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "Researcher", "Faculty", "hi!", true);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        int int7 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        int int7 = researcher5.getID();
        researcher5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "test@example.com", "", "test@example.com", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) (byte) 1, "Student", "hi!", "Faculty", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Guest", "Password1!", "Password1!", true);
        java.lang.String str6 = guest5.getUserType();
        int int7 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "Faculty", "WrongPassword1!", "headlabcoordinator", true);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Faculty");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        int int13 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("WrongPassword1!");
        boolean boolean17 = userRepository1.emailExists("Student");
        int int18 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        int int19 = userRepository1.getNextID();
        int int20 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService22 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService23 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(36, "Guest", "test@example.com", "guest", true);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "test@example.com", "data/test-users.csv", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "headlabcoordinator", "Andrew", "Password1!", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", 0, "Faculty", "student", "", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("labmanager");
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "Researcher", "guest", "researcher", true);
        java.lang.String str6 = headLabCoordinator5.getName();
        headLabCoordinator5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "headlabcoordinator", "", "faculty", true);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        int int12 = faculty11.getID();
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("Andrew");
        boolean boolean10 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Faculty");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional13);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getEmail();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getUserType();
        boolean boolean12 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean4 = userRepository1.emailExists("Researcher");
        com.reservation_system.model.Guest guest10 = new com.reservation_system.model.Guest(0, "labmanager", "researcher", "data/test-users.csv", true);
        int int11 = guest10.getID();
        userRepository1.addUser((com.reservation_system.model.User) guest10);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("Guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(userOptional14);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "test@example.com", "Guest", "WrongPassword1!", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", (int) ' ', "", "hi!", "labmanager", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "Researcher", "", "faculty", true);
        researcher5.setApproved(true);
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "student", "Guest", "Faculty", true);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "faculty", "guest", "faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "student", "data/test-users.csv", "headlabcoordinator", true);
        int int6 = labManager5.getID();
        java.lang.String str7 = labManager5.getUserType();
        labManager5.setApproved(false);
        java.lang.String str10 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("test@example.com");
        boolean boolean7 = userRepository1.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository7.getAllUsers();
        boolean boolean9 = userRepository7.headLabCoordinatorExists();
        boolean boolean10 = userRepository7.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository7.getAllUsers();
        userRepository1.saveAllUsers(userList11);
        com.reservation_system.model.Researcher researcher18 = new com.reservation_system.model.Researcher((int) ' ', "", "Faculty", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher18);
        int int20 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getPassword();
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        researcher5.setApproved(false);
        java.lang.String str12 = researcher5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "hi!", "Student", "Researcher", true);
        faculty5.setApproved(true);
        java.lang.String str8 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository7.getAllUsers();
        boolean boolean9 = userRepository7.headLabCoordinatorExists();
        boolean boolean10 = userRepository7.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository7.getAllUsers();
        userRepository1.saveAllUsers(userList11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("guest");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository17.getAllUsers();
        com.reservation_system.services.AuthService authService19 = new com.reservation_system.services.AuthService(userRepository17);
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository17.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository17.getAllUsers();
        boolean boolean24 = userRepository17.emailExists("labmanager");
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository26.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList28 = userRepository26.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository30.getAllUsers();
        boolean boolean32 = userRepository30.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository34 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList35 = userRepository34.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList36 = userRepository34.getAllUsers();
        userRepository30.saveAllUsers(userList36);
        userRepository26.saveAllUsers(userList36);
        boolean boolean39 = userRepository26.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList40 = userRepository26.getAllUsers();
        userRepository17.saveAllUsers(userList40);
        java.util.List<com.reservation_system.model.User> userList42 = userRepository17.getAllUsers();
        userRepository1.saveAllUsers(userList42);
        boolean boolean44 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList45 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList7);
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        boolean boolean12 = userRepository10.headLabCoordinatorExists();
        boolean boolean13 = userRepository10.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList14);
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        boolean boolean18 = userRepository1.emailExists("Student");
        com.reservation_system.model.Guest guest24 = new com.reservation_system.model.Guest(100, "WrongPassword1!", "faculty", "Andrew", true);
        java.lang.String str25 = guest24.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest24);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Guest" + "'", str25, "Guest");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        boolean boolean13 = userRepository1.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService15 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.Researcher researcher21 = new com.reservation_system.model.Researcher((int) (byte) 10, "researcher", "Researcher", "", false);
        boolean boolean22 = researcher21.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) researcher21);
        java.lang.String str24 = researcher21.getPassword();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 0, "student", "", "Faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(false);
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository5.saveAllUsers(userList11);
        userRepository1.saveAllUsers(userList11);
        com.reservation_system.services.AuthService authService14 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator20 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str21 = headLabCoordinator20.getUserType();
        int int22 = headLabCoordinator20.getID();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator20);
        com.reservation_system.services.AuthService authService24 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user27 = authService24.login("data/test-users.csv", "WrongPassword1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "headlabcoordinator" + "'", str21, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "test@example.com", "", "Andrew", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean8 = userRepository7.headLabCoordinatorExists();
        int int9 = userRepository7.getNextID();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository7.getAllUsers();
        userRepository1.saveAllUsers(userList10);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        boolean boolean14 = userRepository1.emailExists("headlabcoordinator");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "Password1!", "WrongPassword1!", "guest", false);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        int int4 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "researcher", "hi!", "", false);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 97, "headlabcoordinator", "WrongPassword1!", "hi!", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "", "", "WrongPassword1!", true);
        faculty5.setApproved(true);
        boolean boolean8 = faculty5.requiresDepartmentApproval();
        boolean boolean9 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "Andrew", "faculty", "Student", true);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "test@example.com", "WrongPassword1!", "WrongPassword1!", false);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(102, "headlabcoordinator", "Student", "test@example.com", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "Password1!", "hi!", "Andrew", false);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "Faculty", "Password1!", "Student", true);
        int int6 = labManager5.getID();
        java.lang.String str7 = labManager5.getEmail();
        labManager5.setApproved(false);
        java.lang.String str10 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Guest", "Password1!", "Password1!", true);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        java.lang.String str8 = guest5.getPassword();
        java.lang.String str9 = guest5.getPassword();
        java.lang.String str10 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Password1!" + "'", str10, "Password1!");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        guest5.setApproved(false);
        java.lang.String str10 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("guest");
        int int6 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userOptional13);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "hi!", "student", "", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "labmanager", "Andrew", "", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "Researcher", "", "student", false);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Researcher", "Faculty", "hi!", false);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "researcher", "faculty", "hi!", false);
        java.lang.String str6 = faculty5.getUserType();
        faculty5.setApproved(false);
        int int9 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Faculty");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        int int13 = userRepository1.getNextID();
        boolean boolean15 = userRepository1.emailExists("hi!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "16) test1845(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
// flaky "8) test1845(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean7 = userRepository1.emailExists("researcher");
        com.reservation_system.services.AuthService authService8 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user11 = authService8.login("Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(101, "Researcher", "student", "hi!", false);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList5 = userRepository4.getAllUsers();
        boolean boolean6 = userRepository4.headLabCoordinatorExists();
        boolean boolean8 = userRepository4.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository4.findByEmail("Faculty");
        int int11 = userRepository4.getNextID();
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository13.getAllUsers();
        com.reservation_system.services.AuthService authService15 = new com.reservation_system.services.AuthService(userRepository13);
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository13.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository13.getAllUsers();
        userRepository4.saveAllUsers(userList18);
        userRepository1.saveAllUsers(userList18);
        boolean boolean22 = userRepository1.emailExists("data/test-users.csv");
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList25 = userRepository24.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList26 = userRepository24.getAllUsers();
        com.reservation_system.services.AuthService authService27 = new com.reservation_system.services.AuthService(userRepository24);
        java.util.Optional<com.reservation_system.model.User> userOptional29 = userRepository24.findByEmail("faculty");
        com.reservation_system.services.AuthService authService30 = new com.reservation_system.services.AuthService(userRepository24);
        boolean boolean32 = userRepository24.emailExists("researcher");
        com.reservation_system.repository.UserRepository userRepository34 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean35 = userRepository34.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty41 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        userRepository34.addUser((com.reservation_system.model.User) faculty41);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator48 = new com.reservation_system.model.HeadLabCoordinator(10, "headlabcoordinator", "data/test-users.csv", "faculty", false);
        java.lang.String str49 = headLabCoordinator48.getEmail();
        java.lang.String str50 = headLabCoordinator48.getUserType();
        userRepository34.addUser((com.reservation_system.model.User) headLabCoordinator48);
        com.reservation_system.repository.UserRepository userRepository53 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList54 = userRepository53.getAllUsers();
        com.reservation_system.services.AuthService authService55 = new com.reservation_system.services.AuthService(userRepository53);
        com.reservation_system.model.LabManager labManager61 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean62 = labManager61.isApproved();
        userRepository53.addUser((com.reservation_system.model.User) labManager61);
        boolean boolean65 = userRepository53.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList66 = userRepository53.getAllUsers();
        userRepository34.saveAllUsers(userList66);
        userRepository24.saveAllUsers(userList66);
        userRepository1.saveAllUsers(userList66);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "17) test1848(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userOptional29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "data/test-users.csv" + "'", str49, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "headlabcoordinator" + "'", str50, "headlabcoordinator");
        org.junit.Assert.assertNotNull(userList54);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(userList66);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 35, "Password1!", "Researcher", "Faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator10 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Faculty", "", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator10);
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList13 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService14 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = authService14.login("headlabcoordinator", "student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository13.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository13.getAllUsers();
        userRepository1.saveAllUsers(userList15);
        boolean boolean18 = userRepository1.emailExists("labmanager");
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        userRepository1.saveAllUsers(userList21);
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList25 = userRepository24.getAllUsers();
        com.reservation_system.services.AuthService authService26 = new com.reservation_system.services.AuthService(userRepository24);
        com.reservation_system.model.LabManager labManager32 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean33 = labManager32.isApproved();
        userRepository24.addUser((com.reservation_system.model.User) labManager32);
        com.reservation_system.model.Faculty faculty40 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository24.addUser((com.reservation_system.model.User) faculty40);
        boolean boolean43 = userRepository24.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional45 = userRepository24.findByEmail("researcher");
        int int46 = userRepository24.getNextID();
        com.reservation_system.model.LabManager labManager52 = new com.reservation_system.model.LabManager((int) ' ', "test@example.com", "Password1!", "guest", true);
        userRepository24.addUser((com.reservation_system.model.User) labManager52);
        com.reservation_system.repository.UserRepository userRepository55 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList56 = userRepository55.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList57 = userRepository55.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository59 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList60 = userRepository59.getAllUsers();
        boolean boolean61 = userRepository59.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository63 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList64 = userRepository63.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList65 = userRepository63.getAllUsers();
        userRepository59.saveAllUsers(userList65);
        userRepository55.saveAllUsers(userList65);
        com.reservation_system.model.Faculty faculty73 = new com.reservation_system.model.Faculty(98, "guest", "Researcher", "student", true);
        userRepository55.addUser((com.reservation_system.model.User) faculty73);
        com.reservation_system.repository.UserRepository userRepository76 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList77 = userRepository76.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList78 = userRepository76.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository80 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList81 = userRepository80.getAllUsers();
        boolean boolean82 = userRepository80.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository84 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList85 = userRepository84.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList86 = userRepository84.getAllUsers();
        userRepository80.saveAllUsers(userList86);
        userRepository76.saveAllUsers(userList86);
        java.util.List<com.reservation_system.model.User> userList89 = userRepository76.getAllUsers();
        userRepository55.saveAllUsers(userList89);
        userRepository24.saveAllUsers(userList89);
        userRepository1.saveAllUsers(userList89);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(userOptional45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 101 + "'", int46 == 101);
        org.junit.Assert.assertNotNull(userList56);
        org.junit.Assert.assertNotNull(userList57);
        org.junit.Assert.assertNotNull(userList60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(userList64);
        org.junit.Assert.assertNotNull(userList65);
        org.junit.Assert.assertNotNull(userList77);
        org.junit.Assert.assertNotNull(userList78);
        org.junit.Assert.assertNotNull(userList81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(userList85);
        org.junit.Assert.assertNotNull(userList86);
        org.junit.Assert.assertNotNull(userList89);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "Guest", "researcher", "Password1!", true);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "student", "data/test-users.csv", "headlabcoordinator", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository13.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository13.getAllUsers();
        userRepository1.saveAllUsers(userList15);
        boolean boolean18 = userRepository1.emailExists("labmanager");
        com.reservation_system.model.Researcher researcher24 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str25 = researcher24.getUserType();
        boolean boolean26 = researcher24.isApproved();
        java.lang.String str27 = researcher24.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher24);
        com.reservation_system.model.Guest guest34 = new com.reservation_system.model.Guest(98, "faculty", "student", "Andrew", false);
        java.lang.String str35 = guest34.getPassword();
        java.lang.String str36 = guest34.getUserType();
        java.lang.String str37 = guest34.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) guest34);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Researcher" + "'", str25, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "student" + "'", str27, "student");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Andrew" + "'", str35, "Andrew");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Guest" + "'", str36, "Guest");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "student" + "'", str37, "student");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        int int3 = userRepository1.getNextID();
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = authService5.login("student", "headlabcoordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(36, "test@example.com", "Password1!", "hi!", false);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Faculty");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        int int13 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("WrongPassword1!");
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository17.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList19 = userRepository17.getAllUsers();
        com.reservation_system.services.AuthService authService20 = new com.reservation_system.services.AuthService(userRepository17);
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList23 = userRepository22.getAllUsers();
        com.reservation_system.services.AuthService authService24 = new com.reservation_system.services.AuthService(userRepository22);
        com.reservation_system.model.LabManager labManager30 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean31 = labManager30.isApproved();
        userRepository22.addUser((com.reservation_system.model.User) labManager30);
        com.reservation_system.model.Faculty faculty38 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository22.addUser((com.reservation_system.model.User) faculty38);
        int int40 = userRepository22.getNextID();
        int int41 = userRepository22.getNextID();
        java.util.List<com.reservation_system.model.User> userList42 = userRepository22.getAllUsers();
        userRepository17.saveAllUsers(userList42);
        java.util.List<com.reservation_system.model.User> userList44 = userRepository17.getAllUsers();
        userRepository1.saveAllUsers(userList44);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "18) test1857(com.reservation_system.Randoop.AuthService.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 101 + "'", int40 == 101);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 101 + "'", int41 == 101);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertNotNull(userList44);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str10 = faculty9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository13.getAllUsers();
        com.reservation_system.services.AuthService authService15 = new com.reservation_system.services.AuthService(userRepository13);
        com.reservation_system.model.LabManager labManager21 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean22 = labManager21.isApproved();
        userRepository13.addUser((com.reservation_system.model.User) labManager21);
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList26 = userRepository25.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList27 = userRepository25.getAllUsers();
        userRepository13.saveAllUsers(userList27);
        boolean boolean30 = userRepository13.emailExists("labmanager");
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository32.getAllUsers();
        userRepository13.saveAllUsers(userList33);
        userRepository1.saveAllUsers(userList33);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(userList33);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        java.lang.String str10 = faculty9.getUserType();
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str17 = labManager16.getEmail();
        com.reservation_system.model.Researcher researcher23 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean24 = researcher23.isApproved();
        com.reservation_system.model.Faculty faculty30 = new com.reservation_system.model.Faculty((int) (short) 0, "Faculty", "headlabcoordinator", "", true);
        com.reservation_system.model.LabManager labManager36 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str37 = labManager36.getEmail();
        com.reservation_system.model.Faculty faculty43 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str44 = faculty43.getName();
        java.lang.String str45 = faculty43.getName();
        com.reservation_system.model.LabManager labManager51 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str52 = labManager51.getEmail();
        com.reservation_system.model.Faculty faculty58 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        com.reservation_system.model.Faculty faculty64 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str65 = faculty64.getName();
        java.lang.String str66 = faculty64.getName();
        java.lang.String str67 = faculty64.getName();
        com.reservation_system.model.Researcher researcher73 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean74 = researcher73.requiresDepartmentApproval();
        com.reservation_system.model.Faculty faculty80 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        com.reservation_system.model.User[] userArray81 = new com.reservation_system.model.User[] { faculty9, labManager16, researcher23, faculty30, labManager36, faculty43, labManager51, faculty58, faculty64, researcher73, faculty80 };
        java.util.ArrayList<com.reservation_system.model.User> userList82 = new java.util.ArrayList<com.reservation_system.model.User>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<com.reservation_system.model.User>) userList82, userArray81);
        userRepository1.saveAllUsers((java.util.List<com.reservation_system.model.User>) userList82);
        int int85 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService86 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user89 = authService86.login("guest", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "headlabcoordinator" + "'", str44, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "headlabcoordinator" + "'", str45, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "headlabcoordinator" + "'", str65, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "headlabcoordinator" + "'", str66, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "headlabcoordinator" + "'", str67, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(userArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 98 + "'", int85 == 98);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", (int) (short) 100, "labmanager", "Password1!", "WrongPassword1!", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "data/test-users.csv", "student", "Faculty", false);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(36, "guest", "Faculty", "Andrew", true);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Student", "data/test-users.csv", "test@example.com", true);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "Andrew", "student", "Researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "guest", "Guest", "Faculty", true);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository5.saveAllUsers(userList11);
        userRepository1.saveAllUsers(userList11);
        boolean boolean15 = userRepository1.emailExists("Researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userOptional17);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "faculty", "Faculty", "student", false);
        java.lang.String str6 = student5.getName();
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("Andrew");
        boolean boolean10 = userRepository1.emailExists("headlabcoordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("test@example.com");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userOptional12);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository5.saveAllUsers(userList11);
        userRepository1.saveAllUsers(userList11);
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        int int17 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository19 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList20 = userRepository19.getAllUsers();
        com.reservation_system.services.AuthService authService21 = new com.reservation_system.services.AuthService(userRepository19);
        java.util.Optional<com.reservation_system.model.User> userOptional23 = userRepository19.findByEmail("");
        int int24 = userRepository19.getNextID();
        com.reservation_system.services.AuthService authService25 = new com.reservation_system.services.AuthService(userRepository19);
        com.reservation_system.model.Researcher researcher31 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean32 = researcher31.isApproved();
        java.lang.String str33 = researcher31.getEmail();
        java.lang.String str34 = researcher31.getUserType();
        java.lang.String str35 = researcher31.getEmail();
        userRepository19.addUser((com.reservation_system.model.User) researcher31);
        com.reservation_system.model.Researcher researcher42 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "data/test-users.csv", "test@example.com", true);
        int int43 = researcher42.getID();
        userRepository19.addUser((com.reservation_system.model.User) researcher42);
        boolean boolean46 = userRepository19.emailExists("Student");
        com.reservation_system.repository.UserRepository userRepository48 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList49 = userRepository48.getAllUsers();
        com.reservation_system.services.AuthService authService50 = new com.reservation_system.services.AuthService(userRepository48);
        com.reservation_system.model.LabManager labManager56 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean57 = labManager56.isApproved();
        userRepository48.addUser((com.reservation_system.model.User) labManager56);
        com.reservation_system.repository.UserRepository userRepository60 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList61 = userRepository60.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList62 = userRepository60.getAllUsers();
        userRepository48.saveAllUsers(userList62);
        java.util.List<com.reservation_system.model.User> userList64 = userRepository48.getAllUsers();
        userRepository19.saveAllUsers(userList64);
        userRepository1.saveAllUsers(userList64);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 98 + "'", int17 == 98);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 98 + "'", int24 == 98);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "student" + "'", str33, "student");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Researcher" + "'", str34, "Researcher");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "student" + "'", str35, "student");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(userList61);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertNotNull(userList64);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 1, "WrongPassword1!", "hi!", "Student", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(99, "labmanager", "data/test-users.csv", "Student", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository5.saveAllUsers(userList11);
        userRepository1.saveAllUsers(userList11);
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList16 = userRepository15.getAllUsers();
        com.reservation_system.services.AuthService authService17 = new com.reservation_system.services.AuthService(userRepository15);
        com.reservation_system.model.LabManager labManager23 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean24 = labManager23.isApproved();
        userRepository15.addUser((com.reservation_system.model.User) labManager23);
        com.reservation_system.repository.UserRepository userRepository27 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList28 = userRepository27.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList29 = userRepository27.getAllUsers();
        userRepository15.saveAllUsers(userList29);
        userRepository1.saveAllUsers(userList29);
        boolean boolean33 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.model.Faculty faculty39 = new com.reservation_system.model.Faculty(98, "guest", "Researcher", "student", true);
        java.lang.String str40 = faculty39.getUserType();
        java.lang.String str41 = faculty39.getUserType();
        java.lang.String str42 = faculty39.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty39);
        java.util.Optional<com.reservation_system.model.User> userOptional45 = userRepository1.findByEmail("Password1!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Faculty" + "'", str40, "Faculty");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Faculty" + "'", str41, "Faculty");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Faculty" + "'", str42, "Faculty");
        org.junit.Assert.assertNotNull(userOptional45);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.services.AuthService authService12 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean14 = userRepository1.emailExists("");
        java.lang.Class<?> wildcardClass15 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "Faculty", "faculty", "labmanager", false);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "Guest", "researcher", false);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository6.getAllUsers();
        com.reservation_system.services.AuthService authService8 = new com.reservation_system.services.AuthService(userRepository6);
        com.reservation_system.model.LabManager labManager14 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean15 = labManager14.isApproved();
        userRepository6.addUser((com.reservation_system.model.User) labManager14);
        com.reservation_system.model.Faculty faculty22 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository6.addUser((com.reservation_system.model.User) faculty22);
        int int24 = userRepository6.getNextID();
        int int25 = userRepository6.getNextID();
        java.util.List<com.reservation_system.model.User> userList26 = userRepository6.getAllUsers();
        userRepository1.saveAllUsers(userList26);
        com.reservation_system.repository.UserRepository userRepository29 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList30 = userRepository29.getAllUsers();
        com.reservation_system.services.AuthService authService31 = new com.reservation_system.services.AuthService(userRepository29);
        int int32 = userRepository29.getNextID();
        boolean boolean33 = userRepository29.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository35 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList36 = userRepository35.getAllUsers();
        boolean boolean37 = userRepository35.headLabCoordinatorExists();
        boolean boolean38 = userRepository35.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList39 = userRepository35.getAllUsers();
        userRepository29.saveAllUsers(userList39);
        java.util.Optional<com.reservation_system.model.User> userOptional42 = userRepository29.findByEmail("guest");
        java.util.List<com.reservation_system.model.User> userList43 = userRepository29.getAllUsers();
        userRepository1.saveAllUsers(userList43);
        com.reservation_system.services.AuthService authService45 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 99 + "'", int24 == 99);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 99 + "'", int25 == 99);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 99 + "'", int32 == 99);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(userOptional42);
        org.junit.Assert.assertNotNull(userList43);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "guest", "researcher", "Password1!", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getEmail();
        int int9 = researcher5.getID();
        java.lang.String str10 = researcher5.getPassword();
        java.lang.String str11 = researcher5.getUserType();
        researcher5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(99, "Password1!", "hi!", "faculty", false);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(36, "Researcher", "Researcher", "Guest", true);
        faculty5.setApproved(false);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "Andrew", "", "", true);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Password1!", "Faculty", "student", false);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "student", "Researcher", "faculty", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        boolean boolean9 = student5.isApproved();
        java.lang.Class<?> wildcardClass10 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Password1!", "Andrew", "headlabcoordinator", false);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository7.getAllUsers();
        boolean boolean9 = userRepository7.headLabCoordinatorExists();
        boolean boolean10 = userRepository7.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository7.getAllUsers();
        userRepository1.saveAllUsers(userList11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("guest");
        com.reservation_system.model.Guest guest20 = new com.reservation_system.model.Guest(1, "Guest", "Password1!", "Password1!", true);
        java.lang.String str21 = guest20.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest20);
        java.lang.String str23 = guest20.getPassword();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Guest" + "'", str21, "Guest");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Password1!" + "'", str23, "Password1!");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        boolean boolean12 = labManager9.isApproved();
        labManager9.setApproved(true);
        labManager9.setApproved(true);
        java.lang.Class<?> wildcardClass17 = labManager9.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "labmanager", "Password1!", "faculty", true);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getName();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        java.lang.String str11 = faculty5.getUserType();
        java.lang.String str12 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "student", "Faculty", "Guest", true);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getName();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        java.lang.String str12 = labManager11.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        int int14 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository1.findByEmail("Faculty");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(userOptional18);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "labmanager", "researcher", "Password1!", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "test@example.com", "faculty", "faculty", true);
        java.lang.String str6 = guest5.getName();
        guest5.setApproved(true);
        java.lang.Class<?> wildcardClass9 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "Faculty", "data/test-users.csv", "headlabcoordinator", false);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository6.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository6.getAllUsers();
        com.reservation_system.model.Faculty faculty14 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str15 = faculty14.getUserType();
        userRepository6.addUser((com.reservation_system.model.User) faculty14);
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository6.findByEmail("Student");
        int int19 = userRepository6.getNextID();
        java.util.List<com.reservation_system.model.User> userList20 = userRepository6.getAllUsers();
        userRepository1.saveAllUsers(userList20);
        boolean boolean22 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        int int3 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository5.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        boolean boolean11 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository13.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository13.getAllUsers();
        userRepository9.saveAllUsers(userList15);
        userRepository5.saveAllUsers(userList15);
        java.util.List<com.reservation_system.model.User> userList18 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList18);
        com.reservation_system.model.LabManager labManager25 = new com.reservation_system.model.LabManager(99, "Andrew", "guest", "labmanager", false);
        java.lang.String str26 = labManager25.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "labmanager" + "'", str26, "labmanager");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(101, "test@example.com", "researcher", "labmanager", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository5.saveAllUsers(userList11);
        userRepository1.saveAllUsers(userList11);
        com.reservation_system.services.AuthService authService14 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator20 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str21 = headLabCoordinator20.getUserType();
        int int22 = headLabCoordinator20.getID();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator20);
        com.reservation_system.services.AuthService authService24 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.Guest guest30 = new com.reservation_system.model.Guest(10, "researcher", "data/test-users.csv", "data/test-users.csv", true);
        int int31 = guest30.getID();
        userRepository1.addUser((com.reservation_system.model.User) guest30);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "headlabcoordinator" + "'", str21, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "guest", "WrongPassword1!", "Andrew", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "WrongPassword1!", "data/test-users.csv", "labmanager", true);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        int int12 = faculty11.getID();
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("guest");
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository17.getAllUsers();
        boolean boolean19 = userRepository17.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository21.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList23 = userRepository21.getAllUsers();
        userRepository17.saveAllUsers(userList23);
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository26.getAllUsers();
        boolean boolean28 = userRepository26.headLabCoordinatorExists();
        boolean boolean29 = userRepository26.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList30 = userRepository26.getAllUsers();
        userRepository17.saveAllUsers(userList30);
        boolean boolean32 = userRepository17.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService33 = new com.reservation_system.services.AuthService(userRepository17);
        com.reservation_system.model.User user40 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) '4', "guest", "Faculty", "researcher", false);
        userRepository17.addUser(user40);
        int int42 = userRepository17.getNextID();
        java.util.List<com.reservation_system.model.User> userList43 = userRepository17.getAllUsers();
        userRepository1.saveAllUsers(userList43);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(userList43);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "Guest", "Researcher", "test@example.com", false);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService10 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user13 = authService10.login("Student", "Password1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList7);
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        boolean boolean12 = userRepository10.headLabCoordinatorExists();
        boolean boolean13 = userRepository10.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList14);
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        boolean boolean18 = userRepository1.emailExists("Student");
        com.reservation_system.services.AuthService authService19 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList20 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList23 = userRepository22.getAllUsers();
        boolean boolean24 = userRepository22.headLabCoordinatorExists();
        boolean boolean25 = userRepository22.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList26 = userRepository22.getAllUsers();
        int int27 = userRepository22.getNextID();
        java.util.List<com.reservation_system.model.User> userList28 = userRepository22.getAllUsers();
        userRepository1.saveAllUsers(userList28);
        com.reservation_system.model.Student student35 = new com.reservation_system.model.Student((int) '4', "WrongPassword1!", "Student", "WrongPassword1!", false);
        java.lang.String str36 = student35.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student35);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Student" + "'", str36, "Student");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "WrongPassword1!", "Password1!", "Faculty", false);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "Researcher", "data/test-users.csv", "faculty", true);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "Researcher", "Faculty", "guest", false);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean7 = userRepository1.emailExists("researcher");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(99, "WrongPassword1!", "", "Password1!", true);
        java.lang.String str6 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "WrongPassword1!" + "'", str6, "WrongPassword1!");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository7.getAllUsers();
        boolean boolean9 = userRepository7.headLabCoordinatorExists();
        boolean boolean10 = userRepository7.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository7.getAllUsers();
        userRepository1.saveAllUsers(userList11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("guest");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository17.getAllUsers();
        com.reservation_system.services.AuthService authService19 = new com.reservation_system.services.AuthService(userRepository17);
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository17.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository17.getAllUsers();
        boolean boolean24 = userRepository17.emailExists("labmanager");
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository26.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList28 = userRepository26.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository30.getAllUsers();
        boolean boolean32 = userRepository30.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository34 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList35 = userRepository34.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList36 = userRepository34.getAllUsers();
        userRepository30.saveAllUsers(userList36);
        userRepository26.saveAllUsers(userList36);
        boolean boolean39 = userRepository26.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList40 = userRepository26.getAllUsers();
        userRepository17.saveAllUsers(userList40);
        java.util.List<com.reservation_system.model.User> userList42 = userRepository17.getAllUsers();
        userRepository1.saveAllUsers(userList42);
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList46 = userRepository45.getAllUsers();
        com.reservation_system.services.AuthService authService47 = new com.reservation_system.services.AuthService(userRepository45);
        com.reservation_system.services.AuthService authService48 = new com.reservation_system.services.AuthService(userRepository45);
        boolean boolean49 = userRepository45.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList50 = userRepository45.getAllUsers();
        userRepository1.saveAllUsers(userList50);
        com.reservation_system.repository.UserRepository userRepository53 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList54 = userRepository53.getAllUsers();
        boolean boolean55 = userRepository53.headLabCoordinatorExists();
        boolean boolean57 = userRepository53.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional59 = userRepository53.findByEmail("Faculty");
        int int60 = userRepository53.getNextID();
        com.reservation_system.repository.UserRepository userRepository62 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList63 = userRepository62.getAllUsers();
        com.reservation_system.services.AuthService authService64 = new com.reservation_system.services.AuthService(userRepository62);
        java.util.Optional<com.reservation_system.model.User> userOptional66 = userRepository62.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList67 = userRepository62.getAllUsers();
        userRepository53.saveAllUsers(userList67);
        userRepository1.saveAllUsers(userList67);
        int int70 = userRepository1.getNextID();
        int int71 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertNotNull(userList54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(userOptional59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertNotNull(userList63);
        org.junit.Assert.assertNotNull(userOptional66);
        org.junit.Assert.assertNotNull(userList67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 100 + "'", int71 == 100);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        java.lang.String str10 = faculty8.getName();
        boolean boolean11 = faculty8.requiresDepartmentApproval();
        faculty8.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str10 = faculty9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Student");
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        boolean boolean16 = userRepository1.emailExists("labmanager");
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository1.findByEmail("Password1!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userOptional18);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("labmanager");
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList12 = userRepository10.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository14 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository14.getAllUsers();
        boolean boolean16 = userRepository14.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository18.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList20 = userRepository18.getAllUsers();
        userRepository14.saveAllUsers(userList20);
        userRepository10.saveAllUsers(userList20);
        boolean boolean23 = userRepository10.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList24 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList24);
        java.util.List<com.reservation_system.model.User> userList26 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass27 = userList26.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository7.getAllUsers();
        boolean boolean9 = userRepository7.headLabCoordinatorExists();
        boolean boolean10 = userRepository7.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository7.getAllUsers();
        userRepository1.saveAllUsers(userList11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("guest");
        com.reservation_system.model.Guest guest20 = new com.reservation_system.model.Guest(1, "Guest", "Password1!", "Password1!", true);
        java.lang.String str21 = guest20.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest20);
        boolean boolean23 = guest20.isApproved();
        java.lang.String str24 = guest20.getName();
        java.lang.String str25 = guest20.getEmail();
        boolean boolean26 = guest20.isApproved();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Guest" + "'", str21, "Guest");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Guest" + "'", str24, "Guest");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Password1!" + "'", str25, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(99, "Researcher", "labmanager", "researcher", true);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "", "test@example.com", "hi!", false);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        int int6 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "test@example.com", "headlabcoordinator", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getUserType();
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean6 = labManager5.isApproved();
        labManager5.setApproved(true);
        java.lang.String str9 = labManager5.getName();
        labManager5.setApproved(false);
        java.lang.Class<?> wildcardClass12 = labManager5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        com.reservation_system.services.AuthService authService19 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean21 = userRepository1.emailExists("WrongPassword1!");
        boolean boolean23 = userRepository1.emailExists("data/test-users.csv");
        com.reservation_system.services.AuthService authService24 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Student", "faculty", "", false);
        int int6 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "researcher", "faculty", "faculty", true);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "Password1!", "headlabcoordinator", "test@example.com", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "faculty", "faculty", "researcher", true);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "", "", "WrongPassword1!", true);
        boolean boolean6 = faculty5.isApproved();
        boolean boolean7 = faculty5.isApproved();
        boolean boolean8 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator15 = new com.reservation_system.model.HeadLabCoordinator(100, "guest", "guest", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator15);
        int int17 = userRepository1.getNextID();
        boolean boolean18 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "data/test-users.csv", "WrongPassword1!", "faculty", true);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", (int) (short) 10, "headlabcoordinator", "student", "WrongPassword1!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(36, "Faculty", "Student", "faculty", false);
        java.lang.String str6 = guest5.getUserType();
        int int7 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "hi!", "Password1!", "WrongPassword1!", true);
        int int6 = faculty5.getID();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getUserType();
        boolean boolean9 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "guest", "faculty", "faculty", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) (byte) 1, "labmanager", "Researcher", "researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("WrongPassword1!");
        com.reservation_system.model.User user14 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) '4', "guest", "Faculty", "researcher", false);
        userRepository1.addUser(user14);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(user14);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "Password1!", "Faculty", "guest", false);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "labmanager", "Andrew", "researcher", true);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "data/test-users.csv", "researcher", "hi!", true);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("WrongPassword1!");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        int int10 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "Researcher", "Faculty", "researcher", true);
        boolean boolean6 = faculty5.isApproved();
        boolean boolean7 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "Student", "guest", "headlabcoordinator", true);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        int int19 = userRepository1.getNextID();
        int int20 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
        com.reservation_system.model.Researcher researcher27 = new com.reservation_system.model.Researcher((int) (byte) 0, "labmanager", "Andrew", "researcher", true);
        java.lang.String str28 = researcher27.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher27);
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList32 = userRepository31.getAllUsers();
        boolean boolean33 = userRepository31.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository35 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList36 = userRepository35.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList37 = userRepository35.getAllUsers();
        userRepository31.saveAllUsers(userList37);
        com.reservation_system.repository.UserRepository userRepository40 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList41 = userRepository40.getAllUsers();
        boolean boolean42 = userRepository40.headLabCoordinatorExists();
        boolean boolean43 = userRepository40.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList44 = userRepository40.getAllUsers();
        userRepository31.saveAllUsers(userList44);
        boolean boolean46 = userRepository31.headLabCoordinatorExists();
        boolean boolean48 = userRepository31.emailExists("Student");
        com.reservation_system.repository.UserRepository userRepository50 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList51 = userRepository50.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList52 = userRepository50.getAllUsers();
        com.reservation_system.services.AuthService authService53 = new com.reservation_system.services.AuthService(userRepository50);
        java.util.Optional<com.reservation_system.model.User> userOptional55 = userRepository50.findByEmail("faculty");
        com.reservation_system.services.AuthService authService56 = new com.reservation_system.services.AuthService(userRepository50);
        java.util.List<com.reservation_system.model.User> userList57 = userRepository50.getAllUsers();
        userRepository31.saveAllUsers(userList57);
        userRepository1.saveAllUsers(userList57);
        int int60 = userRepository1.getNextID();
        java.lang.Class<?> wildcardClass61 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(userList44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(userOptional55);
        org.junit.Assert.assertNotNull(userList57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 101 + "'", int60 == 101);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "", "Faculty", "headlabcoordinator", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean8 = userRepository7.headLabCoordinatorExists();
        int int9 = userRepository7.getNextID();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository7.getAllUsers();
        userRepository1.saveAllUsers(userList10);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList13 = userRepository1.getAllUsers();
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher20 = new com.reservation_system.model.Researcher((-1), "Guest", "data/test-users.csv", "", true);
        java.lang.String str21 = researcher20.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher20);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Researcher" + "'", str21, "Researcher");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        boolean boolean13 = userRepository1.emailExists("Researcher");
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList16 = userRepository15.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList17 = userRepository15.getAllUsers();
        com.reservation_system.services.AuthService authService18 = new com.reservation_system.services.AuthService(userRepository15);
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        com.reservation_system.services.AuthService authService22 = new com.reservation_system.services.AuthService(userRepository20);
        com.reservation_system.model.LabManager labManager28 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean29 = labManager28.isApproved();
        userRepository20.addUser((com.reservation_system.model.User) labManager28);
        com.reservation_system.model.Faculty faculty36 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository20.addUser((com.reservation_system.model.User) faculty36);
        int int38 = userRepository20.getNextID();
        int int39 = userRepository20.getNextID();
        java.util.List<com.reservation_system.model.User> userList40 = userRepository20.getAllUsers();
        userRepository15.saveAllUsers(userList40);
        java.util.List<com.reservation_system.model.User> userList42 = userRepository15.getAllUsers();
        userRepository1.saveAllUsers(userList42);
        int int44 = userRepository1.getNextID();
        boolean boolean45 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList48 = userRepository47.getAllUsers();
        boolean boolean49 = userRepository47.headLabCoordinatorExists();
        boolean boolean51 = userRepository47.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional53 = userRepository47.findByEmail("Faculty");
        int int54 = userRepository47.getNextID();
        int int55 = userRepository47.getNextID();
        int int56 = userRepository47.getNextID();
        java.util.List<com.reservation_system.model.User> userList57 = userRepository47.getAllUsers();
        userRepository1.saveAllUsers(userList57);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 101 + "'", int38 == 101);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 101 + "'", int39 == 101);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 101 + "'", int44 == 101);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(userOptional53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 101 + "'", int54 == 101);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 101 + "'", int55 == 101);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 101 + "'", int56 == 101);
        org.junit.Assert.assertNotNull(userList57);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "Andrew", "Faculty", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "Guest", "faculty", "headlabcoordinator", true);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository5.saveAllUsers(userList11);
        userRepository1.saveAllUsers(userList11);
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(98, "guest", "Researcher", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty19);
        boolean boolean22 = userRepository1.emailExists("test@example.com");
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        boolean boolean25 = userRepository1.emailExists("hi!");
        com.reservation_system.model.Researcher researcher31 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str32 = researcher31.getUserType();
        boolean boolean33 = researcher31.isApproved();
        researcher31.setApproved(true);
        java.lang.String str36 = researcher31.getEmail();
        boolean boolean37 = researcher31.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) researcher31);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Researcher" + "'", str32, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "student" + "'", str36, "student");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "", "researcher", "", false);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        int int19 = userRepository1.getNextID();
        int int20 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional23 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList24 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student30 = new com.reservation_system.model.Student((int) (byte) -1, "faculty", "Faculty", "student", false);
        userRepository1.addUser((com.reservation_system.model.User) student30);
        student30.setApproved(true);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "WrongPassword1!", "", "headlabcoordinator", false);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "Researcher", "Andrew", "researcher", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "Andrew", "labmanager", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(99, "Password1!", "labmanager", "Student", false);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getEmail();
        int int9 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "guest", "hi!", "data/test-users.csv", true);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "Password1!", "guest", "test@example.com", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Andrew");
        int int14 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(102, "researcher", "Researcher", "Guest", true);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(98, "test@example.com", "Guest", "", false);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository7.getAllUsers();
        boolean boolean9 = userRepository7.headLabCoordinatorExists();
        boolean boolean10 = userRepository7.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository7.getAllUsers();
        userRepository1.saveAllUsers(userList11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("guest");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        boolean boolean18 = userRepository1.emailExists("WrongPassword1!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        int int19 = userRepository1.getNextID();
        int int20 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository23 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean24 = userRepository23.headLabCoordinatorExists();
        int int25 = userRepository23.getNextID();
        com.reservation_system.repository.UserRepository userRepository27 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean28 = userRepository27.headLabCoordinatorExists();
        int int29 = userRepository27.getNextID();
        java.util.List<com.reservation_system.model.User> userList30 = userRepository27.getAllUsers();
        userRepository23.saveAllUsers(userList30);
        userRepository1.saveAllUsers(userList30);
        boolean boolean33 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 101 + "'", int29 == 101);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "headlabcoordinator", "data/test-users.csv", "WrongPassword1!", false);
        boolean boolean6 = guest5.isApproved();
        java.lang.String str7 = guest5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "Student", "headlabcoordinator", "Password1!", true);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        int int19 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService20 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user23 = authService20.login("faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "hi!", "Student", "Researcher", true);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "guest", "Andrew", "Faculty", false);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("Andrew");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("headlabcoordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional14);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "Student", "headlabcoordinator", "Faculty", true);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) (byte) 0, "Andrew", "Andrew", "student", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator10 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Faculty", "", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator10);
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService13 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean15 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.AuthService authService16 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user19 = authService16.login("headlabcoordinator", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        int int3 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository6.getAllUsers();
        boolean boolean8 = userRepository6.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository6);
        int int10 = userRepository6.getNextID();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository6.getAllUsers();
        boolean boolean12 = userRepository6.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList13 = userRepository6.getAllUsers();
        userRepository1.saveAllUsers(userList13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        java.lang.String str12 = labManager9.getUserType();
        java.lang.String str13 = labManager9.getUserType();
        java.lang.String str14 = labManager9.getEmail();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "labmanager" + "'", str13, "labmanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("hi!");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        boolean boolean10 = userRepository1.emailExists("faculty");
        boolean boolean12 = userRepository1.emailExists("hi!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "researcher", "guest", "Faculty", true);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository5.saveAllUsers(userList11);
        userRepository1.saveAllUsers(userList11);
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList16 = userRepository15.getAllUsers();
        com.reservation_system.services.AuthService authService17 = new com.reservation_system.services.AuthService(userRepository15);
        com.reservation_system.model.LabManager labManager23 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean24 = labManager23.isApproved();
        userRepository15.addUser((com.reservation_system.model.User) labManager23);
        com.reservation_system.repository.UserRepository userRepository27 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList28 = userRepository27.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList29 = userRepository27.getAllUsers();
        userRepository15.saveAllUsers(userList29);
        userRepository1.saveAllUsers(userList29);
        boolean boolean33 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean34 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "headlabcoordinator", "Student", "student", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        java.lang.String str8 = researcher5.getUserType();
        boolean boolean9 = researcher5.isApproved();
        java.lang.String str10 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Faculty", "", true);
        int int6 = headLabCoordinator5.getID();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean12 = userRepository11.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty18 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        userRepository11.addUser((com.reservation_system.model.User) faculty18);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator25 = new com.reservation_system.model.HeadLabCoordinator(10, "headlabcoordinator", "data/test-users.csv", "faculty", false);
        java.lang.String str26 = headLabCoordinator25.getEmail();
        java.lang.String str27 = headLabCoordinator25.getUserType();
        userRepository11.addUser((com.reservation_system.model.User) headLabCoordinator25);
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository30.getAllUsers();
        com.reservation_system.services.AuthService authService32 = new com.reservation_system.services.AuthService(userRepository30);
        com.reservation_system.model.LabManager labManager38 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean39 = labManager38.isApproved();
        userRepository30.addUser((com.reservation_system.model.User) labManager38);
        boolean boolean42 = userRepository30.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList43 = userRepository30.getAllUsers();
        userRepository11.saveAllUsers(userList43);
        java.util.Optional<com.reservation_system.model.User> userOptional46 = userRepository11.findByEmail("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository48 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList49 = userRepository48.getAllUsers();
        com.reservation_system.services.AuthService authService50 = new com.reservation_system.services.AuthService(userRepository48);
        int int51 = userRepository48.getNextID();
        com.reservation_system.model.Guest guest57 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str58 = guest57.getName();
        java.lang.String str59 = guest57.getName();
        java.lang.String str60 = guest57.getEmail();
        guest57.setApproved(true);
        userRepository48.addUser((com.reservation_system.model.User) guest57);
        java.util.List<com.reservation_system.model.User> userList64 = userRepository48.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList65 = userRepository48.getAllUsers();
        userRepository11.saveAllUsers(userList65);
        userRepository1.saveAllUsers(userList65);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "data/test-users.csv" + "'", str26, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "headlabcoordinator" + "'", str27, "headlabcoordinator");
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertNotNull(userOptional46);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 101 + "'", int51 == 101);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Password1!" + "'", str60, "Password1!");
        org.junit.Assert.assertNotNull(userList64);
        org.junit.Assert.assertNotNull(userList65);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "Guest", "", "Researcher", false);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        java.lang.String str10 = faculty8.getName();
        java.lang.String str11 = faculty8.getUserType();
        java.lang.String str12 = faculty8.getPassword();
        java.lang.String str13 = faculty8.getUserType();
        java.lang.String str14 = faculty8.getUserType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Faculty", "researcher", "Researcher", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "test@example.com", "Andrew", "researcher", false);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest11 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str12 = guest11.getEmail();
        java.lang.String str13 = guest11.getEmail();
        java.lang.String str14 = guest11.getUserType();
        boolean boolean15 = guest11.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) guest11);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Password1!" + "'", str13, "Password1!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("Andrew");
        boolean boolean10 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean12 = userRepository1.emailExists("data/test-users.csv");
        int int13 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "test@example.com", "guest", "data/test-users.csv", false);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "", "faculty", "test@example.com", true);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.isApproved();
        boolean boolean8 = student5.isApproved();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(102, "Researcher", "guest", "Guest", true);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Guest", "Password1!", "Password1!", true);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        java.lang.String str8 = guest5.getPassword();
        java.lang.String str9 = guest5.getPassword();
        boolean boolean10 = guest5.requiresDepartmentApproval();
        java.lang.String str11 = guest5.getUserType();
        boolean boolean12 = guest5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getEmail();
        researcher5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(101, "data/test-users.csv", "Andrew", "Faculty", true);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "headlabcoordinator", "data/test-users.csv", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("WrongPassword1!");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "data/test-users.csv", "WrongPassword1!", "Researcher", false);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) '4', "", "Researcher", "student", false);
        java.lang.String str7 = user6.getName();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getEmail();
        java.lang.String str7 = guest5.getEmail();
        boolean boolean8 = guest5.isApproved();
        java.lang.String str9 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        java.lang.String str12 = labManager11.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Faculty");
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository14 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository14.getAllUsers();
        com.reservation_system.services.AuthService authService16 = new com.reservation_system.services.AuthService(userRepository14);
        com.reservation_system.model.LabManager labManager22 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean23 = labManager22.isApproved();
        userRepository14.addUser((com.reservation_system.model.User) labManager22);
        com.reservation_system.services.AuthService authService25 = new com.reservation_system.services.AuthService(userRepository14);
        boolean boolean27 = userRepository14.emailExists("");
        java.util.List<com.reservation_system.model.User> userList28 = userRepository14.getAllUsers();
        userRepository1.saveAllUsers(userList28);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(101, "guest", "Guest", "hi!", true);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "Researcher", "", "hi!", true);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        int int6 = userRepository1.getNextID();
        int int7 = userRepository1.getNextID();
        int int8 = userRepository1.getNextID();
        java.lang.Class<?> wildcardClass9 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "guest", "headlabcoordinator", "labmanager", true);
    }
}
