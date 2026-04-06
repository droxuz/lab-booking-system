package com.reservation_system.Randoop.AuthService;

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
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "researcher", "researcher", "Password1!", false);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "Researcher", "Password1!", "guest", true);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("student");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("guest");
        java.lang.Class<?> wildcardClass12 = userOptional11.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        java.lang.Class<?> wildcardClass29 = student27.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "1) test0504(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("WrongPassword1!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userOptional17);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = authService19.login("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        student27.setApproved(true);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "2) test0507(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Faculty", "Faculty", "Guest", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "labmanager", "WrongPassword1!", "labmanager", false);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        com.reservation_system.model.Researcher researcher24 = new com.reservation_system.model.Researcher((int) (short) -1, "Andrew", "headlabcoordinator", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher24);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        boolean boolean13 = userRepository1.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService15 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = authService15.login("", "guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "", "", "guest", true);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Faculty", "", "Guest", false);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "headlabcoordinator", "Student", "student", true);
        java.lang.String str6 = researcher5.getUserType();
        int int7 = researcher5.getID();
        boolean boolean8 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        com.reservation_system.services.AuthService authService19 = new com.reservation_system.services.AuthService(userRepository17);
        com.reservation_system.model.LabManager labManager25 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean26 = labManager25.isApproved();
        userRepository17.addUser((com.reservation_system.model.User) labManager25);
        com.reservation_system.repository.UserRepository userRepository29 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList30 = userRepository29.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList31 = userRepository29.getAllUsers();
        userRepository17.saveAllUsers(userList31);
        userRepository1.saveAllUsers(userList31);
        java.util.List<com.reservation_system.model.User> userList34 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
// flaky "3) test0515(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", 36, "guest", "Andrew", "data/test-users.csv", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        com.reservation_system.services.AuthService authService13 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager19 = new com.reservation_system.model.LabManager((int) 'a', "Guest", "Faculty", "test@example.com", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager19);
        com.reservation_system.services.AuthService authService21 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean22 = userRepository1.headLabCoordinatorExists();
        int int23 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean26 = userRepository25.headLabCoordinatorExists();
        int int27 = userRepository25.getNextID();
        java.util.List<com.reservation_system.model.User> userList28 = userRepository25.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository30.getAllUsers();
        boolean boolean32 = userRepository30.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository34 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList35 = userRepository34.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList36 = userRepository34.getAllUsers();
        userRepository30.saveAllUsers(userList36);
        com.reservation_system.repository.UserRepository userRepository39 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList40 = userRepository39.getAllUsers();
        boolean boolean41 = userRepository39.headLabCoordinatorExists();
        boolean boolean42 = userRepository39.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList43 = userRepository39.getAllUsers();
        userRepository30.saveAllUsers(userList43);
        boolean boolean45 = userRepository30.headLabCoordinatorExists();
        boolean boolean47 = userRepository30.emailExists("Student");
        com.reservation_system.repository.UserRepository userRepository49 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList50 = userRepository49.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList51 = userRepository49.getAllUsers();
        com.reservation_system.services.AuthService authService52 = new com.reservation_system.services.AuthService(userRepository49);
        java.util.Optional<com.reservation_system.model.User> userOptional54 = userRepository49.findByEmail("faculty");
        com.reservation_system.services.AuthService authService55 = new com.reservation_system.services.AuthService(userRepository49);
        java.util.List<com.reservation_system.model.User> userList56 = userRepository49.getAllUsers();
        userRepository30.saveAllUsers(userList56);
        userRepository25.saveAllUsers(userList56);
        userRepository1.saveAllUsers(userList56);
        org.junit.Assert.assertNotNull(userList2);
// flaky "4) test0517(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 98 + "'", int23 == 98);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 98 + "'", int27 == 98);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertNotNull(userOptional54);
        org.junit.Assert.assertNotNull(userList56);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "WrongPassword1!", "faculty", "hi!", true);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str10 = faculty9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Student");
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("test@example.com");
        boolean boolean17 = userRepository1.emailExists("hi!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "WrongPassword1!", "student", "student", false);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "", "data/test-users.csv", "student", true);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("test@example.com");
        boolean boolean21 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userOptional20);
// flaky "5) test0522(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Student", "faculty", "", false);
        java.lang.String str6 = guest5.getUserType();
        guest5.setApproved(false);
        java.lang.String str9 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "WrongPassword1!", "Andrew", "labmanager", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        int int10 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "data/test-users.csv", "", "Guest", false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("faculty");
        int int9 = userRepository1.getNextID();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
// flaky "6) test0527(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
// flaky "1) test0527(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "researcher", "headlabcoordinator", "headlabcoordinator", false);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "student", "data/test-users.csv", "headlabcoordinator", true);
        int int6 = labManager5.getID();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getEmail();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-users.csv" + "'", str8, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("Andrew");
        com.reservation_system.model.Researcher researcher14 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean15 = researcher14.isApproved();
        java.lang.String str16 = researcher14.getEmail();
        java.lang.String str17 = researcher14.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher14);
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean21 = userRepository20.headLabCoordinatorExists();
        int int22 = userRepository20.getNextID();
        boolean boolean24 = userRepository20.emailExists("test@example.com");
        java.util.List<com.reservation_system.model.User> userList25 = userRepository20.getAllUsers();
        userRepository1.saveAllUsers(userList25);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Researcher" + "'", str17, "Researcher");
// flaky "7) test0530(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
// flaky "2) test0530(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "faculty", "student", "WrongPassword1!", true);
        int int6 = headLabCoordinator5.getID();
        int int7 = headLabCoordinator5.getID();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.Class<?> wildcardClass9 = headLabCoordinator5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean6 = labManager5.isApproved();
        labManager5.setApproved(true);
        java.lang.String str9 = labManager5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        boolean boolean11 = faculty5.requiresDepartmentApproval();
        java.lang.String str12 = faculty5.getUserType();
        java.lang.String str13 = faculty5.getPassword();
        java.lang.Class<?> wildcardClass14 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "labmanager" + "'", str13, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(36, "Student", "", "Researcher", false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "headlabcoordinator", "data/test-users.csv", "faculty", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "Researcher", "WrongPassword1!", "data/test-users.csv", false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        java.util.List<com.reservation_system.model.User> userList17 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService18 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        boolean boolean22 = userRepository20.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList25 = userRepository24.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList26 = userRepository24.getAllUsers();
        userRepository20.saveAllUsers(userList26);
        com.reservation_system.repository.UserRepository userRepository29 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList30 = userRepository29.getAllUsers();
        boolean boolean31 = userRepository29.headLabCoordinatorExists();
        boolean boolean32 = userRepository29.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList33 = userRepository29.getAllUsers();
        userRepository20.saveAllUsers(userList33);
        userRepository1.saveAllUsers(userList33);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList21);
// flaky "8) test0537(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList30);
// flaky "3) test0537(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
// flaky "1) test0537(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(userList33);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "labmanager", "faculty", "WrongPassword1!", true);
        faculty5.setApproved(false);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        java.lang.String str32 = researcher27.getPassword();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Researcher" + "'", str30, "Researcher");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Faculty" + "'", str32, "Faculty");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(35, "faculty", "Researcher", "labmanager", false);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "", "Password1!", "", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "Password1!", "guest", "Andrew", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        boolean boolean9 = faculty5.requiresDepartmentApproval();
        java.lang.String str10 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "headlabcoordinator", "Guest", "hi!", true);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) (byte) 100, "WrongPassword1!", "Password1!", "Guest", true);
        int int7 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        java.lang.String str6 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "Password1!", "test@example.com", "faculty", true);
        java.lang.String str6 = guest5.getEmail();
        java.lang.String str7 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        com.reservation_system.services.AuthService authService18 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user21 = authService18.login("", "WrongPassword1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
// flaky "9) test0550(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userList11);
// flaky "4) test0550(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "2) test0550(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Password1!", "faculty", "faculty", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "WrongPassword1!", "", "researcher", false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = authService5.login("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
// flaky "10) test0553(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "WrongPassword1!", "Andrew", "WrongPassword1!", true);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = authService14.login("", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
// flaky "11) test0555(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        headLabCoordinator5.setApproved(true);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
            com.reservation_system.model.User user17 = authService14.login("labmanager", "Password1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
// flaky "12) test0557(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "5) test0557(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user10 = authService7.login("WrongPassword1!", "WrongPassword1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean9 = userRepository1.emailExists("researcher");
        com.reservation_system.services.AuthService authService10 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "guest", "Student", "WrongPassword1!", false);
        java.lang.String str6 = labManager5.getEmail();
        boolean boolean7 = labManager5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "Andrew", "hi!", "guest", true);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "test@example.com", "data/test-users.csv", "Andrew", true);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        int int3 = userRepository1.getNextID();
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService6 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "test@example.com", "Andrew", "student", true);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "", "student", "", false);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "hi!", "test@example.com", "student", false);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        java.lang.String str10 = faculty8.getName();
        boolean boolean11 = faculty8.requiresDepartmentApproval();
        java.lang.String str12 = faculty8.getUserType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        int int22 = userRepository1.getNextID();
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService24 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.User user25 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "researcher", "Andrew", "Student", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "Researcher", "headlabcoordinator", "hi!", false);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "data/test-users.csv", "test@example.com", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(100, "guest", "guest", "Password1!", true);
        headLabCoordinator5.setApproved(false);
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) (byte) 100, "WrongPassword1!", "Password1!", "Guest", true);
        boolean boolean7 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "test@example.com", "Andrew", "labmanager", true);
        int int6 = student5.getID();
        boolean boolean7 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Andrew", "Guest", "Faculty", true);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "researcher", "Researcher", "", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        boolean boolean11 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        int int2 = userRepository1.getNextID();
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty((int) 'a', "data/test-users.csv", "faculty", "WrongPassword1!", false);
        faculty8.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "Guest", "Student", "test@example.com", false);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        java.util.Optional<com.reservation_system.model.User> userOptional96 = userRepository1.findByEmail("Faculty");
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
        org.junit.Assert.assertNotNull(userOptional96);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "", "Student", "researcher", false);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "Guest", "", "Andrew", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 36, "guest", "", "student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "guest", "", "guest", false);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService6 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user9 = authService6.login("Faculty", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        com.reservation_system.services.AuthService authService13 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager19 = new com.reservation_system.model.LabManager((int) 'a', "Guest", "Faculty", "test@example.com", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager19);
        com.reservation_system.services.AuthService authService21 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository23 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList24 = userRepository23.getAllUsers();
        com.reservation_system.services.AuthService authService25 = new com.reservation_system.services.AuthService(userRepository23);
        com.reservation_system.model.LabManager labManager31 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean32 = labManager31.isApproved();
        userRepository23.addUser((com.reservation_system.model.User) labManager31);
        boolean boolean35 = userRepository23.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList36 = userRepository23.getAllUsers();
        userRepository1.saveAllUsers(userList36);
        boolean boolean38 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        java.lang.Class<?> wildcardClass16 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(35, "test@example.com", "guest", "Student", false);
        headLabCoordinator5.setApproved(false);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "Researcher", "", "guest", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        boolean boolean20 = userRepository1.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional22 = userRepository1.findByEmail("researcher");
        boolean boolean24 = userRepository1.emailExists("researcher");
        com.reservation_system.model.Student student30 = new com.reservation_system.model.Student(0, "student", "Andrew", "guest", false);
        java.lang.String str31 = student30.getUserType();
        boolean boolean32 = student30.isApproved();
        java.lang.String str33 = student30.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student30);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Student" + "'", str31, "Student");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Student" + "'", str33, "Student");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        boolean boolean13 = userRepository1.emailExists("Researcher");
        int int14 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 98 + "'", int14 == 98);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-users.csv", (int) (short) 10, "Guest", "Faculty", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        int int6 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "headlabcoordinator", "data/test-users.csv", "labmanager", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "Guest", "Faculty", "researcher", false);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getEmail();
        boolean boolean10 = researcher5.isApproved();
        java.lang.String str11 = researcher5.getUserType();
        java.lang.String str12 = researcher5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "data/test-users.csv", "hi!", "student", true);
        java.lang.String str6 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-users.csv" + "'", str6, "data/test-users.csv");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "headlabcoordinator", "Student", "student", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "WrongPassword1!", "guest", "labmanager", false);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "Researcher", "Andrew", "researcher", false);
        java.lang.String str6 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
        boolean boolean89 = userRepository1.emailExists("Faculty");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("researcher");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass22 = userList21.getClass();
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
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user96 = authService93.login("Faculty", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        boolean boolean7 = userRepository1.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Student");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user20 = authService17.login("Researcher", "guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "headlabcoordinator", "Andrew", "test@example.com", false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = authService5.login("student", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        com.reservation_system.services.AuthService authService17 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("Guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userOptional19);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getEmail();
        int int9 = researcher5.getID();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        int int6 = userRepository1.getNextID();
        int int7 = userRepository1.getNextID();
        boolean boolean9 = userRepository1.emailExists("guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "hi!", "WrongPassword1!", "Student", false);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "", "faculty", "test@example.com", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(101, "faculty", "", "guest", false);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user7 = authService4.login("guest", "labmanager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "hi!", "", "", false);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty12 = new com.reservation_system.model.Faculty(100, "", "labmanager", "Guest", true);
        boolean boolean13 = faculty12.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) faculty12);
        boolean boolean16 = userRepository1.emailExists("Student");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "test@example.com", "headlabcoordinator", "Guest", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "data/test-users.csv", "Guest", "Guest", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user19 = authService16.login("faculty", "Student");
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
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator13 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "Guest", "", "", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator13);
        java.lang.String str15 = headLabCoordinator13.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "headlabcoordinator" + "'", str15, "headlabcoordinator");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "hi!", "Faculty", "WrongPassword1!", false);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "faculty", "Guest", "Faculty", false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        boolean boolean13 = userRepository1.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty20 = new com.reservation_system.model.Faculty((int) (byte) -1, "Researcher", "Andrew", "data/test-users.csv", true);
        boolean boolean21 = faculty20.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) faculty20);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "student", "data/test-users.csv", "headlabcoordinator", true);
        int int6 = labManager5.getID();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getUserType();
        boolean boolean9 = faculty5.requiresDepartmentApproval();
        java.lang.String str10 = faculty5.getName();
        java.lang.String str11 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        java.util.Optional<com.reservation_system.model.User> userOptional34 = userRepository1.findByEmail("hi!");
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList37 = userRepository36.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList38 = userRepository36.getAllUsers();
        com.reservation_system.model.Faculty faculty44 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str45 = faculty44.getUserType();
        userRepository36.addUser((com.reservation_system.model.User) faculty44);
        faculty44.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) faculty44);
        int int50 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Researcher" + "'", str25, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "student" + "'", str27, "student");
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertNotNull(userOptional32);
        org.junit.Assert.assertNotNull(userOptional34);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Faculty" + "'", str45, "Faculty");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 101 + "'", int50 == 101);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        boolean boolean7 = faculty5.isApproved();
        boolean boolean8 = faculty5.isApproved();
        java.lang.String str9 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator10 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Faculty", "", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator10);
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("Student");
        org.junit.Assert.assertNotNull(userList2);
// flaky "13) test0628(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "6) test0628(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userOptional15);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        boolean boolean10 = guest5.isApproved();
        java.lang.String str11 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "headlabcoordinator", "hi!", "hi!", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        labManager5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "Password1!", "Andrew", "labmanager", false);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "Researcher", "Andrew", "student", false);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getPassword();
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        java.lang.String str10 = researcher5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        boolean boolean15 = userRepository1.emailExists("Student");
        boolean boolean17 = userRepository1.emailExists("WrongPassword1!");
        boolean boolean18 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Guest", "Password1!", "Password1!", true);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        java.lang.String str8 = guest5.getPassword();
        java.lang.String str9 = guest5.getPassword();
        boolean boolean10 = guest5.requiresDepartmentApproval();
        java.lang.String str11 = guest5.getUserType();
        boolean boolean12 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "researcher" + "'", str9, "researcher");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "student", "data/test-users.csv", "headlabcoordinator", true);
        int int6 = labManager5.getID();
        java.lang.String str7 = labManager5.getUserType();
        int int8 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Researcher", "student", "Faculty", false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "faculty", "student", "Andrew", false);
        java.lang.String str6 = guest5.getPassword();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass8 = guest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        boolean boolean8 = headLabCoordinator5.isApproved();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        java.lang.String str11 = headLabCoordinator5.getEmail();
        java.lang.String str12 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Andrew" + "'", str11, "Andrew");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "headlabcoordinator" + "'", str12, "headlabcoordinator");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(99, "faculty", "student", "hi!", false);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "", "faculty", "", false);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "researcher", "researcher", "Password1!", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        boolean boolean8 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        int int9 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList12 = userRepository11.getAllUsers();
        boolean boolean13 = userRepository11.headLabCoordinatorExists();
        boolean boolean14 = userRepository11.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator20 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Faculty", "", true);
        userRepository11.addUser((com.reservation_system.model.User) headLabCoordinator20);
        boolean boolean22 = userRepository11.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList23 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList23);
        int int25 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList8);
// flaky "14) test0646(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userList23);
// flaky "7) test0646(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(101, "", "Password1!", "guest", true);
        java.lang.String str6 = researcher5.getName();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "test@example.com", "Student", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "", "hi!", "Student", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "", "guest", "Password1!", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "researcher", "Researcher", "", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 35, "Student", "headlabcoordinator", "Faculty", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
        java.util.List<com.reservation_system.model.User> userList17 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("labmanager");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userOptional19);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("labmanager");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Student");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
// flaky "15) test0654(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (short) 10, "headlabcoordinator", "researcher", "Faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "hi!", "labmanager", "Guest", false);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.emailExists("WrongPassword1!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        com.reservation_system.repository.UserRepository userRepository61 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList62 = userRepository61.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList63 = userRepository61.getAllUsers();
        com.reservation_system.model.Faculty faculty69 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str70 = faculty69.getUserType();
        userRepository61.addUser((com.reservation_system.model.User) faculty69);
        boolean boolean72 = faculty69.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) faculty69);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "16) test0658(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 102 + "'", int19 == 102);
// flaky "8) test0658(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 102 + "'", int20 == 102);
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
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertNotNull(userList63);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Faculty" + "'", str70, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
        boolean boolean15 = userRepository1.emailExists("Student");
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("data/test-users.csv");
        int int18 = userRepository1.getNextID();
        com.reservation_system.model.Faculty faculty24 = new com.reservation_system.model.Faculty(101, "Guest", "hi!", "data/test-users.csv", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty24);
        java.util.Optional<com.reservation_system.model.User> userOptional27 = userRepository1.findByEmail("headlabcoordinator");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userOptional17);
// flaky "17) test0659(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 102 + "'", int18 == 102);
        org.junit.Assert.assertNotNull(userOptional27);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "Student", "headlabcoordinator", "WrongPassword1!", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        boolean boolean8 = headLabCoordinator5.isApproved();
        headLabCoordinator5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        com.reservation_system.services.AuthService authService34 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user37 = authService34.login("guest", "Student");
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
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "test@example.com", "researcher", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(101, "Faculty", "Faculty", "WrongPassword1!", true);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "Student", "Password1!", "researcher", true);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "researcher", "Password1!", "", false);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        boolean boolean20 = userRepository1.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional22 = userRepository1.findByEmail("researcher");
        int int23 = userRepository1.getNextID();
        com.reservation_system.model.LabManager labManager29 = new com.reservation_system.model.LabManager((int) ' ', "test@example.com", "Password1!", "guest", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager29);
        java.lang.String str31 = labManager29.getEmail();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 102 + "'", int23 == 102);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Password1!" + "'", str31, "Password1!");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) (byte) 1, "Andrew", "student", "hi!", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
        java.lang.String str44 = faculty39.getPassword();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Faculty" + "'", str40, "Faculty");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Faculty" + "'", str41, "Faculty");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Faculty" + "'", str42, "Faculty");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "student" + "'", str44, "student");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("labmanager");
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = authService9.login("Student", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
// flaky "18) test0669(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "Guest", "researcher", "Password1!", true);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Password1!", "", "Faculty", true);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 99, "", "data/test-users.csv", "labmanager", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "Faculty", "faculty", "WrongPassword1!", true);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(36, "Andrew", "", "guest", true);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Guest", "headlabcoordinator", "researcher", false);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        java.lang.String str25 = researcher18.getName();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Researcher" + "'", str19, "Researcher");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Researcher" + "'", str20, "Researcher");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Researcher" + "'", str21, "Researcher");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Password1!" + "'", str25, "Password1!");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "hi!", "test@example.com", "student", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.Class<?> wildcardClass7 = guest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "labmanager", "researcher", "student", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "Student", "headlabcoordinator", "data/test-users.csv", false);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) (short) 0, "hi!", "hi!", "labmanager", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) (byte) 0, "researcher", "hi!", "Password1!", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        com.reservation_system.services.AuthService authService13 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager19 = new com.reservation_system.model.LabManager((int) 'a', "Guest", "Faculty", "test@example.com", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager19);
        java.lang.String str21 = labManager19.getEmail();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (int) (byte) -1, "", "faculty", "Faculty", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Guest", "Password1!", "Password1!", true);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass8 = guest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "Researcher", "faculty", "Andrew", true);
        int int6 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "faculty", "Password1!", "guest", true);
        java.lang.Class<?> wildcardClass6 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) (short) 1, "test@example.com", "labmanager", "student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Faculty", "Guest", "", false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Andrew", "test@example.com", "student", true);
        int int6 = guest5.getID();
        guest5.setApproved(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.User user7 = null; // flaky "19) test0690(com.reservation_system.Randoop.AuthService.RegressionTest1)": authService4.login("guest", "Researcher");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "9) test0690(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertNotNull(user7);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Researcher", "Andrew", "data/test-users.csv", true);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        int int6 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 102 + "'", int6 == 102);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "test@example.com", "Password1!", "guest", true);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "hi!", "data/test-users.csv", "test@example.com", false);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 99, "Faculty", "labmanager", "headlabcoordinator", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "Guest", "Password1!", "", true);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "headlabcoordinator", "guest", "data/test-users.csv", false);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "faculty", "Password1!", "guest", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "student", "guest", "headlabcoordinator", false);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str10 = faculty9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("Guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userOptional15);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(99, "test@example.com", "student", "guest", false);
        boolean boolean6 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "researcher", "Student", "Andrew", false);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (byte) 100, "Password1!", "Faculty", "student", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(101, "WrongPassword1!", "student", "", true);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "Andrew", "", "Faculty", false);
        boolean boolean6 = guest5.isApproved();
        boolean boolean7 = guest5.isApproved();
        int int8 = guest5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "data/test-users.csv", "faculty", true);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "student", "Researcher", "faculty", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.requiresDepartmentApproval();
        java.lang.String str8 = student5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "hi!", "guest", "Student", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        com.reservation_system.services.AuthService authService34 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean35 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
// flaky "20) test0709(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
// flaky "10) test0709(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "student", "data/test-users.csv", "guest", true);
        guest5.setApproved(true);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "Password1!", "Guest", "Guest", true);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "Faculty", "Password1!", "Student", true);
        int int6 = labManager5.getID();
        java.lang.String str7 = labManager5.getEmail();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "Password1!", "WrongPassword1!", "student", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        researcher5.setApproved(false);
        java.lang.String str10 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "researcher", "student", "headlabcoordinator", true);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "researcher", "Faculty", "Andrew", true);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(99, "labmanager", "data/test-users.csv", "Student", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-users.csv" + "'", str6, "data/test-users.csv");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(99, "Password1!", "labmanager", "Student", false);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository26.getAllUsers();
        com.reservation_system.services.AuthService authService28 = new com.reservation_system.services.AuthService(userRepository26);
        com.reservation_system.model.LabManager labManager34 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean35 = labManager34.isApproved();
        userRepository26.addUser((com.reservation_system.model.User) labManager34);
        com.reservation_system.model.Faculty faculty42 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository26.addUser((com.reservation_system.model.User) faculty42);
        com.reservation_system.services.AuthService authService44 = new com.reservation_system.services.AuthService(userRepository26);
        boolean boolean46 = userRepository26.emailExists("WrongPassword1!");
        java.util.List<com.reservation_system.model.User> userList47 = userRepository26.getAllUsers();
        userRepository1.saveAllUsers(userList47);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Researcher" + "'", str19, "Researcher");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Researcher" + "'", str20, "Researcher");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Researcher" + "'", str21, "Researcher");
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(userList47);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
            com.reservation_system.model.User user20 = authService17.login("WrongPassword1!", "student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
// flaky "21) test0719(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
// flaky "11) test0719(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList11);
// flaky "3) test0719(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "1) test0719(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Researcher", "", "headlabcoordinator", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(99, "Guest", "Password1!", "headlabcoordinator", false);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) ' ', "", "faculty", "Guest", false);
        java.lang.String str7 = user6.getEmail();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        com.reservation_system.model.Guest guest39 = new com.reservation_system.model.Guest(97, "Andrew", "", "Faculty", false);
        boolean boolean40 = guest39.isApproved();
        java.lang.String str41 = guest39.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest39);
        guest39.setApproved(false);
        java.lang.String str45 = guest39.getUserType();
        boolean boolean46 = guest39.isApproved();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
// flaky "22) test0723(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Guest" + "'", str41, "Guest");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Guest" + "'", str45, "Guest");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(36, "faculty", "data/test-users.csv", "student", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "headlabcoordinator", "", "hi!", false);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "researcher", "", "", false);
        researcher5.setApproved(false);
        boolean boolean8 = researcher5.isApproved();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "headlabcoordinator", "", "hi!", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(101, "Andrew", "Researcher", "faculty", false);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
        int int20 = userRepository1.getNextID();
        boolean boolean21 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList22 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "23) test0729(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList18);
// flaky "12) test0729(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 98 + "'", int20 == 98);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) '#', "Researcher", "Guest", "student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        java.util.List<com.reservation_system.model.User> userList17 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList18 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager24 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean25 = labManager24.isApproved();
        labManager24.setApproved(true);
        java.lang.String str28 = labManager24.getUserType();
        java.lang.String str29 = labManager24.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager24);
        com.reservation_system.model.LabManager labManager36 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str37 = labManager36.getEmail();
        java.lang.String str38 = labManager36.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager36);
        java.lang.String str40 = labManager36.getUserType();
        java.lang.String str41 = labManager36.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "labmanager" + "'", str28, "labmanager");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "labmanager" + "'", str29, "labmanager");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "labmanager" + "'", str38, "labmanager");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "labmanager" + "'", str40, "labmanager");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "labmanager" + "'", str41, "labmanager");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(99, "researcher", "headlabcoordinator", "", false);
        labManager5.setApproved(false);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "WrongPassword1!", "", "hi!", true);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        com.reservation_system.model.Faculty faculty91 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str92 = faculty91.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty91);
        com.reservation_system.services.AuthService authService94 = new com.reservation_system.services.AuthService(userRepository1);
        java.lang.Class<?> wildcardClass95 = authService94.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Faculty" + "'", str92, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Password1!", "", "headlabcoordinator", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(100, "guest", "guest", "Password1!", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "", "", "Password1!", true);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = authService3.login("headlabcoordinator", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean7 = userRepository1.emailExists("researcher");
        com.reservation_system.services.AuthService authService8 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean10 = userRepository1.emailExists("guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        int int22 = userRepository1.getNextID();
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService24 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean26 = userRepository1.emailExists("Password1!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "test@example.com", "Faculty", "Faculty", false);
        headLabCoordinator5.setApproved(false);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "Password1!", "", "labmanager", false);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 0, "Guest", "faculty", "guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "researcher", "", "", false);
        int int6 = researcher5.getID();
        int int7 = researcher5.getID();
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "faculty", "headlabcoordinator", "Faculty", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "Andrew", "labmanager", "researcher", true);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "labmanager", "Guest", "", false);
        java.lang.String str6 = faculty5.getPassword();
        faculty5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
        int int17 = userRepository1.getNextID();
        boolean boolean18 = userRepository1.headLabCoordinatorExists();
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 98 + "'", int17 == 98);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "labmanager", "faculty", "WrongPassword1!", true);
        java.lang.String str6 = faculty5.getPassword();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "WrongPassword1!" + "'", str6, "WrongPassword1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "Student", "hi!", "Andrew", true);
        headLabCoordinator5.setApproved(true);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "Password1!", "guest", "Student", false);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "guest", "Student", "WrongPassword1!", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "WrongPassword1!" + "'", str7, "WrongPassword1!");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
        com.reservation_system.services.AuthService authService17 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.User user24 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) '4', "guest", "Faculty", "researcher", false);
        userRepository1.addUser(user24);
        com.reservation_system.services.AuthService authService26 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user29 = authService26.login("WrongPassword1!", "WrongPassword1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(user24);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager15 = new com.reservation_system.model.LabManager((int) (short) -1, "guest", "Student", "WrongPassword1!", false);
        java.lang.String str16 = labManager15.getUserType();
        boolean boolean17 = labManager15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) labManager15);
        com.reservation_system.model.Faculty faculty24 = new com.reservation_system.model.Faculty((int) (byte) 1, "WrongPassword1!", "Andrew", "student", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty24);
        boolean boolean27 = userRepository1.emailExists("WrongPassword1!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "labmanager" + "'", str16, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "Guest", "", "Andrew", false);
        java.lang.String str6 = headLabCoordinator5.getName();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        int int8 = headLabCoordinator5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        boolean boolean15 = userRepository1.emailExists("Student");
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository1.getAllUsers();
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str26 = guest25.getEmail();
        java.lang.String str27 = guest25.getEmail();
        java.lang.String str28 = guest25.getUserType();
        java.lang.String str29 = guest25.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest25);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Password1!" + "'", str26, "Password1!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Password1!" + "'", str27, "Password1!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Guest" + "'", str28, "Guest");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Guest" + "'", str29, "Guest");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "data/test-users.csv", "faculty", "WrongPassword1!", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getPassword();
        java.lang.String str8 = faculty5.getEmail();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "WrongPassword1!" + "'", str7, "WrongPassword1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Researcher", "WrongPassword1!", "test@example.com", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        com.reservation_system.model.Faculty faculty25 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str26 = faculty25.getName();
        java.lang.String str27 = faculty25.getName();
        java.lang.String str28 = faculty25.getUserType();
        java.lang.String str29 = faculty25.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "headlabcoordinator" + "'", str26, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "headlabcoordinator" + "'", str27, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Faculty" + "'", str28, "Faculty");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Faculty" + "'", str29, "Faculty");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        boolean boolean9 = faculty5.requiresDepartmentApproval();
        boolean boolean10 = faculty5.requiresDepartmentApproval();
        faculty5.setApproved(false);
        java.lang.String str13 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        com.reservation_system.model.Researcher researcher28 = new com.reservation_system.model.Researcher((int) (byte) 0, "labmanager", "Andrew", "researcher", true);
        java.lang.String str29 = researcher28.getUserType();
        boolean boolean30 = researcher28.requiresDepartmentApproval();
        researcher28.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) researcher28);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Researcher" + "'", str29, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "headlabcoordinator", "", "researcher", false);
        java.lang.String str6 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "test@example.com", "Researcher", "WrongPassword1!", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "labmanager", "Andrew", "researcher", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass8 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "faculty", "Student", "faculty", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        java.util.Optional<com.reservation_system.model.User> userOptional25 = userRepository1.findByEmail("Guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userOptional25);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        boolean boolean11 = faculty5.requiresDepartmentApproval();
        java.lang.String str12 = faculty5.getUserType();
        java.lang.String str13 = faculty5.getUserType();
        java.lang.String str14 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 36, "data/test-users.csv", "student", "student", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "Student", "Student", "test@example.com", false);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("student");
        com.reservation_system.services.AuthService authService10 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.Student student16 = new com.reservation_system.model.Student(0, "student", "Andrew", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) student16);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        boolean boolean13 = userRepository1.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService15 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = authService15.login("faculty", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-users.csv", "Andrew", "", false);
        student5.setApproved(true);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Password1!", "Student", "Student", false);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "test@example.com", "researcher", "headlabcoordinator", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getEmail();
        java.lang.String str7 = guest5.getEmail();
        guest5.setApproved(false);
        java.lang.String str10 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Password1!" + "'", str10, "Password1!");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "data/test-users.csv", "Guest", "Faculty", false);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "Researcher", "Student", "guest", true);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        java.util.List<com.reservation_system.model.User> userList17 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "Andrew", "data/test-users.csv", "headlabcoordinator", true);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean7 = userRepository1.emailExists("researcher");
        com.reservation_system.services.AuthService authService8 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.Researcher researcher14 = new com.reservation_system.model.Researcher(35, "headlabcoordinator", "data/test-users.csv", "headlabcoordinator", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher14);
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        boolean boolean18 = userRepository1.emailExists("Student");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "data/test-users.csv" + "'", str7, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "", "guest", "Password1!", false);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        java.lang.Class<?> wildcardClass15 = userOptional14.getClass();
        org.junit.Assert.assertNotNull(userList2);
// flaky "24) test0783(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "Researcher", "", "Password1!", true);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "labmanager", "test@example.com", "guest", false);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 99, "faculty", "data/test-users.csv", "faculty", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "labmanager", "labmanager", "Guest", true);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Researcher", "", "Andrew", true);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) (byte) 100, "guest", "labmanager", "labmanager", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "Faculty", "", "researcher", true);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "Faculty", "Guest", "guest", false);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "Password1!", "student", "Andrew", true);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "Faculty", "guest", "hi!", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 98, "WrongPassword1!", "faculty", "WrongPassword1!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getName();
        boolean boolean9 = faculty5.requiresDepartmentApproval();
        boolean boolean10 = faculty5.requiresDepartmentApproval();
        java.lang.String str11 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getUserType();
        java.lang.String str11 = guest5.getUserType();
        java.lang.String str12 = guest5.getUserType();
        guest5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository1.findByEmail("WrongPassword1!");
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user32 = authService29.login("researcher", "test@example.com");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "faculty", "student", "WrongPassword1!", true);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        int int9 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "Student", "headlabcoordinator", "WrongPassword1!", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        boolean boolean8 = headLabCoordinator5.isApproved();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "Researcher", "WrongPassword1!", "test@example.com", true);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "test@example.com", "labmanager", "researcher", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "Password1!", "hi!", "", false);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "Researcher", "Andrew", "labmanager", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getEmail();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getPassword();
        java.lang.String str11 = researcher5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getEmail();
        boolean boolean9 = researcher5.isApproved();
        java.lang.String str10 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) (short) 100, "", "guest", "", true);
        int int7 = user6.getID();
        boolean boolean8 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "researcher", "test@example.com", "", true);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "WrongPassword1!", "labmanager", "student", false);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        java.util.List<com.reservation_system.model.User> userList17 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList18 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager24 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean25 = labManager24.isApproved();
        labManager24.setApproved(true);
        java.lang.String str28 = labManager24.getUserType();
        java.lang.String str29 = labManager24.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager24);
        com.reservation_system.model.LabManager labManager36 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str37 = labManager36.getEmail();
        java.lang.String str38 = labManager36.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager36);
        com.reservation_system.services.AuthService authService40 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "labmanager" + "'", str28, "labmanager");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "labmanager" + "'", str29, "labmanager");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "labmanager" + "'", str38, "labmanager");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) (byte) 1, "faculty", "Andrew", "hi!", true);
        user6.setApproved(false);
        int int9 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        java.util.List<com.reservation_system.model.User> userList17 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService18 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user21 = authService18.login("guest", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "headlabcoordinator", "data/test-users.csv", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(false);
        java.lang.String str9 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "data/test-users.csv" + "'", str9, "data/test-users.csv");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "Researcher", "Student", "guest", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "student", "headlabcoordinator", "data/test-users.csv", false);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getEmail();
        guest5.setApproved(true);
        guest5.setApproved(true);
        int int13 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        boolean boolean17 = userRepository1.emailExists("guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userList15);
// flaky "25) test0817(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "Password1!", "Andrew", "headlabcoordinator", false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "data/test-users.csv", "student", "guest", true);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "headlabcoordinator", "", "", true);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", (int) (short) 1, "student", "Faculty", "Researcher", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user10 = authService7.login("labmanager", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "guest", "researcher", "Password1!", true);
        int int6 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        com.reservation_system.services.AuthService authService17 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.User user24 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) '4', "guest", "Faculty", "researcher", false);
        userRepository1.addUser(user24);
        int int26 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator32 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "Researcher", "guest", "researcher", true);
        java.lang.String str33 = headLabCoordinator32.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator32);
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList37 = userRepository36.getAllUsers();
        com.reservation_system.services.AuthService authService38 = new com.reservation_system.services.AuthService(userRepository36);
        com.reservation_system.services.AuthService authService39 = new com.reservation_system.services.AuthService(userRepository36);
        com.reservation_system.services.AuthService authService40 = new com.reservation_system.services.AuthService(userRepository36);
        com.reservation_system.repository.UserRepository userRepository42 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean43 = userRepository42.headLabCoordinatorExists();
        int int44 = userRepository42.getNextID();
        java.util.List<com.reservation_system.model.User> userList45 = userRepository42.getAllUsers();
        userRepository36.saveAllUsers(userList45);
        java.util.List<com.reservation_system.model.User> userList47 = userRepository36.getAllUsers();
        userRepository1.saveAllUsers(userList47);
        boolean boolean49 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(user24);
// flaky "26) test0824(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 101 + "'", int26 == 101);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "headlabcoordinator" + "'", str33, "headlabcoordinator");
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 101 + "'", int44 == 101);
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str10 = faculty9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        boolean boolean12 = faculty9.requiresDepartmentApproval();
        java.lang.String str13 = faculty9.getUserType();
        java.lang.String str14 = faculty9.getEmail();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", 36, "guest", "hi!", "data/test-users.csv", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Guest", "Password1!", "Password1!", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getPassword();
        java.lang.String str8 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Student", "Researcher", "Andrew", false);
        java.lang.String str6 = labManager5.getUserType();
        int int7 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager15 = new com.reservation_system.model.LabManager((int) (short) -1, "guest", "Student", "WrongPassword1!", false);
        java.lang.String str16 = labManager15.getUserType();
        boolean boolean17 = labManager15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) labManager15);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        boolean boolean21 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "labmanager" + "'", str16, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "data/test-users.csv", "headlabcoordinator", "hi!", true);
        java.lang.String str6 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-users.csv" + "'", str6, "data/test-users.csv");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        int int9 = researcher5.getID();
        boolean boolean10 = researcher5.isApproved();
        java.lang.String str11 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "Researcher", "Andrew", "labmanager", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        student5.setApproved(true);
        int int10 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.AuthService authService1 = new com.reservation_system.services.AuthService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user4 = authService1.login("researcher", "student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.repository.UserRepository.findByEmail(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Student", "test@example.com", "data/test-users.csv", true);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        java.util.Optional<com.reservation_system.model.User> userOptional28 = userRepository1.findByEmail("");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(userOptional28);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
        com.reservation_system.model.Researcher researcher21 = new com.reservation_system.model.Researcher(35, "headlabcoordinator", "data/test-users.csv", "headlabcoordinator", false);
        java.lang.String str22 = researcher21.getUserType();
        researcher21.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) researcher21);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Researcher" + "'", str22, "Researcher");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "", "Andrew", "headlabcoordinator", false);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(101, "guest", "", "Faculty", true);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        com.reservation_system.services.AuthService authService17 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.User user24 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) '4', "guest", "Faculty", "researcher", false);
        userRepository1.addUser(user24);
        int int26 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator32 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "Researcher", "guest", "researcher", true);
        java.lang.String str33 = headLabCoordinator32.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator32);
        java.util.Optional<com.reservation_system.model.User> userOptional36 = userRepository1.findByEmail("student");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 101 + "'", int26 == 101);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "headlabcoordinator" + "'", str33, "headlabcoordinator");
        org.junit.Assert.assertNotNull(userOptional36);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        researcher5.setApproved(true);
        int int10 = researcher5.getID();
        java.lang.String str11 = researcher5.getUserType();
        java.lang.String str12 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "data/test-users.csv", "test@example.com", "labmanager", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "Researcher", "Andrew", "researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList23 = userRepository22.getAllUsers();
        boolean boolean24 = userRepository22.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository26.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList28 = userRepository26.getAllUsers();
        userRepository22.saveAllUsers(userList28);
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean32 = userRepository31.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository34 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList35 = userRepository34.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList36 = userRepository34.getAllUsers();
        userRepository31.saveAllUsers(userList36);
        userRepository22.saveAllUsers(userList36);
        userRepository1.saveAllUsers(userList36);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userList36);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        java.lang.String str12 = labManager11.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService15 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = authService15.login("labmanager", "headlabcoordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "student", "guest", "researcher", false);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        boolean boolean18 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        java.util.Optional<com.reservation_system.model.User> userOptional33 = userRepository1.findByEmail("WrongPassword1!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
// flaky "27) test0847(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userOptional33);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        boolean boolean7 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator10 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Faculty", "", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator10);
        com.reservation_system.model.LabManager labManager17 = new com.reservation_system.model.LabManager((int) '4', "hi!", "labmanager", "Student", false);
        java.lang.String str18 = labManager17.getEmail();
        java.lang.String str19 = labManager17.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager17);
        org.junit.Assert.assertNotNull(userList2);
// flaky "28) test0849(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "13) test0849(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
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
        int int24 = researcher21.getID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "29) test0850(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) ' ', "Password1!", "", "student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        com.reservation_system.model.Faculty faculty23 = new com.reservation_system.model.Faculty((int) (byte) -1, "", "", "WrongPassword1!", true);
        faculty23.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) faculty23);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky "30) test0852(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 98 + "'", int17 == 98);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "Andrew", "labmanager", "WrongPassword1!", false);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        int int14 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "31) test0854(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "14) test0854(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 98 + "'", int14 == 98);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Password1!", "Guest", "guest", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getPassword();
        student5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "student", "", "Guest", false);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "Guest", "Student", "WrongPassword1!", false);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getUserType();
        java.lang.Class<?> wildcardClass8 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "WrongPassword1!" + "'", str6, "WrongPassword1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager15 = new com.reservation_system.model.LabManager((int) (short) -1, "guest", "Student", "WrongPassword1!", false);
        java.lang.String str16 = labManager15.getUserType();
        boolean boolean17 = labManager15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) labManager15);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator24 = new com.reservation_system.model.HeadLabCoordinator(98, "guest", "guest", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator24);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
// flaky "32) test0858(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "labmanager" + "'", str16, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "labmanager", "faculty", "WrongPassword1!", true);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "Password1!", "Researcher", "Password1!", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("labmanager");
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = authService9.login("researcher", "student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) (byte) 1, "headlabcoordinator", "guest", "Faculty", true);
        java.lang.String str7 = user6.getName();
        boolean boolean8 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        java.lang.String str17 = headLabCoordinator15.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "headlabcoordinator" + "'", str17, "headlabcoordinator");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList5 = userRepository4.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList6 = userRepository4.getAllUsers();
        userRepository1.saveAllUsers(userList6);
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        java.lang.Class<?> wildcardClass9 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (int) '#', "guest", "", "Student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("researcher");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
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
        com.reservation_system.services.AuthService authService36 = new com.reservation_system.services.AuthService(userRepository23);
        int int37 = userRepository23.getNextID();
        com.reservation_system.repository.UserRepository userRepository39 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList40 = userRepository39.getAllUsers();
        com.reservation_system.services.AuthService authService41 = new com.reservation_system.services.AuthService(userRepository39);
        com.reservation_system.model.LabManager labManager47 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean48 = labManager47.isApproved();
        userRepository39.addUser((com.reservation_system.model.User) labManager47);
        com.reservation_system.repository.UserRepository userRepository51 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList52 = userRepository51.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList53 = userRepository51.getAllUsers();
        userRepository39.saveAllUsers(userList53);
        userRepository23.saveAllUsers(userList53);
        com.reservation_system.repository.UserRepository userRepository57 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList58 = userRepository57.getAllUsers();
        com.reservation_system.services.AuthService authService59 = new com.reservation_system.services.AuthService(userRepository57);
        int int60 = userRepository57.getNextID();
        boolean boolean61 = userRepository57.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository63 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList64 = userRepository63.getAllUsers();
        boolean boolean65 = userRepository63.headLabCoordinatorExists();
        boolean boolean66 = userRepository63.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList67 = userRepository63.getAllUsers();
        userRepository57.saveAllUsers(userList67);
        java.util.Optional<com.reservation_system.model.User> userOptional70 = userRepository57.findByEmail("guest");
        java.util.List<com.reservation_system.model.User> userList71 = userRepository57.getAllUsers();
        userRepository23.saveAllUsers(userList71);
        userRepository1.saveAllUsers(userList71);
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
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 101 + "'", int37 == 101);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 101 + "'", int60 == 101);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(userList64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(userList67);
        org.junit.Assert.assertNotNull(userOptional70);
        org.junit.Assert.assertNotNull(userList71);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "hi!", "WrongPassword1!", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        int int24 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "33) test0868(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        boolean boolean45 = userRepository1.headLabCoordinatorExists();
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        com.reservation_system.services.AuthService authService19 = new com.reservation_system.services.AuthService(userRepository17);
        com.reservation_system.model.LabManager labManager25 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean26 = labManager25.isApproved();
        userRepository17.addUser((com.reservation_system.model.User) labManager25);
        com.reservation_system.repository.UserRepository userRepository29 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList30 = userRepository29.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList31 = userRepository29.getAllUsers();
        userRepository17.saveAllUsers(userList31);
        userRepository1.saveAllUsers(userList31);
        com.reservation_system.repository.UserRepository userRepository35 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList36 = userRepository35.getAllUsers();
        com.reservation_system.services.AuthService authService37 = new com.reservation_system.services.AuthService(userRepository35);
        java.util.Optional<com.reservation_system.model.User> userOptional39 = userRepository35.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList40 = userRepository35.getAllUsers();
        userRepository1.saveAllUsers(userList40);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userOptional39);
        org.junit.Assert.assertNotNull(userList40);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "hi!", "faculty", "student", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("labmanager");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService11 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user14 = authService11.login("student", "labmanager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "Password1!", "WrongPassword1!", "student", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        researcher5.setApproved(false);
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "Andrew", "guest", "hi!", true);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getEmail();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getPassword();
        java.lang.String str11 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        int int3 = userRepository1.getNextID();
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "hi!", "Password1!", "guest", false);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        int int10 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
// flaky "34) test0879(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "WrongPassword1!", "data/test-users.csv", "", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Password1!", "researcher", "researcher", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
        com.reservation_system.model.Guest guest39 = new com.reservation_system.model.Guest(97, "Andrew", "", "Faculty", false);
        boolean boolean40 = guest39.isApproved();
        java.lang.String str41 = guest39.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest39);
        com.reservation_system.services.AuthService authService43 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user46 = authService43.login("Guest", "data/test-users.csv");
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
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Guest" + "'", str41, "Guest");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "headlabcoordinator", "data/test-users.csv", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "data/test-users.csv", "", "student", true);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        java.lang.String str37 = researcher35.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userOptional29);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Researcher" + "'", str37, "Researcher");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        java.lang.String str12 = labManager9.getUserType();
        java.lang.String str13 = labManager9.getPassword();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Andrew" + "'", str13, "Andrew");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(98, "Student", "Guest", "student", false);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        boolean boolean25 = userRepository1.emailExists("");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "35) test0888(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "WrongPassword1!", "researcher", "Password1!", true);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        int int12 = faculty11.getID();
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        java.lang.Class<?> wildcardClass14 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "data/test-users.csv", "Researcher", "Researcher", false);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "labmanager", "", "hi!", true);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "researcher", "faculty", "Andrew", false);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(101, "WrongPassword1!", "hi!", "headlabcoordinator", false);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "headlabcoordinator", "data/test-users.csv", "WrongPassword1!", false);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("faculty");
        int int9 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService10 = new com.reservation_system.services.AuthService(userRepository1);
        int int11 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "Password1!", "guest", "Andrew", false);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "Andrew", "Andrew", "faculty", false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        com.reservation_system.services.AuthService authService18 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user21 = authService18.login("", "researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "labmanager", "faculty", "WrongPassword1!", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "guest", "test@example.com", "Andrew", false);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "Faculty", "Password1!", "Andrew", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "guest", "", "", true);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(98, "test@example.com", "", "Guest", true);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass11 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("data/test-users.csv");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
        org.junit.Assert.assertNotNull(userOptional19);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "student", "", "researcher", true);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "faculty", "Student", "data/test-users.csv", false);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Password1!", "labmanager", "Password1!", false);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(101, "WrongPassword1!", "Researcher", "data/test-users.csv", false);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList5 = userRepository4.getAllUsers();
        com.reservation_system.services.AuthService authService6 = new com.reservation_system.services.AuthService(userRepository4);
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean13 = labManager12.isApproved();
        userRepository4.addUser((com.reservation_system.model.User) labManager12);
        boolean boolean16 = userRepository4.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository4.getAllUsers();
        com.reservation_system.services.AuthService authService18 = new com.reservation_system.services.AuthService(userRepository4);
        com.reservation_system.model.Researcher researcher24 = new com.reservation_system.model.Researcher((int) (byte) 10, "researcher", "Researcher", "", false);
        boolean boolean25 = researcher24.isApproved();
        userRepository4.addUser((com.reservation_system.model.User) researcher24);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository4.getAllUsers();
        userRepository1.saveAllUsers(userList27);
        int int29 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional31 = userRepository1.findByEmail("test@example.com");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 101 + "'", int29 == 101);
        org.junit.Assert.assertNotNull(userOptional31);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        int int6 = faculty5.getID();
        java.lang.String str7 = faculty5.getPassword();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "Researcher", "test@example.com", "Student", true);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("student");
        com.reservation_system.services.AuthService authService10 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Guest", "Andrew", "Student", true);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getName();
        java.lang.String str9 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "headlabcoordinator", "data/test-users.csv", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        int int8 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "", "Guest", "", true);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("labmanager");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userOptional19);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 52, "student", "Faculty", "Andrew", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getName();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        boolean boolean11 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "student", "", "Password1!", false);
        int int6 = student5.getID();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "WrongPassword1!", "faculty", "Researcher", true);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        boolean boolean7 = userRepository1.emailExists("data/test-users.csv");
        boolean boolean9 = userRepository1.emailExists("Andrew");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "36) test0925(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "15) test0925(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "headlabcoordinator", "data/test-users.csv", "WrongPassword1!", false);
        java.lang.String str6 = guest5.getName();
        int int7 = guest5.getID();
        java.lang.String str8 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Password1!", "Faculty", "Student", true);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        boolean boolean21 = userRepository1.emailExists("headlabcoordinator");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
        int int33 = userRepository1.getNextID();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 101 + "'", int33 == 101);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str10 = faculty9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        int int12 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "Andrew", "student", "researcher", true);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (-1), "Guest", "WrongPassword1!", "guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "Student", "headlabcoordinator", "WrongPassword1!", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(101, "WrongPassword1!", "Researcher", "guest", true);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "researcher", "Guest", "faculty", false);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "WrongPassword1!", "", "headlabcoordinator", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) '#', "Guest", "WrongPassword1!", "data/test-users.csv", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str6 = labManager5.getEmail();
        labManager5.setApproved(true);
        java.lang.String str9 = labManager5.getUserType();
        boolean boolean10 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "labmanager", "Student", "faculty", false);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        int int21 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService22 = new com.reservation_system.services.AuthService(userRepository1);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
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
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator28 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str29 = headLabCoordinator28.getUserType();
        int int30 = headLabCoordinator28.getID();
        java.lang.String str31 = headLabCoordinator28.getUserType();
        java.lang.String str32 = headLabCoordinator28.getUserType();
        java.lang.String str33 = headLabCoordinator28.getPassword();
        java.lang.String str34 = headLabCoordinator28.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator28);
        boolean boolean36 = headLabCoordinator28.isApproved();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Guest" + "'", str21, "Guest");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "headlabcoordinator" + "'", str29, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 98 + "'", int30 == 98);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "headlabcoordinator" + "'", str31, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "headlabcoordinator" + "'", str32, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "guest" + "'", str33, "guest");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "headlabcoordinator" + "'", str34, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        java.lang.Class<?> wildcardClass88 = userRepository1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        java.lang.String str6 = faculty5.getUserType();
        faculty5.setApproved(true);
        faculty5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(98, "WrongPassword1!", "Andrew", "Password1!", false);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.services.AuthService authService12 = new com.reservation_system.services.AuthService(userRepository1);
        int int13 = userRepository1.getNextID();
        boolean boolean15 = userRepository1.emailExists("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("faculty");
        boolean boolean18 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student24 = new com.reservation_system.model.Student((int) (short) -1, "Password1!", "faculty", "faculty", true);
        java.lang.String str25 = student24.getEmail();
        java.lang.String str26 = student24.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student24);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 98 + "'", int13 == 98);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userOptional17);
// flaky "37) test0945(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "faculty" + "'", str25, "faculty");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Student" + "'", str26, "Student");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getName();
        java.lang.String str9 = faculty5.getUserType();
        faculty5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "Password1!", "guest", "test@example.com", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 36, "WrongPassword1!", "guest", "Researcher", true);
        user6.setApproved(false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "researcher", "", "test@example.com", true);
        int int6 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        int int3 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager10 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str11 = labManager10.getUserType();
        java.lang.String str12 = labManager10.getEmail();
        boolean boolean13 = labManager10.requiresDepartmentApproval();
        java.lang.String str14 = labManager10.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager10);
        java.lang.String str16 = labManager10.getUserType();
        boolean boolean17 = labManager10.requiresDepartmentApproval();
// flaky "38) test0950(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "labmanager" + "'", str16, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "", "test@example.com", "", false);
        java.lang.Class<?> wildcardClass6 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Andrew", "test@example.com", "student", true);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        com.reservation_system.services.AuthService authService13 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager19 = new com.reservation_system.model.LabManager((int) 'a', "Guest", "Faculty", "test@example.com", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager19);
        com.reservation_system.services.AuthService authService21 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean22 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.User user29 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (byte) -1, "Researcher", "", "Andrew", false);
        userRepository1.addUser(user29);
        com.reservation_system.model.Researcher researcher36 = new com.reservation_system.model.Researcher((-1), "Guest", "data/test-users.csv", "", true);
        java.lang.String str37 = researcher36.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher36);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
// flaky "39) test0953(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "16) test0953(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "4) test0953(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
// flaky "2) test0953(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Guest" + "'", str37, "Guest");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        int int24 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
// flaky "40) test0954(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "17) test0954(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 98 + "'", int24 == 98);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "test@example.com", "guest", "guest", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = authService19.login("data/test-users.csv", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
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
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        java.util.List<com.reservation_system.model.User> userList19 = userRepository1.getAllUsers();
        boolean boolean21 = userRepository1.emailExists("Password1!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        boolean boolean17 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService18 = new com.reservation_system.services.AuthService(userRepository1);
        java.lang.Class<?> wildcardClass19 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "headlabcoordinator", "", "Password1!", true);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "Student", "Researcher", "", true);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Password1!", "WrongPassword1!", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getEmail();
        int int7 = researcher5.getID();
        java.lang.String str8 = researcher5.getName();
        java.lang.String str9 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "WrongPassword1!" + "'", str6, "WrongPassword1!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
        boolean boolean31 = student27.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Student" + "'", str29, "Student");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Student" + "'", str30, "Student");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("student");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("guest");
        int int12 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "labmanager", "Andrew", "researcher", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "guest", "labmanager", "Password1!", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Andrew", "test@example.com", "headlabcoordinator", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator15 = new com.reservation_system.model.HeadLabCoordinator(10, "headlabcoordinator", "data/test-users.csv", "faculty", false);
        java.lang.String str16 = headLabCoordinator15.getEmail();
        java.lang.String str17 = headLabCoordinator15.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator15);
        int int19 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "data/test-users.csv" + "'", str16, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "headlabcoordinator" + "'", str17, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "WrongPassword1!", "test@example.com", "test@example.com", false);
        faculty5.setApproved(false);
        boolean boolean8 = faculty5.isApproved();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-users.csv", "Andrew", "", false);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getID();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "Password1!", "hi!", "student", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "faculty", "WrongPassword1!", "data/test-users.csv", false);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "Student", "", "data/test-users.csv", false);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty13 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        java.lang.String str14 = faculty13.getUserType();
        com.reservation_system.model.LabManager labManager20 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str21 = labManager20.getEmail();
        com.reservation_system.model.Researcher researcher27 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean28 = researcher27.isApproved();
        com.reservation_system.model.Faculty faculty34 = new com.reservation_system.model.Faculty((int) (short) 0, "Faculty", "headlabcoordinator", "", true);
        com.reservation_system.model.LabManager labManager40 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str41 = labManager40.getEmail();
        com.reservation_system.model.Faculty faculty47 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str48 = faculty47.getName();
        java.lang.String str49 = faculty47.getName();
        com.reservation_system.model.LabManager labManager55 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str56 = labManager55.getEmail();
        com.reservation_system.model.Faculty faculty62 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        com.reservation_system.model.Faculty faculty68 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str69 = faculty68.getName();
        java.lang.String str70 = faculty68.getName();
        java.lang.String str71 = faculty68.getName();
        com.reservation_system.model.Researcher researcher77 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean78 = researcher77.requiresDepartmentApproval();
        com.reservation_system.model.Faculty faculty84 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        com.reservation_system.model.User[] userArray85 = new com.reservation_system.model.User[] { faculty13, labManager20, researcher27, faculty34, labManager40, faculty47, labManager55, faculty62, faculty68, researcher77, faculty84 };
        java.util.ArrayList<com.reservation_system.model.User> userList86 = new java.util.ArrayList<com.reservation_system.model.User>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<com.reservation_system.model.User>) userList86, userArray85);
        userRepository5.saveAllUsers((java.util.List<com.reservation_system.model.User>) userList86);
        int int89 = userRepository5.getNextID();
        java.util.List<com.reservation_system.model.User> userList90 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList90);
        boolean boolean92 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional94 = userRepository1.findByEmail("Student");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "headlabcoordinator" + "'", str48, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "headlabcoordinator" + "'", str49, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "headlabcoordinator" + "'", str69, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "headlabcoordinator" + "'", str70, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "headlabcoordinator" + "'", str71, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(userArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 98 + "'", int89 == 98);
        org.junit.Assert.assertNotNull(userList90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(userOptional94);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "", "", "data/test-users.csv", true);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "Guest", "hi!", "hi!", true);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "Password1!", "hi!", "student", true);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str10 = faculty9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        java.lang.String str12 = faculty9.getUserType();
        int int13 = faculty9.getID();
        faculty9.setApproved(true);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Student", "hi!", "labmanager", true);
        int int6 = faculty5.getID();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str10 = faculty9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Student");
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("test@example.com");
        int int16 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 98 + "'", int16 == 98);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "WrongPassword1!", "", "hi!", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.services.AuthService authService12 = new com.reservation_system.services.AuthService(userRepository1);
        int int13 = userRepository1.getNextID();
        boolean boolean15 = userRepository1.emailExists("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("faculty");
        boolean boolean18 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList19 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 98 + "'", int13 == 98);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userOptional17);
// flaky "41) test0982(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "hi!", "Student", "", false);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "researcher", "Researcher", "", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        int int10 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean6 = labManager5.isApproved();
        labManager5.setApproved(true);
        java.lang.String str9 = labManager5.getUserType();
        java.lang.String str10 = labManager5.getUserType();
        java.lang.String str11 = labManager5.getUserType();
        java.lang.String str12 = labManager5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "test@example.com", "Guest", "WrongPassword1!", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "WrongPassword1!" + "'", str7, "WrongPassword1!");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        researcher24.setApproved(true);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Researcher" + "'", str25, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "student" + "'", str27, "student");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "Student", "WrongPassword1!", "headlabcoordinator", false);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "Andrew", "data/test-users.csv", "student", false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean4 = userRepository1.emailExists("Researcher");
        com.reservation_system.model.Guest guest10 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str11 = guest10.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest10);
        int int13 = userRepository1.getNextID();
        boolean boolean15 = userRepository1.emailExists("headlabcoordinator");
        org.junit.Assert.assertNotNull(userList2);
// flaky "42) test0990(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
// flaky "18) test0990(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        int int6 = userRepository1.getNextID();
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager((int) (byte) 100, "Faculty", "Password1!", "Student", true);
        int int13 = labManager12.getID();
        userRepository1.addUser((com.reservation_system.model.User) labManager12);
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "43) test0991(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
// flaky "19) test0991(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "data/test-users.csv", "headlabcoordinator", "student", true);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "", "Password1!", "", true);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "Password1!", "labmanager", "headlabcoordinator", true);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "student", "labmanager", "", false);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean7 = userRepository1.emailExists("researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
// flaky "44) test0996(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userOptional9);
// flaky "20) test0996(com.reservation_system.Randoop.AuthService.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "", "Password1!", "", false);
        boolean boolean6 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "headlabcoordinator", "Faculty", "Guest", false);
        java.lang.String str6 = student5.getPassword();
        boolean boolean7 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "Guest", "Student", "WrongPassword1!", false);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "WrongPassword1!" + "'", str6, "WrongPassword1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(99, "Password1!", "labmanager", "Student", false);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getEmail();
        java.lang.String str9 = labManager5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
    }
}
